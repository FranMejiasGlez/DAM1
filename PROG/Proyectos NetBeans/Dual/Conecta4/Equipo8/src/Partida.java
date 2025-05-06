
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
        this.turno = 1;
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

    public String mostrarTablero() {
        //Entorno
        String salida;
        //Algoritmo
        salida = "";
        int filas = 6;
        int columnas = 8;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                salida = salida + "[] ";
            }//Fin Para
            salida = salida + "\n";
        }//Fin Para
        return salida;
    }//Fin Metodo

    public static byte esTurnoDe() {
        //entorno
        byte jugador;
        //algoritmo
        jugador = 0;
        if (this.turno == 1) {
            jugador = 1;
        }
    }
}//Fin Clase
