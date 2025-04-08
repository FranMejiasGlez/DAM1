/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Palabra {

    private String palabra;
    private int contador;
    //Constructores

    public Palabra(String palabra) {
        this.palabra = palabra;
        this.contador = 1;
    }//Fin Constructor
    //Metodos
    //GetterSetter

    /**
     * @return la palabra
     */
    public String obtenerPalabra() {
        return palabra;
    }//Fin Getter

    /**
     * @return el contador
     */
    public int obtenerFrecuencia() {
        return contador;
    }//Fin Getter

    /**
     * Incrementa el contador en uno
     */
    public void incrementaFrecuencia() {
        this.contador++;
    }//Fin Setter
}//Fin Clase
