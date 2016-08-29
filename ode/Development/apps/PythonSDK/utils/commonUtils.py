import datetime
import logging
import os, sys

from odeClient import client, timehelpers
from utils import odePresets


end_date = datetime.datetime.now().strftime(timehelpers.date_format)
start_date = (datetime.datetime.now() - datetime.timedelta(days=1)).strftime(timehelpers.date_format)

skip = odePresets.skip
limit = odePresets.limit

def get_logger(logerName, logging_level, logFile):
    logger = logging.getLogger(logerName)
    logger.setLevel(logging_level)
    
    fh = logging.FileHandler(os.path.join('logs',logFile)) # logs
    fh.setLevel(logging.DEBUG)
    # create console handler with a higher log level
    ch = logging.StreamHandler(stream=sys.stdout)
    ch.setLevel(logging_level)
    # create formatter and add it to the handlers
    formatter = logging.Formatter('%(asctime)s-%(name)s-%(levelname)s: %(message)s', datefmt="%Y-%m-%dT%H:%M:%S")
    fh.setFormatter(formatter)
    ch.setFormatter(formatter)
    # add the handlers to the logger
    logger.addHandler(fh)
    logger.addHandler(ch)
    
    return logger

def build_request(config):
    request = None

    area = config.get('SERVICE_REGION', None)

    if area is not None:
        region = build_region(area)

    if config.get('REQUEST_TYPE', None):
        if config.get('REQUEST_TYPE') == 'sub':
            request = client.SubscriptionRequest(config.get('DATA_TYPE'),region)
        elif config.get('REQUEST_TYPE') == 'qry':
            request = client.QueryRequest(config.get('DATA_TYPE'),
                                          region,
                                          config.get('START_DATE', start_date),
                                          config.get('END_DATE', end_date),
                                          config.get('SKIP', skip),
                                          config.get('LIMIT', limit))
        elif "INPUT_FILE" in config and (config.get('REQUEST_TYPE') == 'tst' or 
                                         config.get('REQUEST_TYPE') == 'dep'):
            request = client.BaseRequest(config.get('REQUEST_TYPE'), 
                                         config.get('DATA_TYPE'),
                                         region)

    if config.get('ROAD_SEGMENTS',False):
        for segment in config['ROAD_SEGMENTS']:
            if segment.get('startPoint'):
                startPoint = client.OdePoint(*tuple(segment['startPoint'].split(',')))
            else:
                startPoint=None

            endpoint = client.OdePoint(*tuple(segment['endPoint'].split(',')))
            rs = client.RoadSegment(segment['id'],
                                    startPoint=startPoint,
                                    endPoint=endpoint,
                                    previousSegmentId=segment.get('previousSegmentId',None))
            request.add_road_segments(rs)
    return request

def build_region(regionValues):
    """
    :rtype : odeClient.client.GeographicRegion
    """
    return client.GeographicRegion(regionValues["nwLat"],
                                   regionValues["nwLon"],
                                   regionValues["seLat"],
                                   regionValues["seLon"] )

