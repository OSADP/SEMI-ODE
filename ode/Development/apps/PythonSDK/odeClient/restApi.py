import json
import logging

import httplib2
import base64
#logger = logging.getLogger(__name__)

uriBase = "/api"
POST = 'POST'
GET = 'GET'
DELETE = 'DELETE'

def login(host,username,password):
    client = httplib2.Http()
    client.add_credentials(username,password)
    url = 'http://{}{}{}'.format(host,uriBase,'/auth/login')

    auth = base64.encodestring(username + ':' + password)

    auth_header = { 'Authorization' : 'Basic ' + auth }
    r, c = client.request(url,method=GET, headers=auth_header )

    token = None

    if r is not None and r.status == 200:
        token = json.loads(c)['message']
    return token

def logout(host,token):
    client = httplib2.Http()
    token_header = {'Authorization': 'Bearer {}'.format(token)}
    url = 'http://{}{}{}'.format(host,uriBase,'/auth/logout')

    r, c = client.request(url,method=POST, headers=token_header)

    status = None

    if r is not None and r.status ==200:
        status  = json.loads(c)['code']
    elif r is not None and  r.status==401:
        status  = json.loads(c)['code']
    else:
        status = 'FAILURE'
    return status

