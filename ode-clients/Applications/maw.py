#Code developed by Catherine Slesnick (Booz Allen Hamilton) - Slesnick_Catherine@bah.com
#Code updated by Jerome Froelich (Booz Allen Hamilton)
# -*- coding: utf-8 -*-
import os
import sys
import datetime
import win32com.client as com
from random import randrange, uniform
import pandas as pd
import pickle
import math
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
import ode_functions_r6

from PySide.QtCore import Signal
from PySide.QtCore import QObject

# to parse uploaded json file
import json

current_file_path = os.path.dirname(os.path.abspath('__file__'))
data_path = os.path.join(current_file_path,'Data')
weather_alert_file = 'bothtestbeds_weather_alerts_2016-02-15T19_13_21.pkl'
weather_alerts = pickle.load(open(data_path + '/' + weather_alert_file,'rb'))

class mawcode(QObject):

    messages = 0
    alerts = 0

    signal = Signal(object)

    logger = logging.getLogger('ODEApplication.mawcode')
    def app(self, datatype, username, password, server, area, frequency, inputFile):
        self.logger.debug('MAW App Started.')
        frequency = float(frequency)

        if inputFile is None:
            sdate = datetime.datetime(2016,04,07)#datetime.datetime.now()
        else:
            # TODO: read this from inputFile
            sdate = datetime.datetime(2016,04,07)#datetime.datetime.now()

        walerts = self.make_alerts(sdate, weather_alerts)

        if datatype == "sim":
            self.mawsim(username, password, server, frequency, area, walerts)
        elif datatype == "field":
            self.mawfield(username, password, server, frequency, area, walerts)
        else:
            self.mawinput(username, password, server, frequency, area, walerts, inputFile)

    def make_alerts(self,sdate,walerts):
        nalerts = []
        for a in walerts:
            t = a.starttime
            starttime = sdate.replace(hour=t.hour, minute=t.minute, second=t.second, microsecond=t.microsecond)
            a.set_starttime(starttime)

            te = a.endtime
            endtime = sdate.replace(hour=te.hour, minute=te.minute, second=te.second, microsecond=te.microsecond)
            a.set_endtime(endtime)
            nalerts.append(a)
        return nalerts

    def append_to_file_gen(self,entry,outfile):
        with open(outfile, "a") as myfile: # output
            #print "appending to file ",outfile
            if len(entry) > 1:
                for v in entry:
                    myfile.write(str(v))
                    myfile.write(',')
            else:
                myfile.write(str(entry))
                myfile.write(',')
            myfile.write('r1')
            myfile.write("\n")

    def mawsim(self,username, password, server, frequency,location, walerts):
        self.logger.debug('MAW App is using Simulated Data.')
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
        ode.get_token(username,password)
        ode.setRequest(test_request)

        if not os.path.exists('output'):
            os.makedirs('output')
        output_path = os.path.join(current_file_path,'output')
        vehfile = 'NEW_data_tb1.json'
        current_date_time = datetime.datetime.now().strftime("%Y-%m-%dT%H_%M_%S")
        output_file = vehfile +"_alerts_{0}.txt".format(current_date_time)
        outputdat = output_path + "/" + output_file

        # start upload and async client
        async = client.AsyncODEClient(odeClient=ode)
        async.start()

        # set up input file
        config = {}
        config['HOST']= host
        config['REQUEST_TYPE'] = 'sub'
        config['DATA'] = 'veh'
        config['TEST_REQUEST'] = None
        config['INPUT_FILE'] = './/maw_sim.json'

        # main weather application
        totthru = 0 # count # received as sanity check - for debug only
        while True:
            items = async.get_all_messages()
            CVData = []

            # reset current counts
            self.messages, self.alerts = len(items), 0

            for record in items:
                totthru = totthru+1
                if totthru%100 == 0:
                    self.logger.info("Received %d records", totthru)
                if record.get_payload_type() in ('status',) and record.get_payload_value('requestId'):
                    config['TEST_REQUEST'] = record.get_payload_value('requestId')
                    depositClient.update_config(config)
                    thread.start_new_thread(depositClient._run_main, (config,))
                else:
                    vehList = [0,0,0,0,0]
                    vehList[0] = record.get_payload_value('tempId')
                    vehList[1] = record.get_payload_value('latitude')
                    vehList[2] = record.get_payload_value('longitude')
                    vehList[3] = record.get_payload_value('speed')
                    vehList[4] = record.get_payload_value('dateTime')
                    self.logger.debug('Data Received: %s' % str(vehList))
                    CVData.append(vehList)
            #Get latest data from a vehicle.
            vehIDs = []
            all_vdat = []
            for i in range (1, len(CVData)):
                vehData = CVData[i]
                tid = vehData[0]
                if tid not in vehIDs:
                    vehIDs.append(tid)
                    all_vdat.append(vehData)
            if len(vehIDs) > 0:
                vdat = pd.DataFrame(all_vdat, columns = ['VID','Latitude','Longitude','speed','heading','dateTime','groupId'])
                for veh in vdat.VID.unique():
                    # Uses mean (lat, lon) for each vehicle in time window
                    lat, lon = vdat[vdat['VID']==veh]['Latitude'].mean(), vdat[vdat['VID']==veh]['Longitude'].mean()
                    vdateTime = datetime.datetime.strptime(vdat[vdat['VID']==veh].dateTime.min(), '%Y-%m-%dT%H:%M:%SZ')
                    act = 0
                    typs = []
                    for a in weather_alerts:
                        # check time window
                        if (vdateTime >= a.starttime) &  (vdateTime <= a.endtime):
                            # Check if car was in an alert box
                            if a.Box.contains_point([lat,lon]):
                                if a.atype not in typs:
                                    aline = [act,veh,vdateTime,lat,lon, a.atype, a.value, a.get_msg()[0],a.temperature]
                                    self.append_to_file_gen(aline,outputdat)
                                    self.logger.info(aline)
                                    typs.append(a.atype)

                                    self.alerts += 1

                        act = act+1

            self.signal.emit([self.messages, self.alerts])

            time.sleep(frequency)

    def mawfield(self,username, password, server, frequency,location, walerts):
        if location == 0:
            Loc = 'Downtown Area'
            nwLat=42.53790
            nwLon=-83.47790
            seLat=42.30575
            seLon=-82.84275
        else:
            Loc = 'Novi Area'
            nwLat=42.517880
            nwLon=-83.306151
            seLat=42.448886
            seLon=-83.259115
        self.logger.debug('MAW App is using Field Data from %s.' % Loc)
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

        if not os.path.exists('output'):
            os.makedirs('output')
        output_path = os.path.join(current_file_path,'output')
        vehfile = 'NEW_data_tb1.json'
        current_date_time = datetime.datetime.now().strftime("%Y-%m-%dT%H_%M_%S")
        output_file = vehfile +"_alerts_{0}.txt".format(current_date_time)
        outputdat = output_path + "/" + output_file

        # main weather application
        totthru = 0 # count # received as sanity check - for debug only
        while True:
            CVData = [] #stores raw data

            # reset current counts
            self.messages, self.alerts = 0, 0

            if not async.is_buffer_empty():
                items = async.get_all_messages()
                #items = async.get_messages(10) # Specifiy number of items to process

                self.messages = math.log(len(items),10)
                #self.messages = len(items)

                for record in items:
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
            #Get latest data from a vehicle.
            vehIDs = []
            all_vdat = []
            for i in range (1, len(CVData)):
                vehData = CVData[i]
                tid = vehData[0]
                if tid not in vehIDs:
                    vehIDs.append(tid)
                    all_vdat.append(vehData)
            if len(vehIDs) > 0:
                vdat = pd.DataFrame(all_vdat, columns = ['VID','Latitude','Longitude','speed','heading','dateTime','groupId'])
                for veh in vdat.VID.unique():
                    # Uses mean (lat, lon) for each vehicle in time window
                    lat, lon = vdat[vdat['VID']==veh]['Latitude'].mean(), vdat[vdat['VID']==veh]['Longitude'].mean()
                    #print vdat
                    if len(vdat[vdat['VID']==veh].dateTime.min()) > 20:
                        vdateTime = datetime.datetime.strptime(str(vdat[vdat['VID']==veh].dateTime.min()), '%Y-%m-%dT%H:%M:%S.%fZ')
                    else:
                        vdateTime = datetime.datetime.strptime(str(vdat[vdat['VID']==veh].dateTime.min()), '%Y-%m-%dT%H:%M:%SZ')
                    act = 0
                    typs = []
                    for a in weather_alerts:
                        # check time window
                        if (vdateTime >= a.starttime) &  (vdateTime <= a.endtime):
                            # Check if car was in an alert box
                            if a.Box.contains_point([lat,lon]):
                                if a.atype not in typs:
                                    aline = [act,veh,vdateTime,lat,lon, a.atype, a.value, a.get_msg()[0],a.temperature]
                                    self.append_to_file_gen(aline,outputdat)
                                    self.logger.info(aline)
                                    typs.append(a.atype)

                                    self.alerts += 1

                        act = act+1

            self.signal.emit([self.messages, self.alerts])

            time.sleep(frequency)

    def mawinput(self, username, password, server, frequency,location, walerts, inputFile):
        if location == 0:
            Loc = 'Downtown Area'
        else:
            Loc = 'Novi Area'
        self.logger.debug('MAW App is using Input Data from %s.' % Loc)
        nwLat=uniform(42.544480787298,42.544480787299)
        nwLon=-83.52218627929688
        seLat=42.3021981769316
        seLon=-82.78610229492188

        if not os.path.exists('output'):
            os.makedirs('output')
        output_path = os.path.join(current_file_path,'output')
        vehfile = 'NEW_data_tb1.json'
        current_date_time = datetime.datetime.now().strftime("%Y-%m-%dT%H_%M_%S")
        output_file = vehfile +"_alerts_{0}.txt".format(current_date_time)
        outputdat = output_path + "/" + output_file

        self.logger.debug("Running mawinput")

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


        # main weather application
        totthru = 0 # count # received as sanity check - for debug only
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
            self.messages, self.alerts = len(items), 0

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
                if vehList[1] != None:
                    CVData.append(vehList)

            #Get latest data from a vehicle.
            vehIDs = []
            all_vdat = []
            for i in range (1, len(CVData)):
                vehData = CVData[i]
                tid = vehData[0]
                if tid not in vehIDs:
                    vehIDs.append(tid)
                    all_vdat.append(vehData)
            if len(vehIDs) > 0:
                vdat = pd.DataFrame(all_vdat, columns = ['VID','Latitude','Longitude','speed','heading','dateTime','groupId'])
                for veh in vdat.VID.unique():
                    # Uses mean (lat, lon) for each vehicle in time window
                    lat, lon = vdat[vdat['VID']==veh]['Latitude'].mean(), vdat[vdat['VID']==veh]['Longitude'].mean()
                    #print vdat
                    if len(vdat[vdat['VID']==veh].dateTime.min()) > 20:
                        vdateTime = datetime.datetime.strptime(str(vdat[vdat['VID']==veh].dateTime.min()), '%Y-%m-%dT%H:%M:%S.%fZ')
                    else:
                        vdateTime = datetime.datetime.strptime(str(vdat[vdat['VID']==veh].dateTime.min()), '%Y-%m-%dT%H:%M:%SZ')
                    act = 0
                    typs = []
                    for a in weather_alerts:
                        # check time window
                        if (vdateTime >= a.starttime) &  (vdateTime <= a.endtime):
                            # Check if car was in an alert box
                            if a.Box.contains_point([lat,lon]):
                                if a.atype not in typs:
                                    aline = [act,veh,vdateTime,lat,lon, a.atype, a.value, a.get_msg()[0],a.temperature]
                                    self.append_to_file_gen(aline,outputdat)
                                    self.logger.info(aline)
                                    typs.append(a.atype)

                                    self.alerts += 1

                        act = act+1

            self.signal.emit([self.messages, self.alerts])

            time.sleep(frequency)
