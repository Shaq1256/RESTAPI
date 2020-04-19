call runcrud.bat
if "%ERRORLEVEL%" == "0" goto open
echo.
echo runcrud.bat open error - breaking work
goto fail

:open
start "%userprofile%\ustawienia lokalne\dane aplikacji\google\chrome\application\chrome.exe" http://localhost:8080/crud/v1/task/getTasks
if "%ERRORLEVEL%" == "0" goto end
echo Cannot rename file
goto fail

:fail
echo.
echo There were errors

:end
echo.
echo Job is done;)