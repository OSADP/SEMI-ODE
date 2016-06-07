call C:\apache\maven\3.2.5\bin\mvn deploy:deploy-file -Durl=http://dropbox.cnsi.com/nexus/content/repositories/ODE/ -DrepositoryId=cnsi-ode-repo -DcreateChecksum=true -Dpackaging=jar -Dfile=..\ASN.1\JavaAPI\semi\lib\osstoed.jar -DgroupId=asn.1 -DartifactId=oss.runtime -Dversion=6.3
call C:\apache\maven\3.2.5\bin\mvn deploy:deploy-file -Durl=http://dropbox.cnsi.com/nexus/content/repositories/ODE/ -DrepositoryId=cnsi-ode-repo -DcreateChecksum=true -Dpackaging=jar -Dfile=..\ASN.1\JavaAPI\semi\target\semi-2.2.jar -DgroupId=asn.1 -DartifactId=semi -Dversion=2.2
pause
