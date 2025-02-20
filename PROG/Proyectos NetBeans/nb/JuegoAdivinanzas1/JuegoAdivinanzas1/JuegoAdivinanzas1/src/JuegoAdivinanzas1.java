/*
//Programa: JuegoAdivinanzas1
//Autor: Mejias Gonzalez Francisco, Ruiz Alfonso, Martin Jaime, Ochavo Marcos, Maurolagoitia Ignacio
//Entorno:
	numeroSecreto,numeroEstimado,intentos es numérico entero
//Algoritmo:
	Escribir "Jugador 1 Introduce número entre 0 y 99:"
	Leer numeroSecreto
	Hacer 
		Escribir "Jugador 1: Introduce número entre 0 y 99:"
		Leer numeroEstimado
		intentos <-- 8
		Si numeroSecreto = numeroEstimado entonces
			intentos <-- intentos - 1
			Escribir "!Correcto! El número secreto era: "
                        ,numeroSecreto," Adivinaste en: "
					,(8 - intentos), " intentos"
		Sino
			Si numeroEstimado < numeroSecreto entonces
				intentos = intentos - 1
				Si intentos=1 entonces
                    Escribir "Última oportunidad. Adivina sabiamente"
                    Escribir "PISTA: El número secreto "
                            , "es mayor que el introducido, te quedan: "
                            , intentos , " intentos"
				Sino
					Escribir "Intento fallido"
					Escribir "PISTA: El número secreto es mayor que ",numeroEstimado,
						", te quedan: ",intentos," intentos"
				Fin Si
			Sino
				intentos = intentos - 1
				Si intentos=1 entonces
                    Escribir "Última oportunidad. Adivina sabiamente"
                    Escribir "PISTA: El número secreto "
                            , "es mayor que el introducido, te quedan: "
                            , intentos , " intentos"
				Sino
					Escribir "Intento fallido"
					Escribir "PISTA: El número secreto es menor que ",numeroEstimado,
						", te quedan: ",intentos," intentos"
				Fin Si
			Fin Si
		Fin Si
	Hasta intentos = 0 o numeroSecreto = numeroEstimado
	Si intentos = 0 y numeroSecreto != numeroEstimado entonces
		Escribir "Has agotado tus 8 intentos, el número era: "
		,numeroSecreto
	Fin Si
	Fin Programa
	*/
//Programa: JuegoAdivinanzas1
//Autor: Mejias Gonzalez Francisco
public class JuegoAdivinanzas1 {

    public static byte Leebyte() {
        //Entorno:
        short numero;
        //Algoritmo:
        System.out.println("Introduce numero entre 0 y 99:");
        numero = Leer.datoShort();
        while (numero < 0 || numero > 99) {
            System.out.println("introduce numero entre 0 y 99");
            numero = Leer.datoShort();
        }//Fin Mientras
        return (byte) numero;
    }//Fin Funcion

    public static void main(String[] args) {
        //Entorno:
        byte numeroSecreto, numeroEstimado, intentos;
        //Algoritmo:
        System.out.println("Jugador 1");
        numeroSecreto = JuegoAdivinanzas1.Leebyte();
        intentos = 8;
        for (int i =0;i<30;i++){
            System.out.println();
        }//Fin Para
        do {
            System.out.println("Jugador 2 toca adivinar: ");
            numeroEstimado = JuegoAdivinanzas1.Leebyte();
            if (numeroSecreto == numeroEstimado) {
                intentos--;
                System.out.println("!Correcto! El número secreto era: "
                        +numeroSecreto+" Adivinaste en: "
					+(8 - intentos) + " intentos");
            } else {
                if (numeroEstimado < numeroSecreto) {
                    intentos--;
                    if(intentos==1){
                        System.out.println("Última oportunidad."
                                + ", Adivina sabiamente");
                        System.out.println("PISTA: El número secreto "
                            + "es mayor que el introducido, te quedan: "
                            + intentos + " intentos");
                    }else{
                    System.out.println("Intento fallido.");
                    System.out.println("PISTA: El número secreto "
                            + "es mayor que "+numeroEstimado+", te quedan: "
                            + intentos + " intentos");
                    }//Fin Si
                } else {
                    intentos--;
                     if(intentos==1){
                        System.out.println("Última oportunidad."
                                + ", Adivina sabiamente");
                        System.out.println("PISTA: El número secreto "
                            + "es menor que "+numeroEstimado+" te quedan: "
                            + intentos + " intentos");
                    }else{
                    System.out.println("Intento fallido.");
                    System.out.println("PISTA: El número secreto "
                            + "es menor que "+numeroEstimado+" te quedan: "
                            + intentos + " intentos");
                     }//Fin Si
                }//Fin Si
            }//Fin Si
        } while (numeroSecreto != numeroEstimado && intentos != 0);
        if (intentos == 0 && numeroSecreto != numeroEstimado) {
            System.out.println("Has agotado tus 8 intentos, el número era: "
                    +numeroSecreto);
        }//Fin Si
    }//Fin Programa
}
