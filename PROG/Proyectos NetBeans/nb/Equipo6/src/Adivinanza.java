
/**
 * Clase que representa el juego de adivinanza de un número entre 1 y 1,000,000.
 * Se tiene un número secreto que el jugador debe adivinar en 10 intentos. El
 * juego proporciona pistas indicando qué dígitos están en la posición correcta.
 *
 * @author Mejias Gonzalez Francisco
 */
import java.util.Random;

public class Adivinanza {
    // Atributos

    /**
     * Número secreto generado aleatoriamente.
     */
    private int incognita;
    /**
     * Número ingresado por el jugador en su intento actual.
     */
    private int numeroPrueba;
    /**
     * Cantidad de intentos restantes.
     */
    private byte intentos;
    /**
     * Número de cifras del número secreto.
     */
    private byte cifrasIncognita;

    /**
     * Constructor de la clase Adivinanza. Se inicializa el número secreto y los
     * intentos disponibles.
     */
    public Adivinanza() {
        //Entorno
        Random rand;
        //Algoritmo
        rand = new Random();
        this.incognita = rand.nextInt(1_000_000) + 1;
        this.intentos = 10;
        this.numeroPrueba = -1;
    }// Fin Constructor

    /**
     * Método para registrar el número ingresado por el jugador.
     *
     * @param num Número ingresado por el jugador.
     */
    public void juega(int num) {
        this.numeroPrueba = num;
        this.intentos--;
    }// Fin Método

    /**
     * Verifica si el jugador ha adivinado el número secreto.
     *
     * @return true si el número ingresado es igual al número secreto, false en
     * caso contrario.
     */
    public boolean haGanado() {

        return this.numeroPrueba == this.incognita;
    }// Fin Método

    /**
     * Genera una pista para el jugador mostrando los dígitos correctos en la
     * posición correcta. Si es el primer intento, muestra un número de
     * asteriscos igual a la cantidad de cifras del número secreto.
     *
     * @return La pista con asteriscos y dígitos correctos.
     */
    public String getPista() {
        String pista = "";
        String numP = Integer.toString(this.numeroPrueba);
        String incog = Integer.toString(this.incognita);

        while (numP.length() < incog.length()) {
            numP = ";" + numP; // Rellenar con caracteres adicionales para igualar longitud
        }//Fin Mientras

        if (this.numeroPrueba == -1) {
            pista = Adivinanza.meteAsteriscos(Adivinanza.cifras(this.incognita));
        } else {
            for (int i = 0; i < incog.length(); i++) {
                if (numP.charAt(i) == incog.charAt(i)) {
                    pista += numP.charAt(i);
                } else {
                    pista += "*";
                }//Fin Si
            }//Fin Para
        }//Fin Para
        return pista;
    }// Fin Método

    /**
     * Genera una cadena de asteriscos de la longitud especificada.
     *
     * @param n Número de asteriscos a generar.
     * @return Una cadena con n asteriscos.
     */
    private static String meteAsteriscos(byte n) {
        String pistaAsteriscos = "";
        for (int i = 0; i < n; i++) {
            pistaAsteriscos += "*";
        }
        return pistaAsteriscos;
    }// Fin Método

    /**
     * Calcula el número de cifras de un número.
     *
     * @param n Número del cual se desea conocer la cantidad de cifras.
     * @return Cantidad de cifras del número.
     */
    private static byte cifras(int n) {
        return (byte) Integer.toString(n).length();
    }// Fin Método

    // Getters
    /**
     * Obtiene la cantidad de cifras del número secreto.
     *
     * @return Número de cifras del número secreto.
     */
    public byte getCifrasIncognita() {
        return (byte) Integer.toString(this.incognita).length();
    }// Fin Método

    /**
     * Obtiene el número de intentos restantes.
     *
     * @return Número de intentos restantes.
     */
    public byte getIntentos() {
        return this.intentos;
    }// Fin Método

    /**
     * Obtiene el número secreto (para pruebas y depuración).
     *
     * @return El número secreto.
     */
    public int getIncognigta() {
        return this.incognita;
    }// Fin Método
}// Fin Clase