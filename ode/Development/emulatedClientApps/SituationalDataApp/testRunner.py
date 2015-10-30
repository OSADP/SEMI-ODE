__author__ = '562474'

import unittest
import sys
import os
import json
import time
import datetime

try:
    import odeClient
except:
    current_file_path = os.path.dirname(os.path.abspath(__file__))
    sys.path.insert(1, os.path.join(current_file_path, '..', '..', 'apps', 'PythonSDK'))

try:
    from odeClient import client, timehelpers, dataType, exceptions, restApi
    from odeClient.response import BaseResponse

except:
    print "Error Importing ODE Client. Please install the odeClient Package"
    sys.exit(-1)

import testRunnerHelper
import simulatedclient2
import depositClient
import thread


import logging
logger = logging.basicConfig(level=logging.INFO)

# Test to test DateTime and Geographic Region Validators to ensure they
# work as excepted based on the current ODE specification
class Validate_DateTime_Interval_Validation_Rule(unittest.TestCase):
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

    def test_json_dateTime_validates_false_when_before_start_time(self):
        msg = json.loads(self.date_json)
        simulatedclient2.config['START_DATE'] = '2015-06-14T19:52:45.500+0000'
        simulatedclient2.config['END_DATE'] = '2015-06-15T19:52:45.500+0000'
        self.assertFalse(simulatedclient2.validate_datetime(msg))

    def test_json_dateTime_validates_false_when_after_end_time(self):
        msg = json.loads(self.date_json)
        simulatedclient2.config['START_DATE'] = '2015-06-10T19:52:45.500+0000'
        simulatedclient2.config['END_DATE'] = '2015-06-12T19:52:45.500+0000'
        self.assertFalse(simulatedclient2.validate_datetime(msg))


class Validate_GeographicRegion_Interval_Validation_Rule(unittest.TestCase):
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


class ODE_Client_Authentication_REST_API(unittest.TestCase):
    userName = 'user@liferay.com'
    password = 'test'
    host = '192.168.22.12:8080/ode'

    # userName = "sampleUser@liferay.com"
    # password = "ComplexPassword"
    # host = "54.88.79.115:8080/ode"

    def tearDown(self):
        time.sleep(2)

    def test_access_token_with_valid_UserName_Password(self):
        ode = client.ODEClient(self.host, self.userName, self.password)
        self.assertIsNotNone(ode.token)

    def test_exception_returned_with_invalid_Password(self):
        ode = client.ODEClient(self.host, self.userName, "Wrong Password")
        self.assertRaises(exceptions.ODEConnectionException, ode.connect, None)

    def test_exception_returned_with_invalid_UserName(self):
        ode = client.ODEClient(self.host, "wrongUser@example.com", self.password)
        self.assertRaises(exceptions.ODEConnectionException, ode.connect, None)

    def test_restAPI_log_in(self):
        self.assertIsNotNone(restApi.login(self.host, self.userName, self.password))

    def test_restAPI_log_out(self):
        token = restApi.login(self.host, self.userName, self.password)
        self.assertIsNotNone(token)
        self.assertIsNone(restApi.logout(self.host, token))


