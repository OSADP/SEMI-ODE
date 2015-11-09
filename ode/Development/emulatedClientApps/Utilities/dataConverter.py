__author__ = '562474'

import csv
from collections import defaultdict
import json
import sys
from optparse import OptionParser, SUPPRESS_HELP, OptionGroup
import os
import ConfigParser

base_config = {}

def get_empty_config():
    return defaultdict(lambda: None, base_config)

def get_parser():
    """
    Creaates and returns Parser object with certain default values configured.
    :return: optparse.OptionParser
    """
    parser = OptionParser(
        description="JSON FIle Converter for ODE Test Tools",
        conflict_handler="resolve")

    parser.add_option('-?', action='callback', callback=print_help, help=SUPPRESS_HELP)

    req_group = OptionGroup(parser, "Required Options")
    req_group.add_option('-i', '--input', help='Path to input file ',
                         metavar='input_file',
                         dest='INPUT_FILE',
                         default=None)

    req_group.add_option('-o', '--output', help='Path and File name of Output File',
                         metavar='output_file',
                         dest='OUTPUT_FILE',
                         default=None)

    req_group.add_option('-d', '--data', help='Data Type of Records ( veh | int | agg | spat | map )',
                         metavar='data_type',
                         dest='DATA',
                         default=None)

    req_group.add_option('-f', '--format', help='Source File format  ( json | csv )',
                         metavar='format',
                         dest='FORMAT_TYPE',
                         default='json')

    req_group.add_option('-m','--map', help='Key=Value to transform input record key to new ouptut (OldKey=NewKey)',
                         metavar='map',
                         dest='_MAP',
                         action='append')

    req_group.add_option('--drop', help='Column Header of data that will not be included in output',
                         metavar='dropValue',
                         dest='DROP',
                         action='append')
    req_group.add_option('--config', help='Config File that will override all Command Line Settings',
                         metavar='config',
                         dest='CONFIG',
                         default=None)

    parser.add_option_group(req_group)


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



def append_to_file(entry, config, **kwargs):
    with open(os.path.join(config['OUTPUT_FILE']), "a") as myfile:
        myfile.write(entry + "\n")

def convert_file(config, **kwargs):
    count = 0
    with open(config['INPUT_FILE']) as json_file:
        for line in json_file:
            try:
                if line is None or line == "\n":
                    break
                row = transform_row(config, line)
                ode_msg =create_ode_msg(row, config["DATA"])
                append_to_file(json.dumps(ode_msg),config)
                count =+1
            except:
                print "LINE: {}".format( line)
                print "Error Reading JSON FIle: {}".format(config['INPUT_FILE'])
    print "Converted {} Records to new format".format(count)

def convert_csv(config,**kwargs):
    count = 0
    with open(config['INPUT_FILE']) as csvfile:
        reader = csv.DictReader(csvfile)
        try:
            for _row in reader:
                row = transform_row(config, _row)
                ode_msg = create_ode_msg(row, config["DATA"])
                append_to_file(json.dumps(ode_msg),config)
                count += 1
        except Exception as e:
                print e
                print "LINE: {}".format(_row)
                print "Error Reading CSV FIle: {}".format(config['INPUT_FILE'])
    print "Converted {} Records to new format".format(count)

def create_ode_msg(payload, dataType):

    payload["dataType"] = dataType
    ode_msg = {
            "metadata": {"payloadType": dataType},
            "payload": payload
            }
    return ode_msg

def transform_row(config,row,**kwargs):

    if kwargs is None:
        kwargs = {}
    updated_row= None

    if config.get("DROP",None) is not None:
       updated_row = drop_records(config,row)

    if config.get('MAP',None) is not None and updated_row is not None:
        updated_row = update_row_keys(config, updated_row)
    elif config.get('MAP',None) is not None  and updated_row is None:
        updated_row = update_row_keys(config, row)
    else:
        updated_row = row

    return updated_row

def update_row_keys(config,row,**kwargs):

    if kwargs is None:
        kwargs = {}

    new_row = {}
    map_dict = config['MAP']
    for k, v in row.items():
        if k in map_dict.keys():
            new_key = map_dict[k]
            new_row[new_key] = v
        else:
            new_row[k] = v
    return new_row

def drop_records(config,row,**kwargs):
    if kwargs is None:
        kwargs = {}

    filtered_row = {k:v for k, v in row.items() if k not in config.get('DROP')}
    return filtered_row


def convert_map(config):
    _map_values = config.get('_MAP',None)

    map_dict = {}
    if _map_values is not None:
        for entry in _map_values:
            kv = entry.split('=')
            map_dict[kv[0]] = kv[1]
        config['MAP'] = map_dict
    else:
        config['MAP'] = None

def parse_config_file(path_to_config,config=None):
    if config is None:
        config = get_empty_config()

    config_file = ConfigParser.ConfigParser(allow_no_value=True)
    config_file.optionxform = str
    try:
        config_file.readfp(open(path_to_config))
    except Exception as e:
        print ('Unable to Open Config Files')
        print e
        sys.exit(1)
    print "Reading Config File: {}".format(path_to_config)

    if config_file.has_section('dataConverter'):
        config['INPUT_FILE'] = config_file.get('dataConverter', 'input')
        config['DATA'] = config_file.get('dataConverter', 'data')
        config['FORMAT_TYPE'] = config_file.get('dataConverter', 'format')
    if config_file.has_option('dataConverter','output'):
        config['OUTPUT_FILE'] = config_file.get('dataConverter', 'output')

    _map = None
    if config_file.has_section('map'):
        _map={}
        for key, value in config_file.items('map'):
            _map[key] = value
    config['MAP'] = _map

    _drop = None
    if config_file.has_section('drop'):
        _drop = []
        for key, _ in config_file.items('drop'):
            _drop.append(key)
    config['DROP']= _drop

    return config

def _main():
    parser = get_parser()
    (options, args) = parser.parse_args()

    config = get_empty_config()
    config.update(vars(options))
    if config['CONFIG'] is not None:
        parse_config_file(config['CONFIG'],config)

    if config['INPUT_FILE'] is None:
        print "--input is missing"
        sys.exit(-1)

    if config['DATA'] is None:
        print "--data is missing"
        sys.exit(-1)

    if config['FORMAT_TYPE'] is None:
        print "--format is missing"
        sys.exit(-1)

    _run_main(config)

def _run_main(config):

    if config['OUTPUT_FILE'] is None:
            config['OUTPUT_FILE'] = "{}.out.json".format(config['INPUT_FILE'])

    if config['CONFIG'] is None:
        convert_map(config)
    print ""
    print "Input File: %s" %  config['INPUT_FILE']
    print 'Output File: %s' % config['OUTPUT_FILE']

    if config['MAP'] is not None:
        renamed_key = ""
        sorted_keys = sorted(config['MAP'].keys(),  reverse=False)
        for k  in  sorted_keys:
            renamed_key = renamed_key + "\n\t * {0} to {1}".format(k,config['MAP'].get(k))
        print "The following keyxs will be renamed in the output:%s" % renamed_key

    if config['DROP'] is not None:
        dropped_items = ""
        for entry in config['DROP']:
            dropped_items = dropped_items + "\t * "+ entry+"\n"
        print "The following Entries will not appear in the output:\n%s" % dropped_items


    if config['FORMAT_TYPE'].upper()=='JSON':
        convert_file(config)
    elif config['FORMAT_TYPE'].upper()=='CSV':
        convert_csv(config)

if __name__=='__main__':
    _main()