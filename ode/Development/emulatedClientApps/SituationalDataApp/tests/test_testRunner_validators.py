__author__ = '562474'

import unittest
import json
import testRunnerHelper

# Test to test DateTime and Geographic Region Validators to ensure they
# work as excepted based on the current ODE specification

class DateTime_Validation_Rule(unittest.TestCase):

    date_json = '{"year":2015,"month":5,"day":13,"hour":15,"minute":52,"second":45.5,"dateTime":"2015-06-13T19:52:45.500+0000"}'
    config = {}

    def setUp(self):
        pass

    def tearDown(self):
        self.config['START_DATE'] = None
        self.config['END_DATE'] = None

    def test_json_dateTime_validates_within_time_interval(self):
        msg = json.loads(self.date_json)
        self.config['START_DATE'] = '2015-06-12T18:52:45.500+0000'
        self.config['END_DATE'] = '2015-06-15T19:52:45.500+0000'
        self.assertTrue(testRunnerHelper.validate_datetime(msg,self.config))

    def test_json_dateTime_validates_when_equal_to_start_time(self):
        msg = json.loads(self.date_json)
        self.config['START_DATE'] = '2015-06-13T19:52:45.500+0000'
        self.config['END_DATE'] = '2015-06-13T21:52:45.500+0000'
        self.assertTrue(testRunnerHelper.validate_datetime(msg,self.config))

    def test_json_dateTime_validates_when_equal_to_end_time(self):
        msg = json.loads(self.date_json)
        self.config['START_DATE'] = '2015-06-13T18:52:45.500+0000'
        self.config['END_DATE'] = '2015-06-13T19:52:45.500+0000'
        self.assertTrue(testRunnerHelper.validate_datetime(msg,self.config))

    def test_json_dateTime_validates_false_when_before_start_time(self):
        msg = json.loads(self.date_json)
        self.config['START_DATE'] = '2015-06-14T19:52:45.500+0000'
        self.config['END_DATE'] = '2015-06-15T19:52:45.500+0000'
        self.assertFalse(testRunnerHelper.validate_datetime(msg,self.config))

    def test_json_dateTime_validates_false_when_after_end_time(self):
        msg = json.loads(self.date_json)
        self.config['START_DATE'] = '2015-06-10T19:52:45.500+0000'
        self.config['END_DATE'] = '2015-06-12T19:52:45.500+0000'
        self.assertFalse(testRunnerHelper.validate_datetime(msg,self.config))

class GeographicRegion_Location_Validation_Rule(unittest.TestCase):

    veh_json = '{"latitude": 42.3296737, "longitude": -83.0445212, "elevation": 156.9}'
    service_region = {'nwLat': '45.33', 'seLat': '37.0', 'seLon': '-75.1', 'nwLon': '-86.0'}
    config = {}

    def tearDown(self):
        self.config['SERVICE_REGION'] = None

    # def test_latitude_and_longitude_within_requested_region2(self):
    #     msg = json.loads(self.veh_json)
    #     self.config['SERVICE_REGION'] = self.service_region
    #     self.assertTrue(testRunnerHelper.validate_location(msg,self.config))

    def test_latitude_and_longitude_within_requested_region(self):
        msg = json.loads(self.veh_json)
        self.config['SERVICE_REGION'] = self.service_region
        self.assertTrue(testRunnerHelper.validate_location(msg,self.config))

    def test_latitude_and_longitude_within_requested_region(self):
        msg = json.loads(self.veh_json)
        msg['longitude'] = 51.5072
        msg['latitude'] = 0.1275
        self.config['SERVICE_REGION'] = self.service_region
        self.assertFalse(testRunnerHelper.validate_location(msg,self.config))

    def test_latitude_outside_requested_region(self):
        msg = json.loads(self.veh_json)
        msg['latitude'] = 0.00
        self.config['SERVICE_REGION'] = self.service_region
        self.assertFalse(testRunnerHelper.validate_location(msg,self.config))

    def test_longitude_outside_requested_region(self):
        msg = json.loads(self.veh_json)
        msg['longitude'] = 0.00
        self.config['SERVICE_REGION'] = self.service_region
        self.assertFalse(testRunnerHelper.validate_location(msg,self.config))

    def test_latitude_equals_nwLat_validates_true(self):
        msg = json.loads(self.veh_json)
        self.config['SERVICE_REGION'] = self.service_region
        msg['latitude'] = float(self.service_region['nwLat'])
        self.assertTrue(testRunnerHelper.validate_location(msg,self.config))

    def test_latitude_equals_seLat_validates_true(self):
        msg = json.loads(self.veh_json)
        self.config['SERVICE_REGION'] = self.service_region
        msg['latitude'] = float(self.service_region['seLat'])
        self.assertTrue(testRunnerHelper.validate_location(msg,self.config))

    def test_longitude_equals_nwLon_validates_true(self):
        msg = json.loads(self.veh_json)
        self.config['SERVICE_REGION'] = self.service_region
        msg['longitude'] = float(self.service_region['nwLon'])
        self.assertTrue(testRunnerHelper.validate_location(msg,self.config))

    def test_longitude_equals_seLat_validates_true(self):
        msg = json.loads(self.veh_json)
        self.config['SERVICE_REGION'] = self.service_region
        msg['longitude'] = float(self.service_region['seLon'])
        self.assertTrue(testRunnerHelper.validate_location(msg,self.config))

if __name__ == '__main__':
    unittest.main()