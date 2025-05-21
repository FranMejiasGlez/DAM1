
/**
 * Clase que representa el tablero del juego Conecta 4. Gestiona la lógica del
 * tablero, incluyendo colocación de fichas, comprobación de victorias y estado
 * del juego.
 *
 *
 */
/**
 *
 * @author Grupo_8 Francisco Mejias Gonzalez
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

    /**
     * Comprueba si el tablero está completamente lleno
     *
     * @return true si el tablero está lleno, false en caso contrario
     */
    public boolean estaLleno() {
        //Entorno
        boolean lleno;
        //Algoritmo
        lleno = this.numeroFichasIntroducidas == 48;
        return lleno;
    }//Fin Metodo

    /**
     * Busca la primera posición vacía en una columna
     *
     * @param col Columna donde buscar (0-7)
     * @return Fila donde hay espacio vacío o -1 si la columna está llena
     */
    public byte buscaVacio(byte col) {
        //entorno
        byte posicion, fila;
        //algoritmo
        posicion = -1; //No existe vacio.
        fila = 5;
        while (fila > 0 && this.matriz[fila][col] != ' ') {
            fila--;
        }//Fin Mientras
        if (this.matriz[fila][col] == ' ') {
            posicion = fila;
        }//Fin Si
        return posicion;
    }//Fin Metodo

    /**
     * Coloca una ficha en la posición especificada
     *
     * @param ficha Ficha a colocar ('\u263A' o '\u263B')
     * @param fila Fila donde colocar (0-5)
     * @param columna Columna donde colocar (0-7)
     * @return true si se pudo colocar la ficha, false si la posición estaba
     * ocupada
     */
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
        haGanado = false;

        for (fila = 0; fila < this.matriz.length && !haGanado; fila++) {
            contadorSeguidas = 0;
            for (columna = 0; columna < this.matriz[fila].length && !haGanado; columna++) {
                if (this.matriz[fila][columna] == ficha) {
                    contadorSeguidas++;
                    if (contadorSeguidas == 4) {
                        haGanado = true;
                    }//Fin Si
                } else {
                    contadorSeguidas = 0;
                }//Fin Si
            }//Fin Para
        }//Fin Para

        return haGanado;
    }//Fin Metodo

    private boolean compruebaColumna(char ficha) {
        //entorno
        boolean haGanado;
        byte columna, fila, contadorSeguidas;
        //algoritmo
        haGanado = false;
        for (columna = 0; columna < this.matriz[0].length && !haGanado; columna++) {
            contadorSeguidas = 0;
            for (fila = 0; fila < this.matriz.length && !haGanado; fila++) {
                if (this.matriz[fila][columna] == ficha) {
                    contadorSeguidas++;
                    if (contadorSeguidas == 4) {
                        haGanado = true;
                    }//Fin Si
                } else {
                    contadorSeguidas = 0;
                }//Fin Si
            }//Fin Para
        }//Fin Para
        return haGanado;
    }//Fin Metodo

    private boolean compruebaDiagonalPrincipal(char ficha) {
        //entorno
        boolean haGanado;
        byte fila, columna;
        //algoritmo
        haGanado = false;
        for (fila = 0; fila <= this.matriz.length - 4 && !haGanado; fila++) {
            for (columna = 0; columna < this.matriz[0].length - 4 && !haGanado; columna++) {
                if (this.matriz[fila][columna] == ficha
                        && this.matriz[fila + 1][columna + 1] == ficha
                        && this.matriz[fila + 2][columna + 2] == ficha
                        && this.matriz[fila + 3][columna + 3] == ficha) {
                    haGanado = true;
                }//Fin Si
            }//Fin Para
        }//Fin Para
        return haGanado;
    }//Fin Metodo

    private boolean compruebaDiagonalSecundaria(char ficha) {
        //entorno
        boolean haGanado;
        byte fila, columna;
        //algoritmo
        haGanado = false;
        for (fila = 0; fila <= this.matriz.length - 4 && !haGanado; fila++) {
            for (columna = 3; columna < this.matriz[0].length && !haGanado; columna++) {
                if (this.matriz[fila][columna] == ficha
                        && this.matriz[fila + 1][columna - 1] == ficha
                        && this.matriz[fila + 2][columna - 2] == ficha
                        && this.matriz[fila + 3][columna - 3] == ficha) {
                    haGanado = true;
                }//Fin Si
            }//Fin Para
        }//Fin Para
        return haGanado;
    }//Fin Metodo

    /**
     * Comprueba si el jugador con la ficha especificada ha ganado
     *
     * @param ficha Ficha del jugador a comprobar ('\u263A' o '\u263B')
     * @return true si el jugador ha ganado, false en caso contrario
     */
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

    /**
     * Muestra el tablero actual en la consola
     */
    public void pintaTablero() {
        //Entorno
        String salida;
        //Algoritmo
        salida = "";
        for (int fila = 0; fila < 6; fila++) {
            for (int col = 0; col < 8; col++) {
                salida = salida + "|_ ";
                salida = salida + this.matriz[fila][col] + " _|";
            }//Fin Para
            salida = salida + "\n";
        }//Fin Para
        System.out.println("-----------------");
        System.out.println(salida);
    }//Fin Metodo
}//Fin Clase

