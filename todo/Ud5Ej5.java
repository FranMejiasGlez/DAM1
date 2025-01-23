/*
Programa: Ud5Ej5
Autor: Francisco Mejias Gonzalez
Entorno:	
	importe,importeIva,importeDescuento es numérico real
	CONST IVA es numérico real <-- 1.21
	CONST DESCUENTO es numérico real <-- 0.75
Algoritmo:
	Escribir "Introduzca base imponible: "
	Leer importe
	Si importe > 1500 entonces
		importeDescuento <-- importe*0.75*1.21
		Escribir "Total a pagar ",importeDescuento," €"
	Sino 
		importeIva <-- importe*1.21
		Escribir "Total a pagar ",importeIva," €"
Fin programa
*/


//Programa: Ud5Ej5
//Autor: Francisco Mejias Gonzalez
public class Ud5Ej5{
	public static void main(String[] args){
//Entorno:	
	float importe,importeIva,importeDescuento;
	final float IVA = 1.21F;
	final float DESCUENTO = 0.75F;
//Algoritmo:
	System.out.print("Introduzca base imponible: "); 
	importe=Leer.datoFloat();
	if (importe > 1500){
		importeDescuento=(float)importe*IVA*DESCUENTO;
		System.out.print("Total a pagar "+importeDescuento+" €");
	}else{
		importeIva =(float)importe*IVA;
		System.out.print("Total a pagar "+importeIva+" €");
	}//Fin Si
	}//Fin programa
}