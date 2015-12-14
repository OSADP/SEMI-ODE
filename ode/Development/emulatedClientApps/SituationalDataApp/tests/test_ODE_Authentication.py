__author__ = '562474'

__author__ = '562474'

import unittest
import sys
import os
import json
import time
import datetime
import inspect
from __init__ import LogThisTestCase

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

import testRunnerHelper
import logging
import os


class ODE_Client_Authentication_REST_API(unittest.TestCase):

    config = testRunnerHelper.parse_config_file(os.path.join('.','test_config_files','test_Authentication_config.ini'))

    userName = config['USERNAME']
    password = config['PASSWORD']
    host = config['HOST']

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
    __metaclass__ = LogThisTestCase
    logger = logging.getLogger("unitTest")
    logger.setLevel(logging.INFO)

    config = testRunnerHelper.parse_config_file(os.path.join('.','test_config_files','test_Authentication_config.ini'))

    userName = config['USERNAME']
    password = config['PASSWORD']
    host = config['HOST']

    service_region = config['SERVICE_REGION']
    # {'nwLat': '45.33', 'seLat': '37.0', 'seLon': '-75.1', 'nwLon': '-86.0'}

    start_date = config['START_DATE'] # '2014-01-13T19:52:45.500Z'
    end_date =  config['END_DATE'] #'2015-05-17T17:52:45.500Z'
    skip = config['SKIP']
    limit = config['LIMIT']

    invalid_token = "ZZZZZXXXXXXXbGciOiJkaXIiLCJlbmMiOiJBMTI4Q0JDLUhTMjU2In0..jhHij4fTNtDbe38qkiPqjQ.gP82_DfoqGHeGMILhTkjCvIVK9Hn_BE9a8LyoQ_SSZ2wuax3cQgcF0HVVTPxLlcoNGfGorwelfm06idRqzeQT-4aHd5YWSWVfGpDotuIehAYYde9Xksw3NosKjk2h8gKj__gC6OzEYjNZNeYReC89OFuFms5QXoLBwzBLDAZDn02EyFPRlXTR_lpCsZ6HaSGXGFET4t3qvGhniBE63WdvEbXry5PGxIFC76zqUT3roq8rcxWCwwFRTRUrHhHmlU0ouqeYZea26euw9Y0NVw7BMilwR1p5SW4yp5vGM0NmMrld4t03T33JBQh0LSMMfbKOnZqFMIis01JBM2beAt85FGj9giGgExL2RFuxbHtMnSUYTsrCZSvvILWuxw7VbAlnqKIsIEofqNxyj6kk2duSVKW8q23N7cjzDEfj3r2mbIb5NMSHYMJkTidYKIquR7c-KV85Q-4YEby24DfxGfrBqg0U27ebl5NjVEO36-gtLfQUELAQhfjycNc1FHuwAWhuBkHAa92X-6q8XEgYX4XQOD3lQHZOt-4MPG5ZiqAcA--5VonPc8N44sU9nkK1bXQCT6DgM_8GMIrfnkFaebrzEBMR2LJ6Ui_2Ol2oIYygqfzC7D8TkEUsJcXpiztJUPsF5slY4KgqJaqNAoaTJ3VyugeEDhlk02kYKkRczlGLyfasRWOH8zvTmRVYYrTysA5c_7tvcO_XHACTf17xTnWtqTcy2V5TsP5MxfONxBUSwtcPrkmyh9XCPW1OPTLiKTiObFSke8GFWawL15QK_oUkaOVCMHY4aFME_gliw8mgzRQhWW59PNpycgUEgb6xHBLJisu6QZnJ2VvYgQa_GsmxA.fWMsegYMRbdfVqDEKjbInQ"

    def logPoint(self):
        pass

    def setUp(self):
        # Does Not send a Request (Send data) to ODE.
        # Just Connects to ODE & processes the message received in
        # in the client On_message handler
        ode = client.ODEClient(self.host, on_open=lambda ws: None)
        ode.get_token(self.userName, self.password)
        self.client = None
        self.client = client.AsyncODEClient(odeClient=ode)
        self.region = testRunnerHelper.build_region(self.service_region)

    def tearDown(self):
        try:
            self.client.stop()
            self.client.client.destroy_token()
            self.client = None
        except Exception as e:
            pass
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
                self.logger.info("Response: %s", msg.toJson())
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
                self.logger.info("Response: %s", msg.toJson())
                if msg.get_payload_type() in dataType.Status:
                    self.assertIsNotNone(msg.get_payload_value('code', None))
                    self.assertEqual(msg.get_payload_value('code'), 'SUCCESS', msg)
                    beak_loop = True

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
                self.logger.info("Response: %s", msg.toJson())
                if msg.get_payload_type() in dataType.Status:
                    self.assertIsNotNone(msg.get_payload_value('code', None))
                    self.assertEqual(msg.get_payload_value('code'), u'SUCCESS', msg)
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
                self.logger.info("Response: %s", msg.toJson())
                if msg.get_payload_type() in dataType.Status:
                    self.assertIsNotNone(msg.get_payload_value('code', None))
                    self.assertEqual(msg.get_payload_value('code'), 'SUCCESS', msg)
                    break_loop = True

    def run_revoked_token_authentication_test(self, request, destroy_token=False):
        self.client.setRequest(request)
        self.assertIsNone(self.client.client.destroy_token())
        self.run_invalid_token_authentication_test()

    def run_invalid_token_authentication_test(self):
        self.logger.info("Using Invalid Token")
        self.client.start()
        time.sleep(2)
        break_loop = False
        while not self.client.is_buffer_empty() and not break_loop:
            responses = self.client.get_messages(1)
            for msg in responses:
                self.logger.info("Response: %s", msg.toJson())
                if msg.get_payload_type() in dataType.Status:
                    self.assertIsNotNone(msg.get_payload_value('code', None))
                    self.assertEquals(msg.get_payload_value('code'), 'FAILURE')
                    self.assertIn(unicode('Invalid or missing token'), msg.get_payload_value('message', ''))
                    break_loop = True

if __name__ == "__main__":
    unittest.main()  # run all Tests