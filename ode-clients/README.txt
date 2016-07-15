Open Source Overview
============================
SEMI-ODE-CLIENT 1.1 consists of the client applications that runs using the Operational Data Environment. ODE pushes out Connected Vehicle data from the South East Michigan (SEMI) Testbed through web-sockets to applications running on client machines, similar to the ones provided here. Four applications are provided in this repository. They are Speed Harmonization (coded as INFLO), Incident Zone Alerts (coded as INC-ZONE), Eco-Approach and Departure (coded as EAD) and Motorists Advisories and Warnings (coded as MAW). INFLO aims at using the CV data to identify congestion on a roadway and provide harmonized speeds to upstream vehicles. INC-ZONE application produces alerts and warnings to warn drivers approaching a location of incidents. EAD application uses real-time phase and time-remaining information from signalized intersections to provide fuel-optimal vehicle speed advisories to approaching connected vehicles. MAW application provides alerts to vehicles approaching zones of weather events.

License information
-------------------
Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
file except in compliance with the License.
You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software distributed under
the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied. See the License for the specific language governing
permissions and limitations under the License.

System Requirements
-------------------------
8 GB RAM min.
3 GHz Processing Power
Connectivity to ODE's IP (through internet)
Windows 7 OS to support INFLO and COM.

Documentation
-------------
Installation instructions:
1. Install INFLOApps available at INFLO-SIM Repository on the OSADP.
2. Install Python 2.7 (64-bit)
3. Install following Python Libraries
	a. sys
	b. PySide
	c. thread
	d. logging
	e. datetime
	f. matplotlib
	g. win32com
	h. odeClient (available in this repository)
	i. pythoncom
	j. json
4. Initiation details.
	a. InfloLink - should point to installed INFLOApps.exe
	b. INFLODatabase.accdb - configured for INFLO
	c. Obtain ODE IP and Login Credentials
	d. Configure today's date in Lines 48 and 51 of maw.py
	e. Initiation File is ODE_v2.py