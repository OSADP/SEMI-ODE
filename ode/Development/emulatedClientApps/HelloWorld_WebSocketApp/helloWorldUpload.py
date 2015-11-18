____author__ = '562474'

import os
import sys
import datetime

try:
    import odeClient
except:
    current_file_path = os.path.dirname(os.path.abspath(__file__))
    sys.path.insert(1,os.path.join(current_file_path,'..','..','apps','PythonSDK'))

from odeClient import client, timehelpers

import logging
logger = logging.getLogger("odeClient")
logger.setLevel(logging.DEBUG)
ch = logging.StreamHandler(stream=sys.stdout)
ch.setLevel(logging.DEBUG)
formatter = logging.Formatter('%(asctime)s-%(name)s-%(levelname)s: %(message)s', datefmt="%Y-%m-%dT%H:%M:%S")
ch.setFormatter(formatter)
logger.addHandler(ch)

logger2 = logging.getLogger('simulatedClient.depositClient')
logger2.setLevel(logging.INFO)
logger2.addHandler(ch)

if not os.path.exists('logs'):
    os.makedirs('logs')

current_date_time = datetime.datetime.now().strftime("%Y-%m-%dT%H_%M_%S")
log_name = 'helloWorldUpload_{}.log'.format(current_date_time)
fh = logging.FileHandler(os.path.join('logs',log_name)) # logs
fh.setLevel(logging.DEBUG)
logger.addHandler(fh)
logger2.addHandler(fh)

nwLat=44.0111
nwLon=-86.022
seLat=37.0
seLon=-75.1

region = client.GeographicRegion(nwLat,nwLon,seLat,seLon)

skip = 0
limit = 10
start_date = datetime.datetime(2014, month=1, day=1, hour=01, minute=59, second=30, tzinfo=timehelpers.ZULU())
end_date = datetime.datetime(2015, month=10, day=1, hour=23, minute=59, second=59, microsecond=999,
                             tzinfo=timehelpers.ZULU())

qry_data_type = "veh" # veh, int,  adv
qry_request = client.QueryRequest(qry_data_type,
                                  region,
                                  start_date.strftime(timehelpers.date_format),
                                  end_date.strftime(timehelpers.date_format),
                                  skip,
                                  limit)

sub_data_type = "int"  # veh, int, agg
sub_request =  client.SubscriptionRequest(sub_data_type, region)
test_request = client.BaseRequest("tst","veh",region)

#host =  "54.88.79.115:8080/ode"
#host=  "52.20.100.211:8080/ode"
#userName="sampleuser@liferay.com"
#password="ComplexPassword"

host="192.168.22.12:8080/ode"
userName="user@liferay.com"
password="test"

ode = client.ODEClient(host)
#ode = client.ODEClient(host,userName,password)

# only required if no userName or password is
# provided in the constructor.
#
# Access Token is short lived token that will expire.
# A new Token will need to be requested if the web socket is stopped
ode.get_token(userName,password)

# set Request Object
#ode.setRequest(sub_request)
#ode.setRequest(qry_request)
ode.setRequest(test_request)

"""
 The connect method will start the Web socket connection.

 client.on_message is a prebuilt on_message call back function  for the Web Socket.
 Developers will need to create their own on_message call back function based on their needs
 in order to process messages.

 The "on_message" call back takes  two arguments, a reference to the websocket and the message itself
 The ODE will return JSON formatted strings, so the message will need to parsed using a JSON library,
 or converted to an ODE Response.
 Sample call back  method definition:
 def on_message(ws,message):
      print message

"""

#ode.connect(on_message=client.on_message)

"""
The Asynchronous ODE Client behaves like the regular ODE Client with the following differences:
 * The Asynchronous client will buffer the ODE Output in a thread safe internal Queue
 * The get_message(N number of messages) will return up to N message from the internal Queue
 ** If the Queue contains less then N message, then you receive however many messages that are present at request time.
 * The current output from the get_messages function is a list of ODE Response Objects
 """


async = client.AsyncODEClient(odeClient=ode)
async.start() # will connect to the ODE in a separate thread.
import time
import thread
import depositClient

config = {}

config['HOST']= host
config['REQUEST_TYPE'] = 'sub'
config['DATA'] = 'veh'

config['TEST_REQUEST'] = None
config['INPUT_FILE'] = './/BSM_Trans_small_test.json'
while True:
    items = async.get_all_messages()
    #items = async.get_messages(4) # Specify number of items to process
    for record in items:
        if record.get_payload_type() in ('status',) and record.get_payload_value('requestId', False):
            config['TEST_REQUEST'] = record.get_payload_value('requestId')
            depositClient.update_config(config)
            thread.start_new_thread(depositClient._run_main, (config,))
        else:
            logger.info("%s %s", record.get_payload_value('dateTime'), record.toJson() )
            #print record.metaData # json
            #print record.payload # json
            #print record.get_payload_value(key)
    time.sleep(1)


