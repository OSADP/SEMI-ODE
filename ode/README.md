#Southeast Michigan (SEMI) Operational Data Environment (ODE)


##Git

	To set up Git, run the following commands:
	
```
$ git config --global http.sslVerify false
$ git clone https://your.repository.url/semi-ode.git semi-ode
	Cloning into 'semi-ode'...
	Password for 'https://your.repository.url': your.repository.password
``` 
    
	The first command will configure git globally to ignore SSL certificate errors. This
	would necessary if you are using taskforge which provides a self-signed certificate. 
	If you are using Git with other repositories that have a valid CA authorized certificate
	and you wish to verify the certificate's authenticity, you should set the http.sslVerify false
	for the taskforge project only. To do so, enter the following commands:
	
```
$ mkdir GitRepo
$ cd GitRepo
$ git init
$ git config http.sslVerify false
$ git remote add origin https://your.repository.url/semi-ode.git semi-ode
	Cloning into 'semi-ode'...
	Password for 'https://your.repository.url': your.repository.password
$ git pull origin master
```
> Written with [StackEdit](https://stackedit.io/).