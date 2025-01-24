Programa: RefEj10
Autor: Francisco Mejias
Entorno:	
	numero1,numero2,suma,resta,multiplicacion,divisionReal es numérico real
	opcion,resto,divisionEntera,numero1Entero,numero2Entero es numérico entero
Algoritmo:
	Escribir "Número 1: "
	Leer numero1
	Escribir "Número 2: "
	Leer numero2
	Escribir "Elegir Operacion (1 a 5): "
	Leer opcion
	Según Sea opcion hacer
	1
		suma <-- numero1 + numero2
		Escribir numero1," + ",numero2," = ",suma
	2
		resta <-- numero1 - numero2
		Escribir numero1," - ",numero2," = ",resta
	3
		multiplicacion <-- numero1 * numero2
		Escribir numero1," * ",numero2," = ",multiplicacion
	4 
		Si numero2 = 0 entonces
			Escribir "No se puede dividir entre 0"
		Sino
			numero1Entero <-- numero1
			numero2Entero <-- numero2
			Si numero1 = numero1Entero y numero2 = numero2Entero entonces
				divisionEntera <-- numero1 \ numero2
				Escribir numero1," \ ",numero2," = ",divisionEntera
			Sino 
				divisionReal <-- numero1 / numero2
				Escribir numero1," / ",numero2," = ",divisionReal
			Fin Si
		Fin Si
	5
		Si numero2 = 0 entonces
			Escribir "No se puede dividir entre 0"
		Sino
			numero1Entero <-- numero1
			numero2Entero <-- numero2
			Si numero1 = numero1Entero y numero2 = numero2Entero entonces
				resto <-- numero1 mod numero2
				Escribir numero1," mod ",numero2," = ",resto
			Fin Si	
		Fin Si
	Fin Según Sea			
Fin Programa