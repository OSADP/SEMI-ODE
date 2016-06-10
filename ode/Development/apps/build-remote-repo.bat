REM =======================================
REM You must add the Nexus server ID and credentials 
REM to your maven global settings.xml file OR your
REM maven user settings.xml file located in you user
REM home directory: C:\Users\yourusername\.m2\settings.xml
REM
REM    <server>
REM      <id>cnsi-ode-repo</id>
REM      <username>your.nexus.username</username>
REM      <password>your.nexus.password</password>
REM    </server>
REM ========================================

call C:\apache\maven\3.2.5\bin\mvn deploy:deploy-file -Durl=http://dropbox.cnsi.com/nexus/content/repositories/ODE/ -DrepositoryId=cnsi-ode-repo -DcreateChecksum=true -Dpackaging=jar -Dfile=..\ASN.1\JavaAPI\semi\lib\osstoed.jar -DgroupId=asn.1 -DartifactId=oss.runtime -Dversion=6.3
call C:\apache\maven\3.2.5\bin\mvn deploy:deploy-file -Durl=http://dropbox.cnsi.com/nexus/content/repositories/ODE/ -DrepositoryId=cnsi-ode-repo -DcreateChecksum=true -Dpackaging=jar -Dfile=..\ASN.1\JavaAPI\semi\target\semi-2.2.1.jar -DgroupId=asn.1 -DartifactId=semi -Dversion=2.2.1
pause
