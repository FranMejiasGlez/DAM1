
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
        System.out.println("===============");
        System.out.println(partida.getPista());
        System.out.println("===============");
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

            if (partida.haGanado() == false) {
                System.out.println("\n================================");
                System.out.println("\n" + partida.getPista()
                        + "\n\nTe quedan: "
                        + partida.getIntentos() + " Intentos");
                System.out.println("================================");
            } else {
                if (10 - partida.getIntentos() == 1) {
                    System.out.println("================================");
                    System.out.println("\n\n\n\nHas Ganado!! Has necesitado: "
                            + (10 - partida.getIntentos()) + " Intento");
                    System.out.println("=================================");
                } else {
                    System.out.println("=================================");
                    System.out.println("Has Ganado!! Has necesitado: "
                            + (10 - partida.getIntentos()) + " Intentos");
                    System.out.println("=================================");
                }//Fin Si
            }//Fin Si
        }//Fin Si
        if (!partida.haGanado()) {
            System.out.println("=================================");
            System.out.println("Has Perdido!! Te has quedado sin intentos");
            System.out.println("=================================");
        }//Fin Si
    }//Fin Programa
}
