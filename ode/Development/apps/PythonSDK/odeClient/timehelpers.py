from datetime import datetime, tzinfo, timedelta

date_format = '%Y-%m-%dT%H:%M:%S.%f%Z'

ZERO = timedelta(0)

class UTC(tzinfo):

    def utcoffset(self, dt):
        return ZERO
    def tzname(self, dt):
        return "UTC"
    def dst(self, dt):
        return ZERO

class ZULU(UTC):
    def tzname(self, dt):
        return "Z"
