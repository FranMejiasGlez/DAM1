/*
Programa: RefEj2
Autor: Francisco Mejias
Entorno:
	CONST PI es numérico real (3.1416)
	longitud,area,radio es numérico real
Algoritmo:
	Escribir "Unidades de medida iguales"
	Repetir
		Escribir "Radio: "
		Leer radio
	Hasta radio >0
	longitud <-- 2*PI*radio
	area <-- PI*radio**2
	Escribir "Radio: ",radio," y Area: ",area
Fin Programa
*/
//Programa: RefEj2
//Autor: Francisco Mejias
public class RefEj2{
	public static void main(String[] args){
	//Entorno:
		final float PI;
		float longitud,area,radio;
	//Algoritmo:
		PI=3.1416f;
		System.out.println("Unidades de medida en Centímetros");
		do{
			System.out.print( "Radio: ");
			radio=Leer.datoFloat(); 
		}while (radio <=0);
		longitud = 2*PI*radio;
		area = PI*radio*radio;
		System.out.print( "Radio: "+radio+" y Area: "+area);
	}//Fin Programa
}