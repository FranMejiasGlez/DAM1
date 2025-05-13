
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Prueba {

    public static void main(String[] args) {
        Partida partida = new Partida();
        byte columna;
        char fichaActual;

        while (!partida.esFinPartida()) {
            System.out.println("Turno del jugador " + (partida.getTurno() + 1));

            // Mostrar el tablero


            // Pedir columna válida
            do {
                System.out.print("Introduce la columna (0-7): ");
                columna = (byte) Leer.datoInt();
                if (columna < 0 || columna > 7) {
                    System.out.println("Columna fuera de rango.");
                } else if (!partida.tirada(columna)) {
                    System.out.println("La columna está llena.");
                }
            } while (columna < 0 || columna > 7 || !partida.tirada(columna));
            partida.
            // Colocar ficha


            // Cambiar turno si aún no ha terminado
        }//Fin Mientras
    }//Fin Programa
}
