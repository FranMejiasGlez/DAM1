/*
Programa: Ud5Ej8b
Autor: Francisco Mejias
Entorno:
	numero es numérico entero
Algoritmo:
	numero <-- 0
	Escribir "Los 10 primeros números naturales son: "
	Mientras numero <9
		Escribir numero 
		numero <-- numero+1
	Fin Mientras
Fin Programa
*/

//Programa: Ud5Ej8b
//Autor: Francisco Mejias
public class Ud5Ej8b{
	public static void main(String[] args){
//Entorno:
	int numero;
//Algoritmo:
	numero=0;
	System.out.print("Los 10 primeros números naturales son: ");
	while(numero<=9){
		System.out.print(numero);
		numero = numero+1;	
	}//Fin Mientras
	}//Fin Programa
}