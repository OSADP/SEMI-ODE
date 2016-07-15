#Code developed by Raj Kamalanathsharma (Booz Allen Hamilton) - Kamalanathsharma_Raj@bah.com
#Code updated by Jerome Froelich (Booz Allen Hamilton)

import os
import sys
import datetime
import win32com.client as com
from random import randrange, uniform
try:
    import odeClient
except:
    current_file_path = os.path.dirname(os.path.abspath(__file__))
    sys.path.insert(1,os.path.join(current_file_path,'..','..','apps','PythonSDK'))

from odeClient import client, timehelpers

import logging
import time
import thread
import depositClient
import json
import threading
import Queue
import math
import random

from PySide.QtCore import Signal
from PySide.QtCore import QObject

# to parse uploaded json file
import json

timeToChange = Queue.LifoQueue(maxsize=0)
currState = Queue.LifoQueue(maxsize=0)

class eadcode(QObject):

    messages = 0
    case5 = 0

    signal = Signal(object)

    random.seed(42)

    logger = logging.getLogger('ODEApplication.eadcode')

    def app(self, datatype, username, password, server, eadintersection, inputFile):
        timeToChange = 0
        currState = 0
        if eadintersection == 0:
            intersectionId = "00000085"
            lanesetId = 3
            heading = 240
        elif eadintersection == 1:
            intersectionId = "00000088"
            lanesetId = 2
            heading = 240
        elif eadintersection == 2:
            intersectionId = "00000C1D"
            lanesetId = 3
            heading = 0
        elif eadintersection == 3:
            intersectionId = "00000C1E"
            lanesetId = 1
            heading = 180
        else:
            print "Intersection Not Coded"
        #print "success"
        self.logger.debug('EAD App Started with %s as selected intersection.' % intersectionId)

        if datatype == "sim":
            thread1 = threading.Thread(target = self.updateIntData, args = (username, password, server, intersectionId, lanesetId))
            thread2 = threading.Thread(target = self.eadsim, args = (username, password, server, intersectionId, lanesetId))

            thread1.start()
            thread2.start()

        elif datatype == "field":
            thread1 = threading.Thread(target = self.updateIntData, args = (username, password, server, intersectionId, lanesetId))
            thread2 = threading.Thread(target = self.eadfield, args = (username, password, server, intersectionId, lanesetId))

            thread1.start()
            thread2.start()

        else:
            thread = threading.Thread(target = self.eadinput, args = (username, password, server, intersectionId, lanesetId, inputFile))
            thread.start()


    def updateIntData(self, username, password, server, intersectionId, lanesetId):

        self.logger.debug('Intersection Update Thread started.')
        #if intersectionId == "00000085" or intersectionId == "00000088":
        #    nwLat=42.333181
        #    nwLon=-83.051523
        #    seLat=42.327089
        #    seLon=-83.037940
        #else:
        #    nwLat=42.517880
        #    nwLon=-83.306152
        #    seLat=42.448886
        #    seLon=-83.259115
        nwLat=42.53790
        nwLon=-83.47790
        seLat=42.30575
        seLon=-82.84275

        region = client.GeographicRegion(nwLat,nwLon,seLat,seLon)
        sub_data_type = "int"  # veh, int, agg
        sub_request =  client.SubscriptionRequest(sub_data_type, region)
        host = str(server)
        userName=str(username)
        password=str(password)
        ode = client.ODEClient(host)
        ode.get_token(userName,password)
        ode.setRequest(sub_request)

        def on_message(ws, message):
            try:
                msg = json.loads(message)
                #self.logger.debug("Intersection Message Received: %s",  message)
                if msg.get('payload', {'code': None}).get('code', None) is not None and msg.get('payload').get(
                        'code').upper() == 'SUCCESS':
                    # send_file(ws,config['INPUT_FILE'])
                    self.logger.info('Message from the Test API: %s', message)
                elif msg.get('payload', {'code': None}).get('code', None) is not None and msg.get('payload').get(
                        'code').upper() == 'FAILURE':
                    ws.close()
                else:
                    pass
                    #logger.debug('Message from the Test API: %s', message)
                if msg.get("payload", {'code': None}).get("code") == 'FAILURE':
                    ws.close()
            except:
                # logger.warn(message)
                self.logger.exception("Exception convert Message to JSON: %s", message)
            if msg['payload']['spatData']['intersections']['id'] == intersectionId:
                TTC = int(msg['payload']['spatData']['intersections']['states'][lanesetId]['timeToChange'])
                CS = int(msg['payload']['spatData']['intersections']['states'][lanesetId]['currState'])
                timeToChange.put(TTC)
                currState.put(CS)
                self.logger.debug('SPAT for specific intersection received. time to change = %s. current state = %s' % (str(TTC), str(CS)))

        ode.connect(on_message=on_message)

    def eadfield(self, username, password, server, intersectionId, lanesetId):
        self.logger.debug('EAD is using Field Data at %s.' % intersectionId)

        intlat, intlon, uslat, uslon, angle = self.intMapping(intersectionId)
        if angle < 45 or angle > 315: #north facing
            direction = 'N'
        elif 45 < angle < 135: #east facing
            direction = 'E'
        elif 135 < angle < 225:
            direction = 'S'
        else:
            direction = 'W'

        #if intersectionId == "00000085" or intersectionId == "00000088":
        #nwLat=42.3344144
        #nwLon=-83.0565548
        #seLat=42.326815989
        #seLon=-83.033766755
        #else:
        nwLat=42.53790
        nwLon=-83.47790
        seLat=42.30575
        seLon=-82.84275
        region = client.GeographicRegion(nwLat,nwLon,seLat,seLon)
        sub_data_type = "veh"  # veh, int, agg
        sub_request =  client.SubscriptionRequest(sub_data_type, region)
        host = str(server)
        userName=str(username)
        password=str(password)
        ode = client.ODEClient(host)
        ode.get_token(userName,password)
        ode.setRequest(sub_request)
        self.logger.debug('VSD Subscription Requested.')
        async = client.AsyncODEClient(odeClient=ode)
        async.start() # will connect to the ODE in a separate thread.
        while True:
            CVData = [] #stores raw data
            uniqueData = [] #stores processed data

            # reset current counts
            self.messages, self.case5 = 0, 0

            if not async.is_buffer_empty():
                items = async.get_all_messages()
                #items = async.get_messages(10) # Specifiy number of items to process

                # update current number of messages
                self.messages = math.log(len(items),10)

                for record in items:
                    #logger.info("%s", record.get_payload_value('dateTime'))
                    vehList = [0,0,0,0,0,0,0]
                    vehList[0] = record.get_payload_value('tempId')
                    vehList[1] = record.get_payload_value('latitude')
                    vehList[2] = record.get_payload_value('longitude')
                    vehList[3] = record.get_payload_value('speed')
                    vehList[4] = record.get_payload_value('heading')
                    vehList[5] = record.get_payload_value('dateTime')
                    vehList[6] = record.get_payload_value('groupId')
                    self.logger.debug('Data Received: %s' % str(vehList))
                    if vehList[3] != None:
                        CVData.append(vehList)
                #print record.get_payload_value(key)
                #Get latest data from a vehicle.
                vehIDs = []
                for i in range (1, len(CVData)):
                    vehData = CVData[i]
                    if vehData[0] not in vehIDs:
                        uniqueData.append(vehData)
                        vehIDs.append(vehData[0])
                print len(vehIDs)
                TTC = timeToChange.get()
                CS = currState.get()
                self.logger.debug('Unique Data Submitted to EAD App %s' % str(uniqueData))
                self.eadalgorithm(uniqueData, intersectionId, TTC, CS, intlat, intlon, uslat, uslon, angle, direction)
                #print uniqueData, intersectionId, TTC, CS

                self.signal.emit([self.messages, self.case5])

                time.sleep(2)

    def eadsim(self,username,password,server,intersectionId, lanesetId):
        #1. subscribe
        self.logger.debug('EAD is using Simulated Data.')

        nwLat=random.uniform(42.544480787298,42.544480787299)
        nwLon=-83.52218627929688
        seLat=42.3021981769316
        seLon=-82.78610229492188
        region = client.GeographicRegion(nwLat,nwLon,seLat,seLon)
        test_request = client.BaseRequest("tst","veh",region)
        host = str(server)
        userName=str(username)
        password=str(password)
        ode = client.ODEClient(host)
        ode.get_token(userName,password)
        ode.setRequest(test_request)
        #2. upload and async client
        async = client.AsyncODEClient(odeClient=ode)
        async.start()

        config = {}
        config['HOST']= host
        config['REQUEST_TYPE'] = 'sub'
        config['DATA'] = 'veh'
        config['TEST_REQUEST'] = None
        config['INPUT_FILE'] = './/fulldata.json'

        intlat, intlon, uslat, uslon, angle = self.intMapping(intersectionId)
        if angle < 45 or angle > 315: #north facing
            direction = 'N'
        elif 45 < angle < 135: #east facing
            direction = 'E'
        elif 135 < angle < 225:
            direction = 'S'
        else:
            direction = 'W'

        #3. inflo application
        while True:
            items = async.get_all_messages()
            CVData = [] #stores raw data
            uniqueData = [] #stores processed data
            #items = async.get_messages(4) # Specify number of items to process

            # reset current counts
            self.messages, self.case5 = len(items), 0

            for record in items:
                if record.get_payload_type() in ('status',) and record.get_payload_value('requestId'):
                    config['TEST_REQUEST'] = record.get_payload_value('requestId')
                    depositClient.update_config(config)
                    thread.start_new_thread(depositClient._run_main, (config,))
                else:                             # new method
                    self.logger.info("%s", record.get_payload_value('dateTime'))
                    vehList = [0,0,0,0,0,0,0]
                    vehList[0] = record.get_payload_value('tempId')
                    vehList[1] = record.get_payload_value('latitude')
                    vehList[2] = record.get_payload_value('longitude')
                    vehList[3] = record.get_payload_value('speed')
                    vehList[4] = record.get_payload_value('heading')
                    vehList[5] = record.get_payload_value('dateTime')
                    vehList[6] = record.get_payload_value('groupId')
                    self.logger.debug('Data Received: %s' % str(vehList))
                    CVData.append(vehList)
                #print record.get_payload_value(key)
            #Get latest data from a vehicle.
            vehIDs = []
            for i in range (1, len(CVData)):
                vehData = CVData[i]
                if vehData[0] not in vehIDs:
                    uniqueData.append(vehData)
                    vehIDs.append(vehData[0])
            #print uniqueData
            TTC = timeToChange.get()
            CS = currState.get()
            self.logger.debug('Unique Data Submitted to EAD App %s' % str(uniqueData))
            self.eadalgorithm(uniqueData, intersectionId, TTC, CS, intlat, intlon, uslat, uslon, angle, direction)
            #print uniqueData, intersectionId, TTC, CS

            self.signal.emit([self.messages, self.case5])

            time.sleep(2)

    def eadinput(self, username, password, server, intersectionId, lanesetId, inputFile):
        self.logger.debug('EAD is using Input Data')

        inputData = []

        try:
            with open(inputFile, "r") as file:
                for line in file:
                    inputData.append(json.loads(line))
        except IOError as e:
            self.logger.debug("Failed to open file")
            self.logger.debug(e)
            return
        except ValueError as e:
            self.logger.debug("Failed to parse JSON")
            self.logger.debug(e)
            return

        self.logger.debug("File Upload Succeeded")

        LENGTH = len(inputData)
        index = 0

        intlat, intlon, uslat, uslon, angle = self.intMapping(intersectionId)
        if angle < 45 or angle > 315: #north facing
            direction = 'N'
        elif 45 < angle < 135: #east facing
            direction = 'E'
        elif 135 < angle < 225:
            direction = 'S'
        else:
            direction = 'W'

        nwLat=uniform(42.544480787298,42.544480787299)
        nwLon=-83.52218627929688
        seLat=42.3021981769316
        seLon=-82.78610229492188

        while True:
            items = []

            while True:
                items.append(inputData[index]["payload"])

                currentTime = inputData[index]["payload"]["second"]
                index = (index + 1) % LENGTH
                nextTime = inputData[index]["payload"]["second"]
                if nextTime != currentTime:
                    break

            # reset current counts
            self.messages, self.case5 = len(items), 0

            CVData = [] #stores raw data
            uniqueData = [] #stores processed data

            for record in items:
                vehList = [0,0,0,0,0,0,0]
                vehList[0] = record.get('tempId')
                vehList[1] = record.get('latitude')
                vehList[2] = record.get('longitude')
                vehList[3] = record.get('speed')
                vehList[4] = record.get('heading')
                vehList[5] = record.get('dateTime')
                vehList[6] = record.get('groupId')
                self.logger.debug('Data Received: %s' % str(vehList))
                CVData.append(vehList)

            #Get latest data from a vehicle.
            vehIDs = []
            for i in range (1, len(CVData)):
                vehData = CVData[i]
                if vehData[0] not in vehIDs:
                    uniqueData.append(vehData)
                    vehIDs.append(vehData[0])

            TTC = random.choice([1, 2, 4])
            CS = random.random() * 30

            self.logger.debug('Unique Data Submitted to EAD App %s' % str(uniqueData))
            self.eadalgorithm(uniqueData, intersectionId, TTC, CS, intlat, intlon, uslat, uslon, angle, direction)

            self.signal.emit([self.messages, self.case5])

            time.sleep(1)

    def eadalgorithm(self, uniqueData, intersectionId, TTC, CS, intlat, intlon, uslat, uslon, angle, direction):
        """
        check if upstream - use otherwise ignore
        check distance
        check TTI = distance/speed
        if CS = green and TTI < TTC - then processed
        if CS = green and TTI > TTC - slow down to a stop
        if CS = red and TTI > TTC - then processed
        if CS = red and TTI < TTC - slow down and move cautiously
        """
        self.logger.debug('Triggering EAD App to produce eco-approach and departure.')
        TTC = float(TTC)/10
        #status check

        for i in range(1,len(uniqueData)):
            vehData = uniqueData[i-1]
            vehID = vehData[0]
            vehlat = float(str(vehData[1]))
            vehlon = float(str(vehData[2]))
            vehspeed = 0.277778*float(str(vehData[3]))  #mps
            vehheading = float(str(vehData[4]))
            if direction == 'N':
                if vehheading >= 340 or vehheading <= 20:
                    if uslat <= vehlat <= intlat:
                        self.logger.debug('Vehicle ID %s found in the Eco-Approach Zone' % str(vehID))
                        distance = self.distcalc(vehlat, vehlon, intlat, intlon) #meters
                        if vehspeed > 0.1:
                            timeToInt = distance/vehspeed #seconds
                        else:
                            timeToInt = 99999
                        if CS == "1" and timeToInt <= TTC:
                            logtext = str(vehID) + " to proceed safely through intersection (Case 1)"
                            self.case1 += 1
                        elif CS == "1" and timeToInt > TTC:
                            logtext = str(vehID) + " to slow down to a stop pending redlight (Case 2)"
                            self.case2 += 1
                        elif CS == "2":
                            logtext = str(vehID) + " to slow down to a stop to reduce inertial loss (Case 3)"
                            self.case3 += 1
                        elif CS == "4" and timeToInt >= TTC:
                            logtext = str(vehID) + " to proceed safely through intersection to receive green (Case 4)"
                            self.case4 += 1
                        else:
                            logtext = str(vehID) + " to slow-down to Eco Speed (Case 5)"
                            self.case5 += 1
                        self.logger.debug(logtext)
            elif direction == 'S':
                if 150 <= vehheading <= 210:
                    if uslat >= vehlat >= intlat:
                        self.logger.debug('Vehicle ID %s found in the Eco-Approach Zone' % str(vehID))
                        #self.case5 += 1
                        distance = self.distcalc(vehlat, vehlon, intlat, intlon) #meters
                        if vehspeed > 0.1:
                            timeToInt = distance/vehspeed #seconds
                        else:
                            timeToInt = 99999
                        if CS == "1" and timeToInt <= TTC:
                            logtext = str(vehID) + " to proceed safely through intersection (Case 1)"
                            self.case1 += 1
                        elif CS == "1" and timeToInt > TTC:
                            logtext = str(vehID) + " to slow down to a stop pending redlight (Case 2)"
                            self.case2 += 1
                        elif CS == "2":
                            logtext = str(vehID) + " to slow down to a stop to reduce inertial loss (Case 3)"
                            self.case3 += 1
                        elif CS == "4" and timeToInt >= TTC:
                            logtext = str(vehID) + " to proceed safely through intersection to receive green (Case 4)"
                            self.case4 += 1
                        else:
                            logtext = str(vehID) + " to slow-down to Eco Speed (Case 5)"
                            self.case5 += 1
                        self.logger.debug(logtext)
            elif direction == 'W':
                if 220 <= vehheading <= 280:
                    if vehlat <= uslat and vehlat >= intlat and vehlon <= uslon and vehlon >= intlon:
                        #vehicle is upstream
                        self.logger.debug('Vehicle ID %s found in the Eco-Approach Zone' % str(vehID))
                        distance = self.distcalc(vehlat, vehlon, intlat, intlon) #meters
                        if vehspeed > 0.1:
                            timeToInt = distance/vehspeed #seconds
                        else:
                            timeToInt = 99999
                        if CS == "1" and timeToInt <= TTC:
                            logtext = str(vehID) + " to proceed safely through intersection (Case 1)"
                            self.case1 += 1
                        elif CS == "1" and timeToInt > TTC:
                            logtext = str(vehID) + " to slow down to a stop pending redlight (Case 2)"
                            self.case2 += 1
                        elif CS == "2":
                            logtext = str(vehID) + " to slow down to a stop to reduce inertial loss (Case 3)"
                            self.case3 += 1
                        elif CS == "4" and timeToInt >= TTC:
                            logtext = str(vehID) + " to proceed safely through intersection to receive green (Case 4)"
                            self.case4 += 1
                        else:
                            logtext = str(vehID) + " to slow-down to Eco Speed (Case 5)"
                            self.case5 += 1
                        self.logger.debug(logtext)

    def distcalc(self, lat1, lon1, lat2, lon2):
        radius = 6371000 # km

        dlat = math.radians(lat2-lat1)
        dlon = math.radians(lon2-lon1)
        a = math.sin(dlat/2) * math.sin(dlat/2) + math.cos(math.radians(lat1)) \
            * math.cos(math.radians(lat2)) * math.sin(dlon/2) * math.sin(dlon/2)
        c = 2 * math.atan2(math.sqrt(a), math.sqrt(1-a))
        d = radius * c
        return d

    def intMapping(self, intersectionId):
        if intersectionId == "00000085":
            intlat = 42.328735
            intlon = -83.049172
            uslat = 42.3307144 #42.329222
            uslon = -83.0445921 #-83.048127
            heading = 240
        elif intersectionId == "00000088":
            intlat = 42.3302089
            intlon = -83.045771
            uslat = 42.3306866
            uslon = -83.0446457
            heading = 240
        elif intersectionId == "00000C1E":
            intlat = 42.5011143
            intlon = -83.2851965
            uslat = 42.493725
            uslon = -83.284714
            heading = 0
        elif intersectionId == "00000C1D":
            intlat = 42.472001
            intlon = -83.045771
            uslat = 42.477680
            uslon = -83.285100
            heading = 160
        else:
            intlat = 0
            intlon = 0
            uslat = 0
            uslon = 0
            heading = 0
            print "ERROR: Intersection Not Listed"
        return (intlat, intlon, uslat, uslon, heading)
