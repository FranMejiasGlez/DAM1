/*
Programa: Ud5Ej11a
Autor: Francisco Mejias
Entorno:
	numero es numérico real
	numeroNegativo es numérico entero
	continuar es alfanumérico (1)
Algoritmo:
	numeroNegativo <-- 0
	Repetir 
		Escribir "Número: "
		Leer numero
		Escribir "Continuar? S / N
		Leer continuar
	Hasta continuar = "S" o continuar "s"
	Si numero <0 entonces 
		numeroNegativo <-- numero negativo + 1  
	Fin Si
	Si continuar = "n" o continuar = "N" entonces y numeroNegativo >0 entonces
		Escribir "Había al menos un numero negativo"
	Fin Si 
Fin Programa
*/

//Programa: Ud5Ej11a
//Autor: Francisco Mejias
public class Ud5Ej11a{
	public static void main(String[] args){
//Entorno:
	float numero;
	int numeroNegativo;
	char continuar;
//Algoritmo:
	numeroNegativo=0;
	do{
		System.out.print("Número: "); 
		numero=Leer.datoFloat();
		System.out.print("Continuar? S / N: ");
		continuar=Leer.datoChar();
	}while (continuar== 'S' | continuar== 's');
		if (numero <0){
		numeroNegativo =numeroNegativo + 1;
	}//Fin Si
	if (continuar=='n' | continuar== 'N' & numeroNegativo >0){
		System.out.print("Había al menos un numero negativo");
	}//Fin Si 
	}//Fin Programa
}
