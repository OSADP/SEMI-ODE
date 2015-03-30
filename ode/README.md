Project Name: Operational Data Environment (ODE)

Git
	To set up Git, run the following commands:
		$ git config --global http.sslVerify false
		$ git clone https://hamidmusavi@buildforge.cnsi.com:9443/scm/ode/ode-repo.git GitRepo
		Cloning into 'GitRepo'...
		Password for 'https://hamidmusavi@buildforge.cnsi.com:9443': <your taskforge password>

	The first command will configure git globally to ignore SSL certificate errors. This
	would necessary if you are using taskforge which provides a self-signed certificate. 
	If you are using Git with other repositories that have a valid CA authorized certificate
	and you wish to verify the certificate's authenticity, you should set the http.sslVerify false
	for the taskforge project only. To do so, enter the following commands:
	
		$ mkdir GitRepo
		$ cd GitRepo
		$ git init
		$ git config http.sslVerify false
		$ git remote add origin https://hamidmusavi@buildforge.cnsi.com:9443/scm/ode/ode-repo.git
		Cloning into 'GitRepo'...
		Password for 'https://hamidmusavi@buildforge.cnsi.com:9443': <your taskforge password>
		$ git pull origin master

	