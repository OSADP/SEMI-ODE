__author__ = '562474'

import inspect
import logging
import sys
import time




class LogThisTestCase(type):
    """
    http://stackoverflow.com/a/15969985
    """

    def __new__(cls, name, bases, dct):
        # if the TestCase already provides setUp, wrap it
        if 'setUp' in dct:
            setUp = dct['setUp']
        else:
            setUp = lambda self: None
            # print "creating setUp..."

        def wrappedSetUp(self):
            for hdlr in self.logger.handlers:
                self.logger.removeHandler(hdlr)
            # self.formatter = logging.Formatter('%(asctime)s-%(name)s-%(levelname)s-%(lineno)d: %(message)s', datefmt="%Y-%m-%dT%H:%M:%S")
            self.formatter = logging.Formatter('%(message)s')
            self.hdlr = logging.StreamHandler(stream=sys.stdout)
            self.hdlr.setLevel(logging.DEBUG)
            self.hdlr.setFormatter(self.formatter)
            self.logger.addHandler(self.hdlr)

            currentTest = self.id().split('.')[-1]
            callingFunction = inspect.stack()[1][3]
            self.logger.info("============Starting %s============\n", currentTest)
            setUp(self)

        dct['setUp'] = wrappedSetUp

        # same for tearDown
        if 'tearDown' in dct:
            tearDown = dct['tearDown']
        else:
            tearDown = lambda self: None

        def wrappedTearDown(self):
            tearDown(self)
            self.logger.info("\n============================================\n")
            self.logger.removeHandler(self.hdlr)

        dct['tearDown'] = wrappedTearDown

        # return the class instance with the replaced setUp/tearDown
        return type.__new__(cls, name, bases, dct)

