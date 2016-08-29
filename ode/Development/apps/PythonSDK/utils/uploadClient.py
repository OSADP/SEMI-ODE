from collections import defaultdict
import logging
import thread, time, sys, os
import datetime
import websocket
#import json

current_file_path = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(1, os.path.join(current_file_path, '..'))

import commonUtils
import clientConfig


file_date_format = datetime.datetime.now().strftime("%Y-%m-%dT%H-%M-%S")
logFile = 'uploadClient{}.log'.format(file_date_format)
logger = commonUtils.get_logger('PythonSDK.uploadClient', logging.INFO, logFile)

base_config = {}
config = defaultdict(lambda: None, base_config)

batchRecords = None
batchPeriod = None

maxDotsPerLine = 100
dots = 0

#def update_config(new_config):
#    config.update(new_config)


# Web Socket Functions

def send_file(ws, filePath):
    """

    :rtype : Boolean
    """
    count = 0
    with open(filePath, ) as f:
        batchCount = 0
        for line in f:
            try:
                if line is None or line == "\n":
                    break
                #msg = json.loads(line, encoding='utf-8')
                # msg["dataType"] = config["DATA"]
                # if msg.get('metadata') and msg.get('payload'):
                #     ode_msg = msg
                # else:
                # msg["dataType"] = config["DATA"]
                # ode_msg = {
                #         "metadata": {"payloadType": config["DATA"]},
                #         "payload": msg
                #         }
                #ws.send(json.dumps(msg))
                # ws.send(json.dumps(ode_msg))
                ws.send(line)
                count += 1
                batchCount += 1
                #if count % 100 == 0:
                #    logger.info("Uploaded %d records", count)
            except:
                logger.debug("LINE: %s", line)
                logger.exception("Error Uploading data: %s", line)

            if batchPeriod is not None and batchCount >= batchRecords:
                time.sleep(batchPeriod/1000.0) # uncomment out and  adjust to change how slow/fast data is uploaded
                batchCount = 0

        result = True
    logger.info('*****Uploaded %d records to the ODE *****', count)
#     stopMsg = {"metadata":{"payloadType":"control","version":1},"payload":{"tag":"STOP","dataType":"Control","version":1},"version":1}
#     stopMsg["payload"]["sentRecordCount"] = count 
#     ws.send(json.dumps(stopMsg))
    
    return result


def on_open(ws):
    pause = 7

    def run(*args):
        time.sleep(pause)
        send_file(ws, config['INPUT_FILE'])
        time.sleep(pause)
        logger.info("Done Sending File in 'On_Open' Thread...")
        # on_close(ws)

    thread.start_new_thread(run, ())


def on_message(ws, message):
    try:
        #logger.debug("Message: %s",  message)
        
        global dots
        if dots % maxDotsPerLine == 0:
            sys.stdout.write('\nuploadClient: {0}'.format(dots))
            
        dots += 1
        sys.stdout.write('.')
        #print(message)
    except:

        # logger.warn(message)
        logger.exception("Exception convert Message to JSON: %s", message)


def on_error(ws, error):
    logger.exception(error)
    logger.critical("Closing Web Socket Connection")
    on_close(ws)


def on_close(ws):
    logger.info('Closing Web Socket client via "OnClose" Function')
    ws.close()


def _main():
    this_config = defaultdict(lambda: None, {})
    parser = clientConfig.get_options_parser()
    (options, args) = parser.parse_args()
    
    if len(args) > 0:
        logger.info("Application does not currently use any arguments. Ignoring passed arguments: %s", args)

    if len(sys.argv) < 2:
        parser.print_help()
        sys.exit()
    
    cp = None
    # vars returns a dictionary (__dict__) object from the options which is a optparse.Values object
    # then the config object is updated with the same set of key/value pairs
    this_config.update(vars(options))
    if this_config.get('CONFIG_FILE'):
        cp = clientConfig.get_config_from_file(config['CONFIG_FILE'])
        config.update(cp)

    logger.debug("User Config: %s", this_config)
    config_info = "User:{}, Host: {}, Request Type: {}, Data Type: {} ".format(
            this_config['USERNAME'],
            this_config['HOST'],
            this_config['REQUEST_TYPE'],
            this_config['DATA_TYPE'])

    logger.info(config_info)
    if this_config['PASSWORD'] is None:
        logger.exception("Missing Password. ")
        sys.exit(1)
    global record_count
    record_count = 0.0
    
    global batchPeriod
    if this_config['BP']:
        batchPeriod = this_config['BP']
    
    global batchRecords
    if this_config['BR']:
        batchRecords = this_config['BR']
        
    _run_main(this_config, cp)


def _run_main(this_config, config_file=None):
    if 'LOGGER_NAME' in this_config:
        logger = logging.getLogger(this_config['LOGGER_NAME'])

    config.update(this_config)
    
    global batchPeriod
    if this_config['BP']:
        batchPeriod = this_config['BP']
    
    global batchRecords
    if this_config['BR']:
        batchRecords = this_config['BR']

    request_type = this_config['REQUEST_TYPE']

    if request_type == 'tst':
        data_type = '{0}'.format(this_config['DATA_TYPE'])
    else:
        logger.warn('Subscription type of [%s] is not supported', request_type)
        sys.exit(-1)

    socket_url = "ws://{0}/{1}/ws/{2}/{3}".format(this_config['HOST'], request_type, data_type, this_config['REQUEST_ID'])
    logger.info("Connecting to Upload Web Socket: %s", socket_url)

    global input_file

    if this_config.get('INPUT_FILE'):
        input_file = this_config.get('INPUT_FILE')
    else:
        logger.warn('No input file provided')
        sys.exit(-1)

    logger.info("Uploading Input File: %s", this_config['INPUT_FILE'])
    websocket.enableTrace(False)
    ws = websocket.WebSocketApp(socket_url, header=[], cookie=None,
                                on_open=on_open,
                                on_message=on_message,
                                on_error=on_error,
                                on_close=on_close,
                                )
    ws.run_forever()
    


if __name__ == "__main__":
    _main()

