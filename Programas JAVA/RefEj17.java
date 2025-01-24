Programa: RefEj17
Autor: Francisco Mejias
Entorno:
	numero,suma,sumandos es numérico entero
Algoritmo:
	suma <-- 0
	sumandos <-- 0
	Repetir
		Escribir "Numero >0: (0 para fin serie)"
		Leer numero
		suma <-- suma + numero
		sumandos <-- sumandos + 1
	Hasta numero = 0
	Escribir "Serie de: ",sumandos," sumandos y de suma: ",suma
Fin Programa