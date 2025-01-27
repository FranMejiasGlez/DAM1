Programa: RefEj22
Autor: Francisco Mejias
Entorno:
	dia,mes,anio es numérico entero
Algoritmo:
	Escribir "Dia: "
	Leer dia
	Escribir "Mes: "
	Leer mes
	Escribir "Año: "
	Leer anio
	Si mes >=1 y mes <=12 entonces
		Si mes 1 o 5 o 7 o 8 o 10 o 12 entonces //meses que tienen 31 dias
			Si dia >=1 y dia <=31 entonces 
				Escribir "Fecha correcta" 
			Sino 
				Escribir "Fecha incorrecta"
			Fin Si
		Sino 
			Si mes = 2 entonces //Comprobar si año es bisiesto
				Si anio mod 4 = 0 y anio mod 100 !=0 o anio mod 400 = 0 entonces
					Si dia >=1 y dia <= 29
						Escribir "Fecha correcta"
					Sino 
						Escribir "Fecha incorrecta"
					Fin Si 
				Sino 
					Si dia >=1 y dia <= 28 entonces
						Escribir "Fecha correcta" 
					Sino 
						Escribir "Fecha incorrecta"
					Fin Si
				Fin Si
			Sino //Meses que tienen 30 dias
				Si dia >=1 y dia <=30 entonces
					Escribir " Fecha correcta"
				Sino 
					Escribir "Fecha incorrecta"
				Fin Si
			Fin Si
		Fin Si
	Sino 
		Escribir "Fecha incorrecta"
	Fin Si
Fin Programa