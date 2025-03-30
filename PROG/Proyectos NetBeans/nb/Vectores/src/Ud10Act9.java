/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Ud10Act9 {

    public static void main(String[] args) {
        // Entorno
        int[] tabla = {7, 8, 3, 0, 33};
        int ultimo;
        // Algoritmo:
        ultimo = tabla[tabla.length - 1];
        for (int i = tabla.length - 1; i > 0; i--) {
            tabla[i] = tabla[i - 1]; // Mover el elemento anterior
                                        //a la posición actual
        }//Fin Para
        tabla[0] = ultimo;
        for (int i=0; i<tabla.length;i++) {
            System.out.print(tabla[i] + " ");
        }//Fin Para
    }//Fin Programa
}
