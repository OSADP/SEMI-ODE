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


class ODE_TestCase9_Validate_Spatial_Values_in_VehicleSubscription(unittest.TestCase):
    """
    Test ID 9
    Requirement ID’s
     * 3.1.2

    Test Name
     Validate by filtering spatially irrelevant data
    """
    __metaclass__ = LogThisTestCase
    logger = logging.getLogger("Test_Case9_Validate_Spatial_Values")
    logger.propagate = False
    logger.setLevel(logging.DEBUG)
    config = testRunnerHelper.parse_config_file(
        os.path.join('.', 'test_config_files', 'test_Basic_Subscription_API_config.ini'))

    def setUp(self):
        ode = client.ODEClient(self.config['HOST'])
        ode.get_token(self.config['USERNAME'], self.config['PASSWORD'])
        self.client = None
        self.client = client.AsyncODEClient(odeClient=ode)
        self.config['DATA'] = "veh"
        self.config['REQUEST_TYPE'] = 'sub'
        self.config['VALIDATION_FILE'] = os.path.join('.', 'test_validation', 'TFR9_sub_veh_10_records_bad_Lat_Long_results.json')
        self.config['TEST_REQUEST'] = None

    def tearDown(self):
        try:
            self.client.stop()
            self.client.client.destroy_token()
            self.client = None
            self.config['TEST_REQUEST'] = None
        except Exception as e:
            pass
        time.sleep(3)

    def test_vehicle_spatial_validation_with_bad_input(self):
        self.config['INPUT_FILE'] = os.path.join('.', 'test_input', 'TF9_sub_veh_10_records_bad_Lat_Long.json')

        request = client.BaseRequest("tst", self.config['DATA'],testRunnerHelper.build_region(self.config['SERVICE_REGION']))
        self.logger.info("Request: %s", request.toJson())
        self.client.setRequest(request)
        self.client.start()
        time.sleep(5)

        self.run_validation_test()

    def test_vehicle_spatial_validation_with_good_input(self):
        self.config['INPUT_FILE'] = os.path.join('.', 'test_input', 'TF9_sub_veh_7_records_good_Lat_Long.json')

        request = client.BaseRequest("tst", self.config['DATA'],testRunnerHelper.build_region(self.config['SERVICE_REGION']))
        self.logger.info("Request: %s", request.toJson())
        self.client.setRequest(request)
        self.client.start()
        time.sleep(5)

        self.run_validation_test()

    def run_validation_test(self):
        valid_ode_output = testRunnerHelper.extract_payload_expected_records(self.config['VALIDATION_FILE'])

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


        veh_count = 0

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

                if msg.get_payload_type() in dataType.VehicleData:
                    self.assertEqual(msg.get_payload_value('dataType', None), 'veh')

                    try:
                        self.assertTrue(testRunnerHelper.validate_location(msg.payload, self.config),
                                        msg="Error Validating Spatial Region in  Record SerialID: {2}  Lat: {0} Long: {1}".format(
                                            msg.get_payload_value("latitude"), msg.get_payload_value("longitude"),msg.get_payload_value("serialId")))

                        # Continue testing if record is within Spatial region
                        key = 'serialId'

                        # Should be one and only one record in the expected result file that matches with the
                        # output from the ode.
                        expected_record = [r for r in valid_ode_output if r[key] == msg.payload[key]]

                        self.assertEquals(len(expected_record),1, msg="Could not find record with serial Id {} in expected results file".format(msg.get_payload_value('serialId')))

                        # Filter records to remove empty Key/Value pairs prior to evaluation
                        actual_record = {k: v for k, v in msg.payload.items() if v!=""}
                        filtered_expected_record ={k: v for k, v in expected_record[0].items() if v!=""}

                        if expected_record is not None:
                            record_delta = set(filtered_expected_record.items()) - set(actual_record.items())
                            actual_record_delta = set(actual_record.items()) - set(filtered_expected_record.items())

                            self.assertTrue( (len(record_delta) == 0 or len(actual_record_delta) == 0),
                                msg="No matching record found. Found similar record Serial Id: {0}.\nExpected: {1}\nActual:   {2}".format(
                                    msg.get_payload_value('serialId'), sorted(record_delta), sorted(actual_record_delta)) )
                            veh_count += 1
                    except AssertionError as e:
                        self.logger.warn(e.message)

            time.sleep(.5)

        self.logger.info("Valid number of vehicle records received: %d",veh_count)
        self.logger.info("Total number of records receive %d",total_records_received )

        self.assertEquals(veh_count,len(valid_ode_output),msg="Did not receive {} valid vehicle records".format(len(valid_ode_output)))
        self.assertEquals(total_records_received, len(valid_ode_output),
                          msg="Received {} more record(s) than expected ".format(total_records_received-len(valid_ode_output)))