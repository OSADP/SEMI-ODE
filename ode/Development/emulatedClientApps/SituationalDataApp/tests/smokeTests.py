__author__ = '562474'

import unittest
from test_ODE_Query_API import ODE_Query_Downloads_Tests
from test_ODE_Subscription_API import ODE_Subscription_Connectivity_Tests



if __name__ =='__main__':
    suite = unittest.TestSuite()

    suite.addTests(unittest.makeSuite(ODE_Subscription_Connectivity_Tests))
    suite.addTests(unittest.makeSuite(ODE_Query_Downloads_Tests))

    runner = unittest.TextTestRunner()
    runner.run(suite)
