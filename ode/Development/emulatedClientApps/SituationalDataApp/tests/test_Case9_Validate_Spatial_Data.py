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
    logger = logging.getLogger("ODE_Subscription_Downloads_Connectivity_Tests")
    logger.propagate = False
    logger.setLevel(logging.DEBUG)
    config = testRunnerHelper.parse_config_file(
        os.path.join('.', 'test_config_files', 'test_Basic_Subscription_API_config.ini'))

    def setUp(self):
        ode = client.ODEClient(self.config['HOST'])
        ode.get_token(self.config['USERNAME'], self.config['PASSWORD'])
        self.client = None
        self.client = client.AsyncODEClient(odeClient=ode)

    def tearDown(self):
        try:
            self.client.stop()
            self.client.client.destroy_token()
            self.client = None
        except Exception as e:
            pass
        time.sleep(3)

    def test_Vehicle_Subscription_Spatial_Validation(self):
        self.config['DATA'] = "veh"
        self.config['REQUEST_TYPE'] = 'sub'
        # self.config['VALIDATION_FILE'] = os.path.join('.', 'test_json', 'sub_veh_200_records.json')
        self.config['INPUT_FILE'] = os.path.join('.', 'test_input', 'sub_veh_10_records_bad_Lat_Long.json')
        request = client.BaseRequest("tst", self.config['DATA'],testRunnerHelper.build_region(self.config['SERVICE_REGION']))

        self.client.setRequest(request)
        self.client.start()
        time.sleep(5)
        self.config['TEST_REQUEST'] = None
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
        exception_list = []
        veh_count = 0

        while not (self.client.is_buffer_empty() and veh_count != 0):
            responses = self.client.get_messages(25)
            for msg in responses:
                # self.logger.debug(msg.toJson())
                if msg.get_payload_type() in dataType.Status:
                    self.assertIsNotNone(msg.get_payload_value('code', None))
                    self.assertEqual(msg.get_payload_value('code'), 'SUCCESS')
                    time.sleep(2)
                if msg.get_payload_type() in dataType.VehicleData:
                    self.assertEqual(msg.get_payload_value('dataType', None), 'veh')
                    veh_count += 1
                    try:
                        self.assertTrue(testRunnerHelper.validate_location(msg.payload, self.config),
                                        msg="Error Validating Spatial Region in  Record SerialID: {2}  Lat: {0} Long: {1}".format(
                                            msg.get_payload_value("latitude"), msg.get_payload_value("longitude"),msg.get_payload_value("serialId")))
                    except AssertionError as e:
                        self.logger.warn(e.message)
                        exception_list.append(e)
            time.sleep(.5)

        self.logger.info( "Vehicle Record Count: {}".format(veh_count))
        self.assertEqual(len(exception_list), 3)