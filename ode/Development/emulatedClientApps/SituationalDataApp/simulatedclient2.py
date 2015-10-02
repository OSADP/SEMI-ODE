#!/bin/env python

import thread, time, datetime, json, sys, os
import logging

import dateutil.parser

from optparse import OptionParser, SUPPRESS_HELP, OptionGroup
from collections import defaultdict
import ConfigParser

import websocket
import timehelpers
import depositClient
import restApi

import clientConfig
from odeClient import client, timehelpers

# Set TIME to UTC
# logging.Formatter.converter = time.gmtime

logging_level = logging.DEBUG

current_date_time = datetime.datetime.now().strftime("%Y-%m-%dT%H_%M_%S")
log_name = 'simpleApp_{}.log'.format(current_date_time)
logger = logging.getLogger('simpleApp')
logger.setLevel(logging.DEBUG)
fh = logging.FileHandler(log_name)
fh.setLevel(logging_level)
# create console handler with a higher log level
ch = logging.StreamHandler(stream=sys.stdout)
ch.setLevel(logging_level)
# create formatter and add it to the handlers
formatter = logging.Formatter('%(asctime)s-%(name)s-%(levelname)s: %(message)s', datefmt="%Y-%m-%dT%H:%M:%S")
fh.setFormatter(formatter)
ch.setFormatter(formatter)
# add the handlers to the logger
logger.addHandler(fh)
logger.addHandler(ch)

base_config = {}
config = defaultdict(lambda: None, base_config)

json_file_data = []

message_codes = [
    'SUCCESS',
    'FAILURE',
    'SOURCE_CONNECTION_ERROR',
    'INVALID_REQUEST_TYPE_ERROR',
    'INVALID_DATA_TYPE_ERROR'
]

areas_subs = ["veh", "int", "agg"]

nwLat = "43.652969118285434",
nwLon = "-85.94707489013672",
seLat = "36.4765153148293",
seLon = "-74.53468322753906",

region = client.GeographicRegion(nwLat, nwLon, seLat, seLon)

# 2015-01-01T01:01:30.000Z to  2015-06-15T23:59:59.999Z
start_date = datetime.datetime(2015, month=1, day=1, hour=1, minute=1, second=30, tzinfo=timehelpers.ZULU())
end_date = datetime.datetime(2015, month=6, day=1, hour=23, minute=59, second=59, microsecond=999,
                             tzinfo=timehelpers.ZULU())
date_format = '%Y-%m-%dT%H:%M:%S.%f%Z'

# File Name to capture ODE OUTPUT
# Same date time stamp used for log file
ode_output_file_name = 'ODE_test_run_{0}.txt'.format(current_date_time)
log_to_file = True

skip = 0,
limit = 100

qry_subs = \
    {
        "veh": {client.QueryRequest("veh",
                                    region,
                                    start_date.strftime(timehelpers.date_format),
                                    end_date.strftime(timehelpers.date_format),
                                    skip,
                                    limit)

                },
        "adv": {client.QueryRequest("adv",
                                region,
                                start_date.strftime(timehelpers.date_format),
                                end_date.strftime(timehelpers.date_format),
                                skip,
                                limit)

        },
        "int": {client.QueryRequest("int",
                                region,
                                start_date.strftime(timehelpers.date_format),
                                end_date.strftime(timehelpers.date_format),
                                skip,
                                limit)
        },
    }

msg = {}  # Empty Message body

input_file = None


def append_to_file(entry):
    with open(ode_output_file_name, "a") as myfile:
        myfile.write(entry + "\n")


def get_json_file(test_type):
    """
    Get correct json file based on subscription type input Tuple
    :return:
    """
    # os.getcwdu()
    json_files = {
        ('sub', 'veh'): os.path.join('.', 'test_json', 'sub_veh.json'),
        ('sub', 'int'): os.path.join('.', 'test_json', 'sub_int.json'),
        ('sub', 'agg'): os.path.join('.', 'test_json', 'sub_agg.json'),
        ('qry', 'veh'): os.path.join('.', 'test_json', 'qry_veh.json'),
        ('qry', 'int'): os.path.join('.', 'test_json', 'qry_int.json'),
        ('qry', 'adv'): os.path.join('.', 'test_json', 'qry_adv.json'),
    }

    return json_files[test_type]


