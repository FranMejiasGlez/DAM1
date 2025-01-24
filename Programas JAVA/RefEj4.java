Programa: RefEj4
Autor: Francisco Mejias
Entorno: 
	CONST PI es numérico real (3.1416)
	radio,volumen,area es numérico real
Algoritmo:
	Escribir "Unidades de medida en Centímetros"
	Repetir
		Escribir "Radio: "
		Leer radio
	Hasta radio >0
	volumen <-- 1.33*PI*radio**3
	area <-- 4*PI*radio**2
	Escribir "Con Radio: ",radio," Volumen: ",volumen," Área: ",area
Fin Programa