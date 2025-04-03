
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Adivinanza3 {

    public static byte cifras(int n) {
        //Entorno
        return (byte) Integer.toString(n).length();
    }//Fin Metodo

    public static void main(String[] args) {
        //Entorno

        Adivinanza partida;
        Integer num;

        //Algoritmo

        System.out.println("!!JUEGO DE ADIVINANZAS¡¡\n"
                + "\nSe genera un numero entre 1 y 1.000.000\n"
                + "\nCada digito bien colocado se mostrará.\n"
                + "Tienes 10 intentos:" + "\n ");
        partida = new Adivinanza();

        System.out.println(partida.getPista());

        System.out.println("Numero Secreto: " + partida.getIncognigta()); //Para pruebas

        while (partida.getIntentos() > 0 && !partida.haGanado()) {

            do {
                System.out.print("\nJugador te toca adivinar: \n"
                        + "\nIntroduce un numero entre 1 y 1.000.000: "
                        + "\n\nNumero: ");

                num = Leer.datoInt();
            } while (Adivinanza3.cifras(num)
                    > partida.getCifrasIncognita() || num < 0);//Fin Repetir

            partida.juega(num);
            if (!partida.haGanado() && partida.getIntentos() > 1) {
                System.out.println(partida.getPista());
                System.out.println("Te quedan: " + partida.getIntentos());

            } else {
                if (!partida.haGanado() && partida.getIntentos() == 1) {
                    System.out.println(partida.getPista());
                    System.out.println("Ultimo intento");
                }//Fin Si
            }//Fin Si
            if (partida.haGanado()) {
                if (partida.getIntentos() == 9) {
                    System.out.println("Has Ganado! Has necesitado: "
                            + (10 - partida.getIntentos()) + " intento");
                } else {
                    System.out.println("Has Ganado! Has necesitado: "
                            + (10 - partida.getIntentos()) + " intentos");
                }//Fin 
            } else {
                if (!partida.haGanado() && partida.getIntentos() == 0) {
                    System.out.println("Te has quedado sin intentos, "
                            + "has perdido");
                }//Fin Si
            }//Fin Si
        }//Fin Mientras
    }//Fin Programa
}
