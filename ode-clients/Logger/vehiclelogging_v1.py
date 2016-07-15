#Code developed by Raj Kamalanathsharma (Booz Allen Hamilton) - Kamalanathsharma_Raj@bah.com

import os
import sys
import datetime
import json

try:
    import odeClient
except:
    current_file_path = os.path.dirname(os.path.abspath(__file__))
    sys.path.insert(1,os.path.join(current_file_path,'..','..','apps','PythonSDK'))

from odeClient import client, timehelpers


import logging
logger = logging.getLogger("odeClient")
logger.setLevel(logging.DEBUG)
formatter = logging.Formatter('%(asctime)s-%(name)s-%(levelname)s: %(message)s')#, datefmt="%Y-%m-%dT%H:%M:%S.%f")

current_date_time = datetime.datetime.now().strftime("%Y-%m-%dT%H_%M_%S")
log_name = 'GUIAppODE_{}.log'.format(current_date_time)
fh = logging.FileHandler(os.path.join('GUIlogs',log_name)) # logs
fh.setLevel(logging.DEBUG)
fh.setFormatter(formatter)
logger.addHandler(fh)


ch = logging.StreamHandler(stream=sys.stdout)
ch.setLevel(logging.INFO)
formatter = logging.Formatter('%(asctime)s-%(name)s-%(levelname)s: %(message)s', datefmt="%Y-%m-%dT%H:%M:%S")
ch.setFormatter(formatter)

logger.addHandler(ch)
nwLat=42.3344143862
nwLon=-83.056554794
seLat=42.326815989116625
seLon=-83.033766746521

region = client.GeographicRegion(nwLat,nwLon,seLat,seLon)

sub_data_type = "veh"  # veh, int, agg
sub_request =  client.SubscriptionRequest(sub_data_type, region)

host = "52.90.45.32:8080/ode"
userName="sampleuser@liferay.com"
password="ComplexPassword"

ode = client.ODEClient(host)
#ode = client.ODEClient(host,userName,password)

# only required if no userName or password is
# provided in the constructor.
#
# Access Token is short lived token that will expire.
# A new Token will need to be requested if the websocket is stopped
ode.get_token(userName,password)

# set Request Object
ode.setRequest(sub_request)
#ode.setRequest(qry_request)
logger.debug('VSD Subscription Requested')

"""
 The connect method will start the Websocket connection.

 client.on_message is a prebuilt on_message call back function  for the Web Socket.
 Developers will need to create their own on_message call back function based on their needs
 in order to process messages.

 The "on_message" call back takes  two arguments, a reference to the websocket and the message itself
 The ODE will return JSON formatted strings, so the message will need to parsed using a JSON library,
 or convdeted to an ODE Response.
 Sample call back  method definition:
 def on_message(ws,message):
      print message

"""


def on_message(ws, message):
    try:
        msg = json.loads(message)
        logger.debug("Message: %s",  message)
        if msg.get('payload', {'code': None}).get('code', None) is not None and msg.get('payload').get(
                'code').upper() == 'SUCCESS':
            # send_file(ws,config['INPUT_FILE'])
            logger.debug('Message from the Test API: %s', message)
        elif msg.get('payload', {'code': None}).get('code', None) is not None and msg.get('payload').get(
                'code').upper() == 'FAILURE':
            ws.close()
        else:
            pass
            #logger.debug('Message from the Test API: %s', message)
        if msg.get("payload", {'code': None}).get("code") == 'FAILURE':
            ws.close()
    except:

        # logger.warn(message)
        logger.exception("Exception convert Message to JSON: %s", message)
    #print msg['payload']['spatData']['intersections']['id']
    #print msg['payload']['mapData']['intersections'][0]['refPoint']
    print msg
ode.connect(on_message=on_message)

