/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Ud10Act11 {

    public static void main(String[] args) {
        //Entorno
        int[] tabla;
        int contador, numero, posicion;
        String salida;
        //Algoritmo
        contador = 1;
        tabla = new int[5];
        salida = "";
        for (int i = 0; i <= tabla.length - 1; i++) {
            do {
                System.out.println("Introduzca numero entero nº: " + contador);
                numero = Leer.datoInt();
                contador++;
            } while (numero < 0);//Fin Repetir
        }//Fin Para
    }//Fin Programa
}
