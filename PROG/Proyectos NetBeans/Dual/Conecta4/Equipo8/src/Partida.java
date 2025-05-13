
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
        //Algoritmo
      
        esTirada = this.tablero.buscaVacio(col) != -1;
        return esTirada;
    }//Fin Metodo

    public byte getGanador() {
        return this.turno;
    }//Fin Metodo
}//Fin Clase
