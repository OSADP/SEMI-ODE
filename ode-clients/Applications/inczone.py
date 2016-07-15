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

from PySide.QtCore import Signal
from PySide.QtCore import QObject

import logging
import time
import thread
import depositClient
import math

# for input file
import json

# for testing
from random import randint

class inczonecode(QObject):

    messages = 0
    advisories = 0
    alerts = 0
    warnings = 0

    signal = Signal(object)

    def __init__(self):
        super(inczonecode, self).__init__()

    logger = logging.getLogger('ODEApplication.inczonecode')
    def app(self, datatype, username, password, server, location, inputFile):
        #self.logger = logging.getLogger('ODEApplication.inczonecode')
        self.logger.debug('INC-ZONE App Started.')

        """
        location = 0 => Downtown
        location = 1 => NB Telegraph Road
        lcoation = 2 => SB Telegraph Road

        """

        if datatype == "sim":
            self.inczonesim(username, password, server, location)
        elif datatype == "field":
            self.inczonefield(username, password, server, location)
        else:
            self.inczoneinput(username, password, server, location, inputFile)

    def inczonefield(self, username, password, server, location):
        #self.logger = logger.getLogger('ODEApplication.inczonefield')
        if location == 0:
            Loc = 'Congress Street'
            incLatitude = 42.329226
            incLongitude = -83.048201
            heading = 60
            speedlimit = 25
            nwLat=42.53790
            nwLon=-83.47790
            seLat=42.30575
            seLon=-82.84275
        elif location == 1:
            Loc = 'NB Telegraph Road'
            incLatitude = 42.500625
            incLongitude = -83.284654
            heading = 180
            speedlimit = 50
            nwLat=42.517880
            nwLon=-83.306150
            seLat=42.448888
            seLon=-83.259115
        else:
            Loc = 'SB Telegraph Road'
            incLatitude = 42.472016
            incLongitude = -83.282423
            heading = 0
            speedlimit = 50
            nwLat=42.517880
            nwLon=-83.306150
            seLat=42.448886
            seLon=-83.259115
        self.logger.debug('INC-ZONE is using Field Data on %s.' % Loc)
        z1lat, z1lon, z2lat, z2lon, z3lat, z3lon = self.zoning(incLatitude,incLongitude,heading,speedlimit)
        self.logger.debug('INC-ZONE Zoning Done.')

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
        import time
        while True:
            CVData = [] #stores raw data
            uniqueData = [] #stores processed data

            # reset current counts
            self.messages, self.advisories, self.alerts, self.warnings = [0]*4

            if not async.is_buffer_empty():
                items = async.get_all_messages()

                # update current number of messages
                self.messages = math.log(len(items),10)

                #items = async.get_messages(10) # Specifiy number of items to process
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
                    self.logger.debug('Data Received: %s'% str(vehList))
                    if vehList[3] != None:
                        CVData.append(vehList)
                
                vehIDs = []
                for i in range (1, len(CVData)):
                    vehData = CVData[i]
                    if vehData[0] not in vehIDs:
                        uniqueData.append(vehData)
                        vehIDs.append(vehData[0])
                #print uniqueData
                self.logger.debug('Unique Data Submitted to INC-ZONE %s'% str(uniqueData))
                self.inczonemanage(uniqueData, location,incLatitude, incLongitude, z1lat, z1lon, z2lat, z2lon, z3lat, z3lon)
                time.sleep(1)

                # emit counts
                self.signal.emit([self.messages, self.advisories, self.alerts, self.warnings])

    def inczonesim(self,username,password,server,location):
        #1. subscribe
        #self.logger = logging.getLogger('ODEApplication.inczonesim')
        if location == 0:
            Loc = 'Congress Street'
            incLatitude = 42.329226
            incLongitude = -83.048201
            heading = 60
            speedlimit = 25
        elif location == 1:
            Loc = 'NB Telegraph Road'
            incLatitude = 42.500625
            incLongitude = -83.284654
            heading = 180
            speedlimit = 50
        else:
            Loc = 'SB Telegraph Road'
            incLatitude = 42.472016
            incLongitude = -83.282423
            heading = 0
            speedlimit = 50
        self.logger.debug('INC-ZONE is using Simulated Data on %s.' % Loc)
        z1lat, z1lon, z2lat, z2lon, z3lat, z3lon = self.zoning(incLatitude,incLongitude,heading,speedlimit)
        self.logger.debug('INC-ZONE Zoning Done.')

        nwLat=uniform(42.544480787298,42.544480787299)
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
        config['INPUT_FILE'] = './/dry_run_data.json'
        #3. inflo application
        while True:
            items = async.get_all_messages()

            # reset current counts
            self.messages, self.advisories, self.alerts, self.warnings = [0]*4
            # update current number of messages
            self.messages = len(items)

            CVData = [] #stores raw data
            uniqueData = [] #stores processed data
            #items = async.get_messages(4) # Specify number of items to process
            for record in items:
                if record.get_payload_type() in ('status',) and record.get_payload_value('requestId'):
                    config['TEST_REQUEST'] = record.get_payload_value('requestId')
                    depositClient.update_config(config)
                    thread.start_new_thread(depositClient._run_main, (config,))
                else:                             # new method
                    #self.logger.info("%s", record.get_payload_value('dateTime'))
                    vehList = [0,0,0,0,0,0,0]
                    vehList[0] = record.get_payload_value('tempId')
                    vehList[1] = record.get_payload_value('latitude')
                    vehList[2] = record.get_payload_value('longitude')
                    vehList[3] = record.get_payload_value('speed')
                    vehList[4] = record.get_payload_value('heading')
                    vehList[5] = record.get_payload_value('dateTime')
                    vehList[6] = record.get_payload_value('groupId')
                    self.logger.debug('Data Received: %s'% str(vehList))
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
            self.logger.debug('Unique Data Submitted to INC-ZONE %s'% str(uniqueData))
            self.inczonemanage(uniqueData, location, incLatitude, incLongitude, z1lat, z1lon, z2lat, z2lon, z3lat, z3lon)
            time.sleep(1)

            # emit counts
            #self.signal.emit([randint(18, 36), randint(0, 16), randint(0, 12), randint(0, 8)])
            self.signal.emit([self.messages, self.advisories, self.alerts, self.warnings])

    def inczoneinput(self, username, password, server, location, inputFile):
        self.logger.debug("Running inczoneinput")

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

        if location == 0:
            Loc = 'Congress Street'
            incLatitude = 42.329226
            incLongitude = -83.048201
            heading = 60
            speedlimit = 25
        elif location == 1:
            Loc = 'NB Telegraph Road'
            incLatitude = 42.500625
            incLongitude = -83.284654
            heading = 180
            speedlimit = 50
        else:
            Loc = 'SB Telegraph Road'
            incLatitude = 42.472016
            incLongitude = -83.282423
            heading = 0
            speedlimit = 50
        self.logger.debug('INC-ZONE is using Simulated Data on %s.' % Loc)
        z1lat, z1lon, z2lat, z2lon, z3lat, z3lon = self.zoning(incLatitude,incLongitude,heading,speedlimit)
        self.logger.debug('INC-ZONE Zoning Done.')

        nwLat=uniform(42.544480787298,42.544480787299)
        nwLon=-83.52218627929688
        seLat=42.3021981769316
        seLon=-82.78610229492188

        while True:
            items = []
            # get records with same timestamp
            while True:
                items.append(inputData[index]["payload"])

                currentTime = inputData[index]["payload"]["second"]
                index = (index + 1) % LENGTH
                nextTime = inputData[index]["payload"]["second"]
                if nextTime != currentTime:
                    break

            # reset current counts
            self.messages, self.advisories, self.alerts, self.warnings = [0]*4
            # update current number of messages
            self.messages = len(items)

            CVData = [] #stores raw data
            uniqueData = [] #stores processed data

            for record in items:
                #logger.info("%s", record.get_payload_value('dateTime'))
                vehList = [0,0,0,0,0,0,0]
                vehList[0] = record.get('tempId')
                vehList[1] = record.get('latitude')
                vehList[2] = record.get('longitude')
                vehList[4] = record.get('heading')
                vehList[3] = record.get('speed')
                vehList[5] = record.get('dateTime')
                vehList[6] = record.get('groupId')
                self.logger.debug('Data Received: %s'% str(vehList))
                CVData.append(vehList)

            vehIDs = []
            for i in range (1, len(CVData)):
                vehData = CVData[i]
                if vehData[0] not in vehIDs:
                    uniqueData.append(vehData)
                    vehIDs.append(vehData[0])
            #print uniqueData
            self.logger.debug('Unique Data Submitted to INC-ZONE %s'% str(uniqueData))
            self.inczonemanage(uniqueData, location, incLatitude, incLongitude, z1lat, z1lon, z2lat, z2lon, z3lat, z3lon)
            time.sleep(1)

            # emit counts
            self.signal.emit([randint(18, 36), randint(0, 16), randint(0, 12), randint(0, 8)])
            
    def inczonemanage(self, uniqueData, location, inclat, inclong, z1lat, z1lon, z2lat, z2lon, z3lat, z3lon):
        self.logger.debug('Initiating Threat Assessment')
        for i in range(1, len(uniqueData)):
            vehData = uniqueData[i-1]
            vehID = vehData[0]
            vehlat = float(str(vehData[1]))
            vehlong = float(str(vehData[2]))
            vehspeed = round(0.621371*float(str(vehData[3])),2)
            vehheading = float(str(vehData[4]))
            vehThreat = self.inczonethreat(location,vehheading, vehlat, vehlong, inclat, inclong, z1lat, z1lon, z2lat, z2lon, z3lat, z3lon)
            if vehThreat == 1:
                logtext = "Advisory! issued to vehicle ID " + str(vehID) + " traveling at "+ str(vehspeed) + "mps"
                # emit total number of advisories processed
                self.advisories += 1
            elif vehThreat == 2:
                logtext = "Alert! issued to vehicle ID " + str(vehID) + " traveling at "+str(vehspeed) + "mps"
                # emit total number of alerts processed
                self.alerts += 1
            elif vehThreat == 3:
                logtext = "Warning! issued to vehicle ID " + str(vehID) + " traveling at "+str(vehspeed) + "mps"
                # emit total number of warnings processed
                self.warnings += 1
            else:
                logtext = "Nothing issued to vehicle ID " + str(vehID) + " traveling at "+str(vehspeed) + "mps"
            self.logger.debug(logtext)
        #logging threats

    def inczonethreat(self,location,vehheading,vehlat,vehlong,inclat,inclon,z1lat,z1lon,z2lat,z2lon,z3lat,z3lon):
        #virtual incident heading
        #1 - advisory
        #2 - alert
        #3 - warning
        #self.logger = logging.getLogger('ODEApplication.inczonethreat')
        lat = vehlat
        lon = vehlong
        """if location == 0:
            if vehheading >= 200 and vehheading <= 250:
                if lat >= inclat and lat <= z3lat and lon >= inclon and lon <= z3lon:
                    threat = 1
                elif lat >= z3lat and lat <= z2lat and lon >= z3lon and lon <= z2lon:
                    threat = 2
                elif lat >= z1lat and lat <= z2lat and lon >= z1lon and lon <= z2lon:
                    threat = 3
                else:
                    threat = 0
            else:
                threat = 0"""
        if location == 0:
            if vehheading >= 200 and vehheading <= 250:
                if inclon <= lon <= z3lon:
                    threat = 3
                elif z3lon <= lon <= z2lon:
                    threat = 2
                elif z2lon <= lon <= z1lon:
                    threat = 1
                else:
                    threat = 0
            else:
                threat = 0

        elif location == 1:
            if vehheading <= 35 or vehheading >= 330:
                if z1lat <= lat <= z2lat:
                    threat = 1
                elif z2lat <= lat <= z3lat:
                    threat = 2
                elif z3lat <= lat <= inclat:
                    threat = 3
                else:
                    threat = 0
            else:
                threat = 0
        elif location == 2:
            if 160 <= vehheading <= 200:
                if z1lat >= lat >= z2lat:
                    threat = 1
                elif z2lat >= lat >= z3lat:
                    threat = 2
                elif z3lat >= lat >= inclat:
                    threat = 3
                else:
                    threat = 0
            else:
                threat = 0
        self.logger.debug('Threat Assessment Complete')
        return threat

    def zoning (self, inclat, inclong, heading, speedlimit):
        #self.logger = logger.getLogger('ODEApplication.zoning')
        #MUTCD Zones:
        Blocked_Lanes = 1
        Speed_Limit = speedlimit                            #miles per hour
        advWarningDist = 304.8                              #meters
        bufferLength = (13.3*Speed_Limit - 284)*0.305       #meters
        taperLength = 12*Blocked_Lanes*Speed_Limit*0.305    #meters
        dist_one = advWarningDist + bufferLength + taperLength  #not considered for arterials
        dist_two = bufferLength + taperLength               #threat level = 1
        dist_three = taperLength                            #threat level = 2

        Approach_Heading = heading                #degrees
        z1lat, z1lon = self.latlongfinder(inclat, inclong, Approach_Heading, dist_one)
        z2lat, z2lon = self.latlongfinder(inclat, inclong, Approach_Heading, dist_two)
        z3lat, z3lon = self.latlongfinder(inclat, inclong, Approach_Heading, dist_three)
        self.logger.debug('The three INC-ZONE Distances are %s, %s and %s.' %(str(dist_one), str(dist_two), str(dist_three)))
        self.logger.debug('The three zones are %s, %s, %s, %s, %s, %s' %(str(z1lat), str(z1lon), str(z2lat), str(z2lon), str(z3lat), str(z3lon)))
        return (z1lat, z1lon, z2lat, z2lon, z3lat, z3lon)

    def latlongfinder(self, lat, lon, bearing, distance):
        R = 6378.1 #Radius of the Earth
        brng = math.radians(bearing) #1.57 #Bearing is 90 degrees converted to radians.
        d = distance/1000 #Distance in km

        lat1 = math.radians(lat) #Current lat point converted to radians
        lon1 = math.radians(lon) #Current long point converted to radians

        lat2 = math.asin(math.sin(lat1)*math.cos(d/R) + math.cos(lat1)*math.sin(d/R)*math.cos(brng))
        lon2 = lon1 + math.atan2(math.sin(brng)*math.sin(d/R)*math.cos(lat1), math.cos(d/R)-math.sin(lat1)*math.sin(lat2))

        lat2 = math.degrees(lat2)
        lon2 = math.degrees(lon2)

        return (lat2, lon2)
