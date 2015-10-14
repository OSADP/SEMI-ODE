__author__ = '562474'

import sys
import logging

from optparse import OptionParser, SUPPRESS_HELP, OptionGroup
from collections import defaultdict
import ConfigParser

logger = logging.getLogger('simpleApp.clientConfig')
# Command Line Parser Methods
def get_parser():
    """
    Creaates and returns Parser object with certain default values configured.
    :return: optparse.OptionParser
    """
    parser = OptionParser(
        description="Situation Data App Example",
        conflict_handler="resolve")

    parser.add_option('-?', action='callback', callback=print_help, help=SUPPRESS_HELP)

    req_group = OptionGroup(parser, "Required Parameters")
    req_group.add_option('-t', '--type', help='Request Type Query - qry, Subscription = sub',
                         metavar='type',
                         dest='REQUEST_TYPE',
                         default='sub')

    req_group.add_option('-d', '--data', help='Data Type (Vehicle, Intersection, Aggregate, Advisory)',
                         metavar='data',
                         dest='DATA',
                         default='veh')

    req_group.add_option('-h', '--host', help='ODE Host with out the HTTP',
                         metavar='host',
                         dest='HOST',
                         default='localhost:8080/ode')

    req_group.add_option('-u', '--user', help='ODE User Name',
                         metavar='username',
                         dest='USERNAME',
                         default='user@liferay.com')

    req_group.add_option('-p', '--password', help='ODE User Password',
                         metavar='password',
                         dest='PASSWORD',
                         default=None)

    parser.add_option_group(req_group)

    group = OptionGroup(parser, "Optional Parameters")

    group.add_option('-f', '--file', help='Full Path to a File containing JSON output that will be used to'
                                          'validaate ODE output instead of default JSON files',
                     metavar='file',
                     dest='VALIDATION_FILE',
                     default=None, )
    group.add_option('-c', '--config', help='Full path to config file File that can be used to override all settings.'
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
