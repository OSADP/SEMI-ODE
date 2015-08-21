REM this will build the ODE-WEB application for use on HDP 2.3 as isntalled on the ODE. 
REM if the HDP Stack version changes 2.3.0.0-2557  to 2.3.x.y-z, then pom properties or arguments will need to be updated.

REM If certain environmental variables do not exist
REM create a file called set-env.bat and set the environmental variables there.
set "CURRENT_DIR=%cd%"
if not exist "%CURRENT_DIR%\set-env.bat" goto setEnvDone
call "%CURRENT_DIR%\set-env.bat"
:setEnvDone

call mvn clean install  package
pause