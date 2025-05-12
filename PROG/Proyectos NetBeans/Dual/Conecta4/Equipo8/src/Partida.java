
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Partida {
    //Atributos

    private byte columna, turno;
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

    public void pideColumna(boolean turno) {
        do {
            if (!turno) {
                System.out.println("Jugador 1 Columna: ");
                this.columna = (byte) (Leer.datoShort() - 1);
            } else {
                System.out.println("Jugador 2 Columna: ");
                this.columna = (byte) (Leer.datoShort() - 1);
            }//Fin Si
        } while (this.buscaHueco(this.columna) == -1);
    }//Fin Metodo

    public void insertaFicha(boolean turno) {
        //Entorno
        //Algoritmo
        if (turno) {
            this.tablero[this.buscaHueco(this.columna)][this.columna] = '\u263A';
        } else {
            this.tablero[this.buscaHueco(this.columna)][this.columna] = '\u263B';
        }//Fin Si
    }//Fin Metodo

    private byte buscaHueco(byte columna) {
        //entorno
        byte posicion, fila;
        char fichaNegra, fichaBlanca;
        //algoritmo
        fichaNegra = '\u263A';
        fichaBlanca = '\u263B';
        fila = 5;
        posicion = -1;
        while (fila > 0 && this.tablero[fila][columna] == fichaNegra
                || this.tablero[fila][columna] == fichaBlanca) {
            fila--;
        }//Fin Mientras
        if (this.tablero[fila][columna] != fichaNegra
                || this.tablero[fila][columna] != fichaBlanca) {
            posicion = fila;
        }//Fin Si
        return posicion;
    }//Fin Metodo

    public String mostrarTablero() {
        //Entorno
        String salida;
        //Algoritmo
        salida = "";
        int filas = 6;
        int columnas = 8;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                salida = salida + "|_" + this.tablero[i][j] + "_| ";
            }//Fin Para
            salida = salida + "\n";
        }//Fin Para
        return salida;
    }//Fin Metodo

    public boolean haGanado() {
        //Entorno
        boolean esGanador;
        //Algoritmo
        esGanador = false;
        //Comprobar Horizontal

        //Comprobar Vertical
        //Comprobar Diagonal
        return esGanador;
    }//Fin Metodo
}//Fin Clase
