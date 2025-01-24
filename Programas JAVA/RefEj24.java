Programa: RefEj24
Autor: Francisco Mejias
Entorno:
	numero,divisores,esPrimo es numérico entero
Algoritmo:
	Escribir "Número: "
	Leer numero
	esPrimo <-- 0		
	Para divisores de 1 a numero hacer
		Si numero mod divisores = 0 entonces
			esPrimo <-- esPrimo + 1
		Fin si
	Fin Para
	Si esPrimo = 2 entonces
		Escribir "Es numero primo" 
	Sino
		Escribir "No es primo" 
	Fin Si
Fin Programa