Programa: RefEj3
Autor: Francisco Mejias
Entorno:
	horas,minutos,segundos,totalSegundos es numérico real 
Algoritmo:
	Repetir
		Escribir "Horas: "
		Leer horas
	Hasta horas >=0
	Repetir
		Escribir "Minutos: "
		Leer minutos
	Hasta minutos >=0
	Repetir
		Escribir "Segundos: "
		Leer segundos
	Hasta segundos >=0 
	totalSegundos <-- horas*3600+minutos*60+segundos
	Escribir "El total de Segundos es: ",totalSegundos
Fin Programa