class ODE_Streaming_API_Authentication_Tests(unittest.TestCase):
    userName = 'user@liferay.com'
    password = 'test'
    host = '192.168.22.12:8080/ode'
    # userName = "sampleUser@liferay.com"
    # password = "ComplexPassword"
    # host = "54.88.79.115:8080/ode"  #ODE-AWS Test
    #    # "54.88.79.115:8080/ode"

    service_region = {'nwLat': '45.33', 'seLat': '37.0', 'seLon': '-75.1', 'nwLon': '-86.0'}

    start_date = '2014-01-13T19:52:45.500Z'
    end_date = '2015-05-17T17:52:45.500Z'
    skip = 0
    limit = 10

    invalid_token = "ZZZZZXXXXXXXbGciOiJkaXIiLCJlbmMiOiJBMTI4Q0JDLUhTMjU2In0..jhHij4fTNtDbe38qkiPqjQ.gP82_DfoqGHeGMILhTkjCvIVK9Hn_BE9a8LyoQ_SSZ2wuax3cQgcF0HVVTPxLlcoNGfGorwelfm06idRqzeQT-4aHd5YWSWVfGpDotuIehAYYde9Xksw3NosKjk2h8gKj__gC6OzEYjNZNeYReC89OFuFms5QXoLBwzBLDAZDn02EyFPRlXTR_lpCsZ6HaSGXGFET4t3qvGhniBE63WdvEbXry5PGxIFC76zqUT3roq8rcxWCwwFRTRUrHhHmlU0ouqeYZea26euw9Y0NVw7BMilwR1p5SW4yp5vGM0NmMrld4t03T33JBQh0LSMMfbKOnZqFMIis01JBM2beAt85FGj9giGgExL2RFuxbHtMnSUYTsrCZSvvILWuxw7VbAlnqKIsIEofqNxyj6kk2duSVKW8q23N7cjzDEfj3r2mbIb5NMSHYMJkTidYKIquR7c-KV85Q-4YEby24DfxGfrBqg0U27ebl5NjVEO36-gtLfQUELAQhfjycNc1FHuwAWhuBkHAa92X-6q8XEgYX4XQOD3lQHZOt-4MPG5ZiqAcA--5VonPc8N44sU9nkK1bXQCT6DgM_8GMIrfnkFaebrzEBMR2LJ6Ui_2Ol2oIYygqfzC7D8TkEUsJcXpiztJUPsF5slY4KgqJaqNAoaTJ3VyugeEDhlk02kYKkRczlGLyfasRWOH8zvTmRVYYrTysA5c_7tvcO_XHACTf17xTnWtqTcy2V5TsP5MxfONxBUSwtcPrkmyh9XCPW1OPTLiKTiObFSke8GFWawL15QK_oUkaOVCMHY4aFME_gliw8mgzRQhWW59PNpycgUEgb6xHBLJisu6QZnJ2VvYgQa_GsmxA.fWMsegYMRbdfVqDEKjbInQ"

    def setUp(self):
        # Does Not send a Request (Send data) to ODE.
        # Just Connects to ODE & processes the message received in
        # in the client On_message handler

        ode = client.ODEClient(self.host, on_open=lambda ws: None)
        ode.get_token(self.userName, self.password)
        self.client = None
        self.client = client.AsyncODEClient(odeClient=ode)
        self.region = simulatedclient2.build_region(self.service_region)

    def tearDown(self):
        self.client.stop()
        self.client.client.destroy_token()
        self.client = None
        time.sleep(1)

    def build_qry_request(self, data_type):
        return client.QueryRequest(data_type, self.region,
                                   self.start_date,
                                   self.end_date,
                                   self.skip, self.limit)

    def build_sub_request(self, data_type):
        return client.SubscriptionRequest(data_type, self.region)

    def test_Authentication_to_Int_Qry_API(self):
        """
        Will Return ISD Data and not ODE Specific INT Data
        """
        data_type = 'int'
        request = self.build_qry_request(data_type)

        self.client.setRequest(request)
        self.client.start()
        time.sleep(2)
        break_loop = False
        while not self.client.is_buffer_empty() and not break_loop:
            responses = self.client.get_messages(1)
            for msg in responses:
                if msg.get_payload_type() in dataType.Status:
                    self.assertIsNotNone(msg.get_payload_value('code', None))
                    self.assertEqual(msg.get_payload_value('code'), 'SUCCESS', msg)
                    break_loop = True

    def test_Authentication_to_Veh_Qry_API(self):
        data_type = 'veh'
        request = self.build_qry_request(data_type)
        self.client.setRequest(request)
        self.client.start()
        time.sleep(2)
        break_loop = False
        while not self.client.is_buffer_empty() and not break_loop:
            responses = self.client.get_messages(1)
            for msg in responses:
                print msg
                if msg.get_payload_type() in dataType.Status:
                    self.assertIsNotNone(msg.get_payload_value('code', None))
                    self.assertEqual(msg.get_payload_value('code'), 'SUCCESS', msg)
                    beak_loop = True;

    def test_Authentication_to_Adv_Qry_API(self):
        data_type = 'adv'
        request = self.build_qry_request(data_type)
        self.client.setRequest(request)
        self.client.start()
        time.sleep(2)
        break_loop = False
        while not self.client.is_buffer_empty() and not break_loop:
            responses = self.client.get_messages(1)
            for msg in responses:
                print msg
                if msg.get_payload_type() in dataType.Status:
                    self.assertIsNotNone(msg.get_payload_value('code', None))
                    self.assertEqual(msg.get_payload_value('code'), 'SUCCESS', msg)
                    break_loop = True

    def test_Authentication_to_Int_Sub_API(self):
        data_type = 'int'
        request = self.build_sub_request(data_type)
        self.run_valid_authentication_test(request)

    def test_Authentication_to_Veh_Sub_API(self):
        data_type = 'veh'
        request = self.build_sub_request(data_type)
        self.run_valid_authentication_test(request)

    def test_Authentication_to_Agg_Sub_API(self):
        data_type = 'agg'
        request = self.build_sub_request(data_type)
        self.run_valid_authentication_test(request)

    def test_revoked_token_Authentication_to_Int_Qry_API(self):
        data_type = 'int'
        request = self.build_qry_request(data_type)
        self.run_revoked_token_authentication_test(request)

    def test_revoked_token_Authentication_to_Veh_Qry_API(self):
        data_type = 'veh'
        request = self.build_qry_request(data_type)
        self.run_revoked_token_authentication_test(request)

    def test_revoked_token_Authentication_to_Adv_Qry_API(self):
        data_type = 'adv'
        request = self.build_qry_request(data_type)
        self.run_revoked_token_authentication_test(request)

    def test_revoked_token_Authentication_to_Int_Sub_API(self):
        data_type = 'int'
        request = self.build_sub_request(data_type)
        self.run_revoked_token_authentication_test(request)

    def test_revoked_token_Authentication_to_Veh_Sub_API(self):
        data_type = 'veh'
        request = self.build_sub_request(data_type)
        self.run_revoked_token_authentication_test(request)

    def test_revoked_token_Authentication_to_Agg_Sub_API(self):
        data_type = 'agg'
        request = self.build_sub_request(data_type)
        self.run_revoked_token_authentication_test(request)

    def test_revoked_token_Authentication_to_Int_Qry_API(self):
        data_type = 'int'
        request = self.build_qry_request(data_type)
        self.run_revoked_token_authentication_test(request)

    def test_Invalid_Authentication_to_Int_Veh_API(self):
        data_type = 'veh'
        request = self.build_qry_request(data_type)
        self.client.client.token = self.invalid_token
        self.client.setRequest(request)
        self.run_invalid_token_authentication_test()

    def test_Invalid_Authentication_to_Int_Adv_API(self):
        data_type = 'adv'
        request = self.build_qry_request(data_type)
        self.client.client.token = self.invalid_token
        self.client.setRequest(request)
        self.run_invalid_token_authentication_test()

    def test_Invalid_Authentication_to_Int_Sub_API(self):
        data_type = 'int'
        request = self.build_qry_request(data_type)
        self.client.client.token = self.invalid_token
        self.client.setRequest(request)
        self.run_invalid_token_authentication_test()

    def test_Invalid_Authentication_to_Veh_Sub_API(self):
        data_type = 'veh'
        request = self.build_qry_request(data_type)
        self.client.client.token = self.invalid_token
        self.client.setRequest(request)
        self.run_invalid_token_authentication_test()

    def test_Invalid_Authentication_to_Agg_Sub_API(self):
        data_type = 'agg'
        request = self.build_qry_request(data_type)
        self.client.client.token = self.invalid_token
        self.client.setRequest(request)
        self.run_invalid_token_authentication_test()

    def run_valid_authentication_test(self, request):
        self.client.setRequest(request)
        self.client.start()
        time.sleep(2)
        break_loop = False
        while not self.client.is_buffer_empty() and not break_loop:
            responses = self.client.get_messages(1)
            for msg in responses:
                print msg
                if msg.get_payload_type() in dataType.Status:
                    self.assertIsNotNone(msg.get_payload_value('code', None))
                    self.assertEqual(msg.get_payload_value('code'), 'SUCCESS', msg)
                    break_loop = True

    def run_revoked_token_authentication_test(self, request, destroy_token=False):
        self.client.setRequest(request)
        self.assertIsNone(self.client.client.destroy_token())
        self.run_invalid_token_authentication_test()

    def run_invalid_token_authentication_test(self):
        self.client.start()
        time.sleep(2)
        break_loop = False
        while not self.client.is_buffer_empty() and not break_loop:
            responses = self.client.get_messages(1)
            for msg in responses:
                print msg
                if msg.get_payload_type() in dataType.Status:
                    self.assertIsNotNone(msg.get_payload_value('code', None))
                    self.assertEquals(msg.get_payload_value('code'), 'FAILURE')
                    self.assertIn(unicode('Invalid or missing token'), msg.get_payload_value('message', ''))
                    break_loop = True


