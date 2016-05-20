# coding=utf-8

import unittest
import sys
import os
import json
import logging
import time
import datetime
import thread
import deposit_TestClient

from __init__ import LogThisTestCase
import testRunnerHelper

try:
    import odeClient
except:
    current_file_path = os.path.dirname(os.path.abspath(__file__))
    sys.path.insert(1, os.path.join(current_file_path, '..', '..', '..', 'apps', 'PythonSDK'))

try:
    from odeClient import client, timehelpers, dataType, exceptions, restApi
    from odeClient.response import BaseResponse

except:
    print "Error Importing ODE Client. Please install the odeClient Package"
    sys.exit(-1)

class ODE_Validation_With_Test_Upload(unittest.TestCase):
    __metaclass__ = LogThisTestCase
    logger = logging.getLogger("ODE_Validation_Upload_TestCase")
    logger.propagate = False
    logger.setLevel(logging.DEBUG)

    config_path = os.path.join('.','test_config_files')

    def initialize(self, full_config_path):
        self.config = config = testRunnerHelper.parse_config_file(full_config_path)

        self.config['START_DATE'] = "2014-01-13T19:52:45.500Z"
        self.config['END_DATE'] = "2015-09-17T17:52:45.500Z"

        self.logger.info(config['TEST_NAME'])
        ode = client.ODEClient(self.config['HOST'])
        ode.get_token(self.config['USERNAME'], self.config['PASSWORD'])
        self.client = None
        self.client = client.AsyncODEClient(odeClient=ode)
        self.config['TEST_REQUEST'] = None

    def tearDown(self):
        try:
            self.client.stop()
            self.client.client.destroy_token()
            self.client = None
            self.config['TEST_REQUEST'] = None
        except Exception as e:
            pass
        time.sleep(1)

    def run_test_with_input(self):
        request = client.BaseRequest("tst", self.config['DATA'],
                                     testRunnerHelper.build_region(self.config['SERVICE_REGION']))
        self.logger.info("Request: %s", request.toJson())
        self.client.setRequest(request)
        self.client.start()
        time.sleep(5)

        self.run_validation_test()

    def run_validation_test(self):
        valid_ode_output = testRunnerHelper.extract_payload_expected_records(self.config['VALIDATION_FILE'], subkey = None)

        while not self.client.is_buffer_empty() and self.config['TEST_REQUEST'] is None:
            responses = self.client.get_messages(2)
            for msg in responses:

                if msg.get_payload_type() in dataType.Status and msg.get_payload_value('requestId', False):
                    self.config['TEST_REQUEST'] = msg.get_payload_value('requestId')
                    deposit_TestClient.update_config(self.config)
                    thread.start_new_thread(deposit_TestClient._run_main, (self.config,))

        # Pause to allow data upload to commence
        # in separate thread, and to allow spark to process the data.
        # Spark may introduce some unknown delay.
        time.sleep(7)

        record_count = 0

        total_records_received = 0

        while not (self.client.is_buffer_empty() and total_records_received != 0):
            responses = self.client.get_messages(25)
            for msg in responses:

                total_records_received += 1
                # Run validation logic over vehicle records and not ODE Status Messages
                if msg.get_payload_type() in dataType.Status:
                    self.assertIsNotNone(msg.get_payload_value('code', None))
                    self.assertEqual(msg.get_payload_value('code'), 'SUCCESS')
                    time.sleep(2)
                elif msg.get_payload_type() in('veh','agg','spat','map','int'):

                    try:

                        key = 'serialId'
                        try:
                            msg.payload[key]
                        except:
                            self.logger.info(msg)

                        expected_record = [r for r in valid_ode_output if r['payload'][key] == msg.payload[key]]
                        expected_record_obj = BaseResponse(json.dumps(expected_record[0]))
                        self.assertEquals(len(expected_record), 1,
                                          msg="Could not find record with serial Id {} in expected results file".format(
                                              msg.get_payload_value('serialId')))


                        # TODO filter road segments if empty string only.
                        actual_record = {k: v for k, v in msg.payload.items() if k not in (u"receivedAt",u"version")}
                        filtered_expected_record = {k: v for k, v in expected_record[0]['payload'].items() if k not in (u"receivedAt",u"version")}

                        # TODO try to output the min/max w/ actual in the error messaging if failure.

                        result, error_msg = testRunnerHelper.validate_violations_metadata(msg,expected_record_obj)
                        self.assertTrue(result,msg=error_msg)

                        if expected_record is not None:
                            record_delta = set(filtered_expected_record.items()) - set(actual_record.items())
                            actual_record_delta = set(actual_record.items()) - set(filtered_expected_record.items())

                            self.assertTrue((len(record_delta) == 0 and len(actual_record_delta) == 0),
                                            msg="No matching record found. Found similar record Serial Id: {0}.\nExpected: {1}\nActual:   {2}".format(
                                                msg.get_payload_value('serialId'), sorted(record_delta),
                                                sorted(actual_record_delta)))
                            record_count += 1
                    except AssertionError as e:
                        self.logger.warn(e.message)

                time.sleep(.5)

        self.logger.info("Valid number of records received: %d", record_count)
        self.logger.info("Total number of records received %d", total_records_received)
        self.logger.info("Total number of expected records %d", len(valid_ode_output))

        self.assertEquals(record_count, len(valid_ode_output),
                          msg="Received {} more(less) record(s) than expected ".format(
                              record_count - len(valid_ode_output)))

    def test_upload_with_good_input(self):
        full_config_path = os.path.join(self.config_path, 'test_Upload_Data_good_input_config.ini')
        self.initialize(full_config_path)

        cwd = os.path.dirname(os.path.realpath(__file__))
        self.config['INPUT_FILE'] = os.path.join(cwd, "test_input", "TF9_sub_veh_7_records_good_Lat_Long.json")
        self.config['VALIDATION_FILE'] = os.path.join(cwd, "test_validation", "TFR9_sub_veh_7_records_good_Lat_Long_results.json")
        self.run_test_with_input()

    def test_upload_with_bad_input(self):
        full_config_path = os.path.join(self.config_path, 'test_Upload_Data_bad_input_config.ini')
        self.initialize(full_config_path)

        cwd = os.path.dirname(os.path.realpath(__file__))
        self.config['INPUT_FILE'] = os.path.join(cwd, "test_input", "TF9_sub_veh_10_records_bad_Lat_Long.json")
        self.config['VALIDATION_FILE'] = os.path.join(cwd, "test_validation", "TFR9_sub_veh_10_records_bad_Lat_Long_results.json")
        self.run_test_with_input()

if __name__ == '__main__':
    unittest.main()  # run all Tests
