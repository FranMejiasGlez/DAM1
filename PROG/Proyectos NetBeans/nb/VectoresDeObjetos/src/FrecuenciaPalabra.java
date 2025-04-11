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
    //Constructores

    public FrecuenciaPalabra() {
        this.listaPalabras = new Palabra[0];
        this.numPalabras = 0;
    }//Fin Constructor
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
        this.listaPalabras = aux;
        this.numPalabras++;
    }//Fin Metodo

    private void insertarPalabra(Palabra p) {
        this.listaPalabras[this.numPalabras - 1] = p;
    }//Fin Metodo

    public void cuentaPalabra(String cad) {
        //Entorno
        int siguiente, espacio;
        Palabra p;
        String palabra;
        //Algoritmo
        siguiente = 0;
        espacio = cad.indexOf(" ");
        //Busca las palabras
        while (espacio != -1) {
            palabra = cad.substring(siguiente, espacio);
            siguiente = espacio + 1;
            espacio = cad.indexOf(" ", siguiente);
            //Si existe la palabra en la lista incrementa
            if (buscarPalabra(palabra) != -1) {
                this.listaPalabras[buscarPalabra(palabra)].incrementaFrecuencia();
                //Si no existe crea palabra y aumenta lista e inserta
            } else {
                p = new Palabra(palabra);
                unaPalabraMas(this.listaPalabras);
                insertarPalabra(p);
            }//Fin Si
        }//Fin Mientras
    }//Fin Metodo

    /**
     * @return
     */
    private int buscarPalabra(String cad) {
        //entorno
        int salida, i;
        //algoritmo
        salida = -1;
        i = 0;
        //Busco la palabra pasada por parametro
        while (i < this.listaPalabras.length
                && !cad.equals(this.listaPalabras[i].obtenerPalabra())) {
            i++;
        }//FIN MIENTRAS
        //Si es igual a la palabra en la lista en i posicion
        if (i < this.listaPalabras.length
                && cad.equals(this.listaPalabras[i].obtenerPalabra())) {
            salida = i;
        }//FIN SI

        return salida;
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


