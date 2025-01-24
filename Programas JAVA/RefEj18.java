Programa: RefEj18
Autor: Francisco Mejias
Entorno:
	media,notas,sumatorioNotas es numérico real
	numeroDeNotas es numérico entero
Algoritmo:
	numeroDeNotas <-- 0
	sumatorioNotas <-- 0
	Repetir
		Escribir "Nota: (negativo para fin)"
		Leer nota
			Mientas nota >=0 hacer
				numeroDeNotas <-- numeroDeNotas+1
				sumatorioNotas <-- sumatorioNotas+nota
				media <-- sumatorioNotas/numeroDeNotas
			Fin Mientras
	Hasta nota <0
	Escribir "La nota media es: ",media
Fin Programa