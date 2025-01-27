/*
Programa: Ud5Ej6
Autor: Francisco Mejias Gonzalez
Entorno:	
	area,base,altura es numérico real
Algoritmo:
	Repetir
		Escribir "Base: "
		Leer base
	Hasta base>0
	Repetir
		Escribir Altura 
		Leer altura
	Hasta altura>0
	area <-- base*altura/2
	Escribir "El área es: ",area
Fin Programa
*/


//Programa: Ud5Ej6
//Autor: Francisco Mejias Gonzalez
public class Ud5Ej6{
	public static void main(String[] args){
//Entorno:	
	float area,base,altura;
//Algoritmo:
	do{
		System.out.print("Base: ");
		base=Leer.datoFloat();
	}while (base<=0);
	do{
		System.out.print("Altura: ");
		altura=Leer.datoFloat();
	}while (altura<=0);
	area = (float)base*altura/2;
	System.out.print("El área es: "+area);
	}//Fin Programa
}

