/*Programa: Ud5Ej1
Autor: Francisco Mejias Gonzalez
Entorno:	
	numero1,numero2,suma,resta,multiplicacion,divReal es numérico real
	divEntera,resto,numero1Entero,numero2Entero es numérico entero
Algoritmo:
	Escribir "Introduzca numero 1"
	Leer numero1
	Escribir "Introduzca numero 2"
	Leer numero2
	suma <-- numero1 + numero2 
	resta <-- numero1 -  numero2
	multiplicacion <-- numero1 * numero2
	Escribir numero1," + " numero2," = ",suma 
	Escribir numero1," - " numero2," = ",resta 
	Escribir numero1," * " numero2," = ",multiplicacion
	Si numero2 = 0 entonces
		Escribir "No se puede dividir entre 0"
	Sino
		divreal <-- numero1 / numero2 
	Fin Si 
	numero1Entero <-- numero1
	numero2Entero <-- numero2
	Si numero1=numero1Entero y numero2=numero2Entero entonces
		diventera <-- numero1 \ numero2
		resto <-- numero1 mod numero2
		Escribir  numero1,"/" numero2," = ",divreal, numero1," / " numero2," (Entera)"" = ",diventera, "El resto de ",numero1," y ",numero2," = ",resto
	Fin Si	  
Fin programa
*/
//Programa: Ud5Ej1
//Autor: Francisco Mejias Gonzalez
public class Ud5Ej1{
	public static void main(String[] args){
//Entorno:	
	float numero1,numero2,suma,resta,multiplicacion,divReal;
	int divEntera,resto;
//Algoritmo:
	System.out.print("numero 1: ");
	numero1=Leer.datoFloat();
	System.out.print("numero 2: ");
	numero2=Leer.datoFloat();
	suma=numero1+numero2; 
	resta=numero1-numero2;
	multiplicacion=numero1*numero2;
	System.out.println("La suma de: "+numero1+" y "+numero2+" es "+suma);
	System.out.println("La resta de: "+numero1+" y "+numero2+" es "+resta);
	System.out.println("El producto de: "+numero1+" y "+numero2+" es "+multiplicacion);
	if (numero2==0){
		System.out.print("No se puede dividir entre 0");
	}else{
		divReal=numero1/numero2 ;
		System.out.println("La Division real de: "+numero1+" y "+numero2+" es "+divReal);
		resto=(int)(numero1%numero2);
		System.out.println("El Resto de: "+numero1+" y "+numero2+" es "+resto);
	}//Fin Si 
	/*if (numero1%1==0&&numero2%1==0){//Cambia la forma de verificar si los numeros son reales
		resto=(int)(numero1%numero2);
		divEntera=(int)(numero1/numero2);
		System.out.println("La Division entera de: "+numero1+" y "+numero2+" es "+divEntera);
		System.out.println("El Resto de: "+numero1+" y "+numero2+" es "+resto);
	}//Fin Si*/	  
	}//Fin programa
 }