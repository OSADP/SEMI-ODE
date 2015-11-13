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


class ODE_Query_Downloads_Tests(unittest.TestCase):
    __metaclass__ = LogThisTestCase
    logger = logging.getLogger("QueryTests")
    logger.setLevel(logging.INFO)

    config = testRunnerHelper.parse_config_file( os.path.join('.','test_config_files','test_Basic_Query_API_config.ini'))

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
        time.sleep(1)

    def test_Connection_to_Vehicle_Query_API(self):
        self.config['DATA'] = 'veh'
        request = testRunnerHelper.build_query_request(self.config)
        self.run_query_test(request,min_queue=25,min_records=5)

     # TODO Change DataType to int

    def test_Connection_to_Intersection_Query_API(self):
        self.config['DATA'] = 'int'
        request = testRunnerHelper.build_query_request(self.config)
        self.run_query_test(request,dataType='isd',min_queue=25,min_records=25)

    @unittest.skip("Aggregate Query Test Not Implemented Yet")
    def test_Connection_to_Aggregate_Query_API(self):
        self.config['DATA'] = 'agg'
        self.config['LIMIT'] = 25
        request = testRunnerHelper.build_query_request(self.config)
        testRunnerHelper.build_road_Segment(request,self.config)
        self.run_query_test(request,min_queue=4,min_records=3,limit=self.config['LIMIT'])

    @unittest.skip("SPAT Query Test Not Implemented Yet")
    def test_Connection_to_SPAT_Query_API(self):
        pass


    @unittest.skip("MAP Query Test Not Implemented Yet")
    def test_Connection_to_MAP_Query_API(self):
        pass

    def run_query_test(self, request,**kwargs):
        self.client.client.setRequest(request)
        self.client.start()
        if kwargs is None:
            kwargs = {}
        record_count = 0
        time.sleep(5)

        self.logger.info(request.toJson())

        while self.client.queue.qsize() <= kwargs.get('min_queue', 10):
            time.sleep(3)

        self.logger.info('validating all returned records to ensure spatial and/or temporal consistency- outliers will be displayed on the screen' \
            + 'exception processing same thing with expected result')

        responses = self.client.get_messages(kwargs.get('limit', 100))
        exception_list = []
        for msg in responses:
            if msg.get_payload_type() in kwargs.get('dataType', request.dataType):
                self.assertEquals(msg.get_payload_type(),kwargs.get('dataType',request.dataType))
                record_count += 1

        # TODO Change assertion as more data types support Lat / Long Keys
        # TODO Change assertion as more data types have their created date
            if msg.get_payload_type() in ('veh',):
                self.assertEqual(msg.get_payload_value('dataType', None), 'veh')
                record_count += 1
                try:
                    self.assertTrue(testRunnerHelper.validate_location(msg.payload, self.config),
                                    msg="Error Validating Spatial Region Record SerialID: {2}  Lat: {0} Long: {1}".format(
                                        msg.get_payload_value("latitude"), msg.get_payload_value("longitude"),msg.get_payload_value("serialId")))

                except AssertionError as e:
                    self.logger.warn(e.message)
                    exception_list.append(e)
                # self.assertTrue(testRunnerHelper.validate_location(msg.payload,self.config), "Location Validation Issue")
                # self.assertTrue(testRunnerHelper.validate_datetime(msg.payload,self.config), "Temporal Validation Issue")

        self.logger.info('Received %s results', record_count)
        self.assertGreaterEqual(record_count,kwargs.get('min_records', 5),
                                "Did Not receive at least {} records from the ODE".format(kwargs.get('min_records', 5)))
        self.assertLessEqual(record_count,kwargs.get('limit', 100),
                             "Received more than the requested amount of records. Request at most {} records".format(kwargs.get('limit' ,100)))

        self.assertEqual(len(exception_list), 0, "Encountered More than expected Validation Errors")


if __name__ == "__main__":
    unittest.main()  # run all Tes