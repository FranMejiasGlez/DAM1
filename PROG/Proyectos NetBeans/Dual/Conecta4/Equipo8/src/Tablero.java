
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Tablero {
    //Atributos

    private char matriz[][];
    private byte numeroFichasIntroducidas;
    private byte ultimaColumna;
    private byte ultimaFila;
    //Constructores

    public Tablero() {
        //entorno
        byte fila, col;
        //algoritmo
        this.numeroFichasIntroducidas = 0;
        this.ultimaColumna = 7;
        this.ultimaFila = 0;
        this.matriz = new char[6][8];
        for (fila = 0; fila < 6; fila++) {
            for (col = 0; col < 8; col++) {
                this.matriz[fila][col] = ' ';
            }//Fin Para
        }//Fin Para
    }//Fin Constructor
    //Metodos

    public boolean estaLleno() {
        //Entorno
        boolean lleno;
        //Algoritmo
        lleno = this.numeroFichasIntroducidas == 48;
        return lleno;
    }//Fin Metodo

    public byte buscaVacio(byte col) {
        //entorno
        byte posicion, fila;
        //algoritmo
        posicion = -1;
        for (fila = 5; fila >= 0; fila--) {
            if (this.matriz[fila][col] == ' ') {
                posicion = fila;
            }//Fin Si
        }//Fin Para
        return posicion;
    }//Fin Metodo

    public boolean colocaFicha(char ficha, byte fila, byte columna) {
        //Entorno
        boolean colocado;
        //Algoritmo
        colocado = true;
        if (this.buscaVacio(columna) == -1) {
            colocado = !colocado;
        } else {
            this.matriz[fila][columna] = ficha;
            this.numeroFichasIntroducidas++;
        }//Fin Si
        return colocado;
    }//Fin Metodo

    private boolean compruebaFila(char ficha) {
        //entorno
        boolean haGanado;
        byte fila, columna, contadorSeguidas;
        //algoritmo
        contadorSeguidas = 0;
        for (fila = 0; fila < this.matriz[fila].length; fila++) {
            for (columna = 0; columna < this.matriz[columna].length; columna++) {
                if (this.matriz[fila][columna] == ficha
                        && this.matriz[fila][columna + 1] == ficha) {
                    contadorSeguidas++;
                }//Fin Si
            }//Fin Para
        }//Fin Para

        haGanado = contadorSeguidas >= 4;

        return haGanado;
    }//Fin Metodo

    private boolean compruebaColumna(char ficha) {
        //entorno
        boolean haGanado;
        byte columna, fila, contadorSeguidas;
        //algoritmo
        contadorSeguidas = 0;
        for (columna = 0; columna < this.matriz[columna].length; columna++) {
            for (fila = 0; fila < this.matriz[fila].length; fila++) {
                if (this.matriz[fila][columna] == ficha
                        && this.matriz[fila + 1][columna] == ficha) {
                    contadorSeguidas++;
                }//Fin Si
            }//Fin Para
        }//Fin Para

        haGanado = contadorSeguidas >= 4;

        return haGanado;
    }//Fin Metodo

    private boolean compruebaDiagonalPrincipal(char ficha) {
        //entorno
        boolean haGanado;
        byte filas, columnas;
        //algoritmo
        haGanado = false;
        for (filas = 0; filas < 2; filas++) {
            for (columnas = 0; columnas < 4; columnas++) {
                if (this.matriz[filas][columnas]
                        == this.matriz[filas + 1][columnas + 1]
                        && this.matriz[filas + 2][columnas + 2]
                        == this.matriz[filas + 3][columnas + 2]) {
                    haGanado = true;
                }//Fin Si
            }//Fin Para
        }//Fin Para
        return haGanado;
    }//Fin Metodo

    private boolean compruebaDiagonalSecundaria(char ficha) {
        //entorno
        boolean haGanado;
        byte filas, columnas;
        //algoritmo
        haGanado = false;
        for (filas = 3; filas < 5; filas++) {
            for (columnas = 0; columnas < 4; columnas++) {
                if (this.matriz[filas][columnas] == ficha
                        && this.matriz[filas + 1][columnas + 1] == ficha
                        && this.matriz[filas + 2][columnas + 2] == ficha
                        && this.matriz[filas + 3][columnas + 2] == ficha) {

                    haGanado = true;
                }//Fin Si
            }//Fin Para
        }//Fin Para
        return haGanado;
    }//Fin Metodo
    public boolean haGanado(char ficha) {
        //Entorno
        boolean haGanado;
        //Algoritmo
        haGanado = this.compruebaFila(ficha)
                || this.compruebaColumna(ficha)
                || this.compruebaDiagonalPrincipal(ficha)
                || this.compruebaDiagonalSecundaria(ficha);
        return haGanado;
    }//Fin Metodo

    public void pintaTablero() {
        System.out.println(" 0 1 2 3 4 5 6 7");
        for (int fila = 0; fila < 6; fila++) {
            for (int col = 0; col < 8; col++) {
                System.out.print("|" + matriz[fila][col]);
            }
            System.out.println("|");
        }
        System.out.println("-----------------");
    }
}//Fin Clase

