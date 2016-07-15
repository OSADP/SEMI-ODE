#Code developed by Catherine Slesnick (Booz Allen Hamilton) - Slesnick_Catherine@bah.com
#Code updated by Raj Kamalanathsharma (Booz Allen Hamilton) - Kamalanathsharma_Raj@bah.com



import geopy
from geopy.distance import VincentyDistance
from geopy.distance import vincenty
from geopy.distance import great_circle
import pandas as pd
from matplotlib import path
import datetime
from datetime import timedelta
from dateutil.parser import parse
import numpy as np
import pickle 

relevant_data = ['canStabilityControlStatus','canWiperStatus','essAirTemperature']  # Observation types to use for alert generation


################################################
#  modules for grouping alerts by geo coords  #
################################################

def distfunc(typereq,p1,p2):
	if typereq=='sub':
		dist = np.abs(p1-p2)
	if typereq == 'geo':
		dist = vincenty(p1,p2).meters
	if typereq == 'geo_gc':
		dist = great_circle(p1,p2).meters	
	return dist

def groups_geo(data,radius,typereq):
	ngroup = 1
	pt = data.index.min()
	gpts = [pt]
	for i,row in data.iterrows():
		dis = distfunc('geo',(data.loc[pt,'Latitude'],data.loc[pt,'Longitude']), (row['Latitude'],row['Longitude']))
		data.loc[i,'dists'] = dis
		data.loc[i,'group'] = 0
	data.loc[pt,'group'] = ngroup
	while len(data[data['group']==0]) > 0:
		data.loc[(data['dists'] <= radius) & (~data.index.isin(gpts)), 'group'] = ngroup
	 	ninds = data[(data['group']==ngroup) & (~data.index.isin(gpts))].index
	 	while len(ninds) > 0:
		 	gpts = gpts + list(ninds)
		 	for n in ninds:
		 		tinds = data[data['group']==0].index
		 		for t in tinds:
		 			data.loc[t,'dists'] = distfunc('geo',(data.loc[n,'Latitude'],data.loc[n,'Longitude']), (data.loc[t,'Latitude'],data.loc[t,'Longitude']))
				data.loc[(data['dists'] <= radius) & (~data.index.isin(gpts)), 'group'] = ngroup
	 		ninds = data[(data['group']==ngroup) & (~data.index.isin(gpts))].index
	 	if len(data[data['group']==0]) > 0:
	 		pt = data[data['group']==0].index.min()
	 		ngroup = ngroup + 1
	 		#print "new group number is ", ngroup
			data.loc[pt,'group'] = ngroup
	 		gpts = gpts + [pt]
			tinds = data[data['group']==0].index
			for t in tinds:
		 		data.loc[t,'dists'] = distfunc('geo',(data.loc[pt,'Latitude'],data.loc[pt,'Longitude']), (data.loc[t,'Latitude'],data.loc[t,'Longitude']))
	return data



##################################
#  moduless for defining alerts  #
##################################


class alert(object):
	def __init__(self,alertCoords,alertTime,alertValue,alertTemperature,alertType='Rain',alertRadius=300,alertPersistance=1):
		self.coords = alertCoords
		self.atype = alertType
		self.rad = alertRadius/1000.0
		self.keeptime = alertPersistance
		self.value = alertValue
		self.temperature = alertTemperature
		self.Center = (alertCoords[:,0].mean(), alertCoords[:,1].mean())
		self.Box = self.make_box(alertCoords[:,0].max(),alertCoords[:,0].min(), \
			alertCoords[:,1].max(), alertCoords[:,1].min(), self.rad)
		self.starttime = alertTime
		self.endtime = self.starttime + datetime.timedelta(minutes = self.keeptime)

	def set_starttime(self,ntime):
		self.starttime = ntime

	def set_endtime(self,ntime):
		self.endtime = ntime

	def make_box(self,nLat,sLat,eLon,wLon,di):
		nwCorner = VincentyDistance(kilometers = di).destination(geopy.Point(nLat,wLon),-45)
		swCorner = VincentyDistance(kilometers = di).destination(geopy.Point(sLat,wLon),-135)
		seCorner = VincentyDistance(kilometers = di).destination(geopy.Point(sLat,eLon),135)
		neCorner = VincentyDistance(kilometers = di).destination(geopy.Point(nLat,eLon),45)
		return path.Path([(nwCorner.latitude, nwCorner.longitude),(swCorner.latitude, swCorner.longitude), \
			(seCorner.latitude, seCorner.longitude), (neCorner.latitude, neCorner.longitude)])
		
	
	def get_msg(self):
		if (self.atype == 'Rain'): # & (len(self.coords) > 1):
			if self.value == 1:
				msg = "Advisory: Light rain in your area."
				mtype = 1
			if self.value ==2:
				msg = "Warning: Heavy rain in your area."
				mtype = 2
		if (self.atype == 'Snow'): # & (len(self.coords) > 1):
			if self.value == 1 :
				msg = "Advisory: Light snow and/or freezing rain in your area."
				mtype = 3
			if self.value ==2:
				msg = "Warning: Heavy snow and/or freezing rain in your area."
				mtype = 4
		if self.atype == 'Rough':
			if len(self.coords) < 2:
				msg = "Advisory: Possible rough road in your area."
				mtype = 5
			else:
				msg = "Advisory: Likely rough road in your area."
				mtype = 6
		if self.atype == "Ice":
			if len(self.coords) < 2:
				msg = "Warning: Possible ice in your area."
				mtype = 7
			else:
				msg = "Warning: Likely ice in your area."	
				mtype = 8		
		return msg, mtype	



