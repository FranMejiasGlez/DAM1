/*
Programa: Ud5Ej10
Autor: Francisco Mejias
Entorno:
	numero,sumatorio es numérico real
Algoritmo:
	sumatorio <-- 0
	Repetir 
		Escribir "Número: "
		Leer numero
		sumatorio <-- numero + sumatorio
		Escribir "La suma es: ",sumatorio
	Hasta numero = 0
Fin Programa
*/

//Programa: Ud5Ej10
//Autor: Francisco Mejias
public class Ud5Ej10{
	public static void main(String[] args){
//Entorno:
	float numero,sumatorio;
//Algoritmo:
	sumatorio=0;
	do{
		System.out.print("Número: ");
		numero=Leer.datoFloat();
		sumatorio =(float)numero+sumatorio;
		System.out.println("La suma es : "+sumatorio);
	}while (numero !=0);
	}//Fin Programa
}