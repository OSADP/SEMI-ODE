
import logging
import time
import sys
import json 
import thread
import websocket
import restApi


enableWebSocketTrace = False
logger = logging.getLogger('odeClient')
websocket.enableTrace(enableWebSocketTrace)

class ODEClient(object):


    def __init__(self,host, userName=None,password=None):
        self.host = host
        if userName is not None and password is not None:
            self.get_token(userName,password)
        else:
            self.token = None
        self.ws = None
        self.request = None

    def get_token(self,username,password):
        self.token= restApi.login(self.host,username,password)
        if self.token is None:
            print("Unable to get Access Token from Web Service")


    def get_new_token(self,username,password):
        self.token= restApi.login(self.host,username,password)

    def destroy_token(self):
        restApi.logout(self.host,self.host)

    def setRequest(self,request):
        self.request = request

    def _on_open(self,ws):
        pause = 5
        def run(*args):
            logger.debug(self.request.toJson())
            time.sleep(pause)
            ws.send(self.request.toJson())
            time.sleep(pause)
        # ws.close()
            logger.debug("On_open Run thread stopping...")

        thread.start_new_thread(run, ())


    def connect(self, on_message, on_open=None, **kwargs):

        if self.token is None or self.request is None:
            logger.critical("Missing Token or Request")
        
        uri = "{0}/{1}".format(self.request.requestType, self.request.dataType)

        socket_url = "ws://{0}/api/ws/{1}?token={2}".format(self.host, uri, self.token)
        self.ws = websocket.WebSocketApp(socket_url, header=kwargs.get("header", []), 
                                cookie=kwargs.get("cookie", None),
                                on_message=on_message,
                                on_error=kwargs.get("on_error", on_error),
                                on_close=kwargs.get("on_close", on_close),
                                )

        if on_open is None:
            self.ws.on_open = self._on_open
        else:
            self.ws.on_open = on_open

        self.ws.run_forever()


class GeographicRegion(object):
    def __init__(self,northWestLat,northWestLon,southEastLat,southEastLon):
        self.nwLat = northWestLat
        self.nwLon = northWestLon
        self.seLat = southEastLat
        self.seLon = southEastLon
    

    def toJson(self):
        msg = {"nwLat" : self.nwLat,
               "nwLon" : self.nwLon, 
               "seLat" : self.seLat, 
               "seLon" : self.seLon}
        return json.dumps(msg)


class BaseRequest(object):
    def __init__(self, requestType, dataType, geographicRegion):
        self.dataType = dataType
        self.requestType = requestType
        self.geographicRegion = geographicRegion        

    def toJson(self):
        return self.geographicRegion.toJson()

class QueryRequest(BaseRequest):
    def __init__(self, type, geographicRegion, startDate,endDate, skip, limit):
        self.startDate = startDate
        self.endDate = endDate
        self.skip = skip
        self.limit = limit
        BaseRequest.__init__(self,"qry", type, geographicRegion)
    

    def toJson(self):
        msg = json.loads(super(QueryRequest,self).toJson())
        msg["startDate"] = self.startDate
        msg["endDate"] = self.endDate
        msg["skip"] = self.skip
        msg["limit"] = self.limit
        return json.dumps(msg)


class SubscriptionRequest(BaseRequest):
    def __init__(self, type, geographicRegion  ):
        BaseRequest.__init__(self, "sub", type, geographicRegion)


# web Socket Helper Methods
def on_error(ws, error):
    """
    Stop the subscription / query on the ODE and then close the socket.
    :param ws:
    :param error:
    :return:
    """
    # ws.close()
    logger.exception(error)
    logger.critical("Error - Closing Web Socket Connection")
    on_close(ws)

def on_close(ws):
    ws.close()
    logger.info('Closing Web Socket via "OnCLose" Function')
    sys.exit()

def on_message(ws,message):
    print message