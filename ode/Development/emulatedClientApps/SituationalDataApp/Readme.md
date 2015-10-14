
Implemented Develop Generic Situation Data Emulated App as described by ODE-44

Command line arguments:

```
python simulatedclient2.py --help
Usage: simulatedclient2.py [options]

Situation Data App Example

Options:
  --help                show this help message and exit

  Required Parameters:
    -t type, --type=type
                        Request Type Query - qry, Subscription = sub )
    -d data, --data=data
                        Data Type (Vehicle, Intersection, Aggregate, Advisory)
    -h host, --host=host
                        ODE Host with out the HTTP
    -u username, --user=username
                        ODE User Name
    -p password, --password=password
                        ODE User Password

  Optional Parameters:
    -f file, --file=file
                        Full Path to a File containing JSON output that will
                        be used tovalidaate ODE output instead of default JSON
                        files
    -c config_file, --config=config_file
                        Full path to config file File that can be used to
                        override all settings.Config file will override all
                        command line parameters
```