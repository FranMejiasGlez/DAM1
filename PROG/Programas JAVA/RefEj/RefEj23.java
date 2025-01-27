Programa: RefEj23
Autor: Francisco Mejias
Entorno:
	dia,mes,anio,numero es numérico entero
Algoritmo:
	Escribir "Número: "
	Leer numero
	anio <-- numero mod 10000
	mes <-- numero \ 10000 
	dia <-- mes \ 100
	mes <-- mes mod 100
	Si mes >=1 y mes <=12 entonces
		Si mes 1 o 5 o 7 o 8 o 10 o 12 entonces //meses que tienen 31 dias
			Si dia >=1 y dia <=31 entonces 
				Según Sea mes hacer
					1
						mes <-- Enero
					2
						mes <-- Febrero
					3
						mes <-- Marzo
					4
						mes <-- Abril
					5
						mes <-- Mayo
					6
						mes <-- Junio
					7
						mes <-- Julio
					8
						mes <-- Agosto
					9
						mes <-- Septiembre
					10
						mes <-- Octubre
					11
						mes <-- Noviembre
					12
						mes <-- Diciembre
				Fin Según Sea
				Escribir dia," De ",mes," de ",anio 
			Sino 
				Escribir "No existe fecha"
			Fin Si
		Sino 
			Si mes = 2 entonces //Comprobar si es año bisiesto
				Si anio mod 4 = 0 y anio mod 100 !=0 o anio mod 400 = 0 entonces
					Si dia >=1 y dia <= 29
						Según Sea mes hacer
							1
								mes <-- Enero
							2
								mes <-- Febrero
							3
								mes <-- Marzo
							4
								mes <-- Abril
							5
								mes <-- Mayo
							6
								mes <-- Junio
							7
								mes <-- Julio
							8
								mes <-- Agosto
							9		
								mes <-- Septiembre
							10
								mes <-- Octubre
							11
								mes <-- Noviembre
							12
								mes <-- Diciembre
						Fin Según Sea
						Escribir dia," De ",mes," de ",anio
					Sino 
						Escribir "No existe fecha"
					Fin Si 
				Sino 
					Si dia >=1 y dia <= 28 entonces
						Según Sea mes hacer
							1
								mes <-- Enero
							2
								mes <-- Febrero
							3
								mes <-- Marzo
							4
								mes <-- Abril
							5
								mes <-- Mayo
							6
								mes <-- Junio
							7
								mes <-- Julio
							8
								mes <-- Agosto
							9
								mes <-- Septiembre
							10
								mes <-- Octubre
							11
								mes <-- Noviembre
							12
								mes <-- Diciembre
						Fin Según Sea
						Escribir dia," De ",mes," de ",anio
					Sino 
						Escribir "No existe fecha"
					Fin Si
				Fin Si
			Sino //Meses que tienen 30 dias
				Si dia >=1 y dia <=30 entonces
					Según Sea mes hacer
						1
							mes <-- Enero
						2
							mes <-- Febrero
						3
							mes <-- Marzo
						4
							mes <-- Abril
						5
							mes <-- Mayo
						6
							mes <-- Junio
						7
							mes <-- Julio
						8
							mes <-- Agosto
						9
							mes <-- Septiembre
						10
							mes <-- Octubre
						11
							mes <-- Noviembre
						12
							mes <-- Diciembre
					Fin Según Sea
					Escribir dia," De ",mes," de ",anio
				Sino 
					Escribir "No existe fecha"
				Fin Si
			Fin Si
		Fin Si
	Sino
		Escribir "No existe fecha"
	Fin Si
Fin Programa