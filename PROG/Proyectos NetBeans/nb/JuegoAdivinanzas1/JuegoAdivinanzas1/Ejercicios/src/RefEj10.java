/*
Programa: RefEj10
Autor: Francisco Mejias
Entorno:	
	numero1,numero2,suma,resta,multiplicacion,divisionReal es numérico real
	opcion,resto,divisionEntera,numero1Entero,numero2Entero es numérico ente
ro
Algoritmo:
	Escribir "Número 1: "
	Leer numero1
	Escribir "Número 2: "
	Leer numero2
	Escribir "Elegir Operacion (1 a 5): "
	Leer opcion
	Según Sea opcion hacer
	1
		suma <-- numero1 + numero2
		Escribir numero1," + ",numero2," = ",suma
	2
		resta <-- numero1 - numero2
		Escribir numero1," - ",numero2," = ",resta
	3
		multiplicacion <-- numero1 * numero2
		Escribir numero1," * ",numero2," = ",multiplicacion
	4 
		Si numero2 = 0 entonces
			Escribir "No se puede dividir entre 0"
		Sino
			numero1Entero <-- numero1
			numero2Entero <-- numero2
			Si numero1 = numero1Entero y numero2 = numero2Entero en
                        tonces
				divisionEntera <-- numero1 \ numero2
				Escribir numero1," \ ",numero2," = ",divisionEn
                                tera
			Sino 
				divisionReal <-- numero1 / numero2
				Escribir numero1," / ",numero2," = ",division
                                Real
			Fin Si
		Fin Si
	5
		Si numero2 = 0 entonces
			Escribir "No se puede dividir entre 0"
		Sino
			numero1Entero <-- numero1
			numero2Entero <-- numero2
			Si numero1 = numero1Entero y numero2 = numero2Entero en
                        tonces
				resto <-- numero1 mod numero2
				Escribir numero1," mod ",numero2," = ",resto
			Fin Si	
		Fin Si
	Fin Según Sea			
Fin Programa
*/
//Programa: RefEj10
//Autor: Francisco Mejias
public class RefEj10{
    public static void main(String[] args){
    //Entorno:	
	float numero1,numero2,suma,resta,multiplicacion,divReal;
	int resto,divEntera,numero1Entero,numero2Entero;
        byte opcion;
    //Algoritmo:
	System.out.println( "Número 1: ");
	numero1=Leer.datoFloat();
	System.out.println( "Número 2: ");
        numero2=Leer.datoFloat();
	System.out.println("Elegir Operacion (1 a 5): ");
	opcion=(byte)Leer.datoShort();
	switch (opcion){
            case 1:
		suma = numero1 + numero2;
		System.out.println( numero1+" + "+numero2+" = "+suma);
                break;
            case 2:
		resta = numero1 - numero2;
		System.out.println( numero1+" - "+numero2+" = "+resta);
                break;
            case 3:
		multiplicacion = numero1 * numero2;
		System.out.println( numero1+" * "+numero2+" = "+multiplicacion);
                break;
            case 4: 
		if( numero2 == 0 ){
			System.out.println( "No se puede dividir entre 0");
                }else{
                    if ((int)numero1 == numero1 & (int)numero2==numero2){
                        divEntera=(int)numero1/(int)numero2;
                        System.out.println( numero1+" / "+numero2+" = "
                                +divEntera);
                    }else{
                        divReal=numero1/numero2;
                    System.out.println( numero1+" / "+numero2+" = "+divReal);
                 }//Fin Si
                }//Fin Si
                 break;
            case 5:
		if (numero2 == 0 ){
			System.out.println( "No se puede dividir entre 0");
                }else{
			if ((int)numero1 == numero1 & (int)numero2==numero2){
                        resto=(int)numero1/(int)numero2;
                        System.out.println( numero1+" mod "+numero2+" = "
                                +resto);
                        }else{
                            System.out.println("No se puede calcular resto");
                        }//Fin Si
                }//Fin Si
                break;
                }//Fin Según Sea	   
}//Fin Programa
}