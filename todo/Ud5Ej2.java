/*Programa: Ud5Ej2
Autor: Francisco Mejias Gonzalez
Entorno:	
	numero,cuadrado es numérico entero
Algoritmo:
	Escribir "Introduzca número entero"
	Leer numero
	Si numero mod 2 = 1 entonces
		cuadrado <-- numero**2
		Escribir cuadrado
	Fin Si 
Fin programa 
*/

//Programa: Ud5Ej2
//Autor: Francisco Mejias Gonzalez
public class Ud5Ej2{
	public static void main(String[] args){
//Entorno:	
	float numero,cuadrado;
//Algoritmo:
	System.out.print("Introduzca número: ");
	numero=Leer.datoFloat();
	if (numero % 2 >=1){
		cuadrado=(float)Math.pow(numero,2);
		System.out.print(cuadrado);
	}//Fin Si 
	}//Fin programa 
}