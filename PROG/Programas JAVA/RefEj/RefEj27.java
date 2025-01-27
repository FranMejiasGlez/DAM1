Programa: RefEj27
Autor: Francisco Mejias
Entorno:
	divisores,numero1,numero2,esPrimo,primos es numérico entero
Algoritmo:
	Para divisores de numero1 a numero2 hacer //Rango numero1 a numero2
	esPrimo <-- 0
		Para primos de 1 a divisores hacer //Comprobar si los numeros son primos
			Si divisores mod primos = 0 entonces 
				esPrimo <-- esPrimo + 1	
			Fin Si
		Fin Para
	Si esPrimo = 2 entonces // Si es primo (2 divisores)
		Escribir divisores
	Fin Si
	Fin Para
Fin Programa