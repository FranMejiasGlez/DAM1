Programa: RefEj13
Autor: Francisco Mejias
Entorno:
	longitud,superficie,volumen,area,radio es numérico real
	CONST PI es numérico real (3.1416)
	opcion es alfanumerico (A,B,C,D)
Algoritmo:
	Escribir "Eliga una opcion A,B,C,D, E para salir"
	Leer opcion
	Repetir
	Según Sea opcion hacer 
		A
			Repetir 
				Escribir "Radio en cm: "
			Hasta radio>0
			longitud <-- 2*PI*radio
			Escribir "La longitud es : ",longitud," cm"
		B
			Repetir 
				Escribir "Radio en cm: "
			Hasta radio>0
			superficie <-- PI*radio**2
			Escribir "La superficie es : ",superficie," cm"
		C
			Repetir 
				Escribir "Radio en cm: "
			Hasta radio>0
			volumen <-- 4*PI*radio**3/3
			Escribir "El Volumen es : ",volumen," cm3"
		D
			Repetir 
				Escribir "Radio en cm: "
			Hasta radio>0
			area <-- 4*PI*radio**2
			Escribir "El área es : ",area," cm2"
		E 
			Escribir "Fin Programa"
		Sino 
			Escribir "Eliga una opcion A,B,C,D, E para salir"
			Leer opcion
	Fin Según Sea
	Hasta que opcion=E
Fin Programa