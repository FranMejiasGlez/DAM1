/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
        byte fila, columna;
        //Algoritmo
        fila = 5;
        columna = 0;
        lleno = false;
        while (fila > this.ultimaFila || columna < this.ultimaColumna
                && this.matriz[fila][columna] != ' ') {
            fila--;
            if (fila == 0) {
                fila = 5;
                columna++;
            }//Fin Si
        }//Fin Mientras
        if (fila == 0 && columna == 7) {
            lleno = !lleno;
        }//Fin Si
        return lleno;
    }//Fin Metodo

    public byte buscaVacio(byte col) {
        //entorno
        byte posicion, fila;
        char fichaNegra, fichaBlanca;
        //algoritmo
        fichaNegra = '\u263A';
        fichaBlanca = '\u263B';
        fila = 5;
        posicion = -1;
        while (fila > 0 && this.matriz[fila][col] == fichaNegra
                || this.matriz[fila][col] == fichaBlanca) {
            fila--;
        }//Fin Mientras
        if (this.matriz[fila][col] != fichaNegra
                || this.matriz[fila][col] != fichaBlanca) {
            posicion = fila;
        }//Fin Si
        return posicion;
    }//Fin Metodo

    public boolean colocaFicha(char ficha, byte fila, byte columna) {
        //Entorno
        boolean colocado;
        //Algoritmo
        colocado = true;
        if (this.buscaVacio(fila) == -1) {
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
        //algoritmo
        haGanado = false;
    }//Fin Metodo

    private boolean compruebaDiagonalSecundaria(char ficha) {
        //entorno
        boolean haGanado;
        //algoritmo
        haGanado = false;
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
}//Fin Clase

