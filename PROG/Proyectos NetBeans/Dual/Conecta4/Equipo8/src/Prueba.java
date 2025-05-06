
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Prueba {

    public static void main(String[] args) {
        //entorno
        Partida partida;
        Jugador j1, j2;
        //algoritmo
        j1 = new Jugador('\u263A');
        j2 = new Jugador('\u263B');
        partida=new Partida();
        System.out.println(partida.getTablero());
    }//Fin Programa
}
