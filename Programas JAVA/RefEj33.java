/*
Programa: RefEj33
Autor: Francisco Mejias
Entorno:
	numero1,numero2,auxiliar,numeroInverso,primerosDigitos es numérico entero
Algoritmo:
	Escribir "Número 1: "
	Leer numero1
	Escribir "Número 2: "
	Leer numero2
	Para i de numero1+1 a numero2-1 hacer
		digito <--0
		numeroInverso <-- 0
		Repetir //Calcular digitos
			auxiliar <-- i \ 10 
			digito <-- digito +1
			primerosDigitos
		Hasta auxiliar =0
		Si i mod 2 = 1 entonces //Si el numero es impar
			digito <-- digito \ 2
			Para j de 1 a digito hacer
				auxiliar <-- (i mod 10 )* 10 ** j
				numeroInverso <-- numeroInverso + auxiliar
				Si numeroInverso = primerosDigitos entonces
					Escribir i
				Fin Si
			Fin Para
		Sino 
			digito <-- digito \ 2
			Para j de 1 a digito hacer
				auxiliar <-- (i mod 10 )* 10 ** j
				numeroInverso <-- numeroInverso + auxiliar
				Si numeroInverso = primerosDigitos entonces
					Escribir i
				Fin Si
			Fin Para	
		Fin Si
	Fin Para
Fin Programa
*/
//Programa: RefEj33
//Autor: Francisco Mejias
public class RefEj33{
public static void main(String[] args){
//Entorno:
	int j,digito,i,numero1,numero2,num,numeroInverso;
//Algoritmo:
	System.out.print("Número 1: ");
	numero1 = Leer.datoInt(); 
	System.out.print( "Número 2: ");
	numero2 = Leer.datoInt();
	for( i = numero1; i <= numero2 ; i++ ){
			digito = 1; // Inicializamos en 1 porque todos los números tienen al menos un dígito
			num = i;
			while (num >= 10){
				num = num/10;
				digito++;
			}//Fin Mientras
			for (j=0; j<=digito ; j++){
				num = 0;
				num = num % 10 *(int)Math.pow(num,j)+num;
				System.out.println(num);
			}//Fin Para			
	}//Fin Para
	}//Fin Programa
}