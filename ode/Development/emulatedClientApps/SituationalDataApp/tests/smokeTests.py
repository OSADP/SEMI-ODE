__author__ = '562474'

import unittest
import sys
from test_ODE_Query_API import ODE_Query_Downloads_Tests
from test_ODE_Subscription_API import ODE_Subscription_Connectivity_Tests

from test_ODE_Multiple_Clients import ODE_Basic_Subscription_Multiple_Clients_Tests

if __name__ == '__main__':
    suite = unittest.TestSuite()

    suite.addTests(unittest.makeSuite(ODE_Subscription_Connectivity_Tests))
    suite.addTests(unittest.makeSuite(ODE_Query_Downloads_Tests))
    suite.addTest(unittest.makeSuite(ODE_Basic_Subscription_Multiple_Clients_Tests))

    runner = unittest.TextTestRunner(stream=sys.stdout)
    runner.run(suite)
