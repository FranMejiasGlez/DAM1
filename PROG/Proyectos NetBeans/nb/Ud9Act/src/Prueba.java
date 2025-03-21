/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Prueba {

    public static void main(String[] args) {
        //Entorno
        String nCadena, cadena = "hola";
        int i;
        //Algoritmo
        for (i = 1; i <cadena.length() +1; i++) {
            System.out.println(cadena.substring(i) + cadena.substring(0, i));
        }
    }
}