class ODESubscriptionUploadTestData(unittest.TestCase):
    service_region = {'nwLat': '45.30', 'seLat': '37.0', 'seLon': '-75.1', 'nwLon': '-86.0'}
    userName = 'user@liferay.com'
    password = 'test'
    host = '192.168.22.12:8080/ode'

    config = {'SERVICE_REGION': service_region,
              'SKIP': 0,
              'LIMIT': 4,
              'START_DATE': '2014-01-13T19:52:45.500Z',
              'END_DATE': '2015-05-17T17:52:45.500Z',
              'UPLOAD_TEST_DATA': True,
              'HOST': host,
              'REQUEST_TYPE': 'sub'
              }

    def setUp(self):
        ode = client.ODEClient(self.host, self.userName, self.password)
        self.client = client.AsyncODEClient(odeClient=ode)
        self.region = simulatedclient2.build_region(self.service_region)

    def tearDown(self):
        self.client.stop()
        self.client = None

    def test_Veh_Subscription_with_Upload_Test_Data(self):
        self.config['DATA'] = "veh"
        self.config['VALIDATION_FILE'] = os.path.join('.', 'test_json', 'sub_veh_200_records.json')
        self.config['INPUT_FILE'] = os.path.join('.', 'test_json', 'sub_veh_200_records.json')
        simulatedclient2.config.update(self.config)
        request = client.BaseRequest("tst", self.config['DATA'],
                                     simulatedclient2.build_region(self.config['SERVICE_REGION']))

        self.client.setRequest(request)
        self.client.start()
        time.sleep(5)
        self.config['TEST_REQUEST'] = None
        while not self.client.is_buffer_empty() and self.config['TEST_REQUEST'] is None:
            responses = self.client.get_messages(1)
            for msg in responses:
                if msg.get_payload_type() in dataType.Status and msg.get_payload_value('requestId', False):
                    self.config['TEST_REQUEST'] = msg.get_payload_value('requestId')
                    depositClient.update_config(self.config)
                    thread.start_new_thread(depositClient._run_main, (self.config,))

        # Pause to allow data upload to commence
        # in separate thread, and to allow spark to process the data.
        # Spark may introduce some unknown delay.
        time.sleep(15)
        while not self.client.is_buffer_empty():
            responses = self.client.get_all_messages()
            for msg in responses:
                print msg
                if msg.get_payload_type() in dataType.Status:
                    self.assertIsNotNone(msg.get_payload_value('code', None))
                    self.assertEqual(msg.get_payload_value('code'), 'SUCCESS')

                if msg.get_payload_type() in dataType.VehicleData:
                    self.assertEqual(msg.get_payload_value('dataType', None), 'veh')
                    self.assertTrue(simulatedclient2.validate_location(msg.payload),
                                    msg="Error Validating Spatial Region Lat: {0} Long: {0}".format(
                                        msg.get_payload_value("latitude"), msg.get_payload_value("longitude")))
            time.sleep(5)


if __name__ == "__main__":
    unittest.main()  # run all Test
