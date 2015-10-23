#!/bin/env python

import thread
import datetime
import json
import sys
import os
import logging
import dateutil.parser

from collections import defaultdict
import ConfigParser

import sys

try:
    import odeClient
except:
    current_file_path = os.path.dirname(os.path.abspath(__file__))
    sys.path.insert(1,os.path.join(current_file_path,'..','..','apps','PythonSDK'))

try:
    from odeClient import client, timehelpers, dataType
    from odeClient.response import BaseResponse as OdeResponse
except:
    print "Error Importing ODE Client. Please install the odeClient Package"
    sys.exit(-1)

import depositClient
import simulatedClientPresets
import clientConfig

# Logging Setup and Configuration
#
# Set TIME to UTC
# logging.Formatter.converter = time.gmtime

logging_level = logging.DEBUG

if not os.path.exists('logs'):
    os.makedirs('logs')
if not os.path.exists('output'):
    os.makedirs('output')

current_date_time = datetime.datetime.now().strftime("%Y-%m-%dT%H_%M_%S")
log_name = 'simulated_client2_{}.log'.format(current_date_time)
logger = logging.getLogger('simulatedClient')
logger.setLevel(logging_level)

fh = logging.FileHandler(os.path.join('logs',log_name)) # logs
fh.setLevel(logging.DEBUG)
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
logger2 = logging.getLogger('odeClient')
logger2.setLevel(logging.INFO)
logger2.addHandler(ch)
date_format = '%Y-%m-%dT%H:%M:%S.%f%Z'

# File Name to capture ODE OUTPUT
# Same date time stamp used for log file

base_config = {'OUTPUT_TO_FILE': True,
               'OUTPUT_FILE_NAME': 'simulated_client2_output_{0}.txt'.format(current_date_time),
               }
config = defaultdict(lambda: None, base_config)

# File Name to capture ODE OUTPUT
# Same date time stamp used for log file
log_to_file = config['OUTPUT_TO_FILE']
ode_output_file_name = config['OUTPUT_FILE_NAME']

json_file_data = []

areas_subs = ["veh", "int", "agg"]

#
# Built in presents
#
region = simulatedClientPresets.pre_built_region()

# 2015-01-01T01:01:30.000Z to  2015-06-15T23:59:59.999Z
start_date = simulatedClientPresets.start_date.strftime(timehelpers.date_format)
end_date = simulatedClientPresets.end_date.strftime(timehelpers.date_format)

skip = simulatedClientPresets.skip
limit = simulatedClientPresets.limit

un_supported_payloads_codes = [x[1] for x in dataType.all_dataTypes()
                               if x[1] !='veh' and x[1]!='status' and x[1]!='other']

input_file = None

def append_to_file(entry):
    with open(os.path.join('output',ode_output_file_name), "a") as myfile: # output
        myfile.write(entry + "\n")


