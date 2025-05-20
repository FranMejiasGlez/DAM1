
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Prueba {

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
                System.out.print("Introduce la columna (0-7): ");
                columna = (byte) Leer.datoShort();
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
