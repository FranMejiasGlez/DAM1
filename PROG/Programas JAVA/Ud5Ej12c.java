/*
Programa: Ud5Ej12b
Autor: Francisco Mejias Gonzalez
Entorno:
	sumaPar,productoImpar,switch es numérico entero
Algoritmo
	sumaPar <-- 0
	productoImpar <-- 1
	i <-- 0
	esPar <-- FALSO
	Repetir 
		Si switch = FALSO entonces
			sumaPar=sumaPar+i
			esPar <-- no esPar
			i <-- i+1
		Sino
			productoImpar <-- productoImpar * i
			i <-- i+1
			esPar <-- no esPar
		Fin Si
	Hasta sumaPar = 110 y productoImpar =654729075
Fin Programa
*/

//Programa: Ud5Ej12c
//Autor: Francisco Mejias Gonzalez
public class Ud5Ej12c{
	public static void main(String[] args){
//Entorno:
	int sumaPar,productoImpar,i,contarPar,contarImpar;
	boolean esPar;
//Algoritmo
	sumaPar=0;
	productoImpar=1;
	i=1;
	contarPar=0;
	contarImpar=0;
	esPar=false;
	do{
		if (esPar==false){
			sumaPar=sumaPar+i;	
			i++;
			esPar=!esPar;
			contarPar++;
		}else{ 
			productoImpar= i*productoImpar; 
			i++;
			esPar=!esPar;
			contarImpar++;
		}//Fin Si 
	}while (contarPar<=10&&contarImpar<=10);
	System.out.println("La suma de pares: "+sumaPar);
	System.out.println("El producto de impares: "+productoImpar);
	}//Fin Programa
}
