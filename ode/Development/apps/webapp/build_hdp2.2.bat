REM this will build the ODE-WEB application for use on HDP 2.2 as isntalled on the ODE. 
REM if the HDP Stack version changes 2.2.4.2-2 to 2.2.x.y-z, then the arguments below will need to be updated.

REM If certain environmental variables do not exist
REM create a file called set-env.bah and set the environmental variables there.   

set "CURRENT_DIR=%cd%"
if not exist "%CURRENT_DIR%\set-env.bat" goto setEnvDone
call "%CURRENT_DIR%\set-env.bat"
:setEnvDone

call mvn clean install  package -Dapache.hadoop.version=2.6.0 -Dapache.kafka.version=0.8.1 -Dapache.spark.version=1.2.1 -Dhdp.stack.version=2.2.4 -Dhdp.release.increment=2 -Dhdp.build.version=2

pause
