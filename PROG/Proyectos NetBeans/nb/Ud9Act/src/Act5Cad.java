/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Act5Cad {

    public static String cifraPalabra(String palabra, int clave) {
        //Entorno:
        String palabraCifrada;
        //Algoritmo:
        palabraCifrada = "";
        for (int i = 0; i <= palabra.length() - 1; i++) {
            palabraCifrada = palabraCifrada + (char)(palabra.charAt(i)+ clave);
        }//Fin Para
        return palabraCifrada;
    }//Fin Metodo

    public static void main(String[] args) {
        //Entorno:
        String cadena, palabra, cadenaCifrada;
        int clave;
        //Algoritmo:
        System.out.println("Introduce un texto para cifrar: ");
        cadena = Leer.dato();
        System.out.println("Introduce el valor de la clave: ");
        clave = Leer.datoInt();
        cadena = cadena.trim();
        cadenaCifrada = "";
        while (cadena.indexOf(' ') != -1) {
            palabra = cadena.substring(0, cadena.indexOf(' ')); 
            cadenaCifrada = cadenaCifrada + cifraPalabra(palabra, clave) + " ";
            cadena = cadena.substring(cadena.indexOf(' ') + 1);
        }//Fin Mientras
        cadenaCifrada = cadenaCifrada + cifraPalabra(cadena, clave);
        System.out.println(cadenaCifrada);
    }//Fin Programa
}
