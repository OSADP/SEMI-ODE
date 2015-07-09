#!/bin/env python

import websocket
import thread
import time
import json
import sys

from optparse import OptionParser,SUPPRESS_HELP,OptionGroup
from collections import defaultdict

import timehelpers

base_config={}
config = defaultdict(lambda: None, base_config)
areas_subs = ["veh", "int", "agg" ]
area = {
    'nwLat': "43.652969118285434",
    'nwLon': "-85.94707489013672",
    'seLat': "36.4765153148293",
    'seLon': "-74.53468322753906",
    }
common_params = {
    "skip":"0",
    "limit": "10"
    }


qry_subs = \
    {
    "veh": {
           "nwLat": "43.652969118285434",
           "nwLon": "-85.94707489013672",
           "seLat": "36.47651531482931",
           "seLon": "-74.53468322753902",
           "startDate": "2015-01-01T15:16:15.924Z",
           "endDate": "2015-07-02T15:16:15.924Z",
           },
    "adv": {
           "nwLat": "43.652969118285434",
            "nwLon": "-85.94707489013672",
            "seLat": "36.4765153148293",
            "seLon": "-74.53468322753901",
            "startDate": "2015-01-01T15:17:33.227Z",
            "endDate": "2015-07-02T15:17:33.227Z",

            },
    "int": {
        "nwLat": "43.652969118285499",
        "nwLon": "-85.94707489013672",
        "seLat": "36.47651531482931",
        "seLon": "-74.53468322753906",
        "startDate": "2015-01-01T15:17:33.227Z",
        "endDate": "2015-07-02T15:17:33.227Z",

     },
    }

msg = {} # Empty Message body
json_file = None
# Web Socket Handlers

def on_message(ws, message):


    msg = json.loads(message)
    #print (json.dumps(msg,indent=1, separators=(',', ': ')))
    print (repr(message) + "\n")
    # Remove leading and trailing quotes, replace '\' with empty spaces


    # /sub/int
    print "XXXXXXXXXXXXXXXXXXXXXXXXXXXX\n"
    print msg.keys()
    print "XXXXXXXXXXXXXXXXXXXXXXXXXXXX\n"

    ## validate message to that which is stored locaally
    # iterating over local message  to ensure ordering and values are correct

def on_error(ws, error):
    ws.close()
    print (error)
    print ("### closed on error ###")

def on_close(ws):
    ws.close()
    print ("### closed ###" )


def on_open2(ws):
    def run(*args):
        print 'msg payload'
        print(json.dumps(msg))
        ws.send(json.dumps(msg))
        time.sleep(150)
        ws.close()
        print ("thread terminating...")
    thread.start_new_thread(run, ())

def get_json_file():
    """
    Get correct json file based on subscription type
    :return:
    """
    pass

def validate_message(message):
    #Find corrosponding record in file
    # return true/false
    pass
    json_msg = json.loads(message)



#Command Line Parser Methods

def get_parser():
    parser = OptionParser(
        description ="Situation Data App Example ",
        conflict_handler ="resolve")

    parser.add_option('-?', action='callback', callback=print_help,help=SUPPRESS_HELP)

    req_group = OptionGroup(parser,"Required Parameters")
    req_group.add_option('-t' ,'--type', help = 'Subscription Type Query - qry, Subscription = sub )',
                         metavar='type',
                         dest = 'SUB_TYPE',
                         default = 'sub')

    req_group.add_option('-d', '--data', help = 'Data Type (Vehicle, Intersection, Aggregate, Advisory)',
                         metavar='data',
                         dest = 'DATA',
                         default = 'veh')

    req_group.add_option('-h','--host', help='Hostname',
                         dest= 'HOST',
                         default='localhost:8080/ode')

    parser.add_option_group(req_group)

    # group = OptionGroup(parser, "Optional Parameters")
    #
    # group.add_option('-','--archive_root', help='',
    #                      metavar='',
    #                      dest='',
    #                      default = "", )
    # parser.add_option_group(group)

    return parser


def usage(parser):
    parser.print_help()
    sys.exit(2)


def print_help(option, opt_str, value, parser,*args, **kwargs):
    """
    Call back function to handle printing help when passed -?
    Utitilized instead of updating validation method
    """
    usage(parser)

def _main():
    parser = get_parser()
    (options, args) = parser.parse_args()
    config.update(vars(options))
    _run_main(config)


def _run_main(config):

    # host = "localhost:10494"
    # socket_url = "ws://localhost:10494/ode/api/ws/sub/ints" # veh, int,agg,
#	ws://ec2-52-6-61-205.compute-1.amazonaws.com/ode/api/ws/qry/int  #adv, int, veh

    subscription_type=config['SUB_TYPE']


    if subscription_type == 'sub':
        global msg
        msg = area
        uri = 'sub/{0}'.format(config['DATA'])

    else:
        msg = qry_subs[config['DATA']]
        msg.update(common_params) # add common params
        uri = 'qry/{0}'.format(config['DATA'])

    socket_url = "ws://{0}/api/ws/{1}".format(config['HOST'],uri)


    global json_file
    get_json_file()
    json_file = "Some file"
    print "Sending info"
    print socket_url
    print msg
    print '==============='
    websocket.enableTrace(True)
    ws = websocket.WebSocketApp(socket_url,#"ws://echo.websocket.example/",
                                on_message = on_message,
                                on_error = on_error,
                                on_close = on_close,
                               )
    ws.on_open = on_open2


    ws.run_forever()

if __name__ == "__main__":
    #_main() # Parse Command line options

    # Test harness code

    parser = get_parser()
    (options, args) = parser.parse_args()
    config.update(vars(options))
    config["SUB_TYPE"]='qry'  # sub or qry
    config["DATA"]='veh'
    config['HOST'] = "ec2-52-6-61-205.compute-1.amazonaws.com:8080/ode"
    common_params['limit']="100"
    _run_main(config)
