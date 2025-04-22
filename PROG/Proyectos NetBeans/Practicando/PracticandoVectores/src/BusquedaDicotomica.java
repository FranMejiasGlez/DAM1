/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * BUSQUEDA DICOTOMICA DE UN NUMERO EN LISTA ORDENADA ASCENDENTE
 *
 * @Author Mejias Gonzalez Francisco
 */
public class BusquedaDicotomica {

    public static void main(String[] args) {
        //Entorno
        int[] lista = {1, 2, 3, 6, 10, 13, 20, 27, 28};
        int limiteIz, limiteDer, mitad, numeroBuscado;
        boolean encontrado;
        //Algoritmo
        encontrado = false;
        numeroBuscado = 6;
        limiteIz = 0;
        limiteDer = lista.length - 1;
        while (limiteIz <= limiteDer && !encontrado) {
            mitad = (limiteDer + limiteIz) / 2;
            if (lista[mitad] == numeroBuscado) {
                System.out.println("Encontrado en posicion: " + mitad);
                encontrado = true;
            } else {
                //Si el numero que se busca es menor que el valor de mitad de tabla
                if (lista[mitad] > numeroBuscado) {
                    limiteDer = mitad - 1;
                } else {
                    limiteIz = mitad + 1;
                }//Fin Si
            }//Fin Si
        }//Fin Mientras
        if (!encontrado) {
            System.out.println("No se ha encontrado el valor");
        }//Fin Si
    }//Fin Programa
}
