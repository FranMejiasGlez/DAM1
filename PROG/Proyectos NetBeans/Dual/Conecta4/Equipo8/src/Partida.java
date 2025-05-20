
/**
 * Clase que gestiona una partida completa de Conecta 4. Controla los turnos,
 * victorias y flujo del juego.
 *
 */
/**
 *
 * @author Grupo_8 Francisco Mejias Gonzalez
 */
public class Partida {
    //Atributos

    private Tablero tablero;
    private char[] fichas;
    private byte turno;
    private boolean esFinPartida;
    //Constructores

    /**
     * Constructor que inicializa una nueva partida con tablero vacío
     */
    public Partida() {
        //Entorno
        //Algoritmo
        this.tablero = new Tablero();
        this.fichas = new char[]{'\u263A', '\u263B'};
        this.turno = 0;
        this.esFinPartida = false;
        this.tablero.pintaTablero();
    }//Fin Constructor
    //Metodos

    /**
     * Obtiene el turno actual
     *
     * @return 0 para jugador 1, 1 para jugador 2
     */
    public byte getTurno() {
        return this.turno;
    }//Fin Metodo

    /**
     * Comprueba si la partida ha terminado
     *
     * @return true si hay un ganador o el tablero está lleno
     */
    public boolean esFinPartida() {
        //Entorno
        //Algoritmo
        this.esFinPartida = this.tablero.estaLleno()
                || this.tablero.haGanado(this.fichas[0])
                || this.tablero.haGanado(this.fichas[1]);
        return this.esFinPartida;
    }//Fin Metodo

    /**
     * Realiza una tirada en la columna especificada
     *
     * @param col Columna donde colocar la ficha (0-7)
     * @return true si la tirada fue válida, false si no se pudo realizar
     */
    public boolean tirada(byte col) {
        //Entorno
        boolean esTirada;
        byte fila;
        //Algoritmo
        esTirada = false;

        if (this.tablero.buscaVacio(col) != -1) {
            fila = this.tablero.buscaVacio(col);
            esTirada = true;
            this.tablero.colocaFicha(this.fichas[this.getTurno()], fila, col);
            this.tablero.pintaTablero();

            //Verificar si es fin de partida habiendo ganado || estando el tablero lleno
            this.esFinPartida = this.tablero.estaLleno()
                    || this.tablero.haGanado(this.fichas[this.getTurno()]);
            //Alternar entre turnos
            if (!this.esFinPartida) {
                this.turno = (byte) ((this.turno + 1) % 2);
            } else {
                System.out.println("Fin partida!");
                System.out.println("El ganador es el jugador: " + (this.getGanador() + 1));

            }//Fin Si
        } else {
            esTirada = false;
        }//Fin Si
        return esTirada;
    }//Fin Metodo

    /**
     * Obtiene el ganador de la partida
     *
     * @return 0 para jugador 1, 1 para jugador 2, -1 si no hay ganador aún
     */
    public byte getGanador() {
        //Entorno
        byte ganador;
        //Algoritmo
        ganador = -1;
        if (this.tablero.haGanado(this.fichas[this.getTurno()])) {
            ganador = this.getTurno();
        }//Fin Si
        return ganador;
    }//Fin Metodo
}//Fin Clase
