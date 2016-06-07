call mvn install:install-file -DcreateChecksum=true -Dpackaging=jar -Dfile=..\ASN.1\JavaAPI\semi\lib\osstoed.jar -DgroupId=asn.1 -DartifactId=oss.runtime -Dversion=6.3
call mvn install:install-file -DcreateChecksum=true -Dpackaging=jar -Dfile=..\ASN.1\JavaAPI\semi\target\semi-2.2.jar -DgroupId=asn.1 -DartifactId=semi -Dversion=2.2
pause
