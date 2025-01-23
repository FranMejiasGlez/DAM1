/* 
Programa: Ud5Ej18a
Autor: Francisco Mejias Gonzalez
Entorno:
	numero,i es numérico entero
Algoritmo:
	Escribir "Numero: "
	Leer numero
	Para i de 1 a numero hacer 
		Si numero mod i = 0 hacer
			Escribir i 
		Fin Si
	Fin Para
Fin Programa
*/

//Programa: Ud5Ej18a
//Autor: Francisco Mejias Gonzalez
public class Ud5Ej18a{	
	public static void main(String[] args){
//Entorno:
	int numero,i;
//Algoritmo:
	System.out.print("Numero: ");
	numero=Leer.datoInt();
	i=1;
	for (i=1;i<=numero;i++){
		if (numero%i==0){
			System.out.print(i+" "); 
		}//Fin Si
	}//Fin Para
	}//Fin Programa
}