def extract_json_objects(json_file):
    result = False
    global json_file_data

    with open(json_file, ) as f:
        for line in f:
            try:
                if line is None or line == "\n":
                    break
                json_file_data.append(json.loads(line, encoding='utf-8'))
            except:
                logger.debug("LINE: %s", line)
                logger.exception("Error Reading JSON FIle: %s", json_file)
                sys.exit()
        result = True
    return result


def validate_datetime(input_time):
    """
    Validates that the dateTime for a query result is within the requested
     start and end time interval.
    :return:
    """
    import dateutil.parser
    record_time = dateutil.parser.parse(input_time)
    if msg.get('endDate') is not None and msg.get('startDate') is not None:
        if dateutil.parser.parse(msg.get('endDate')) >= record_time >= dateutil.parser.parse(msg.get('startDate')):
            return True
        else:
            return False
    else:
        return False


def validate_location():
    """
    Validates that the latitute and longitutde values for a query result is within the requested
    bounding  box region. .
    :return:
    """
    pass


###
#
# Main Part of the Application
#
###
def _main():
    parser = clientConfig.get_parser()
    (options, args) = parser.parse_args()
    cp = None
    config.update(vars(options))
    if config.get('CONFIG_FILE'):
        cp = parse_config_file(config['CONFIG_FILE'])

    _run_main(config, cp)

def parse_config_file(file_path):
    config_file = ConfigParser.ConfigParser()
    config_file.optionxform = str
    try:
        config_file.readfp(open(file_path))
    except Exception as e:
        logger.exception('Unable to Open Config File')
        sys.exit(1)
    if config_file.has_section('ode'):
        config['HOST'] = config_file.get('ode', 'host')
        config['REQUEST_TYPE'] = config_file.get('ode', 'requestType')
        config['DATA'] = config_file.get('ode', 'dataType')
        config['UPLOAD_TEST_DATA'] = config_file.getboolean('ode', 'uploadData')
        config['VALIDATION_FILE'] = config_file.get('ode', 'validationFile')
        if config['UPLOAD_TEST_DATA']:
            config['INPUT_FILE'] = config_file.get('ode', 'inputFile')

        config['USERNAME'] = config_file.get('ode', 'userName')
        config['PASSWORD'] = config_file.get('ode', 'password')

    return config_file

def build_request(config,config_file):
    request = None
    area = {}
    for key, value in config_file.items('serviceRegion'):
        area[key] = value

    region = build_region(area)

    if config.get('REQUEST_TYPE') and config.get('REQUEST_TYPE') == 'sub':
        request = client.SubscriptionRequest(config_file.get('ode', 'dataType'),
                                             region)

    if config_file.has_section('queryParams') and config.get('REQUEST_TYPE') == 'qry':
        request = client.QueryRequest(config_file.get('ode', 'dataType'),
                                      region,
                                      config_file.get('queryParams', 'startDate'),
                                      config_file.get('queryParams', 'endDate'),
                                      config_file.get('queryParams', 'limit'),
                                      config_file.get('queryParams', 'skip') )
    return request

def build_region(regionValues):

    return client.GeographicRegion(regionValues["nwLat"],
                                   regionValues["nwLon"],
                                   regionValues["seLat"],
                                   regionValues["seLon"] )

def _run_main(config,config_file=None):

    ode = client.ODEClient(config['HOST'], config['USERNAME'], config['PASSWORD'])

    request = build_request(config,config_file)

    logger.info("Subscriptions Params: %s", request.toJson() )

    ode.setRequest(request)
    ode.connect(on_message=on_message)

