__author__ = '562474'

import sys
import logging

from optparse import OptionParser, SUPPRESS_HELP, OptionGroup
from collections import defaultdict
import ConfigParser

logger = logging.getLogger('simpleApp.clientConfig')
# Command Line Parser Methods
def get_options_parser():
    """
    Creates and returns Parser object with certain default values configured.
    :return: optparse.OptionParser
    """
    parser = OptionParser(
        description="Situation Data App Example",
        conflict_handler="resolve")

    parser.add_option('-?', action='callback', callback=print_help, help=SUPPRESS_HELP)

    req_group = OptionGroup(parser, "Required Parameters")
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

    req_group.add_option('-c', '--config', help='Full path to config File that can be used to override all settings.'
                                                'Config file will override all command line parameters',
                     metavar='CONFIG_FILE',
                     dest='CONFIG_FILE',
                     default=None)

    parser.add_option_group(req_group)

    opt_group = OptionGroup(parser, "Optional Parameters")

    opt_group.add_option('--validationFile', help='Full Path to a File containing JSON output that will be used to'
                                         'validate ODE output instead of default JSON files',
                     metavar='validationFile',
                     dest='VALIDATION_FILE',
                     default=None, )

    opt_group.add_option('--rps', help='The rate of Upload and Deposit in records per second',
                     default=50)

    parser.add_option_group(opt_group)

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

def get_config_parser(file_path):
    config_file = ConfigParser.ConfigParser()
    config_file.optionxform = str
    try:
        config_file.readfp(open(file_path))
    except Exception as e:
        logger.exception('Unable to Open Config File')
        sys.exit(1)
    logger.info("Reading Config File: %s",file_path)
    if config_file.has_section('ode'):
        config['HOST'] = config_file.get('ode', 'host')
        config['REQUEST_TYPE'] = config_file.get('ode', 'requestType')
        config['DATA_TYPE'] = config_file.get('ode', 'dataType')
        config['UPLOAD_TEST_DATA'] = bool (config_file.getboolean('ode', 'uploadData'))
        if config['UPLOAD_TEST_DATA']:
          config['VALIDATION_FILE'] = config_file.get('ode', 'validationFile')
        if config['UPLOAD_TEST_DATA']:
            config['INPUT_FILE'] = config_file.get('ode', 'inputFile')

        config['USERNAME'] = config_file.get('ode', 'userName')
        config['PASSWORD'] = config_file.get('ode', 'password')

    if config_file.has_section('queryParams'):
        config['START_DATE'] = config_file.get('queryParams', 'startDate')
        config['END_DATE'] = config_file.get('queryParams', 'endDate')
        config['SKIP']  = config_file.get('queryParams','skip')
        config['LIMIT'] = config_file.get('queryParams','limit')
    area = None

    if config_file.has_section('serviceRegion'):
        area={}
        for key, value in config_file.items('serviceRegion'):
            area[key] = value

    config['SERVICE_REGION'] = area

    segments = [x for x in config_file.sections() if 'segment' in x]

    if segments is not None:
        road_segments = []
        for segment in segments:
            rs ={}
            for key, value in config_file.items(segment):
                rs[key]=value
            road_segments.append(rs)
        config['ROAD_SEGMENTS'] = road_segments
    else:
       config['ROAD_SEGMENTS'] = None

    if config_file.has_section('options'):
        if config_file.has_option('options', 'captureOutput'):
            config['OUTPUT_TO_FILE'] = bool(config_file.get('options', 'captureOutput'))
        if config_file.has_option('options', 'captureOutputFileName'):
            config['OUTPUT_FILE_NAME'] = config_file.get('options', 'capturedOutputFileName')

    return config_file

