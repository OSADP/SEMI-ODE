
import logging
import Queue
import sys
import json 
import threading, thread
import time

import websocket
import restApi
import exceptions
import response

enableWebSocketTrace = False
logger = logging.getLogger('PythonSDK.odeClient')
websocket.enableTrace(enableWebSocketTrace)

supported_types = {
    "sub":["int","veh","agg"],
    "qry":["int","veh","adv"],
    "tst":["veh"],
    "dep":["veh","adv","asnbase64","asnhex"]
    
	}

class ODEClient(object):


    def __init__(self,host, userName=None,password=None,**kwargs):
        self.host = host
        if userName is not None and password is not None:
            self.get_token(userName,password)
        else:
            self.token = None
        self.ws = None
        self.request = None
        self.queue = Queue.Queue()
        if kwargs:
            self.on_open = kwargs.get('on_open',self._on_open)
        else:
            self.on_open = self._on_open

    def get_token(self,username,password):
        self.token= restApi.login(self.host,username,password)
        if self.token is None:
            logger.warn("Unable to get Access Token from Web Service")

    def get_new_token(self,username,password):
        self.token= restApi.login(self.host,username,password)

    def destroy_token(self):
        return restApi.logout(self.host,self.token)

    def setRequest(self,request):
        self.request = request

    def _on_open(self,ws):
        pause = 3
        def run(*args):
            logger.debug(self.request.toJson())
            time.sleep(pause)
            ws.send(self.request.toJson())
            time.sleep(pause)
        # ws.close()
        #    logger.debug("On_open Run thread stopping...")

        thread.start_new_thread(run, ())


    def connect(self, on_message, on_open=None, **kwargs):

        if self.token is None or self.request is None:
            raise exceptions.ODEConnectionException("Missing Token or Request")
        
        uri = "{0}/{1}".format(self.request.requestType, self.request.dataType)

        socket_url = "ws://{0}/api/ws/{1}?token={2}".format(self.host, uri, self.token)
        logger.info("Connecting to: %s", socket_url)
        self.ws = websocket.WebSocketApp(socket_url, header=kwargs.get("header", []),
                                cookie=kwargs.get("cookie", None),
                                on_message=on_message,
                                on_error=kwargs.get("on_error", on_error),
                                on_close=kwargs.get("on_close", on_close),
                                )
        if on_open is None:
            self.ws.on_open= self.on_open
        else:
            self.ws.on_open = on_open

        self.ws.run_forever()

    def disconnect(self):
        self.ws.close()
        
    def getMessages(self, number_of_message):
        """
        Get list messages from an Internal non-blocking FIFO queue object 
 
        :return: list of up to number_of_message, may return less if queue contains less messages
        """
        result = []
        for n in range(number_of_message):
            if not self.queue.notempty():
                result.append(self.queue.get_nowait())
            else:
                break
        return result

    def on_messageQueue(self,ws, message):
        self.queue.put_nowait(response.BaseResponse(message))

class AsyncODEClient(threading.Thread):
    def __init__ (self, *args, **kwargs):
        if kwargs.get("odeClient",None) is not None:
            self.client = kwargs.get("odeClient")
        else:
            self.client = ODEClient(*args,**kwargs)
        threading.Thread.__init__(self)
        self.queue = Queue.Queue()
        self._stop = threading.Event()
        self.daemon = True

    def setRequest(self,request):
        self.client.setRequest(request)

    def is_buffer_empty(self):
        return self.queue.empty()
    
    def get_all_messages(self):
        if not self.is_buffer_empty():
            return self.get_messages(self.queue.qsize())
        else:
            return []
    
    def get_messages(self, number_of_message):
        """
        Get list messages from an Internal non-blocking FIFO queue object 
 
        :return: list of up to number_of_message, may return less if queue contains less messages
        """
        result = []
        for n in range(int(number_of_message)):
            if not self.is_buffer_empty():
                result.append(self.queue.get_nowait())
            else:
                break
        return result

    def on_messageQueue(self, ws, message):
        self.queue.put_nowait(response.BaseResponse(message))

    def run(self,*args,**kwargs):
        self.client.connect(on_message=self.on_messageQueue, *args,**kwargs)

    def stop(self):
        self._stop.set()
        self.client.ws.close()

    def stopped(self):
        return self._stop.isSet()


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
    def __init__(self, requestType, dataType, geographicRegion, **kwargs):
        self.geographicRegion = geographicRegion

        #if supported_types.has_key(requestType) and dataType in supported_types[requestType]:
        self.requestType = requestType
        self.dataType = dataType

        if kwargs is None:
            kwargs = {}
        self.polyline = kwargs.get('roadSegments', [])
        self.dataSource = kwargs.get('dataSource', None )
        #else:
        #    raise exceptions.UnsupportedRequestType("Unsupported request type for {} and {}".format(requestType,dataType))

    def add_road_segments(self,segment):
        self.polyline.append(segment)

    def toJson(self):
        msg = json.loads(self.geographicRegion.toJson())
        if self.polyline:
            segment = {'segments': [json.loads(segment.toJson()) for segment in self.polyline]}
            msg['polyline'] = segment
        if self.dataSource:
            msg['dataSource']=self.dataSource
        return json.dumps(msg)


class QueryRequest(BaseRequest):
    def __init__(self, type, geographicRegion, startDate,endDate, skip, limit,**kwargs):
        self.startDate = startDate
        self.endDate = endDate
        self.skip = skip
        self.limit = limit
        BaseRequest.__init__(self,"qry", type, geographicRegion,**kwargs)
    

    def toJson(self):
        msg = json.loads(super(QueryRequest,self).toJson())
        msg["startDate"] = self.startDate
        msg["endDate"] = self.endDate
        msg["skip"] = self.skip
        msg["limit"] = self.limit
        return json.dumps(msg)


class SubscriptionRequest(BaseRequest):
    def __init__(self, type, geographicRegion,**kwargs):
        BaseRequest.__init__(self, "sub", type, geographicRegion, **kwargs)


class RoadSegment(object):
    def __init__(self, id, startPoint=None, endPoint=None, previousSegmentId=None):
        """
            :param id: User defined Road Segment Identifier
            :param startPoint: Road Segment Start Point, Not Required if PreviousSegmentID is Provided
            :param endPoint: Road Segment End Point
            :param previousSegmentId: Only required if startPoint is not Provided

        """

        self._id = id
        self.endPoint = endPoint

        if startPoint is None and previousSegmentId is not None:
            self.startPoint = None
            self.previousSegment = previousSegmentId
        elif startPoint is not None and previousSegmentId is None:
            self.startPoint = startPoint
            self.previousSegment = None
        else:
            raise Exception("Invalid RoadSegment Configuration")

    def toJson(self):
        msg = {}
        msg["id"] = self._id
        msg["endPoint"]= json.loads(self.endPoint.toJson())

        if self.previousSegment is not None:
            msg['prevSegment'] = self.previousSegment
        else:
            msg['startPoint']= json.loads(self.startPoint.toJson())
        return json.dumps(msg)

class OdePoint(object):

    def __init__(self, latitude, longitude):
        self.latitude = latitude
        self.longitude = longitude

    def toJson(self):
        msg = {
           "latitude": self.latitude,
            "longitude": self.longitude
        }
        return json.dumps(msg)

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
    logger.debug('Closing Web Socket via "OnCLose" Function')
    sys.exit()

def on_message(ws,message):
    print message