
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Partida {
    //Atributos

    private byte columna;
    private char[][] tablero;
    //Constructores

    public Partida() {
        //entorno
        byte fila, col;
        //algoritmo
        this.tablero = new char[6][8];
        for (fila = 0; fila < 6; fila++) {
            for (col = 0; col < 8; col++) {
                this.tablero[fila][col] = ' ';
            }//Fin Para
        }//Fin Para
    }//Fin Constructor
    //Metodos

    public void pideColumna(Jugador jugador) {
        do {
            System.out.println("Columna: ");
            this.columna = (byte) Leer.datoShort();
        } while (this.buscaHueco(this.columna) == -1);
    }//Fin Metodo

    public void insertaFicha(Jugador jugador) {
        //Entorno
        //Algoritmo
        this.tablero[this.buscaHueco(this.columna)][columna] = jugador.getFicha();
    }//Fin Metodo

    private byte buscaHueco(byte columna) {
        //entorno
        byte posicion, fila;
        char fichaNegra, fichaBlanca;
        //algoritmo
        fichaNegra = '\u263A';
        fichaBlanca = '\u263B';
        fila = 6;
        posicion = -1;
        while (fila > 0 && this.tablero[fila][columna] == fichaNegra
                || this.tablero[fila][columna] == fichaBlanca) {
            fila++;
        }//Fin Mientras
        if (tablero[fila][columna] != fichaNegra
                || tablero[fila][columna] != fichaBlanca) {
            posicion = fila;
        }//Fin Si
        return posicion;
    }//Fin Metodo

    public char[][] getTablero() {
        return this.tablero;
    }//Fin Metodo
}//Fin Metodos
