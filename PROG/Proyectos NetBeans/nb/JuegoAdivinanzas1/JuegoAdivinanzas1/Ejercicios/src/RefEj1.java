/*
Programa: RefEj1
Autor: Francisco Mejias 
Entorno:
	longitud,altura,area es numérico real
Algoritmo:
	Escribir "Unidades en la misma medida"
	Repetir 
		Escribir "Altura: "
		Leer altura
	Hasta altura >0
	Repetir
		Escribir "Longitud: "
		Leer Longitud
	Hasta longitud >0
	area <-- altura * longitud
	Escribir "Area: ",area
Fin Programa
*/

//Programa: RefEj1
//Autor: Francisco Mejias 
public class RefEj1{
	public static void main(String[] args){
	//Entorno:
		float longitud,altura,area;
	//Algoritmo:
		System.out.println("Unidades en la misma medida");
		do{
			System.out.print( "Altura: ");
			altura=Leer.datoFloat();
		}while (altura <=0);
		do{
			System.out.print( "Longitud: ");
			longitud=Leer.datoFloat();
		}while (longitud <=0);
		area = altura * longitud;
		System.out.println("Area: "+area);
	}//Fin Programa
}
