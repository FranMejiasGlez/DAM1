Programa: RefEj37 
Autor: Francisco Mejias
Entorno:
	numero,acumulaPar,acumulaImpar,totalNumeros,i es numérico entero
Algoritmo:
	totalNumeros  <-- 0
	acumulaPar <-- 0
	acumulaImpar <-- 0
	factorial <-- 1
	Repetir 
		Escribir "Numero: "
		Leer numero
		Si numero !=0 entonces
			totalNumeros <-- totalNumeros + 1
		Fin Si
		Si numero mod 2 = 0 entonces
			acumulaPar <-- numero ** 3 + acumulaPar
		Sino
			Si numero >1 entonces 
				Para i de numero-1 a 1 hacer
					factorial<-- numero * i
					acumulaImpares <-- factorial * (i -1) + acumulaImpares
				Fin Para
			Sino 
				acumulaImpar <-- numero + acumulaImpar
			Fin Si
		Fin Si
	Hasta numero = 0
	Escribir 
Fin Programa