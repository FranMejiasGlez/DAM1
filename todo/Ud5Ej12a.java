/*
Programa: Ud5Ej12a
Autor: Francisco Mejias Gonzalez
Entorno:
	sumaPar,productoImpar,switch es numérico entero
Algoritmo
	sumaPar <-- 0
	productoImpar <-- 1
	Repetir
		i<--i+1
		Si i mod 2 = 0 entonces
			sumaPar <-- sumaPar+i
		Sino
			productoImpar <-- i*i+1 + productoImpar
		Fin Si 
	Hasta sumaPar=100 y productoImpar=654729075
Fin Programa
*/

//Programa: Ud5Ej12a
//Autor: Francisco Mejias Gonzalez
public class Ud5Ej12a{
	public static void main(String[] args){
//Entorno:
	int sumaPar,productoImpar,i;
//Algoritmo
	sumaPar=0;
	productoImpar=1;
	i=0;
	do{
		if (i%2==0){
			sumaPar=sumaPar+i;	
		}else{ 
			productoImpar= i*productoImpar; 
		}//Fin Si 
	i++;
	}while (sumaPar <110&&productoImpar <=654729075);
	System.out.println("La suma de pares: "+sumaPar);
	System.out.println("El producto de impares: "+productoImpar);
	}//Fin Programa
}
