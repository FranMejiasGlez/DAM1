/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Pruebas {

    public static void main(String[] args) {
        //Entorno
        int[] tabla = {5, 1, 8};
        int limI, limD, mitad, numBus;
        boolean encontrado;
        //Algoritmo
        encontrado = false;
        limI = 0;
        limD = tabla.length - 1;
        numBus = 1;
        while (limI <= limD && !encontrado) {
            mitad = (limD + limI) / 2;
            if (tabla[mitad] == numBus) {
                System.out.println("Encontrado en pos: " + mitad);
                encontrado = true;
            } else {
                if (tabla[mitad] > numBus) {
                    limD = mitad - 1;
                } else {
                    limI = mitad + 1;
                }
            }
        }
        if (!encontrado) {
            System.out.println("No encontrado");
        }
    }
}
