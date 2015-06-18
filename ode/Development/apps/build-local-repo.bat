call mvn install:install-file -DcreateChecksum=true -Dpackaging=jar -Dfile=lib\osstoed.jar -DgroupId=asn.1 -DartifactId=oss.runtime -Dversion=6.1
call mvn install:install-file -DcreateChecksum=true -Dpackaging=jar -Dfile=lib\semi-asn.1.jar -DgroupId=asn.1 -DartifactId=semi -Dversion=2.2
pause