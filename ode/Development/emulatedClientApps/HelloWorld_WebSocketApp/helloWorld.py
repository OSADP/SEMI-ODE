__author__ = '562474'

import sys
import datetime

from odeClient import client, timehelpers


import logging
logger = logging.getLogger("odeClient")
logger.setLevel(logging.DEBUG)
ch = logging.StreamHandler(stream=sys.stdout)
ch.setLevel(logging.DEBUG)
formatter = logging.Formatter('%(asctime)s-%(name)s-%(levelname)s: %(message)s', datefmt="%Y-%m-%dT%H:%M:%S")
ch.setFormatter(formatter)

logger.addHandler(ch)

nwLat=44.0
nwLon=-86.0
seLat=37.0
seLon=-75.1

region = client.GeographicRegion(nwLat,nwLon,seLat,seLon)

skip = 0
limit = 10
start_date = datetime.datetime(2015, month=1, day=1, hour=1, minute=1, second=30, tzinfo=timehelpers.ZULU())
end_date =  datetime.datetime(2015, month=10, day=1, hour=23, minute=59, second=59, microsecond=999,
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

#host = "52.20.100.211:8080/ode"#  "192.168.33.12:8080/ode"
host = "192.168.33.12:8080/ode"

userName="user@liferay.com"
password="test"


ode = client.ODEClient(host)
# ode = client.ODEClient(host,userName,password)

# only required if no userName or password is
# provided in the constructor.
#
# Access Token is short lived token that will expire.
# A new Token will need to be requested if the websocket is stopped
ode.get_token(userName,password)

# set Request Object
#ode.setRequest(sub_request)
ode.setRequest(qry_request)

"""
 The connect method will start the Websocket connection.

 client.on_message is a prebuilt on_message call back function  for the Web Socket.
 Developers will need to create their own on_message call back function based on their needs
 in order to process messages.

 The "on_message" call back takes  two arguments, a reference to the websocket and the message itself
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
 * The current output from the get_messages function is a list of JSON encoded Strings
 ** You must parse  each entry with a JSON parser  in order to manipulate the entry.
 """

async = client.AsyncODEClient(odeClient=ode)
async.start() # will connect to the ODE in a separate thread.
import time
while True:
    if not async.is_buffer_empty():
        val = async.get_messages(4)
        print "Outputting: ", val
    time.sleep(5)