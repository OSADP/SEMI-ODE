__author__ = '562474'

import unittest
import sys
import os

try:
    import odeClient
except:
    current_file_path = os.path.dirname(os.path.abspath(__file__))
    sys.path.insert(1, os.path.join(current_file_path, '..', '..', 'apps', 'PythonSDK'))

try:
    from odeClient import client, timehelpers, dataType
    from odeClient.response import BaseResponse as OdeResponse
except:
    print "Error Importing ODE Client. Please install the odeClient Package"
    sys.exit(-1)

import simulatedclient2, json


class odeClient(unittest.TestCase):
    userName = "sampleUser@liferay.com"
    password = "ComplexPassword"
    host = "54.88.79.115:8080/ode"

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def test_access_token_with_valid_UserName_Password(self):
        self.ode = client.ODEClient(self.host, self.userName, self.password)
        self.assertIsNotNone(self.ode.token)


class ValidateDateTime(unittest.TestCase):
    date_json = '{"year":2015,"month":5,"day":13,"hour":15,"minute":52,"second":45.5,"dateTime":"2015-06-13T19:52:45.500+0000"}'

    def setUp(self):
        pass

    def tearDown(self):
        simulatedclient2.config['START_DATE'] = None
        simulatedclient2.config['END_DATE'] = None

    def test_json_dateTime_validates_within_time_interval(self):
        msg = json.loads(self.date_json)
        simulatedclient2.config['START_DATE'] = '2015-06-12T18:52:45.500+0000'
        simulatedclient2.config['END_DATE'] = '2015-06-15T19:52:45.500+0000'
        self.assertTrue(simulatedclient2.validate_datetime(msg))

    def test_json_dateTime_validates_when_equal_to_start_time(self):
        msg = json.loads(self.date_json)
        simulatedclient2.config['START_DATE'] = '2015-06-13T19:52:45.500+0000'
        simulatedclient2.config['END_DATE'] = '2015-06-13T21:52:45.500+0000'
        self.assertTrue(simulatedclient2.validate_datetime(msg))

    def test_json_dateTime_validates_when_equal_to_end_time(self):
        msg = json.loads(self.date_json)
        simulatedclient2.config['START_DATE'] = '2015-06-13T18:52:45.500+0000'
        simulatedclient2.config['END_DATE'] = '2015-06-13T19:52:45.500+0000'
        self.assertTrue(simulatedclient2.validate_datetime(msg))

    def test_json_dateTime_invalidates_within_time_interval(self):
        msg = json.loads(self.date_json)
        simulatedclient2.config['START_DATE'] = '2015-06-14T19:52:45.500+0000'
        simulatedclient2.config['END_DATE'] = '2015-06-15T19:52:45.500+0000'
        self.assertFalse(simulatedclient2.validate_datetime(msg))


class ValidateGeographicRegions(unittest.TestCase):
    veh_json = '{"latitude": 42.3296737, "longitude": -83.0445212, "elevation": 156.9}'
    service_region = {'nwLat': '45.33', 'seLat': '37.0', 'seLon': '-75.1', 'nwLon': '-86.0'}

    def tearDown(self):
        simulatedclient2.config['SERVICE_REGION'] = None

    def test_latitude_and_longitude_within_requested_region(self):
        msg = json.loads(self.veh_json)
        simulatedclient2.config['SERVICE_REGION'] = self.service_region
        self.assertTrue(simulatedclient2.validate_location(msg))
    def test_latitude_and_longitude_within_requested_region(self):
        msg = json.loads(self.veh_json)
        msg['longitude'] = 51.5072
        msg['latitude'] = 0.1275
        simulatedclient2.config['SERVICE_REGION'] = self.service_region
        self.assertFalse(simulatedclient2.validate_location(msg))

    def test_latitude_outside_requested_region(self):
        msg = json.loads(self.veh_json)
        msg['latitude'] = 0.00
        simulatedclient2.config['SERVICE_REGION'] = self.service_region
        self.assertFalse(simulatedclient2.validate_location(msg))

    def test_longitude_outside_requested_region(self):
        msg = json.loads(self.veh_json)
        msg['longitude'] = 0.00
        simulatedclient2.config['SERVICE_REGION'] = self.service_region
        self.assertFalse(simulatedclient2.validate_location(msg))

    def test_latitude_equals_nwLat_validates_true(self):
        msg = json.loads(self.veh_json)
        simulatedclient2.config['SERVICE_REGION'] = self.service_region
        msg['latitude'] = float(self.service_region['nwLat'])
        self.assertTrue(simulatedclient2.validate_location(msg))

    def test_latitude_equals_seLat_validates_true(self):
        msg = json.loads(self.veh_json)
        simulatedclient2.config['SERVICE_REGION'] = self.service_region
        msg['latitude'] = float(self.service_region['seLat'])
        self.assertTrue(simulatedclient2.validate_location(msg))

    def test_longitude_equals_nwLon_validates_true(self):
        msg = json.loads(self.veh_json)
        simulatedclient2.config['SERVICE_REGION'] = self.service_region
        msg['longitude'] = float(self.service_region['nwLon'])
        self.assertTrue(simulatedclient2.validate_location(msg))

    def test_longitude_equals_seLat_validates_true(self):
        msg = json.loads(self.veh_json)
        simulatedclient2.config['SERVICE_REGION'] = self.service_region
        msg['longitude'] = float(self.service_region['seLon'])
        self.assertTrue(simulatedclient2.validate_location(msg))


if __name__ == "__main__":
    unittest.main()  # run all Test
