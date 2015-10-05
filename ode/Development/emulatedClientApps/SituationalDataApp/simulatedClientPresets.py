__author__ = '562474'

import datetime
from odeClient import client, timehelpers

nwLat = "43.652969118285434"
nwLon = "-85.94707489013672"
seLat = "36.4765153148293"
seLon = "-74.53468322753906"


skip = 0
limit = 100

# 2015-01-01T01:01:30.000Z to  2015-06-15T23:59:59.999Z
start_date = datetime.datetime(2015, month=1, day=1, hour=1, minute=1, second=30, tzinfo=timehelpers.ZULU())
end_date = datetime.datetime(2015, month=6, day=1, hour=23, minute=59, second=59, microsecond=999,
                             tzinfo=timehelpers.ZULU())

date_format = '%Y-%m-%dT%H:%M:%S.%f%Z'

def pre_built_region():
    """

    :rtype : client.GeographicRegion
    """
    return client.GeographicRegion(nwLat, nwLon, seLat, seLon)

def pre_built_queries(data_type):
    return client.QueryRequest(data_type,
                               pre_built_region(),
                               start_date.strftime(timehelpers.date_format),
                               end_date.strftime(timehelpers.date_format),
                               skip,
                               limit)

def pre_built_subscriptions(data_type):
    return client.SubscriptionRequest(data_type, pre_built_region())
