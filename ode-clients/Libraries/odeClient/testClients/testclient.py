__author__ = '562474'
from .. import client

import logging
import thread
import time

logger = logging.getLogger('odeClient.testClient')

class testClient(client.ODEClient):

    def __init__(self):
        self.host=None


    def _on_open(self,ws):
        pause = 3
        def run(*args):
            time.sleep(pause)
            ws.send(self.request.toJson())
            time.sleep(pause)
        # ws.close()
        #    logger.debug("On_open Run thread stopping...")

        thread.start_new_thread(run, ())

    def set_upload_file(self,file):
