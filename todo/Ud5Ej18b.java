/*
Programa: Ud5Ej18b 
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
		Para i de 1 a numero/2 hacer 
			Escribir i
		Fin Para
	Fin Si
Fin Programa
*/
//Programa: Ud5Ej18b 
//Autor: Francisco Mejias Gonzalez
public class Ud5Ej18b{
	public static void main(String[] args){
//Entorno:
	int numero,i;
//Algoritmo:
	System.out.print("Numero: ");
	numero=Leer.datoInt();
	i=1;
	if (numero%2==0){
		for (i=1;i<=numero/2;i++){
			if (numero%i==0){
				System.out.print(i+" "); 
			}//Fin Si
		}//Fin Para
	}else{
		numero=numero-1;
		for (i=1;i<=numero/2;i++){
			System.out.print(i+" ");
		}//Fin Para
	}//Fin Si
	System.out.print(numero);
	}//Fin Programa
}