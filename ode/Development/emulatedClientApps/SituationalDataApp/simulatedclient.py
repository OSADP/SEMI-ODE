#!/bin/env python

import thread, time, datetime, json, sys, os
import logging

from optparse import OptionParser, SUPPRESS_HELP, OptionGroup
from collections import defaultdict
import ConfigParser

import websocket
import timehelpers
import depositClient
import restApi

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
area = {
    'nwLat': "43.652969118285434",
    'nwLon': "-85.94707489013672",
    'seLat': "36.4765153148293",
    'seLon': "-74.53468322753906",
}
common_params = {
    "skip": "0",
    "limit": "10"
}


# 2015-01-01T01:01:30.000Z to  # 2015-06-15T23:59:59.999Z
start_date = datetime.datetime(2015, month=1, day=1, hour=1, minute=1, second=30, tzinfo=timehelpers.ZULU())
end_date = datetime.datetime(2015, month=6, day=1, hour=23, minute=59, second=59, microsecond=999,
                             tzinfo=timehelpers.ZULU())
date_format = '%Y-%m-%dT%H:%M:%S.%f%Z'

# File Name to capture ODE OUTPUT
# Same date time stamp used for log file
ode_output_file_name = 'ODE_test_run_{0}.txt'.format(current_date_time)
log_to_file = False

qry_subs = \
    {
        "veh": {
            "nwLat": "43.652969118285434",
            "nwLon": "-85.94707489013672",
            "seLat": "36.47651531482931",
            "seLon": "-74.53468322753902",
            "startDate": start_date.strftime(date_format),
            "endDate": end_date.strftime(date_format)
        },
        "adv": {
            "nwLat": "43.652969118285434",
            "nwLon": "-85.94707489013672",
            "seLat": "36.4765153148293",
            "seLon": "-74.53468322753901",
            "startDate": start_date.strftime(date_format),
            "endDate": end_date.strftime(date_format)

        },
        "int": {
            "nwLat": "43.652969118285199",
            "nwLon": "-85.94707489013672",
            "seLat": "36.47651531482932",
            "seLon": "-74.53468322753905",
            "startDate": start_date.strftime(date_format),
            "endDate": end_date.strftime(date_format)

        },
    }

msg = {}  # Empty Message body

input_file = None


def append_to_file(entry):
    with open(ode_output_file_name, "a") as myfile:
        myfile.write(entry + "\n")


# Web Socket Handlers
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

            if config['UPLOAD_TEST_DATA'] and  msg.get('requestId'): # 'tstvehOdeTstRequest' in msg.get('message'):
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


def on_error(ws, error):
    """
    Stop the subscription / query on the ODE and then close the socket.
    :param ws:
    :param error:
    :return:
    """
    # ws.close()
    logger.exception(error)
    logger.critical("Closing Web Socket Connection")
    on_close(ws)


def on_close(ws):
    ws.close()
    logger.info('Closing Web Socket via "OnCLose" Function')
    sys.exit()


def on_open2(ws):
    """
     On Web Socket Open Handler
     Transmits a request to the ODE to start subscription/query

    :param ws:
    :return:
    """
    pause = 7

    def run(*args):
        logger.debug(json.dumps(msg))
        time.sleep(pause)
        ws.send(json.dumps(msg))
        time.sleep(pause)
        # ws.close()
        logger.debug("On_open Run thread stopping...")

    thread.start_new_thread(run, ())


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


def validate_message(message):
    """
    Validates JSON result against json file
    :param message: ODE  Message in JSON Format
    :return: Result of evaluation in Tuple Form
    """

    key = 'dateTime'

    if not validate_datetime(message['dateTime']) and  config['SUB_TYPE']=='qry':
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



# Command Line Parser Methods
def get_parser():
    """
    Creaates and returns Parser object
    :return: optparse.OptionParser
    """
    parser = OptionParser(
        description="Situation Data App Example",
        conflict_handler="resolve")

    parser.add_option('-?', action='callback', callback=print_help, help=SUPPRESS_HELP)

    req_group = OptionGroup(parser, "Required Parameters")
    req_group.add_option('-t', '--type', help='Subscription Type Query - qry, Subscription = sub )',
                         metavar='type',
                         dest='SUB_TYPE',
                         default='sub')

    req_group.add_option('-d', '--data', help='Data Type (Vehicle, Intersection, Aggregate, Advisory)',
                         metavar='data',
                         dest='DATA',
                         default='veh')

    req_group.add_option('-h', '--host', help='Hostname',
                         metavar='host',
                         dest='HOST',
                         default='localhost:8080/ode')

    parser.add_option_group(req_group)

    group = OptionGroup(parser, "Optional Parameters")

    group.add_option('-f', '--file', help='Full Path to a File containing JSON output that will be used to'
                                          'validaate ODE output instead of default JSON files',
                     metavar='file',
                     dest='VALIDATION_FILE',
                     default=None, )
    group.add_option('-c', '--config', help='Full path to config file File that can be used to override all Settings.'
                                            'Config file will override all command line parameters',
                     metavar='config_file',
                     dest='CONFIG_FILE',
                     default=None)
    parser.add_option_group(group)

    return parser


