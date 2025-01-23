/*
Programa: Ud5Ej9
Autor: Francisco Mejias
Entorno:
	numero es numérico real
	i es numérico entero
Algoritmo:
	Escribir "Número: "
	Leer numero	
	Para i de 1 a numero hacer 
		Si i mod 3 = 0 entonces
			Escribir i 
		Fin Si
	Fin Para
Fin Programa
*/


//Programa: Ud5Ej9
//Autor: Francisco Mejias
public class Ud5Ej9{
	public static void main(String[] args){
//Entorno:
	float numero;
	int i;
//Algoritmo:
	System.out.print("Numero: ");
	numero=Leer.datoFloat();
            // Mostrar los números del 1 al número introducido
    for (i = 1; i <= numero; i++) {
		if (i % 3 == 0) {
		System.out.print(i + " ");
		}//Fin Si
	}//Fin Para
	}//Fin Programa
}
