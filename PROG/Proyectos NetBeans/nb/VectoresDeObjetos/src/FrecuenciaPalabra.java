/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class FrecuenciaPalabra {
    //atributos

    private Palabra[] listaPalabras;
    private int numPalabras = 0;

    //Metodos
    /**
     * Crea una lista con un elemento mas y lo asigna a la misma del parametro
     */
    private void unaPalabraMas(Palabra[] listaActual) {
        //Entorno
        Palabra[] aux;
        //Algoritmo
        aux = new Palabra[numPalabras + 1];
        for (int i = 0; i < listaActual.length; i++) {
            aux[i] = listaActual[i];
        }//Fin Para
        listaActual = aux;
        this.numPalabras++;
    }//Fin Metodo

    private void insertarPalabra(Palabra p) {
        this.unaPalabraMas(listaPalabras);
        this.listaPalabras[this.numPalabras-1] = p;
    }//Fin Metodo

    public void cuentaPalabra(String cad) {
        //Entorno
        //Algoritmo
    }//Fin Metodo

    /**
     * @return
     */
    private int buscarPalabra(String cad) {
        //entorno
        Palabra p;
        String palabra, repe;
        int i;
        //algoritmo
        repe = "";
        i = 0;
        palabra = cad.substring(0, cad.indexOf(" "));
        cad = cad.replaceFirst(palabra, "").trim();
        p = new Palabra(palabra);
       
       
        return i; 
    }//Fin Metodo
    //Getter/Setter

    /**
     * @return El objeto en posicion de la lista
     */
    public Palabra obtenerObjPalabra(int pos) {
        return this.listaPalabras[pos];
    }//Fin  Getter

    /**
     * @return El numPalabras
     */
    public int obtenerNumPalabras() {
        return numPalabras;
    }//Fin Getter
    /**
     * Cuenta las palabras de la cadena
     */
}//Fin Clase
