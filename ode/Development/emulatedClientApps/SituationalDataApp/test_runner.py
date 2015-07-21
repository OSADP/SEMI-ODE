__author__ = '562474'

import simulatedclient

import json
import sys
import time

if __name__ == '__main__':
     #_main() # Parse Command line options

    # Test harness code
    parser = simulatedclient.get_parser()
    (options, args) = parser.parse_args()
    simulatedclient.config.update(vars(options))
    simulatedclient.config['CONFIG_FILE']='.//sample_config.ini'
    if simulatedclient.config.get('CONFIG_FILE'):
        cp = simulatedclient.parse_config_file(simulatedclient.config['CONFIG_FILE'])

    simulatedclient.extract_json_objects(simulatedclient.config.get('VALIDATION_FILE'))

    time.sleep(3)
    with open(simulatedclient.config.get('INPUT_FILE')) as f:
        for line in f:
            try:
                if line is None:
                    break
                simulatedclient.validate_message(json.loads(line))
            except:
                sys.exit()