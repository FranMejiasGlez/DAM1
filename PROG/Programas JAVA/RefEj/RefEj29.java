Programa: RefEj29
Autor: Francisco Mejias
Entorno:
	numero,sumaPar,restaImpar,diferenciaParImpar es numérico entero
Algoritmo:
	sumaPar <-- 0
	restaImpar <-- 0
	Repetir 
		Escribir "Numero :"
		Leer numero
		Si numero mod 2 = 0 entonces
			sumaPar <-- sumaPar + numero
		Sino 
			restaImpar <-- restaImpar - numero
		Fin Si
	Hasta numero !=0
	diferenciaParImpar <-- sumaPar-(restaImpar)
	Escribir "La diferencia es: ",diferenciaParImpar
Fin Programa