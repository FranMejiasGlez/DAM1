Programa: RefEj44
Autor: Francisco Mejias 
Entorno:
	a,b,dd,d es numerico real	
Algoritmo:
	Escrbir "Numero 1: "
	Leer a
	Escrbir "Numero 2: "
	Leer b
	dd <-- a
	d <-- b
	Si dd mod d !=0 entonces
		dd <-- d 
		d <-- dd mod d
			Si d = 0 entonces
				Escribir d," Es el m.c.d"
			Fin Si 
	Fin Si
Fin Programa