# Web Socket Handlers
# That is written by the application developer
def on_message(ws, message):
    """
    Handler that processes messages received by the web socket
    """

    # determine message and act accordingly
    logger.debug("Message Value: %s", message)
    if (logger.isEnabledFor(logging.DEBUG) or logger.isEnabledFor(logging.INFO)) and log_to_file:
        append_to_file(message)
    try:
        msg = json.loads(message)

        # Identify Message and perform action(s)
        if msg.get('code'):
            logger.info("ODE Connection Status: %s Message: %s", msg.get('code'), msg.get('message'))

            if config['UPLOAD_TEST_DATA'] and msg.get('requestId'):  # 'tstvehOdeTstRequest' in msg.get('message'):
                config['TEST_REQUEST'] = msg.get('requestId')
                depositClient.update_config(config)
                thread.start_new_thread(depositClient._run_main, (config,))

        if msg.get('fullMessage') is not None and 'STOP' in msg.get('fullMessage'):
            on_close(ws)
        if msg.get('serialId') is not None:
            validate_message(msg)
        # if msg.get('payload'):
        #     logger.info(msg['payload']['dialogID']['mValue'])
        #     logger.debug(msg.keys())
        #     validate_message(msg)
        elif msg.get("fullMessage"):
            logger.info(msg.get("fullMessage"))
            #            on_close(ws)
    except Exception as e:
        logger.exception("Unable to convert message to json dictionary object")
        logger.critical("Message Payload: %s\n", message)
        ## validate message to that which is stored locaally
        # iterating over local message  to ensure ordering and values are correct


def validate_message(message):
    """
    Validates JSON result against json file
    :param message: ODE  Message in JSON Format
    :return: Result of evaluation in Tuple Form
    """

    key = 'dateTime'

    if not validate_datetime(message['dateTime']) and config['REQUEST_TYPE'] == 'qry':
        logger.warn("Invalid DateTime in Message Record")
        logger.warn("Start Time: %s,  Actual: %s   End Time: %s", msg['startDate'], message['dateTime'], \
                    msg['endDate'])

    # Valid  Vehicle Data Keys
    valid_keys = [u'accelVert', u'sizeWidth', u'elevation', u'hour', u'sizeLength', u'accelLong', u'longitude', \
                  u'month', u'second', u'accellYaw', u'year', u'latitude', u'heading', u'speed',
                  u'day', u'minute', u'dateTime']

    # Search
    filtered_message = {k: v for k, v in message.items() if k in valid_keys}

    output = [record for record in json_file_data if record[key] == message[key]]
    if output is None:
        logger.info('No matching record found based on key of [%s] in validation file. ODE Message: %s', message[key],
                    message)

    count = len(output)
    check_counter = 0
    logger.debug("ODE Record: %s", message)
    logger.info('Found %d possible matches', count)

    for data in output:
        filtered_validation_data = {k: v for k, v in data.items() if k in valid_keys}
        record_delta = set(filtered_validation_data.items()) - set(filtered_message.items())
        actual_record_delta = set(filtered_message.items()) - set(filtered_validation_data.items())
        if len(record_delta) == 0 and len(actual_record_delta) == 0:
            logger.info("Found Matching Record. Iterations: (%d)", check_counter + 1)
            logger.debug(data)
            return (True, None)
        else:
            check_counter += 1
            logger.debug("Record Count: %d, Check Counter: %d", count, check_counter)
            logger.warn("No matching record found.Found similar record. Iteration: %d, \nExpected: %s,\nActual:   %s",
                        check_counter, sorted(record_delta), sorted(actual_record_delta))
            logger.warn("Full Record Output:\nValidation Record: %s\nActual Record:  %s", data, message)
            if check_counter == count:
                logger.debug("Validation Record: %s", sorted(filtered_validation_data))
                logger.debug("ODE Record: %s", sorted(filtered_message))
                logger.debug("Record Count: %d, Check Counter: %d", count, check_counter)
                logger.warn("End Validation section")
                return (False, record_delta)
    logger.debug("End validation section")
    return (False, None)


if __name__ == "__main__":
    _main()  # Parse Command line options and run program