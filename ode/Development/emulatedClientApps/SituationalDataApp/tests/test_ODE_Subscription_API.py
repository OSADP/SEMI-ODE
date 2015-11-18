import unittest
import sys
import os
import json
import logging
import time
import datetime

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


class ODE_Subscription_Connectivity_Tests(unittest.TestCase):
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

    # TODO will need to modify returned Data Assertion from ISD TO INT
    def test_Connection_to_Intersection_Sub_API(self):
        self.config['DATA'] = 'int'
        request = testRunnerHelper.build_subscription_request(self.config)
        self.run_subscription_test(request, dataType='isd')  # TODO change to 'int'

    def test_Connection_to_Vehicle_Sub_API(self):
        self.config['DATA'] = 'veh'
        request = testRunnerHelper.build_subscription_request(self.config)
        self.run_subscription_test(request)

    @unittest.skip("Aggregate Subscription Test Not Implemented Yet")
    def test_Connection_to_Aggregate_Sub_API(self):
        self.config['DATA'] = 'agg'
        request = testRunnerHelper.build_subscription_request(self.config)

        self.build_road_Segment(request, self.config)
        self.run_subscription_test(request, min_records=3, min_queue=6)

    # @unittest.skip("SPAT Subscription Test Not Implemented Yet")
    def test_Connection_to_SPAT_Sub_API(self):
        self.config['DATA'] = 'spat'
        request = testRunnerHelper.build_subscription_request(self.config)
        self.run_subscription_test(request,dataType='isd')

    # @unittest.skip("Map Subscription Test Not Implemented Yet")
    def test_Connection_to_MAP_Sub_API(self):
        self.config['DATA'] = 'map'
        request = testRunnerHelper.build_subscription_request(self.config)
        self.run_subscription_test(request,dataType='isd',timeOut=90)

    def run_subscription_test(self, request, **kwargs):
        self.client.client.setRequest(request)
        self.client.start()
        break_loop = False
        if kwargs is None:
            kwargs = {}
        record_count = 0
        time.sleep(5)
        break_loop = False
        self.logger.info(request.toJson())
        start_time = datetime.datetime.utcnow()

        while self.client.queue.qsize() <= kwargs.get('min_queue', 10):
            current_time = datetime.datetime.utcnow()
            time_delta = current_time - start_time
            if time_delta.total_seconds() >= kwargs.get('timeOut',60):
                break
            else:
                time.sleep(2)


        responses = self.client.get_messages(25)
        self.logger.info(
            'validating all returned records to ensure spatial consistency- outliers will be displayed on the screen' \
            + 'exception processing same thing with expected result')
        for msg in responses:
            # Ignore Status and other payload message types
            if msg.get_payload_type() not in ('status','other'):
                self.assertEquals(msg.get_payload_type(), kwargs.get('dataType', request.dataType))
            if msg.get_payload_type() in ('veh',):
                self.assertTrue(testRunnerHelper.validate_location(msg.payload, self.config))

            record_count += 1
        self.logger.info("Total Records Received: %d", record_count)
        self.assertGreaterEqual(record_count, kwargs.get('min_records', 5),
                                "Did Not receive at least {}  records from the ODE".format(
                                    kwargs.get('min_records', 5)))
        self.logger.info("Validated all records")

if __name__ == "__main__":
    unittest.main()  # run all Tes