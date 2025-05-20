
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Partida {
    //Atributos

    private Tablero tablero;
    private char[] fichas;
    private byte turno;
    private boolean esFinPartida;
    //Constructores

    public Partida() {
        //Entorno
        //Algoritmo
        this.tablero = new Tablero();
        this.fichas = new char[2];
        this.fichas[0] = '\u263A';
        this.fichas[1] = '\u263B';
        this.turno = 0;
        this.tablero.pintaTablero();
    }//Fin Constructor
    //Metodos

    public byte getTurno() {
        return this.turno;
    }//Fin Metodo

    public boolean esFinPartida() {
        //Entorno
        //Algoritmo
        this.esFinPartida = this.tablero.estaLleno()
                || this.tablero.haGanado(this.fichas[0])
                || this.tablero.haGanado(this.fichas[1]);
        return this.esFinPartida;
    }//Fin Metodo

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

            //Verificar si se ha ganado

            if (this.tablero.haGanado(this.fichas[this.getTurno()])) {
                this.esFinPartida = true;
            } else {
                //Alternar entre turnos
                this.turno = (byte) ((this.turno + 1) % 2);
            }//Fin Si
        }//Fin Si
        return esTirada;
    }//Fin Metodo

    public byte getGanador() {
        return this.getTurno();
    }//Fin Metodo
}//Fin Clase