def get_json_file(test_type):
    """
    Get correct json file based on (request type, data type)  input Tuple
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


def validate_datetime(msg_payload):
    """
    Validates that the dateTime for a query result is within the requested
     start and end time interval.
    :return: boolean result
    """
    # pass
    #import dateutil.parser

    record_time = dateutil.parser.parse(msg_payload['dateTime'])
    if dateutil.parser.parse(config.get('END_DATE')) >= record_time >= dateutil.parser.parse(config.get('START_DATE')):
        return True
    else:
        return False

def validate_location(msg_payload):
    """
    Validates that the latitude and longitutde values for a query result is within the requested
    bounding box region. .
    :return:
    """
    service_region = config['SERVICE_REGION']

    if float(service_region['seLat']) <= float(msg_payload['latitude']) <= float(service_region['nwLat']) and \
       float(service_region['nwLon']) <= float(msg_payload['longitude']) <= float(service_region['seLon']):
        return True
    else:
        return False

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
        parse_options(cp)

    logger.debug("User Config: %s", config)
    config_info = "User:{}, Host: {}, Request Type: {}, Data Type: {} ".format(
            config['USERNAME'],
            config['HOST'],
            config['REQUEST_TYPE'],
            config['DATA'])

    logger.info(config_info)
    if config['PASSWORD'] is None:
        logger.exception("Missing Password. ")
        sys.exit(1)
    _run_main(config, cp)

def parse_config_file(file_path):
    config_file = ConfigParser.ConfigParser()
    config_file.optionxform = str
    try:
        config_file.readfp(open(file_path))
    except Exception as e:
        logger.exception('Unable to Open Config File')
        sys.exit(1)
    logger.info("Reading Config File: %s",file_path)
    if config_file.has_section('ode'):
        config['HOST'] = config_file.get('ode', 'host')
        config['REQUEST_TYPE'] = config_file.get('ode', 'requestType')
        config['DATA'] = config_file.get('ode', 'dataType')
        config['UPLOAD_TEST_DATA'] = bool (config_file.getboolean('ode', 'uploadData'))
        config['VALIDATION_FILE'] = config_file.get('ode', 'validationFile')
        if config['UPLOAD_TEST_DATA']:
            config['INPUT_FILE'] = config_file.get('ode', 'inputFile')

        config['USERNAME'] = config_file.get('ode', 'userName')
        config['PASSWORD'] = config_file.get('ode', 'password')

    if config_file.has_section('queryParams'):
        config['START_DATE'] = config_file.get('queryParams', 'startDate')
        config['END_DATE'] = config_file.get('queryParams', 'endDate')
        config['SKIP']  = config_file.get('queryParams','skip')
        config['LIMIT'] = config_file.get('queryParams','limit')
    area = None

    if config_file.has_section('serviceRegion'):
        area={}
        for key, value in config_file.items('serviceRegion'):
            area[key] = value

    config['SERVICE_REGION'] = area

    return config_file

def parse_options(config_file):
    if config_file.has_section('options'):
        if config_file.has_option('options', 'captureOutput'):
            config['OUTPUT_TO_FILE'] = bool(config_file.get('options', 'captureOutput'))
        if config_file.has_option('options', 'captureOutputFileName'):
            config['OUTPUT_FILE_NAME'] = config_file.get('options', 'capturedOutputFileName')

def build_request(config):
    request = None

    area = config.get('SERVICE_REGION', None)
    region = None
    if area is not None:
        region = build_region(area)
    else:
        region = simulatedClientPresets.pre_built_region()

    if config.get('REQUEST_TYPE',None) and config.get('REQUEST_TYPE') == 'sub':
        request = client.SubscriptionRequest(config.get('DATA'),region)
    # TEST REQUEST Manager
    if config.get('UPLOAD_TEST_DATA',False) and config.get('REQUEST_TYPE') == 'sub':
        request = client.BaseRequest("tst","veh",region)

    elif config.get('REQUEST_TYPE',None) and config.get('REQUEST_TYPE') == 'qry':
        request = client.QueryRequest(config.get('DATA'),
                                      region,
                                      config.get('START_DATE', start_date),
                                      config.get('END_DATE', end_date),
                                      config.get('LIMIT', limit),
                                      config.get('SKIP', skip))
    return request

def build_region(regionValues):

    return client.GeographicRegion(regionValues["nwLat"],
                                   regionValues["nwLon"],
                                   regionValues["seLat"],
                                   regionValues["seLon"] )

def _run_main(config,config_file=None):

    ode = client.ODEClient(config['HOST'], config['USERNAME'], config['PASSWORD'])

    request = build_request(config)
    extract_json_objects(config['VALIDATION_FILE'])

    logger.info("Subscriptions Params: %s", request.toJson() )

    ode.setRequest(request)
    ode.connect(on_message=on_message) # open continuous connection.

# Web Socket Handler
# That is written by the application developer
#
def on_message(ws, message):
    """
    Handler that processes messages received by the web socket
    """

    # determine message type and act accordingly
    logger.debug("Message Value: %s", message)
    if log_to_file:
        append_to_file(message)
    try:
        msg = OdeResponse(message)

        # Identify Message and perform action(s)
        # Used for the Test Deposit
        if msg.get_payload_type() in dataType.Status :
            logger.info("ODE Connection Status: %s Message: %s", msg.get_payload_value('code'), msg.get_payload_value('message'))
            if config['UPLOAD_TEST_DATA'] and msg.get_payload_value('requestId'):
                config['TEST_REQUEST'] = msg.get_payload_value('requestId')
                depositClient.update_config(config)
                thread.start_new_thread(depositClient._run_main, (config,))

        if msg.get_payload_type() in dataType.OtherData and 'STOP' in msg.get_payload_value('fullMessage'):
            ws.close()
        if msg.get_payload_type() in dataType.OtherData and 'STOP' not in  msg.payload.get('fullMessage'):
            logger.info("Other Message Type: %s",msg.payload.get('fullMessage',""))

        if msg.get_payload_type() in dataType.VehicleData and ( config['REQUEST_TYPE'] in ('qry') or  (config['REQUEST_TYPE'] in ('sub') and  config['UPLOAD_TEST_DATA'] )):
            logger.info("Validating Vehicle Record")
            validate_message(msg.payload)
        elif  msg.get_payload_type() in un_supported_payloads_codes:
            logger.info("No validation function defined for payload type: %s",msg.get_payload_type())

        # elif msg.get_payload_value("fullMessage"):
        #     logger.info(msg.get("fullMessage"))

    except Exception as e:
        logger.exception("Unable to convert message to json dictionary object")
        logger.critical("Message Payload: %s\n", message)

def validate_message(msg_payload):
    """
    Validates JSON result against json file
    :param msg_payload: ODE  Message in JSON Format
    :return: Result of evaluation in Tuple Form
    """

    #
    #
    # TODO Refactor whole method to be less intelligent
    #
    #

    key = 'dateTime'

    # if not validate_datetime(message['dateTime']) and config['REQUEST_TYPE'] == 'qry':
    #     logger.warn("Invalid DateTime in Message Record")
    #     logger.warn("Start Time: %s,  Actual: %s   End Time: %s", msg['startDate'], message['dateTime'], \
    #                 msg['endDate'])

    # Valid  Vehicle Data Keys
    valid_keys = [u'accelVert', u'sizeWidth', u'elevation', u'hour', u'sizeLength', u'accelLong', u'longitude', \
                  u'month', u'second', u'accellYaw', u'year', u'latitude', u'heading', u'speed',
                  u'day', u'minute', u'dateTime']

    # Search
    filtered_message = {k:v for k, v in msg_payload.items() if k in valid_keys}

    output = [record for record in json_file_data if record[key] == msg_payload[key]]
    if output is None:
        logger.info('No matching record found based on key of [%s] in validation file. ODE Message: %s', msg_payload[key],
                    msg_payload)

    count = len(output)
    check_counter = 0
    # logger.debug("ODE Record: %s", msg_payload)
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
            logger.warn("No matching record found.Found similar record. Iteration: %d, \nExpected: %s\nActual:   %s",
                        check_counter, sorted(record_delta), sorted(actual_record_delta))
            logger.warn("Full Record Output:\nValidation Record: %s\nActual Record:  %s", data, msg_payload)
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