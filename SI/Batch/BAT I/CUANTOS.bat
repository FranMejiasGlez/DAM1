@ECHO OFF
SET CONTADOR=0
REM Contar el número de parámetros recibidos
FOR %%I IN (%*) DO (
   SET /A CONTADOR += 1
)
REM Validar el número de parámetros
IF %CONTADOR% EQU 1 (
   ECHO SE HAN INTRODUCIDO 1 PARAMETRO
) ELSE IF %CONTADOR% EQU 2 (
   ECHO SE HAN INTRODUCIDO 2 PARAMETROS
) ELSE (
   ECHO NUMERO ERRONEO DE PARAMETROS
) 
