@ECHO OFF 
SET CONTADOR=0
FOR %%I IN (%*) DO (
	SET /A CONTADOR += 1
)
IF /I "%1" == "O" (
    ECHO ENERO,FEBRERO,MARZO,MAYO,JUNIO,JULIO,AGOSTO
) ELSE IF /I "%1" == "L" (
    ECHO ABRIL
) ELSE IF /I "%1" == "E" (
    ECHO SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE
) ELSE (
    ECHO NO EXISTEN MESES QUE ACABEN EN LA LETRA PROPORCIONADA.
)
