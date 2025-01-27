Programa: RefEj36
Autor: Francisco Mejias 
Entorno:
	cantidadNumeros,numero,mayor,menor es numérico real
	i es numérico entero
Algoritmo:
	Escribir "Cantidad de numeros: "
	Leer cantidadNumeros
	mayor <-- 0
	menor <-- 0
	Si cantidadNumeros =0 entonces 
		Escribir "Fin"
	Sino
		Para i de 1 a cantidadNumeros hacer
			Escribir "Numero: "
			Leer numero
			Si numero > mayor entonces
				mayor <-- numero
			Fin Si
			Si numero < menor entonces
				menor <-- numero
			Fin Si
		Fin Para
		Escribir "Mayor: ",mayor
		Escribir "Menor: ",menor
	Fin Si
Fin Programa