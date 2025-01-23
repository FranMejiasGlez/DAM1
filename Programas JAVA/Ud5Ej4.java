/*
Programa: Ud5Ej4
Autor: Francisco Mejias Gonzalez
Entorno:	
	numero1,numero2 es numérico real
Algoritmo:
	Escribir "Introduzca número 1"
	Leer numero1
	Escribir "Introduzca número 2"
	Leer numero2
	Si numero1>numero2 entonces
		Escribir "El primer número es mayor"
	Sino
		Escribir "El segundo número es mayor"	
Fin programa
*/

//Programa: Ud5Ej4
//Autor: Francisco Mejias Gonzalez
public class Ud5Ej4{
	public static void main(String[] args){
//Entorno:	
	float numero1,numero2;
//Algoritmo:
	System.out.print("Introduzca número 1: ");
	numero1=Leer.datoFloat();
	System.out.print("Introduzca número 2: ");
	numero2=Leer.datoFloat();
	if (numero1>numero2){
		System.out.print("El primer número es mayor");
	}else{
		System.out.print("El segundo número es mayor");
	}//Fin Si
	}//Fin programa
}
