/*
Programa: Ud5Ej11b
Autor: Francisco Mejias
Entorno:
	numero es numérico real
	numeroNegativo es numérico entero
	continuar es alfanumérico (1)
Algoritmo:
	numeroNegativo <-- FALSO
	Repetir 
		Escribir "Número: "
		Leer numero
		Escribir "Continuar? S / N
		Leer continuar
	Hasta continuar = "S" o continuar "s"
	Si numero <0 entonces 
		numeroNegativo <-- VERDADERO
	Fin Si
	Si continuar = "n" o continuar = "N" entonces y numeroNegativo = VERDADERO entonces
		Escribir "Había al menos un numero negativo"
	Fin Si 
Fin Programa
*/

//Programa: Ud5Ej11b
//Autor: Francisco Mejias
public class Ud5Ej11b{
	public static void main(String[] args){
//Entorno:
	float numero;
	boolean numeroNegativo;
	char continuar;
//Algoritmo:
	numeroNegativo=false;
	do{
		System.out.print("Número: "); 
		numero=Leer.datoFloat();
		System.out.print("Continuar? S / N: ");
		continuar=Leer.datoChar();
	}while (continuar== 'S' | continuar== 's');
		if (numero <0){
		numeroNegativo =true;
	}//Fin Si
	if (continuar=='n' | continuar== 'N' & numeroNegativo == true){
		System.out.print("Había al menos un numero negativo");
	}//Fin Si 
	}//Fin Programa
}