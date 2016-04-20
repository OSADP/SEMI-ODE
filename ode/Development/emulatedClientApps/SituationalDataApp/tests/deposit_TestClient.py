import thread, time, datetime, json, sys, os
import logging

from optparse import OptionParser, SUPPRESS_HELP, OptionGroup
from collections import defaultdict
import ConfigParser
import websocket

import sys

try:
    import odeClient
except:
    current_file_path = os.path.dirname(os.path.abspath(__file__))
    sys.path.insert(1, os.path.join(current_file_path,'..', '..', '..', 'apps', 'PythonSDK'))

try:
    from odeClient import client, timehelpers, dataType
    from odeClient.response import BaseResponse as OdeResponse
except:
    print "Error Please install the odeClient Package"
    sys.exit(-1)

logging_level = logging.DEBUG

# current_date_time = datetime.datetime.now().strftime("%Y-%m-%dT%H_%M_%S")
# log_name = 'simpleApp{}.log'.format(current_date_time)
logger = logging.getLogger('simulatedClient.depositClient')
logger.addHandler(logging.NullHandler())
logger.setLevel(logging_level)
base_config = {}
config = defaultdict(lambda: None, base_config)

records_per_second = 25.0

rate = 1 / records_per_second


def update_config(new_config):
    config.update(new_config)


# Web Socket Functions

def send_file(ws, filePath):
    """

    :rtype : Boolean
    """
    count = 0
    with open(filePath, ) as f:
        for line in f:
            time.sleep(rate) # uncomment out and  adjust to change how slow/fast data is uploaded
            try:
                if line is None or line == "\n":
                    break
                msg = json.loads(line, encoding='utf-8')
                ws.send(json.dumps(msg))
                count += 1
                if count % 100 == 0:
                    logger.info("Uploaded %d records", count)
            except Exception as e:
                logger.warn("LINE: %s", line)
                logger.exception("Error Reading JSON FIle: %s", input_file)
                raise e

        result = True
    logger.info('*****Uploaded %d records to the ODE *****', count)
    return result


def on_open(ws):
    pause = 3

    def run(*args):
        time.sleep(pause)
        send_file(ws, config['INPUT_FILE'])
        time.sleep(pause)
        logger.info("Done Sending File in 'On_Open' Thread...")
        # on_close(ws)

    thread.start_new_thread(run, ())


def on_message(ws, message):
    try:
        msg = json.loads(message, encoding='UTF-8')
        logger.debug("Message: %s",  message)
        if msg.get('payload', {'code': None}).get('code', None) is not None and msg.get('payload').get(
                'code').upper() == 'SUCCESS':
            # send_file(ws,config['INPUT_FILE'])
            logger.info('Message from the Test API: %s', message)
        elif msg.get('payload', {'code': None}).get('code', None) is not None and msg.get('payload').get(
                'code').upper() == 'FAILURE':
            logger.warn(msg.get('payload').get('message'))
            ws.close()
        else:
            pass
            #logger.debug('Message from the Test API: %s', message)
        if msg.get("payload", {'code': None}).get("code") == 'FAILURE':
            ws.close()
    except:

        # logger.warn(message)
        logger.exception("Exception convert Message to JSON: %s", message)


def on_error(ws, error):
    logger.exception(error)
    logger.critical("Closing Web Socket Connection")
    on_close(ws)


def on_close(ws):
    logger.info('Closing DepositClient  Web Socket via "OnCLose" Function')
    ws.close()


def _main(this_config = config):
    # parser = get_parser()
    # (options, args) = parser.parse_args()

    # config.update(vars(options))
    if this_config.get('CONFIG_FILE'):
        cp = parse_config_file(this_config['CONFIG_FILE'])

    _run_main(this_config)


def parse_config_file(file_path):
    config_file = ConfigParser.ConfigParser()
    config_file.optionxform = str
    try:
        config_file.readfp(open(file_path))
    except Exception as e:
        logger.exception('Unable to Open Config File')
        sys.exit(1)
    logger.info("Reading: %s", file_path)
    if config_file.has_section('ode'):
        config['HOST'] = config_file.get('ode', 'host')
        config['REQUEST_TYPE'] = config_file.get('ode', 'requestType')
        config['DATA'] = config_file.get('ode', 'dataType')
        config['VALIDATION_FILE'] = config_file.get('ode', 'validationFile')
        config['INPUT_FILE'] = config_file.get('ode', 'inputFile')

    return config_file


def _run_main(config):
    subscription_type = config['REQUEST_TYPE']

    if subscription_type == 'sub':
        uri = '{0}'.format(config['DATA'])
    else:
        logger.warn('Subscription type of [%s] is not supported', subscription_type)
        sys.exit(-1)

    socket_url = "ws://{0}/tst/ws/{1}/{2}".format(config['HOST'], uri, config['TEST_REQUEST'])
    logger.info("Connecting to Upload Web Socket: %s", socket_url)

    global input_file

    if config.get('INPUT_FILE'):
        input_file = config.get('INPUT_FILE')
    else:
        logger.warn('Subscription type of [%s] is not supported', subscription_type)
        sys.exit(-1)

    logger.info("Connecting to Upload Web Socket: %s", socket_url)
    logger.info("Uploading Input File: %s", config['INPUT_FILE'])
    websocket.enableTrace(False)
    ws = websocket.WebSocketApp(socket_url, header=[], cookie=None,
                                on_message=on_message,
                                on_error=on_error,
                                on_close=on_close,
                                )
    ws.on_open = on_open

    ws.run_forever()


if __name__ == "__main__":
    pass
