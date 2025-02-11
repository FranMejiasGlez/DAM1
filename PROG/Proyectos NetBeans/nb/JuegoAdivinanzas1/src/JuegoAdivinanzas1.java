/*
//Programa: JuegoAdivinanzas1
//Autor: Mejias Gonzalez Francisco
//Entorno:
	numero,suposicion,intentos es numérico entero
//Algoritmo:
	Escribir "Jugador 1 Introduce número entre 0 y 99:"
	Leer numero
	intentos <-- 0
	Hacer 
		Escribir "Jugador 1 Introduce número entre 0 y 99:"
		Leer suposicion
		Si numero = suposicion entonces
			Escribir "Has acertado con :",(8-intentos)," intentos"
			Sino
				Si suposicion < numero entonces
					intentos = intentos - 1
					Escribir "Has tirado bajo te quedan: ",intentos," intentos"
				Sino
					intentos = intentos - 1
					Escribir "Has tirado alto te quedan: ",intentos," intentos"
				Fin Si
		Fin Si
	Hasta intentos = 0 o numero = suposicion
	Si intentos = 0 y numero != suposicion entonces
		Escribir "Has perdido buena suerte la proxima vez! "
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
        byte numero, suposicion, intentos;
        //Algoritmo:
        System.out.println("Jugador 1");
        numero = JuegoAdivinanzas2.Leebyte();
        intentos = 8;
        do {
            System.out.println("Jugador 2 toca adivinar");
            suposicion = JuegoAdivinanzas2.Leebyte();
            if (numero == suposicion) {
                System.out.println("Has acertado con: "
                        + (8 - intentos) + " intentos");
            } else {
                if (suposicion < numero) {
                    intentos--;
                    System.out.println("Has tirado bajo te quedan: "
                            + intentos + " intentos");
                } else {
                    intentos--;
                    System.out.println("Has tirado alto te quedan: "
                            + intentos + " intentos");
                }//Fin Si
            }//Fin Si
        } while (numero != suposicion && intentos != 0);
        if (intentos == 0 && numero != suposicion) {
            System.out.println("Has perdido buena suerte la proxima vez!");
        }//Fin Si
    }//Fin Programa
}
