copy "C:\Program Files (x86)\OSS Nokalva\asn1pjav\win32\6.2.0\lib\osstoed.jar" .\target\
call mvn install:install-file -DcreateChecksum=true -Dpackaging=jar -Dfile=target\osstoed.jar -DgroupId=asn.1 -DartifactId=oss.runtime -Dversion=6.2
call mvn install:install-file -DcreateChecksum=true -Dpackaging=jar -Dfile=target\semi-2.2.jar -DgroupId=asn.1 -DartifactId=semi -Dversion=2.2
pause