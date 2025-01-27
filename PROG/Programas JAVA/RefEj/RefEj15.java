Programa: RefEj15
Autor: Francisco Mejias
Entorno:
	numero1,numero2,numero3,numero4,numeroMayor,numeroMenor es númerico real
Algoritmo:
	Escribir "Numero 1: "
	Leer numero1
	Escribir "Numero 2: "
	Leer numero2
	Escribir "Numero 3: "
	Leer numero3
	Escribir "Numero 4: "
	Leer numero4
	numeroMayor <-- numero1
	numeroMenor <-- numero1
	Si numero2 > numeroMayor entonces
		numeroMayor <-- numero2
		Si numero3 > numeroMayor entonces
			numeroMayor <-- numero3
		Fin Si
		Si numero4 > numeroMayor entonces
			numeroMayor <-- numero4
		Fin Si
	Fin Si
	Si numero2 < numeroMenor entonces
		numeroMenor <-- numero2
		Si numero3 < numeroMenor entonces
			numeroMenor <-- numero3
		Fin Si
		Si numero4 < numeroMenor entonces
			numeroMenor <-- numero4
		Fin Si
	Fin Si
	Escribir "El mayor es: ",numeroMayor," El menor es: ",numeroMenor
Fin Programa