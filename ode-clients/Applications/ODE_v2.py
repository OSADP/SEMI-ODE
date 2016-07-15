#Code developed by Raj Kamalanathsharma (Booz Allen Hamilton) - Kamalanathsharma_Raj@bah.com
#Code updated by Jerome Froelich (Booz Allen Hamilton)

#Importing all required libraries and modules
import sys
from PySide.QtCore import *
from PySide.QtGui import *

import odegui
import inflo
import inczone
import ead
import maw
import subprocess
#import executable
import thread
import os
import logging
import datetime

import matplotlib

matplotlib.use('Qt4Agg')
matplotlib.rcParams['backend.qt4']='PySide'

from matplotlib.figure import Figure
from matplotlib.backends.backend_qt4agg import FigureCanvasQTAgg as FigureCanvas

"""
Logging functions to console and log files.

"""
logger = logging.getLogger('ODEApplication')
logger.setLevel(logging.DEBUG)

formatter = logging.Formatter('%(asctime)s-%(name)s-%(levelname)s: %(message)s')#, datefmt="%Y-%m-%dT%H:%M:%S.%f")

current_date_time = datetime.datetime.now().strftime("%Y-%m-%dT%H_%M_%S")
log_name = 'GUIAppODE_{}.log'.format(current_date_time)
fh = logging.FileHandler(os.path.join('GUIlogs',log_name)) # logs
fh.setLevel(logging.DEBUG)
fh.setFormatter(formatter)
logger.addHandler(fh)

ch = logging.StreamHandler()
ch.setLevel(logging.DEBUG)
ch.setFormatter(formatter)
logger.addHandler(ch)

#logger.debug('This is a test log message.')
#logger.info('This is a test log message.')
#logger.warning('This is a test log message.')
#logger.error('This is a test log message.')
#logger.critical('This is a test log message.')

"""
Initializing threading to support multiple applications.
"""
inflo = inflo.inflocode()
inczone = inczone.inczonecode()
ead = ead.eadcode()
maw = maw.mawcode()
#execute = executable.executables()

class InfloApps(QThread):
	def __init__(self):
		QThread.__init__(self)

	def __del__(self):
		self.wait()

	def run(self):
		os.system("InfloLink.lnk")
        #os.system(os.path.join(os.getcwd(), "..", "INFLOApps", "bin", "Release", "INFLOApps.exe"))
		logger.debug('External INFLOApps.exe Started.')

class InfloProgram(QThread):
	def __init__(self,datatype,username,password,serverIP, infLocation, inputFile = None):
		QThread.__init__(self)
		self.datatype = datatype
		self.username = username
		self.password = password
		self.serverIP = serverIP
		self.infLocation = infLocation
		self.inputFile = inputFile

	def __del__(self):
		self.wait()

	def run(self):
		inflo.app(self.datatype,self.username,self.password,self.serverIP, self.infLocation, self.inputFile)

class InczoneProgram(QThread):
	def __init__(self, datatype, username, password, serverIP, incLocation, inputFile = None):
		QThread.__init__(self)
		self.datatype = datatype
		self.username = username
		self.password = password
		self.serverIP = serverIP
		self.incLocation = incLocation
		self.inputFile = inputFile

	def __del__(self):
		self.wait()

	def run(self):
		inczone.app(self.datatype,self.username,self.password,self.serverIP, self.incLocation, self.inputFile)

class EadProgram(QThread):
	def __init__(self,datatype, username,password, serverIP, intersection, inputFile = None):
		QThread.__init__(self)
		self.datatype = datatype
		self.username = username
		self.password = password
		self.serverIP = serverIP
		self.intersection = intersection
		self.inputFile = inputFile

	def __del__(self):
		self.wait()

	def run(self):
		ead.app(self.datatype,self.username,self.password,self.serverIP,self.intersection, self.inputFile)

class MawProgram(QThread):
	def __init__(self, datatype, username, password, serverIP, area, mawFrequency, inputFile = None):
		QThread.__init__(self)
		self.datatype = datatype
		self.username = username
		self.password = password
		self.serverIP = serverIP
		self.area = area
		self.mawFrequency = mawFrequency
		self.inputFile = inputFile

	def __del__(self):
		self.wait()

	def run(self):
		maw.app(self.datatype, self.username, self.password, self.serverIP, self.area, self.mawFrequency, self.inputFile)


