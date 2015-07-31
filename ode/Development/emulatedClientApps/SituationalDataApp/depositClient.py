

import thread, time, datetime, json, sys, os
import logging

from optparse import OptionParser, SUPPRESS_HELP, OptionGroup
from collections import defaultdict
import ConfigParser

import websocket

# logging_level = logging.INFO

# current_date_time = datetime.datetime.now().strftime("%Y-%m-%dT%H_%M_%S")
# log_name = 'simpleApp{}.log'.format(current_date_time)
logger = logging.getLogger('simpleApp.depositClient')
# logger.setLevel(logging.DEBUG)
# fh = logging.FileHandler(log_name)
# fh.setLevel(logging_level)
# # create console handler with a higher log level
# ch = logging.StreamHandler(stream=sys.stdout)
# ch.setLevel(logging_level)
# # create formatter and add it to the handlers
# formatter = logging.Formatter('%(asctime)s-%(levelname)s: %(message)s', datefmt="%Y-%m-%dT%H:%M:%S")
# fh.setFormatter(formatter)
# ch.setFormatter(formatter)
# # add the handlers to the logger
# logger.addHandler(fh)
# logger.addHandler(ch)

base_config = {}
config = defaultdict(lambda: None, base_config)

def update_config(new_config):
    config.update(new_config)


# Web Socket Functions

def send_file(ws,filePath):
    """

    :rtype : Boolean
    """
    with open(filePath,) as f:
        for line in f:
            try:
                if line is None or line=="\n":
                    break
                msg = json.loads(line, encoding='utf-8')
                ws.send(json.dumps(msg))
            except:
                logger.debug("LINE: %s", line)
                logger.exception("Error Reading JSON FIle: %s", input_file)

        result = True
    return result

def on_open(ws):
    pause = 7

    def run(*args):
        time.sleep(2)
        send_file(ws,config['INPUT_FILE'])
        time.sleep(pause)
        logger.info("Done Sending File in 'On_Open' Thread...")
        on_close(ws)

    thread.start_new_thread(run, ())

def on_message(ws,message):

    try:
        msg = json.loads(message,encoding='UTF-8')

        if msg.get('code') is not None and msg.get('code').upper() =='SUCCESS':
       #     send_file(ws,config['INPUT_FILE'])
            logger.debug('Message from the Test API: %s', message)
        else:
            logger.debug('Message from the Test API: %s', message)
    except:
        logger.warn(message)
        # logger.exception("Exception convert Message to JSON: %s", message)

def on_error(ws, error):
    logger.exception(error)
    logger.critical("Closing Web Socket Connection")
    on_close(ws)

def on_close(ws):
    logger.info('Closing DepositClient  Web Socket via "OnCLose" Function')
    ws.close()

def _main():
    # parser = get_parser()
    # (options, args) = parser.parse_args()

    # config.update(vars(options))
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
        config['HOST']=config_file.get('ode','host')
        config['SUB_TYPE']=config_file.get('ode','subscriptionType')
        config['DATA']=config_file.get('ode','dataType')
        config['VALIDATION_FILE']=config_file.get('ode','validationFile')
        config['INPUT_FILE']=config_file.get('ode','inputFile')
    # if config_file.has_section('serviceRegion'):
    #     if config.get('SUB_TYPE') and config.get('SUB_TYPE')== 'sub':
    #         for key,value in config_file.items('serviceRegion'):
    #             area[key]=value # Point is Tuple in form of (Name, Value)
    #     else: # Update Query related Params
    #         for key,value in config_file.items('serviceRegion'):
    #             qry_subs[config['DATA']][key]=value
    #         qry_subs[config['DATA']]['startDate']=config_file.get('queryParams','startDate')
    #         qry_subs[config['DATA']]['endDate']=config_file.get('queryParams','endDate')
    # if config_file.has_section('queryParams') and config.get('SUB_TYPE')== 'qry':
    #     common_params['limit']=config_file.get('queryParams','limit')
    #     common_params['skip']=config_file.get('queryParams','skip')
    #     qry_subs[config['DATA']]['startDate']=config_file.get('queryParams','startDate')
    #     qry_subs[config['DATA']]['endDate']=config_file.get('queryParams','endDate')

    return config_file

def _run_main(config):
    # host = "localhost:10494"
    # socket_url = "ws://localhost:10494/ode/api/ws/sub/ints" # veh, int,agg,
    #	ws://ec2-52-6-61-205.compute-1.amazonaws.com/ode/api/ws/qry/int  #adv, int, veh

    subscription_type = config['SUB_TYPE']

    if subscription_type == 'sub':
        uri = '{0}'.format(config['DATA'])
    else:
        logger.warn('Subscription type of [%s] is not supported', subscription_type)
        sys.exit(-1)

    socket_url = "ws://{0}/tst/ws/{1}/{2}".format(config['HOST'], uri,config['TEST_REQUEST'])
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
    ws = websocket.WebSocketApp(socket_url,header=[], cookie=None,
                                on_message=on_message,
                                on_error=on_error,
                                on_close=on_close,
                                )
    ws.on_open = on_open

    ws.run_forever()

if __name__ == "__main__":
    pass
    # #_main() # Parse Command line options and run program
    # config['CONFIG_FILE']='.//sample_config.ini'
    # parse_config_file(config['CONFIG_FILE'])
    # config['TEST_REQUEST']='tstvehOdeTstRequest1255178960'
    # _run_main(config)
