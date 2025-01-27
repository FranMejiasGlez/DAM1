Programa: RefEj34
Autor: Francisco Mejias
Entorno:
	codigo,cantidad,descuento es numérico entero
	precio,total es numérico real
Algoritmo:
	Escribir "Código Articulo: "
	Leer codigo
	Escribir "Cantidad: "
	Leer cantidad
	Escribir "Precio unitario: "
	Si cantidad >100 entonces
		total <-- precio * cantidad * 0.6
		descuento <-- 40
	Sino
		Si cantidad <=100 y >=10 
			Si cantidad  >=25 y <=100 entonces
				total <-- precio * cantidad * 0.8
				descuento <-- 20
			Fin Si 
			Si cantidad >=10 y <=24 entonces
				total <-- precio * cantidad * 0.9
				descuento <-- 10
			Fin Si
		Sino 
			total <-- precio * cantidad 
			descuento <-- 0
		Fin Si
	Fin Si
	Escribir "Código artículo.......",codigo
	Escribir "Cantidad comprada.......",cantidad
	Escribir "Precio unitario.......",precio
	Escribir ""
	Escribir "Descuento.......",descuento,"%"
	Escribir "Total.......",total
Fin Programa