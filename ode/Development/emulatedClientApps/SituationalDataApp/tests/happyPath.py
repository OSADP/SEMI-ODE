import unittest
import sys
from test_Case9_Validate_Spatial_Data import ODE_TestCase9_Validate_Spatial_Values_in_VehicleSubscription

# Update Happy Path Test Suite as needed
if __name__ =='__main__':
    suite = unittest.TestSuite()
    suite.addTests(unittest.makeSuite(ODE_TestCase9_Validate_Spatial_Values_in_VehicleSubscription))

    runner = unittest.TextTestRunner(stream=sys.stdout,verbosity=2)
    runner.run(suite)
