@ECHO OFF
REM Change directory to the repository
cd /d "C:\Users\DAM1\Desktop\CompartidaVB\DAM1"

REM Add all changes to staging
git add .

SET /P commitMessage="Mensaje del commit: "
REM Commit changes with a message
git commit -m "%commitMessage%"

REM Push changes to the remote repository
git push

REM Pause to see the output
PAUSE