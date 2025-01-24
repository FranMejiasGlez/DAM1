Programa: RefEj30
Autor: Francisco Mejias
Entorno:
	termino,i,terminoCero,terminoUno,terminoSiguiente numérico entero
Algoritmo:
	terminoA <-- 0
	terminoB <-- 1
	Escribir terminoA
	Escribir terminoB
	Para i de 2 a termino hacer 
		terminoSiguiente <-- terminoA + terminoB
		terminoA <-- terminoB
		terminoB <-- terminoSiguiente
		Escribir terminoSiguiente
	Fin Para 
Fin Programa
