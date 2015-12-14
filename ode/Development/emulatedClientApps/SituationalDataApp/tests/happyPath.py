import unittest
import os
import sys
# from test_Case9_Validate_Spatial_Data import ODE_TestCase9_Validate_Spatial_Values_in_VehicleSubscription
from  test_with_Upload_Data import ODE_Validation_With_Test_Upload

# Update Happy Path Test Suite as needed
if __name__ =='__main__':
    suite = unittest.TestSuite()

    # suite.addTests(unittest.makeSuite(ODE_TestCase9_Validate_Spatial_Values_in_VehicleSubscription))
    config_path = os.path.join('.','test_config_files')

    # Test Case 9
    suite.addTest(ODE_Validation_With_Test_Upload(config_path=os.path.join(config_path, 'testCase_9_config.ini')))
    suite.addTest(ODE_Validation_With_Test_Upload(config_path=os.path.join(config_path, 'testCase_9__with_bad_input_dataFile_config.ini')))


    runner = unittest.TextTestRunner(stream=sys.stdout,verbosity=1)
    runner.run(suite)