def usage(parser):
    parser.print_help()
    sys.exit(2)


def print_help(option, opt_str, value, parser, *args, **kwargs):
    """
    Call back function to handle printing help when passed -?
    Utitilized instead of updating validation method
    """
    usage(parser)


def _main():
    parser = get_parser()
    (options, args) = parser.parse_args()

    config.update(vars(options))
    if config.get('CONFIG_FILE'):
        cp = parse_config_file(config['CONFIG_FILE'])

    _run_main(config)


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
        config['SUB_TYPE'] = config_file.get('ode', 'subscriptionType')
        config['DATA'] = config_file.get('ode', 'dataType')
        config['UPLOAD_TEST_DATA'] = config_file.getboolean('ode', 'uploadData')
        config['VALIDATION_FILE'] = config_file.get('ode', 'validationFile')
        if config['UPLOAD_TEST_DATA']:
            config['INPUT_FILE'] = config_file.get('ode', 'inputFile')

        config['USERNAME'] = config_file.get('ode','userName')
        config['PASSWORD'] = config_file.get('ode', 'password')


    if config_file.has_section('serviceRegion'):
        if config.get('SUB_TYPE') and config.get('SUB_TYPE') == 'sub':
            for key, value in config_file.items('serviceRegion'):
                area[key] = value  # Point is Tuple in form of (Name, Value)
        else:  # Update Query related Params
            for key, value in config_file.items('serviceRegion'):
                qry_subs[config['DATA']][key] = value
            qry_subs[config['DATA']]['startDate'] = config_file.get('queryParams', 'startDate')
            qry_subs[config['DATA']]['endDate'] = config_file.get('queryParams', 'endDate')
    if config_file.has_section('queryParams') and config.get('SUB_TYPE') == 'qry':
        common_params['limit'] = config_file.get('queryParams', 'limit')
        common_params['skip'] = config_file.get('queryParams', 'skip')
        qry_subs[config['DATA']]['startDate'] = config_file.get('queryParams', 'startDate')
        qry_subs[config['DATA']]['endDate'] = config_file.get('queryParams', 'endDate')

    return config_file



def _run_main(config):
    # host = "localhost:10494"
    # socket_url = "ws://localhost:10494/ode/api/ws/sub/ints" # veh, int,agg,
    #	ws://ec2-52-6-61-205.compute-1.amazonaws.com/ode/api/ws/qry/int  #adv, int, veh

    subscription_type = config['SUB_TYPE']
    global msg

    if subscription_type == 'sub':
        msg = area
        if not config['UPLOAD_TEST_DATA']:
            uri = 'sub/{0}'.format(config['DATA'])
        else:
            uri = 'tst/{0}'.format(config['DATA'])
    elif subscription_type == 'qry' and not config['UPLOAD_TEST_DATA']:
        msg = qry_subs[config['DATA']]
        msg.update(common_params)  # add common params
        uri = 'qry/{0}'.format(config['DATA'])
    else:
        logger.warn("Invalid Option combination")
        sys.exit(1)

    if config['USERNAME'] is not None and config['PASSWORD'] is not None:
        token = restApi.login('http://'+config['HOST'], config['USERNAME'], config['PASSWORD'])

    if token is None:
        logger.warn("Unable to get Access Token from Web Service")
        sys.exit(-1)

    socket_url = "ws://{0}/api/ws/{1}?token={2}".format(config['HOST'], uri, token)

    global input_file

    if config.get('VALIDATION_FILE'):
        json_file = config.get('VALIDATION_FILE')
    else:
        json_file = get_json_file((subscription_type, config['DATA']))
    extract_json_objects(json_file)

    print "Web socket URL: {}".format(socket_url)
    print '++++++++++'
    logger.info("Subscriptions Params: %s",json.dumps(msg))

    # if config['UPLOAD_TEST_DATA']:
    #     config['TEST_REQUEST'] = 'tstvehOdeTstRequest1255178960'
    #     depositClient.update_config(config)
    #     thread.start_new_thread(depositClient._run_main, (config,))

    websocket.enableTrace(False)
    # auth_header  = "Authorization: Basic dXNlckBsaWZlcmF5LmNvbTp0ZXN0" # user@liferay.com:test
    # invalid_auth_header = "Authorization: Basic dXNlckBsaWZlcmF5LmNvbTp0ZXXX"
    ws = websocket.WebSocketApp(socket_url, header=[], # [auth_header, ],
                                cookie=None,
                                on_message=on_message,
                                on_error=on_error,
                                on_close=on_close,
                                )
    ws.on_open = on_open2

    ws.run_forever()


if __name__ == "__main__":
    _main()  # Parse Command line options and run program
