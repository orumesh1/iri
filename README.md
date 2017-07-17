## OruMesh
What is OruMesh?
Orumesh is a movement that aims to empower individuals by creating a new economy based on the principles of decentralization, financial freedom, and equality of opportunity. OruMesh is a revolutionary new transactional settlement , sharing ecnomy and data transfer layer for the IOT’s, . It’s based on a new distributed ledger, Acyclic Mesh, which overcomes the inefficiencies of current Blockchain designs and introduces a new way of reaching consensus in a decentralized peer-to-peer system.Its based on Proof Of Web Application Assets or POWAA.
For the first time ever, through Oru Mesh people can transfer money without any fees. This means that even infinitesimally small nano payments can be made through OruMesh. OruMesh is the missing puzzle piece for the Machine Economy to fully emerge and reach its desired potential.

* **Latest release:** 1.0.0 Release
* **License:** GPLv3

# How to get started

Obviously, because this is its own, independent network, you have to go through the same process as in the main network: **find Socail Partners**. You can find Social Partners in the `#nodesharing` Orubit channel[[Orubit Invite]](http://orubit.com), or on our forum. Community members are usually very happy to help you out and get you connected. If you want to get Oru's for your testcase, please just ask in one of the communication channels as well.

## Reporting Issues

If you notice any issues or irregularities in this release. Please make sure to submit an issue on github.


# Installing

You have two options, the preferred option is that you compile yourself. The second option is that you utilize the provided jar, which is released regularly.

### Compiling yourself  

Make sure to have Maven and Java 8 installed on your computer.

#### To compile & package
```
$ git clone https://github.com/orumesh1/iri
$ mvn clean compile
$ mvn package
```

This will create a `target` directory in which you will find the executable jar file that you can use for the 

### How to run IRI 

Running IRI is pretty simple, and you don't even have to run it under admin rights. Below is a list of command line options. Here is an example script:

```
java -jar iri.jar -p 14265
```


### Command Line Options 

Option | Shortened version | Description | Example Input
--- | --- | --- | --- 
`--port` | `-p` | This is a *mandatory* option that defines the port to be used to send API commands to your node | `-p 14800`
`--neighbors` | `-n` | Neighbors that you are connected with will be added via this option. | `-n "udp://162.162.138.168:14265 udp://[2001:db8:a0b:12f0::1]:14265"`
`--config` | `-c` | Config INI file that can be used instead of CLI options. See more below | `-c iri.ini`
`--udp-receiver-port` | `-u` | UDP receiver port | `-u 14800`
`--tcp-receiver-port` | `-t` | TCP receiver port | `-t 14800`
`--testnet` | | Makes it possible to run IRI with the OruMesh testnet | `--testnet`
`--remote` | | Remotely access your node and send API commands | `--remote`
`--remote-auth` | | Require authentication password for accessing remotely. Requires a correct `username:hashedpassword` combination | `--remote-auth Orutoken:LL9EZFNCHZCMLJLVUBCKJSWKFEXNYRHHMYS9XQLUZRDEKUUDOCMBMRBWJEMEDDXSDPHIGQULENCRVEYMO`
`--remote-limit-api` | | Exclude certain API calls from being able to be accessed remotely | `--remote-limit-api "attachToTangle, addNeighbors"`
`--send-limit`| | Limit the outbound bandwidth consumption. Limit is set to mbit/s | `--send-limit 1.0`
`--max-peers` | | Limit the number of max accepted peers. Default is set to 0 (mutual tethering) | `--max-peers 8`

### INI File

You can also provide an ini file to store all of your command line options and easily update (especially neighbors) if needed. You can enable it via the `--config` flag. Here is an example INI file:
```
[IRI]
PORT = 14700
UDP_RECEIVER_PORT = 14700
NEIGHBORS = udp://my.favorite.com:15600
IXI_DIR = ixi
HEADLESS = true
DEBUG = true
#TESTNET = false
DB_PATH = db
```
