__author__ = '562474'

import json
import sys
import os
import ConfigParser

import dateutil.parser

try:
    import odeClient
except:
    current_file_path = os.path.dirname(os.path.abspath(__file__))
    sys.path.insert(1, os.path.join(current_file_path, '..', '..', '..', 'apps', 'PythonSDK'))

try:
    from odeClient import client, timehelpers, dataType, exceptions
    from odeClient.response import BaseResponse as OdeResponse

except:
    print "Error Importing ODE Client. Please install the odeClient Package"
    sys.exit(-1)


def build_region(regionValues):
    return client.GeographicRegion(regionValues["nwLat"],
                                   regionValues["nwLon"],
                                   regionValues["seLat"],
                                   regionValues["seLon"])


def build_query_request(config, **kwargs):
    return client.QueryRequest(config['DATA'],
                               build_region(config['SERVICE_REGION']),
                               config['START_DATE'],
                               config['END_DATE'],
                               config['SKIP'],
                               config['LIMIT'],
                               **kwargs)


def build_subscription_request(config):
    return client.SubscriptionRequest(config.get('DATA'),
                                      build_region(config['SERVICE_REGION']))


def build_road_Segment(request, config):
    for segment in config['ROAD_SEGMENTS']:
        if segment.get('startPoint'):
            startPoint = client.OdePoint(*tuple(segment['startPoint'].split(',')))
        else:
            startPoint = None

        endpoint = client.OdePoint(*tuple(segment['endPoint'].split(',')))
        rs = client.RoadSegment(segment['id'],
                                startPoint=startPoint,
                                endPoint=endpoint,
                                previousSegmentId=segment.get('previousSegmentId', None))
        request.add_road_segments(rs)


def parse_config_file(file_path, config={}, **kwargs):
    if kwargs is None:
        kwargs = {}
        config = {}
    else:
        config = config

    config_file = ConfigParser.ConfigParser()
    config_file.optionxform = str
    try:
        config_file.readfp(open(file_path))
    except Exception as e:
        raise Exception('Unable to Open Config File with path: {}'.format(file_path))

    if config_file.has_section('ode'):
        config['HOST'] = config_file.get('ode', 'host')
        config['REQUEST_TYPE'] = config_file.get('ode', 'requestType')
        config['DATA'] = config_file.get('ode', 'dataType')

        config['USERNAME'] = config_file.get('ode', 'userName')
        config['PASSWORD'] = config_file.get('ode', 'password')

        if config_file.has_option('ode', 'validationFile'):
            config['VALIDATION_FILE'] = config_file.get('ode', 'validationFile')
        else:
            config['VALIDATION_FILE'] = None

        if config_file.has_option('ode', 'inputFile'):
            config['INPUT_FILE'] = config_file.get('ode', 'inputFile')
        else:
            config['INPUT_FILE'] = None

        if config_file.has_option('ode', 'uploadData'):
            config['UPLOAD_TEST_DATA'] = bool(config_file.getboolean('ode', 'uploadData'))
        else:
            config['UPLOAD_TEST_DATA'] = False

        if config_file.has_option('ode', 'subscriptionTimeout'):
            config['SUBSCRIPTION_TIMEOUT'] = config_file.getint('ode', 'subscriptionTImeout')
        else:
            config['SUBSCRIPTION_TIMEOUT'] = 60

        if config_file.has_option('ode', 'testName'):
            config['TEST_NAME'] = config_file.get('ode', 'testName')
        else:
            config['TEST_NAME'] = " "



    if config_file.has_section('queryParams'):
        config['START_DATE'] = config_file.get('queryParams', 'startDate')
        config['END_DATE'] = config_file.get('queryParams', 'endDate')
        config['SKIP'] = config_file.get('queryParams', 'skip')
        config['LIMIT'] = config_file.get('queryParams', 'limit')
    area = None

    if config_file.has_section('serviceRegion'):
        area = {}
        for key, value in config_file.items('serviceRegion'):
            area[key] = value

    config['SERVICE_REGION'] = area

    segments = [x for x in config_file.sections() if 'segment' in x]

    if segments is not None:
        road_segments = []
        for segment in segments:
            rs = {}
            for key, value in config_file.items(segment):
                rs[key] = value
            road_segments.append(rs)
        config['ROAD_SEGMENTS'] = road_segments
    else:
        config['ROAD_SEGMENTS'] = None

    return config


def validate_location(msg_payload, config):
    """
    Validates that the latitude and longitude values for a query result is within the requested
    bounding box region. .
    :return:
    """

    service_region = config['SERVICE_REGION']

    if float(service_region['seLat']) <= float(msg_payload['latitude']) <= float(service_region['nwLat']) and \
                            float(service_region['nwLon']) <= float(msg_payload['longitude']) <= float(service_region['seLon']):
        return True
    else:
        return False


def validate_datetime(msg_payload, config):
    """
     Validates that the dateTime for a query result is within the requested
     start and end time interval.
    :return: boolean result
    """

    record_time = dateutil.parser.parse(msg_payload['dateTime'])
    if dateutil.parser.parse(config.get('END_DATE')) >= record_time >= dateutil.parser.parse(config.get('START_DATE')):
        return True
    else:
        return False


def extract_payload_expected_records(json_file, subkey='payload'):
    json_file_data = []

    with open(json_file, ) as f:
        for line in f:
            try:
                if line is None or line == "\n":
                    break
                if subkey is not None:
                    json_file_data.append(json.loads(line, encoding='utf-8')[subkey])
                else:
                    json_file_data.append(json.loads(line, encoding='utf-8'))
            except Exception as e:
                print e.message
                sys.exit(-1)

    return json_file_data
