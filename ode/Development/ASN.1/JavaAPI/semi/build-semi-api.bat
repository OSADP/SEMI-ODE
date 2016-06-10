REM Update compiler jar file and install it in the local Maven repository
copy "C:\Program Files (x86)\OSS Nokalva\asn1pjav\win32\6.3.0\lib\osstoed.jar" lib\
call C:\apache\maven\3.2.5\bin\mvn install:install-file -DcreateChecksum=true -Dpackaging=jar -Dfile=lib\osstoed.jar -DgroupId=asn.1 -DartifactId=oss.runtime -Dversion=6.3

REM Generate ASN.1 JavaAPI
call "C:\Program Files (x86)\OSS Nokalva\asn1pjav\win32\6.3.0\ossvars.bat"
call "C:\Program Files (x86)\OSS Nokalva\asn1pjav\win32\6.3.0\bin\asn1pjav.exe" ..\..\DSRC_R36_Source.asn ..\..\SEMI_ASN.1_Structures_2.2.asn -ber -der -per -root -uper -json -path src/main/java -output com.bah.ode.asn.oss -toed

REM build ASN.1 Java API Jar file and install it in the local Maven repository
call C:\apache\maven\3.2.5\bin\mvn clean package
call C:\apache\maven\3.2.5\bin\mvn install:install-file -DcreateChecksum=true -Dpackaging=jar -Dfile=target\semi-2.2.1.jar -DgroupId=asn.1 -DartifactId=semi -Dversion=2.2.1
pause