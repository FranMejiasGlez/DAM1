/*
Programa: Ud5Ej8a
Autor: Francisco Mejias
Entorno:
	numero es numérico entero
Algoritmo:
	numero <-- -1
	Escribir "Los 10 primeros números naturales son: "
	Repetir 
		numero <-- numero +1
		Escribir numero
	Hasta numero = 9
Fin Programa
*/

//Programa: Ud5Ej8a
//Autor: Francisco Mejias
public class Ud5Ej8a{
	public static void main(String[] args){
//Entorno:
	int numero;
//Algoritmo:
	numero=-1;
	System.out.print("Los 10 primeros números naturales son: ");
	do{
		numero = numero+1;
		System.out.print(numero);
	}while (numero<9);
	}//Fin Programa
}