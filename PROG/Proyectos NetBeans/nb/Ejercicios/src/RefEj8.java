/*
Programa: RefEj8
Autor: Francisco Mejias
Entorno:
	numero es numérico real
Algoritmo:
	Repetir
		Escribir "Número: "
		Leer numero
	Hasta numero > 1 y numero < 10
	Escribir "Número dentro de rango"
Fin Programa
*/
//Programa: RefEj8
//Autor: Francisco Mejias
public class RefEj8{
    public static void main(String[] args){
     //Entorno:
	float numero;
     //Algoritmo:
	do{
		System.out.println("Número: ");
		numero=Leer.datoFloat();
        }while( numero <= 1 | numero >=10);
	System.out.println( "Número dentro de rango");
     }//Fin Programa
}