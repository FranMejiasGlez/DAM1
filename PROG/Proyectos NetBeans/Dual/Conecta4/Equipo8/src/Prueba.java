
/**
 *
 * @author Grupo_8 Francisco Mejias Gonzalez
 */
public class Prueba {

    public static byte leerByte() {
        short num;
        do {
            num = Leer.datoShort();
            if (num < Byte.MIN_VALUE || num > Byte.MAX_VALUE) {
                System.out.println("Teclee un dato válido: ");
            }//Fin Si
        } while (num < Byte.MIN_VALUE || num > Byte.MAX_VALUE);
        return (byte) num;
    }//Fin Modulo

    public static void main(String[] args) {
        //Entorno
        Partida partida;
        byte columna;
        boolean tiradaExitosa;
        //Algoritmo
        partida = new Partida();
        while (!partida.esFinPartida()) {
            System.out.println("Turno del jugador " + (partida.getTurno() + 1));
            // Pedir columna válida
            do {
                System.out.print("Introduce la columna (1-8): ");
                columna = (byte) (Prueba.leerByte() - 1);
                if (columna < 0 || columna > 7) {
                    System.out.println("Columna fuera de rango.");
                    tiradaExitosa = false;
                } else {
                    tiradaExitosa = partida.tirada(columna);
                    if (!tiradaExitosa) {
                        System.out.println("La columna está llena.");
                    }//Fin Si
                }//Fin Si
            } while (columna < 0 || columna > 7 || !tiradaExitosa);

        }//Fin Mientras
    }//Fin Programa
}
