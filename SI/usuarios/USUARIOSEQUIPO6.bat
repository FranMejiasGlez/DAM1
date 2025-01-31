@echo off
cls 
FOR /F %%A IN (grupo.txt) DO (
	net user %%A userUSER2 /add /passwordreq:yes /times:lunes-viernes,15:00-21:00 /fullname:"%%A"
)
echo Usuarios creados
pause