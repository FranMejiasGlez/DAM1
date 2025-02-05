/*
 *Programa: JuegoAdivinanzas1
 *Autor: Mejias Gonzalez Francisco
 *Entorno:
 *  numero,suposicion,intentos,intentosRestantes es numérico entero
 *  acierto es booleano
 *Algoritmo:
 *  Repetir
 *      Escribir "Jugador 1 Introduzca número: "
 *      Leer numero
 *  Hasta numero <100 y numero >=0
 *  acierto <-- falso
 *  intentos <-- 0
 *  Mientras acierto = falso y intentos < 8 hacer
 *      Repetir
 *          Escribir "Jugador 2 Adivina el número: "
 *          Leer suposicion
 *      Hasta suposicion <100 y suposicion >=0
 *      intentos <-- intentos + 1
 *      Si suposicion = numero entonces
 *          Escribir "!Has acertado con ",intentos," intentos!
 *          acierto =!acierto
 *      Sino 
 *          Si suposicion < numero entonces 
 *              intentosRestantes <-- 8 - intentos
 *               Escribir "Has fallado, la suposicion es menor que el numero, 
 *                  te quedan ",intentosRestantes," intentos"
 *          Sino 
 *              intentosRestantes <-- 8 - intentos
 *              Escribir "Has fallado, la suposicion es mayor que el numero, 
 *                  te quedan ",intentosRestantes," intentos"
 *          Fin Si
 *      Fin Si
 *  Fin Mientras
 *  Si intentos = 8 y acierto = falso entonces
 *      Escribir "!Has usado todos los intentos!"
 *  Fin Si
 */
//Programa: JuegoAdivinanzas
//Autor: Mejias Gonzalez Francisco
    public class JuegoAdivinanzas1 {
        public static byte LeeByte(){
        //Entorno:
            short numero;
        //Algoritmo:
            do{
                System.out.println("Introduce un numero <100 y >=0: ");
                numero=Leer.datoShort();
            }while(numero <-128 || numero >127);
            return (byte)numero;
    }//Fin Funcion
        public static void main(String[] args){
    //Entorno:
        byte numero,suposicion,intentos,intentosRestantes;
        boolean acierto;
    //Algoritmo:
        do{
            System.out.println( "Jugador 1: ");
            numero=JuegoAdivinanzas1.LeeByte();
        }while( numero >=100 || numero <0 );
         acierto = false;
         intentos = 0;
        while( acierto==false && intentos < 8){
            do{
                System.out.println( "Jugador 2, te toca adivinar... : ");
                suposicion=JuegoAdivinanzas1.LeeByte();
            }while(suposicion >=100 || suposicion <0);
            intentos++;
            if( suposicion == numero ){
                System.out.print( "!Has acertado con "+intentos+" intentos!");
                acierto =true;
            }else{ 
               if (suposicion < numero ){
               intentosRestantes =(byte)(8 - intentos);
               System.out.println( "!Has fallado, suposicion menor que "
                       + "el numero secreto, te quedan "+intentosRestantes
                       +" intentos!");
               }else{
                intentosRestantes =(byte)(8 - intentos);
                System.out.println( "!Has fallado, suposicion es mayor "
                        + "que el numero secreto,  te quedan "+intentosRestantes+
                        " intentos!");
               }//Fin Si
            }//Fin Si
        }//Fin Mientras
        if (intentos==8 && acierto==false){
            System.out.println("!Has usado todos los intentos!, el número"
                    + " correcto era: "+numero );
        }
    }//Fin Programa
}
