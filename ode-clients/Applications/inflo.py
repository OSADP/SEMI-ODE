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
    # changed path to PythonSDK
    #current_file_path = os.path.dirname(os.path.abspath(__file__))
    #sys.path.insert(1,os.path.join(current_file_path,'..','..','apps','PythonSDK'))

    sys.path.insert(1, os.path.join(os.getcwd(),'..','PythonSDK'))

from odeClient import client, timehelpers
import math
import logging
import time
import thread
import depositClient
import pythoncom

from PySide.QtCore import Signal
from PySide.QtCore import QObject

# to parse uploaded json file
import json

class inflocode(QObject):

    messages = 0
    triggers = 0

    signal = Signal(object)

    logger = logging.getLogger('ODEApplication.inflocode')
    def app(self, datatype, username, password, server, location, inputFile):
        #self.logger = logger.getLogger('ODEApplication.inflomain')
        self.logger.debug('INFLO App Started.')
        frequency = 5
        if datatype == "sim":
            self.inflosim(username, password, server, frequency, location)
        elif datatype == "field":
            self.inflofield(username, password, server, frequency, location)
        else:
            self.infloinput(username, password, server, frequency, location, inputFile)

    def inflofield(self,username,password,server, frequency, location):
        #self.logger = logger.getLogger('ODEApplication.inflofield')
        if location == 0:
            Loc = 'Larned Street'
            nwLat=42.53790
            nwLon=-83.47790
            seLat=42.30575
            seLon=-82.84275

        else:
            Loc = 'Telegraph Road'
            nwLat=42.517879
            nwLon=-83.306150
            seLat=42.448886
            seLon=-83.259115
        self.logger.debug('INFLO is using Field Data on %s.' % Loc)

        
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
            self.messages, self.triggers = 0, 0

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
                    self.logger.debug('Data Received: %s' % str(vehList))
                    if vehList[1] != None:
                        CVData.append(vehList)
                #print record.get_payload_value(key)
                #Get latest data from a vehicle.
                vehIDs = []
                for i in range (1, len(CVData)):
                    vehData = CVData[i]
                    if vehData[0] not in vehIDs:
                        uniqueData.append(vehData)
                        vehIDs.append(vehData[0])
                self.logger.debug('Unique Data Submitted to INFLO %s' % str(uniqueData))
                self.inflomanage(uniqueData, location)

                self.signal.emit([self.messages, self.triggers])

                time.sleep(frequency)

    def inflosim(self,username, password, server, frequency, location):
        #1. subscribe
        #self.logger = logging.getLogger('ODEApplication.inflosim')
        self.logger.debug('INFLO is using Simulated Data.')

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
        config['INPUT_FILE'] = './/BSM_Stream.json'

        #3. inflo application
        while True:
            items = async.get_all_messages()
            CVData = [] #stores raw data
            uniqueData = [] #stores processed data
            #items = async.get_messages(4) # Specify number of items to process

            # reset current counts
            self.messages, self.triggers = len(items), 0

            for record in items:
                if record.get_payload_type() in ('status',) and record.get_payload_value('requestId'):
                    config['TEST_REQUEST'] = record.get_payload_value('requestId')
                    depositClient.update_config(config)
                    thread.start_new_thread(depositClient._run_main, (config,))
                else:                             # new method
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
                    CVData.append(vehList)
                #print record.get_payload_value(key)
            #Get latest data from a vehicle.
            vehIDs = []
            for i in range (1, len(CVData)):
                vehData = CVData[i]
                if vehData[0] not in vehIDs:
                    uniqueData.append(vehData)
                    vehIDs.append(vehData[0])
            self.logger.debug('Unique Data Submitted to INFLO %s' % str(uniqueData))
            self.inflomanage(uniqueData, location)

            self.signal.emit([self.messages, self.triggers])

            time.sleep(frequency)

    def infloinput(self, username, password, server, frequency, location, inputFile):
        self.logger.debug("Running infloinput")

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

        nwLat=uniform(42.544480787298,42.544480787299)
        nwLon=-83.52218627929688
        seLat=42.3021981769316
        seLon=-82.78610229492188
        region = client.GeographicRegion(nwLat,nwLon,seLat,seLon)

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
            self.messages, self.triggers = len(items), 0

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

            vehIDs = []
            for i in range (1, len(CVData)):
                vehData = CVData[i]
                if vehData[0] not in vehIDs:
                    uniqueData.append(vehData)
                    vehIDs.append(vehData[0])
            self.logger.debug('Unique Data Submitted to INFLO %s' % str(uniqueData))
            self.inflomanageSimple(uniqueData, location)

            self.signal.emit([self.messages, self.triggers])

            time.sleep(frequency / 2)

    def inflomanage(self,uniqueData, location):
        #self.logger = logging.getLogger('ODEApplication.inflomanage')
        self.logger.debug('Triggering INFLOApps to produce speed recommendations.')
        pythoncom.CoInitialize()
        conn = com.Dispatch(r'ADODB.Connection')
        if location == 0:
            # !!! changed path to db !!!
            db = os.path.join(os.getcwd(),'..','INFLODatabase_larned.accdb')
        else:
            # !!! changed path to db !!!
            db = os.path.join(os.getcwd(),'..','INFLODatabase_telegraph.accdb')
        DSN = ('PROVIDER = Microsoft.ACE.OLEDB.12.0;Data Source = ' + db)
        conn.Open(DSN)
        rs = com.Dispatch(r'ADODB.Recordset')
        state2 = "DELETE * FROM TME_CVData_Input"
        rs = conn.Execute(state2) #clear CVData sheet
        """
        FILTER Unique Vehicles to Corridor

        """
        sqlscript = 0
        if location == 0: #larned
            for i in range(1,len(uniqueData)):
                vehData = uniqueData[i-1]
                latitude = vehData[1]
                longitude = vehData[2]
                heading = vehData[4]
                if 40 <= heading <= 80:
                    if 42.327980 <= latitude <= 42.331668 and -83.048620 <= longitude <= -83.040147:
                        vehID = i
                        vehSpeed = round(0.621371*float(str(vehData[3])),2) #mph
                        vehMM = self.milemarker(vehData[1], vehData[2]) #milemarker
                        if vehSpeed <= 15:
                            vehQueued = "Yes"
                        else:
                            vehQueued = "No"

                        sqlscript = "INSERT INTO TME_CVData_Input (NomadicDeviceID, Speed, \
                            MMLocation, CVQueuedState) VALUES (" + str(vehID) + "," + str(vehSpeed) \
                            + "," + str(vehMM) + "," + str(vehQueued) + ");"
                        self.logger.debug('%s' % sqlscript)

        elif location == 1: #telegraph sb
            for i in range(1,len(uniqueData)):
                vehData = uniqueData[i-1]
                latitude = vehData[1]
                longitude = vehData[2]
                heading = vehData[4]
                if 150 <= heading <= 200:
                    if 42.453550 <= latitude <= 42.509104 and -83.285684 <= longitude <= -83.278326:
                        vehID = i
                        vehSpeed = round(0.621371*float(str(vehData[3])),2) #mph
                        vehMM = self.telegraphmiles(vehData[1], vehData[2]) #milemarker
                        if vehSpeed <= 15:
                            vehQueued = "Yes"
                        else:
                            vehQueued = "No"

                        sqlscript = "INSERT INTO TME_CVData_Input (NomadicDeviceID, Speed, \
                            MMLocation, CVQueuedState) VALUES (" + str(vehID) + "," + str(vehSpeed) \
                            + "," + str(vehMM) + "," + str(vehQueued) + ");"
                        self.logger.debug('%s' % sqlscript)
        if sqlscript != 0:
            rs = conn.Execute(sqlscript)
            self.triggers += 1
        conn.close

        # !!! changed syncfile !!!
        syncfile = os.path.join(os.getcwd(),'..','Data.txt')

        file = open(syncfile, "w") #make text file
        file.write("CVData\n")
        self.logger.debug('INFLO Sync File Generated.')
        file.close()

    def inflomanageSimple(self,uniqueData, location):
        sqlscript = 0
        if location == 0: #larned
            for i in range(1,len(uniqueData)):
                vehData = uniqueData[i-1]
                latitude = vehData[1]
                longitude = vehData[2]
                heading = vehData[4]
                if 40 <= heading <= 80:
                    if 42.327980 <= latitude <= 42.331668 and -83.048620 <= longitude <= -83.040147:
                        vehID = i
                        vehSpeed = round(0.621371*float(str(vehData[3])),2) #mph
                        vehMM = self.milemarker(vehData[1], vehData[2]) #milemarker
                        if vehSpeed <= 15:
                            vehQueued = "Yes"
                        else:
                            vehQueued = "No"

                        sqlscript = "INSERT INTO TME_CVData_Input (NomadicDeviceID, Speed, \
                            MMLocation, CVQueuedState) VALUES (" + str(vehID) + "," + str(vehSpeed) \
                            + "," + str(vehMM) + "," + str(vehQueued) + ");"

        elif location == 1: #telegraph sb
            for i in range(1,len(uniqueData)):
                vehData = uniqueData[i-1]
                latitude = vehData[1]
                longitude = vehData[2]
                heading = vehData[4]
                if 150 <= heading <= 200:
                    if 42.453550 <= latitude <= 42.509104 and -83.285684 <= longitude <= -83.278326:
                        vehID = i
                        vehSpeed = round(0.621371*float(str(vehData[3])),2) #mph
                        vehMM = self.telegraphmiles(vehData[1], vehData[2]) #milemarker
                        if vehSpeed <= 15:
                            vehQueued = "Yes"
                        else:
                            vehQueued = "No"

                        sqlscript = "INSERT INTO TME_CVData_Input (NomadicDeviceID, Speed, \
                            MMLocation, CVQueuedState) VALUES (" + str(vehID) + "," + str(vehSpeed) \
                            + "," + str(vehMM) + "," + str(vehQueued) + ");"

        if sqlscript != 0:
            self.triggers += 1

    def milemarker(self,lat,lon):
        milemarker = 0
        if lat >= 42.327972 and lat <= 42.328876 and lon >= -83.048519 and lon <= -83.046357:
            milemarker = 0.1
        elif lat >= 42.328876 and lat <= 42.329907 and lon >= -83.046357 and lon <= -83.044056:
            milemarker = 0.2
        elif lat >= 42.329907 and lat <= 42.330859 and lon >= -83.044056 and lon <= -83.041846:
            milemarker = 0.3
        elif lat >= 42.330859 and lat <= 42.331573 and lon >= -83.041846 and lon <= -83.040215:
            milemarker = 0.4
        else:
            milemarker = 0.5
        return milemarker

    def telegraphmiles(self,lat,lon):
        milemarker = 0
        #since Telegraph Rd. is southbound, we use latitude differential to log milemarker.
        lat0 = 42.508318
        meters = (lat0 - lat)*111079
        miles = meters*0.000621371
        milemarker = format(miles, '.1f')
        return milemarker
