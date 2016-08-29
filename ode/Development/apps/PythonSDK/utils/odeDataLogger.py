#!/bin/env python

from collections import defaultdict
from datetime import datetime
import logging
import os
import sys
import thread

current_file_path = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(1,os.path.join(current_file_path,'..'))

import clientConfig
from odeClient import client, dataType
from odeClient.response import BaseResponse as OdeResponse
import odePresets
from utils import commonUtils, uploadClient, depositClient
from utils.commonUtils import build_request


#import json
#try:
#    from odeClient import client, timehelpers, dataType
#    from odeClient.response import BaseResponse as OdeResponse
#except:
#    print "Error Importing ODE Client. Please install the odeClient Package"
#    sys.exit(-1)




# Logging Setup and Configuration
#
# Set TIME to UTC
# logging.Formatter.converter = time.gmtime

if not os.path.exists('logs'):
    os.makedirs('logs')
if not os.path.exists('output'):
    os.makedirs('output')

file_date_format = datetime.now().strftime("%Y-%m-%dT%H-%M-%S")
logFile = 'odeDataLogger{}.log'.format(file_date_format)
logger = commonUtils.get_logger('PythonSDK.odeDataLogger', logging.INFO, logFile)

# File Name to capture ODE OUTPUT
# Same date time stamp used for log file
base_config = {
    'OUTPUT_FILE_NAME': 'odeDataLogger_output_{0}.json'.format(file_date_format),
    'LOGGER_NAME': logger.name}

config = defaultdict(lambda: None, base_config)

# File Name to capture ODE OUTPUT
# Same date time stamp used for log file
ode_output_file_name = config['OUTPUT_FILE_NAME']

#
# Built in presets
#
region = odePresets.pre_built_region()

# last 24 hours
maxDotsPerLine = 100
dots = 0

###
#
# Main Part of the Application
#
###
def _main():
    parser = clientConfig.get_options_parser()
    (options, args) = parser.parse_args()
    
    if len(args) > 0:
        logger.info("Application does not currently use any arguments. Ignoring passed arguments: %s", args)
        
    if len(sys.argv) < 2:
        parser.print_help()
        sys.exit()
    
    cp = None
    config.update(vars(options))
    if config.get('CONFIG_FILE'):
        cp = clientConfig.get_config_from_file(config['CONFIG_FILE'])
        config.update(cp)

    logger.debug("User Config: %s", config)
    config_info = "User:{}, Host: {}, Request Type: {}, Data Type: {} ".format(
            config['USERNAME'],
            config['HOST'],
            config['REQUEST_TYPE'],
            config['DATA_TYPE'])

    logger.info(config_info)
    if config['PASSWORD'] is None:
        logger.exception("Missing Password.")
        sys.exit(1)
    global record_count
    record_count = 0.0
    _run_main(config, cp)

def _run_main(this_config, config_file=None):
    ode = client.ODEClient(this_config['HOST'], this_config['USERNAME'], this_config['PASSWORD'])

    request = build_request(this_config)

    logger.info("ODE Request: %s", request.toJson() )

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
    #logger.info("Message Value: %s", message)
    global dots
    if dots % maxDotsPerLine == 0:
        sys.stdout.write('\nodeDataLogger: {0}'.format(dots))
        
    dots += 1
    sys.stdout.write('.')
    
    append_to_file(message)
    try:
        msg = OdeResponse(message)

        # Identify Message and perform action(s)
        # Used for the Test Upload
        if msg.get_payload_type() in dataType.Status:
            logger.info("ODE Connection Status: %s Message: %s", msg.get_payload_value('code'), msg.get_payload_value('message'))
            if 'INPUT_FILE' in config and msg.get_payload_value('requestId', None):
                config['REQUEST_ID'] = msg.get_payload_value('requestId')
                logger.info("Request ID: %s", config['REQUEST_ID'])
                if config['REQUEST_TYPE'] == 'tst':
                    thread.start_new_thread(uploadClient._run_main, (config,))
                elif config['REQUEST_TYPE'] == 'sub':
                    thread.start_new_thread(depositClient._run_main, (config,))

        if msg.get_payload_type() in dataType.OtherData and 'STOP' in msg.get_payload_value('fullMessage'):
            ws.close()
        if msg.get_payload_type() in dataType.OtherData and 'STOP' not in  msg.payload.get('fullMessage'):
            logger.info("Other Message Type: %s",msg.payload.get('fullMessage',""))


        # elif msg.get_payload_value("fullMessage"):
        #     logger.info(msg.get("fullMessage"))

    except Exception as e:
        logger.exception("Unable to convert message to json dictionary object. %s", e)
        logger.critical("Message Payload: %s\n", message)

def append_to_file(entry):
    with open(os.path.join('output',ode_output_file_name), "a") as myfile: # output
        myfile.write(entry + "\n")

if __name__ == "__main__":
    _main()  # Parse Command line options and run program