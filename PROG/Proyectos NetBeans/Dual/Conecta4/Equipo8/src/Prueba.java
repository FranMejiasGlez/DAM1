
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Prueba {

    public static void main(String[] args) {
        //entorno
        Partida partida;
        //char j1, j2;
        boolean turno;
        //algoritmo
        //j1 = '\u263A';
        //j2 = '\u263B';
        turno = false;
        partida = new Partida();
        do {
            System.out.println(partida.mostrarTablero());
            partida.pideColumna(turno);
            partida.insertaFicha(turno);
            turno = !turno;
        } while (!partida.haGanado());
    }//Fin Programa
}
