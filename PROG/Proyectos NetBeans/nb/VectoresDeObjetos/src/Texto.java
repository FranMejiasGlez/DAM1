/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Texto {

    public static void main(String[] args) {
        //Entorno
        String cad, palabra;
        int siguiente, espacio;
        FrecuenciaPalabra listaPalabras;
        //Algoritmo
        cad = "hola ola que la ola";
        cad = cad + " ";
        listaPalabras = new FrecuenciaPalabra();
        listaPalabras.cuentaPalabra(cad);
        for (int i = 0; i < listaPalabras.obtenerNumPalabras(); i++) {
            System.out.println(listaPalabras.obtenerObjPalabra(i).obtenerPalabra()
                    + " - " + listaPalabras.obtenerObjPalabra(i).obtenerFrecuencia());
        }
    }
}