# This function generates new alerts
def get_new_alerts(dat,atime,nskip):
	if nskip==1:
		df = pd.DataFrame(dat, \
			columns = ['num1','type','car','Latitude','Longitude','obstype','obs','unit','time','chunk'])
	else:
		df = pd.DataFrame(dat, \
			columns = ['num1','num2','num3','type','car','Latitude','Longitude','obstype','obs','unit','time','chunk'])
	df[['Latitude','Longitude','obs']] = df[['Latitude','Longitude','obs']].astype(float)
	tavg = df[df['obstype']=='essAirTemperature']['obs'].mean()
	rdat = df[(df['obstype']=='canStabilityControlStatus') & (df['obs'] > 0.0)]
	new_alerts = []
	if (len(rdat) > 0 and ~np.isnan(tavg)):
		rdat = groups_geo(rdat,50,'geo')
		for g in rdat.group.unique():
			obsval = round(rdat[rdat['group']==g]['obs'].mean())
			coords = np.array(rdat[rdat['group']==g][['Latitude','Longitude']])
			if tavg > 0:
				nalert = alert(coords,atime,obsval,tavg,alertType='Rough',alertRadius=100,alertPersistance=30)
			if tavg <= 0:
				nalert = alert(coords,atime,obsval,tavg,alertType='Ice',alertRadius=100,alertPersistance=15)
			new_alerts.append(nalert)
	rdat = df[(df['obstype']=='canWiperStatus') & (df['obs'] > 0.0)]
	if (len(rdat) > 0 and ~np.isnan(tavg)):
		rdat = groups_geo(rdat,300,'geo')
		for g in rdat.group.unique():
			obsval = round(rdat[rdat['group']==g]['obs'].mean())
			coords = np.array(rdat[rdat['group']==g][['Latitude','Longitude']])
			if tavg > 0:
				nalert = alert(coords,atime,obsval,tavg,alertType='Rain',alertRadius=300,alertPersistance=5)
			if tavg <= 0:
				nalert = alert(coords,atime,obsval,tavg,alertType='Snow',alertRadius=300,alertPersistance=5)
			new_alerts.append(nalert)
	return new_alerts



def append_to_file(entry, outputfile):
    with open(outputfile, "a") as myfile:
        for v in entry:
            myfile.write(str(v))
            myfile.write(',')
        myfile.write('r6')
        myfile.write("\n")


# This function generates weather alerts
def gen_weather_alerts(datfile,datpath, timewin, current_date_time,nskip):
	infile = datpath + '/' + datfile + '.csv'
	outputfile = datpath + '/' +datfile + '_alerts_{0}.txt'.format(current_date_time)
	outputfile_pickle = datpath + '/' +datfile + '_alerts_{0}.pkl'.format(current_date_time)

	eval_chunk_ind=0
	ind = 0
	chunk_ind = 0
	alertdat = []
	alertsall = []
	with open(infile,'rb') as f:
		# ignore header
		next(f)
		for line in f:
			if eval_chunk_ind < 2000: # Modifiable stop. For debugging purposes only
				line = line.split(',')
				line.append(eval_chunk_ind)
				dattime = parse(line[7+nskip].strip('\n'))
				if chunk_ind ==0:
					stime =dattime
				# Determine if data in current time window
				# If yes, add it
				if dattime <= stime+timedelta(minutes=timewin):
					if line[4+nskip] in relevant_data:
						alertdat.append(line)
					chunk_ind=chunk_ind+1
				# If no, stop and process alerts
				else:
					chunk_ind=0
					print "Processed data for chunk " +str(eval_chunk_ind)
					print "Generating alerts ... "
					# Generate new alerts
					if len(alertdat) > 0:
						nnalerts = get_new_alerts(alertdat,stime+datetime.timedelta(minutes=timewin),nskip)
						if len(nnalerts) > 0:
							for a in nnalerts:
								alertsall.append(a)
								aout = [0,a.get_msg()[1],a.Center[0],a.Center[1],9]
								append_to_file(aout,outputfile)
					alertdat = []
					eval_chunk_ind=eval_chunk_ind+1	
	pickle.dump(alertsall, open(outputfile_pickle,'wb'))
	return alertsall




