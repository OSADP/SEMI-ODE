__author__ = '562474'

import simulatedclient2
import unittest
import json
import sys
import time

class ValidateGeographicRegions(unittest.TestCase):

    def setUp(self):
        pass
    def tearDown(self):
        pass
    def test(self):
        pass



if __name__=="__main__":
    unittest.main() # run all Test

     #json = '{"groupId":"4130008F","accelLong":0.34,"accelVert":0.0,"accellYaw":8.42,"heading":65.95,"speed":8.12,"sizeLength":500,"sizeWidth":200,"latitude":42.3296667,"longitude":-83.044539,"elevation":156.9,"tempId":"C4290123","year":2015,"month":5,"day":13,"hour":15,"minute":52,"second":45.5,"dateTime":"2015-06-13T19:52:45.500+0000","serialId":"10817812-036b-4d7b-867b-ae0bc62a2b3e.0","receivedAt":"2015-07-22T19:21:16.413+0000","dataType":"veh"}'

     #_main() # Parse Command line options

    # Test harness code
    # parser = simulatedclient.get_parser()
    # (options, args) = parser.parse_args()
    # simulatedclient.config.update(vars(options))
    # simulatedclient.config['CONFIG_FILE']='.//sample_config.ini'
    # if simulatedclient.config.get('CONFIG_FILE'):
    #     cp = simulatedclient.parse_config_file(simulatedclient.config['CONFIG_FILE'])
    #
    # simulatedclient.extract_json_objects(simulatedclient.config.get('VALIDATION_FILE'))
    #
    # time.sleep(3)
    # with open(simulatedclient.config.get('INPUT_FILE')) as f:
    #     for line in f:
    #         try:
    #             if line is None:
    #                 break
    #             simulatedclient.validate_message(json.loads(line))
    #         except:
    #             sys.exit()