
import json
_PAYLOAD_TYPE = 'payloadType'
_DATA_TYPE = 'dataType'

_METADATA = 'metadata'
_PAYLOAD = 'payload'

class BaseResponse(object):
    def __init__(self,json_message = None, metaData=None, payload=None, **kwargs):
        if json_message and (metaData is None and payload is None):
            self.metaData = json.loads(json_message)[_METADATA]
            self.payload = json.loads(json_message)[_PAYLOAD]
        else:
            self.metaData = metaData
            self.payload = payload

    def get_payload_type(self):
        return self.metaData.get(_PAYLOAD_TYPE,None)
    
    def get_data_type(self):
        return self.payload.get(_DATA_TYPE,None)
         
    def get_payload_value(self, key):
        return self.payload.get(key,None)
    
    def get_metadata_value(self, key):
        return self.metaData.get(key,None)
    
    def __str__(self):
        s = "Response Payload Type: "+ self.get_payload_type()
        s = s + "\nPayload: "+ json.dumps(self.payload)
        return s
		