class MainDialog(QDialog, odegui.Ui_Dialog):

	def __init__(self, parent = None):
		super(MainDialog, self).__init__(parent)
		self.setupUi(self)
		self.connect(self.startInflo, SIGNAL("clicked()"), self.runINFLO)
		self.connect(self.startInczone, SIGNAL("clicked()"), self.runINCZONE)
		self.connect(self.startEadapp, SIGNAL("clicked()"), self.runEAD)
		self.connect(self.startMawapp, SIGNAL("clicked()"), self.runMAW)
		self.connect(self.exitInflo, SIGNAL("clicked()"), self.exitapp)
		self.connect(self.exitInczone, SIGNAL("clicked()"), self.exitapp)
		self.connect(self.exitEadapp, SIGNAL("clicked()"), self.exitapp)
		self.connect(self.exitMawapp, SIGNAL("clicked()"), self.exitapp)

		# setup file browser
		self.browseButton.clicked.connect(self.selectFile)

		# update checked boxes on click
		self.connect(self.depositDataBox, SIGNAL("clicked()"), self.depositDataBoxCallback)
		self.connect(self.fieldDataBox, SIGNAL("clicked()"), self.fieldDataBoxCallback)
		self.connect(self.fileUploadBox, SIGNAL("clicked()"), self.fileUploadBoxCallback)

		# setup inczone variables
		self.totalInczoneMessages = 0
		self.currentInczoneMessages = [0]*60
		self.totalInczoneAdvisories = 0
		self.currentInczoneAdvisories = [0]*60
		self.totalInczoneAlerts = 0
		self.currentInczoneAlerts = [0]*60
		self.totalInczoneWarnings = 0
		self.currentInczoneWarnings = [0]*60
		# setup inflo variables
		self.totalInfloMessages = 0
		self.currentInfloMessages = [0]*60
		self.totalInfloTriggers = 0
		self.currentInfloTriggers = [0]*60
		# setup ead variables
		self.totalEadMessages = 0
		self.currentEadMessages = [0]*60
		self.totalEadCase5 = 0
		self.currentEadCase5 = [0]*60
		# setup maw variables
		self.totalMawMessages = 0
		self.currentMawMessages = [0]*60
		self.totalMawAlerts = 0
		self.currentMawAlerts = [0]*60

		# setup plots
		self.setupInczonePlot()
		self.setupInfloPlot()
		self.setupEadPlot()
		self.setupMawPlot()

		logger.debug('ODE Application Interface started.')

	def setupInfloPlot(self):
		self.infloFigure = Figure(dpi=72, facecolor=(1,1,1), edgecolor=(0,0,0))
		self.infloCanvas = FigureCanvas(self.infloFigure)

		self.infloAxes = self.infloFigure.add_subplot(111, title = "Trends over Time",
		xlabel = "Time", ylabel = "Count (Messages x100)")
		self.infloAxes.plot(range(60), self.currentInfloMessages, 'g-', label = 'Messages')
		self.infloAxes.plot(range(60), self.currentInfloTriggers, 'c-', label = 'Triggers')
		self.infloAxes.axis([0, 60, 0, 35])
		self.infloAxes.set_xticklabels([])
		self.infloAxes.legend(loc = 'upper left', fontsize = 10)

		infloLayout = QVBoxLayout(self.infloPlot)
		infloLayout.addWidget(self.infloCanvas)

	def setupInczonePlot(self):
		self.inczoneFigure = Figure(dpi=72, facecolor=(1,1,1), edgecolor=(0,0,0))
		self.inczoneCanvas = FigureCanvas(self.inczoneFigure)

		self.inczoneAxes = self.inczoneFigure.add_subplot(111, title = "Trends over Time",
		xlabel = "Time", ylabel = "Count (Messages x10)")
		self.inczoneAxes.plot(range(60), self.currentInczoneMessages, 'g-', label = 'Messages')
		self.inczoneAxes.plot(range(60), self.currentInczoneAdvisories, 'c-', label = 'Advisories')
		self.inczoneAxes.plot(range(60), self.currentInczoneAlerts, 'y-', label = 'Alerts')
		self.inczoneAxes.plot(range(60), self.currentInczoneWarnings, 'r-', label = 'Warnings')
		self.inczoneAxes.axis([0, 60, 0, 35])
		self.inczoneAxes.set_xticklabels([])
		self.inczoneAxes.legend(loc = 'upper left', fontsize = 10)

		inczoneLayout = QVBoxLayout(self.inczonePlot)
		inczoneLayout.addWidget(self.inczoneCanvas)

	def setupEadPlot(self):
		self.eadFigure = Figure(dpi=72, facecolor=(1,1,1), edgecolor=(0,0,0))
		self.eadCanvas = FigureCanvas(self.eadFigure)

		self.eadAxes = self.eadFigure.add_subplot(111, title = "Trends over Time",
		xlabel = "Time", ylabel = "Count (Messages x10)")
		self.eadAxes.plot(range(60), self.currentEadMessages, 'b-', label = 'Messages')
		self.eadAxes.plot(range(60), self.currentEadCase5, 'r-', label = 'Alerts')
		self.eadAxes.axis([0, 60, 0, 35])
		self.eadAxes.set_xticklabels([])
		self.eadAxes.legend(loc = 'upper left', fontsize = 10)

		eadLayout = QVBoxLayout(self.eadPlot)
		eadLayout.addWidget(self.eadCanvas)

	def setupMawPlot(self):
		self.mawFigure = Figure(dpi=72, facecolor=(1,1,1), edgecolor=(0,0,0))
		self.mawCanvas = FigureCanvas(self.mawFigure)

		self.mawAxes = self.mawFigure.add_subplot(111, title = "Trends over Time",
		xlabel = "Time", ylabel = "Count (Messages x10)")
		self.mawAxes.plot(range(60), self.currentMawMessages, 'b-', label = 'Messages')
		self.mawAxes.plot(range(60), self.currentMawAlerts, 'm-', label = 'Alerts')
		self.mawAxes.axis([0, 60, 0, 35])
		self.mawAxes.set_xticklabels([])
		self.mawAxes.legend(loc = 'upper left', fontsize = 10)

		mawLayout = QVBoxLayout(self.mawPlot)
		mawLayout.addWidget(self.mawCanvas)


	def updateInczonePlot(self, data):
		self.currentInczoneMessages.pop(0)
		self.currentInczoneMessages.append(data[0])
		self.currentInczoneAdvisories.pop(0)
		self.currentInczoneAdvisories.append(data[1])
		self.currentInczoneAlerts.pop(0)
		self.currentInczoneAlerts.append(data[2])
		self.currentInczoneWarnings.pop(0)
		self.currentInczoneWarnings.append(data[3])

		self.inczoneFigure.clear()

		self.inczoneAxes = self.inczoneFigure.add_subplot(111, title = "Trends over Time",
		xlabel = "Time(s)", ylabel = "Count (log(messages)")
		self.inczoneAxes.plot(range(60), self.currentInczoneMessages, 'g-', label = 'Messages')
		self.inczoneAxes.plot(range(60), self.currentInczoneAdvisories, 'c-', label = 'Advisories')
		self.inczoneAxes.plot(range(60), self.currentInczoneAlerts, 'y-', label = 'Alerts')
		self.inczoneAxes.plot(range(60), self.currentInczoneWarnings, 'r-', label = 'Warnings')
		self.inczoneAxes.set_xticklabels([])
		self.inczoneAxes.legend(loc = 'upper left', fontsize = 10)

		self.inczoneCanvas.draw()

	def updateInfloPlot(self, data):
		self.currentInfloMessages.pop(0)
		self.currentInfloMessages.append(data[0])
		self.currentInfloTriggers.pop(0)
		self.currentInfloTriggers.append(data[1])

		self.infloFigure.clear()

		self.infloAxes = self.infloFigure.add_subplot(111, title = "Trends over Time",
		xlabel = "Time(s)", ylabel = "Count (log(messages)")
		self.infloAxes.plot(range(60), self.currentInfloMessages, 'g-', label = 'Messages')
		self.infloAxes.plot(range(60), self.currentInfloTriggers, 'c-', label = 'Triggers')
		self.infloAxes.set_xticklabels([])
		self.infloAxes.legend(loc = 'upper left', fontsize = 10)

		self.infloCanvas.draw()

	def updateEadPlot(self, data):
		self.currentEadMessages.pop(0)
		self.currentEadMessages.append(data[0])
		self.currentEadCase5.pop(0)
		self.currentEadCase5.append(data[1])

		self.eadFigure.clear()

		self.eadAxes = self.eadFigure.add_subplot(111, title = "Trends over Time",
		xlabel = "Time(s)", ylabel = "Count (log(messages)")
		self.eadAxes.plot(range(60), self.currentEadMessages, 'b-', label = 'Messages')
		self.eadAxes.plot(range(60), self.currentEadCase5, 'r-', label = 'Alerts')
		self.eadAxes.set_xticklabels([])
		self.eadAxes.legend(loc = 'upper left', fontsize = 10)

		self.eadCanvas.draw()

	def updateMawPlot(self, data):
		self.currentMawMessages.pop(0)
		self.currentMawMessages.append(data[0])
		self.currentMawAlerts.pop(0)
		self.currentMawAlerts.append(data[1])

		self.mawFigure.clear()

		self.mawAxes = self.mawFigure.add_subplot(111, title = "Trends over Time",
		xlabel = "Time(s)", ylabel = "Count (log(messages))")
		self.mawAxes.plot(range(60), self.currentMawMessages, 'b-', label = 'Messages')
		self.mawAxes.plot(range(60), self.currentMawAlerts, 'm-', label = 'Alerts')
		self.mawAxes.set_xticklabels([])
		self.mawAxes.legend(loc = 'upper left', fontsize = 10)

		self.mawCanvas.draw()


	def updateInczoneLabels(self, data):
		self.totalInczoneMessages += data[0]
		self.totalInczoneAdvisories += data[1]
		self.totalInczoneAlerts += data[2]
		self.totalInczoneWarnings += data[3]

		self.inczoneMessagesCount.setText(str(self.totalInczoneMessages))
		self.inczoneAdvisoriesCount.setText(str(self.totalInczoneAdvisories))
		self.inczoneAlertsCount.setText(str(self.totalInczoneAlerts))
		self.inczoneWarningsCount.setText(str(self.totalInczoneWarnings))

	def updateInfloLabels(self, data):
		self.totalInfloMessages += data[0]
		self.totalInfloTriggers += data[1]

		self.infloMessagesCount.setText(str(self.totalInfloMessages))
		self.infloTriggersCount.setText(str(self.totalInfloTriggers))

	def updateEadLabels(self, data):
		self.totalEadMessages += data[0]
		self.totalEadCase5 += data[1]

		self.eadMessagesCount.setText(str(self.totalEadMessages))
		self.eadCase5Count.setText(str(self.totalEadCase5))

	def updateMawLabels(self, data):
		self.totalMawMessages += data[0]
		self.totalMawAlerts += data[1]

		self.mawMessagesCount.setText(str(self.totalMawMessages))
		self.mawAlertsCount.setText(str(self.totalMawAlerts))

	def fieldDataBoxCallback(self):
		self.depositDataBox.setCheckState(Qt.Unchecked)
		self.fileUploadBox.setCheckState(Qt.Unchecked)
	def depositDataBoxCallback(self):
		self.fieldDataBox.setCheckState(Qt.Unchecked)
		self.fileUploadBox.setCheckState(Qt.Unchecked)
	def fileUploadBoxCallback(self):
		self.fieldDataBox.setCheckState(Qt.Unchecked)
		self.depositDataBox.setCheckState(Qt.Unchecked)

	def selectFile(self):
		selectedFile = QFileDialog.getOpenFileName()
		self.uploadFileText.setText(selectedFile[0])


	def exitapp(self):
		logger.debug('Application Interface closed.')
		quit()


	def runINFLO(self):
		self.inflo_thread = InfloApps()
		self.inflo_thread.start()
		"""
		Inputs given:
		1. Corridor Name = stName
		2. Corridor Length = stLength
		3. Sublink Length = sublinkLength
		4. Minimum Speed = minSpeed
		5. Maximum Speed = maxSpeed
		6. Harmonized Direction = stDirection
		7. Types of Data = dataType
		"""
		logger.debug('INFLO App Triggered.')
		username = self.username.text()
		password = self.password.text()
		serverIP = self.serverIP.text()
		infLocation = self.INFLOCorridor.currentIndex() #0 = Larned St and 1 = Telegraph Rd

		if self.depositDataBox.isChecked():
			self.infloprogramthread = InfloProgram("sim",username,password,serverIP,infLocation)
		elif self.fieldDataBox.isChecked():
			self.infloprogramthread = InfloProgram("field",username,password,serverIP,infLocation)
		else:
			inputFile = self.uploadFileText.text()
			self.infloprogramthread = InfloProgram("input",username,password,serverIP,infLocation, inputFile)

		# connect signals to update functions
		inflo.signal.connect(self.updateInfloPlot)
		inflo.signal.connect(self.updateInfloLabels)

		self.infloprogramthread.start()

	def runINCZONE(self):

		"""
		Inputs given:
		1. Corridor Name = stName_2
		2. Incident Latitude = incLatitude
		3. Incident Longitude = incLongitude
		4. Length of Closure = incClosureLength
		5. Lanes Closed = incClosedLanes
		6. Incident Start Time = incStart
		7. Incident End Time  = incEnd
		"""
		logger.debug('INC-ZONE App Triggered.')
		username = self.username.text()
		password = self.password.text()
		serverIP = self.serverIP.text()
		incLocation = self.INCZONECorridor.currentIndex() #0 = Downtown, #1 = NB Telegraph and #2 = SB Telegraph
		incClosureLength = self.incClosureLength.text()
		if self.depositDataBox.isChecked():
			self.inczonethread = InczoneProgram("sim", username, password, serverIP, incLocation)
		elif self.fieldDataBox.isChecked():
			self.inczonethread = InczoneProgram("field", username,password, serverIP, incLocation)
		else:
			inputFile = self.uploadFileText.text()
			self.inczonethread = InczoneProgram("input", username ,password, serverIP, incLocation, inputFile)

		# connect signals to update functions
		inczone.signal.connect(self.updateInczonePlot)
		inczone.signal.connect(self.updateInczoneLabels)

		self.inczonethread.start()

	def runEAD(self):
		"""
		Inputs given:
		1. Intersection Name = ComboBox
		2. Roadway Speed Limit = speedLimit
		3. Maximum Deceleration = decelMax
		4. Intersection Data Frequency = intFreq
		5. Vehicle Data Frequency = vehFreq
		"""
		logger.debug('EAD Application Triggered.')
		username = self.username.text()
		password = self.password.text()
		serverIP = self.serverIP.text()
		intersection = self.comboBox.currentIndex() #0 = Wash/Cong, #1 = Woodward/Cong, #2 = SBTel/10m, #3 = NBTel/12m
		intFrequency = self.intFreq.text()
		vehFrequency = self.vehFreq.text()

		if self.depositDataBox.isChecked():
			self.eadthread = EadProgram("sim", username,password, serverIP, intersection)
		elif self.fieldDataBox.isChecked():
			self.eadthread = EadProgram("field", username,password, serverIP, intersection)
		else:
			inputFile = self.uploadFileText.text()
			self.eadthread = EadProgram("input", username, password, serverIP, intersection, inputFile)

		# connect signals to update functions
		ead.signal.connect(self.updateEadPlot)
		ead.signal.connect(self.updateEadLabels)

		self.eadthread.start()

	def runMAW(self):
		logger.debug('MAW Application Triggered.')
		"""
		Inputs given:
		1. Intersection Name = ComboBox
		2. Roadway Speed Limit = speedLimit
		3. Maximum Deceleration = decelMax
		4. Intersection Data Frequency = intFreq
		5. Vehicle Data Frequency = vehFreq
		"""
		username = self.username.text()
		password = self.password.text()
		serverIP = self.serverIP.text()
		area = self.mawArea.currentIndex() #0 = Wash/Cong, #1 = Woodward/Cong, #2 = SBTel/10m, #3 = NBTel/12m
		mawFrequency = self.mawFreq.text()
		if self.depositDataBox.isChecked() == True:
			self.mawthread = MawProgram("sim", username, password, serverIP, area, mawFrequency)
		elif self.fieldDataBox.isChecked():
			self.mawthread = MawProgram("field", username, password, serverIP, area, mawFrequency)
		else:
			inputFile = self.uploadFileText.text()
			self.mawthread = MawProgram("input", username, password, serverIP, area, mawFrequency, inputFile)

		# connect signals to update functions
		maw.signal.connect(self.updateMawPlot)
		maw.signal.connect(self.updateMawLabels)

		self.mawthread.start()

app = QApplication(sys.argv)
form = MainDialog()
form.setWindowTitle("ODE Demonstration")
form.show()
app.exec_()
