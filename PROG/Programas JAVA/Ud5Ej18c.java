/*
Programa: Ud5Ej18c
Autor: Francisco Mejias Gonzalez
Entorno:
	numero,i es numérico entero
Algoritmo:
	Si numero mod 2 =0 entonces
	Para i de 1 a numero/2  hacer 
		Si numero mod i = 0 hacer
			Escribir i 
		Fin Si
	Fin Para
	Sino
		numero <-- numero -1
		Para i de numero/2 a 1 hacer 
			Escribir i
		Fin Para
	Fin Si
Fin Programa
*/
//Programa: Ud5Ej18c
//Autor: Francisco Mejias Gonzalez
public class Ud5Ej18c{
	public static void main(String[] args){
//Entorno:
	int numero,i;
//Algoritmo:
	System.out.print("Numero: ");
	numero=Leer.datoInt();
	if (numero%2==0){
		for (i=numero;i>=1;i--){
			if (numero%i==0){
				System.out.print(i+" "); 
			}//Fin Si
		}//Fin Para
	}else{
		for (i=numero;i>=1;i--){
			if (numero%i==0){
				System.out.print(i+" ");
			}//Fin Si
		}//Fin Para
	}//Fin Si
	}//Fin Programa
}