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


class ODE_Basic_Subscription_Multiple_Clients_Tests(unittest.TestCase):
    __metaclass__ = LogThisTestCase
    logger = logging.getLogger("ODE_Multiple_Clients_Tests")
    logger.propagate = False
    logger.setLevel(logging.DEBUG)

    config1 = testRunnerHelper.parse_config_file(
        os.path.join('.', 'test_config_files', 'test_Basic_Multiple_Clients_config_1.ini'))

    config2 = testRunnerHelper.parse_config_file(
        os.path.join('.', 'test_config_files', 'test_Basic_Multiple_Clients_config_2.ini'))

    client1 = client2 = None
    #
    def create_asyncClient_and_request(self,the_config,**kwargs):
        
        ode = client.ODEClient(the_config['HOST'])
        ode.get_token(the_config['USERNAME'], the_config['PASSWORD'])

        asycODE = client.AsyncODEClient(odeClient=ode)
        if the_config['REQUEST_TYPE'] in ['sub',]:
            request = testRunnerHelper.build_subscription_request(the_config, **kwargs)
        else:
            request = testRunnerHelper.build_query_request(the_config,**kwargs)
        self.logger.info("Request: %s", request.toJson())
        asycODE.setRequest(request)
        return asycODE

    def stop_client(self,client):
        client.client.destroy_token()
        client.stop()

    def setUp(self):
        pass

    def tearDown(self):
        try:
            self.stop_client(self.client1)
            self.stop_client(self.client2)
        except Exception as e:
            pass
        time.sleep(3)

    def test_Connection_to_Vehicle_Sub_API(self):
        dataType = 'veh'
        requestType = 'qry'
        self.config1['DATA'] = dataType
        self.config2['DATA']  = dataType

        self.config1['REQUEST_TYPE'] = requestType
        self.config2['REQUEST_TYPE'] = requestType

        self.client1 = self.create_asyncClient_and_request(self.config1)
        self.client2 = self.create_asyncClient_and_request(self.config2)

        self.client1.start()
        self.client2.start()
        time.sleep(60)

        self.stop_client(self.client1)
        self.stop_client(self.client2)

        # TODO Assert Something
        msg1 = self.client1.get_messages(50)
        for m in msg1:
            print m.toJson()
            if m.get_payload_type() in ('veh',):
                self.assertTrue(testRunnerHelper.validate_datetime(m.payload, self.config1))
                self.assertTrue(testRunnerHelper.validate_location(m.payload, self.config1))

        msg2 = self.client2.get_messages(50)
        for m in msg2:
            print m.toJson()
            if m.get_payload_type() in ('veh',):
                self.assertTrue(testRunnerHelper.validate_datetime(m.payload, self.config1))
                self.assertTrue(testRunnerHelper.validate_location(m.payload, self.config1))


        self.logger.info('Records Received: %d', len(msg1))
        self.logger.info('Records Received: %d', len(msg2))
        self.assertGreaterEqual(len(msg1), 10)

        self.assertLessEqual(len(msg2), 10)


    def run_subscription_test(self, clients, **kwargs):

        for client in clients:
            client.start()

        if kwargs is None:
            kwargs = {}
        record_count = 0
        time.sleep(5)

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
    unittest.main()  # run all Test