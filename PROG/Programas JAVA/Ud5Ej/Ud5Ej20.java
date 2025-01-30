/*
Programa: Ud5Ej20
Autor: Francisco Mejias Gonzalez
Entorno:
	a,b,c,auxiliar es numérico real
	i,j es numérico entero
Algoritmo:
	Para i de 1 a 5 hacer 
		Para j de 1 a 3 hacer
			Escribir "Introduzca número"
			Leer a
			Escribir "Introduzca número"
			Leer b
			Escribir "Introduzca número"
			Leer c
			Si a < b entonces
				auxiliar <-- b
				b <-- a
				a <-- auxiliar
				Si b < c entonces
					auxiliar <-- b
					b <-- c
					c <-- auxiliar
					Si a < b entonces
						auxiliar <-- b
						b <-- a
						a <-- auxiliar			
					Fin Si
				Fin Si
			Fin Si
		Fin Para
	Fin Para
Fin Programa
*/

//Programa: Ud5Ej20
//Autor: Francisco Mejias Gonzalez
public class Ud5Ej20{
	public static void main(String[] args){
	//Entorno:
		float a,b,c,auxiliar;
		byte i,j;
	//Algoritmo:
		for(i=1;i<5;i++){
			for(j=1;j<3;j++){
				System.out.print("Introduzca número");
				a=Leer.datoFloat();
				System.out.print("Introduzca número");
				b=Leer.datoFloat();
				System.out.print("Introduzca número");
				c=Leer.datoFloat();
				if( a < b ){
					auxiliar = b;
					b = a;
					a = auxiliar;
					if( b < c) {
						auxiliar = b;
						b = c;
						c = auxiliar;
						if( a < b ){
							auxiliar = b;
							b = a;
							a = auxiliar;		
						}//Fin Si
					}//	Fin Si
				}//Fin Si
			}//Fin Para
		}//Fin Para
	}//Fin Programa
}


