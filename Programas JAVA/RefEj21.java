Programa: RefEj21
Autor: Francisco Mejias
Entorno:
	ladoA,ladoB,ladoC es numérico real
Algoritmo:
	Escribir "Unidades de medida en centímetros"
	Repetir 
		Escribir "Lado A: "
		Leer ladoA
	Hasta ladoA>0 
	Repetir 
		Escribir "Lado B: "
		Leer ladoB
	Hasta ladoA>0 
	Repetir 
		Escribir "Lado C: "
		Leer ladoC
	Hasta ladoA>0 
	Si ladoA = ladoB + ladoC entonces
		Escribir "Es un triangulo rectángulo"
		Si ladoA < ladoB + ladoC entonces
			Escribir "Es un triangulo acutángulo"
			Si ladoA > ladoB + lado C entonces
				Escribir "Es un triangulo obtusángulo"
			Fin Si
		Fin Si
	Fin Si
Fin Programa