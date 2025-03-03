/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class PruebaString3 {
    public static void main(String[] args) {
        //Entorno
            String cadena;
            byte palabras,caracteres;
            
        //Algoritmo
            System.out.println("Programa que lea una cadena y diga,"
                    + " número de caracteres y si es una\n" +
"palabra o más de una.");
            System.out.println("");
            cadena="Esto es una cadena";
            caracteres=(byte)cadena.length();
            System.out.println("La cadena tiene: "+caracteres+" caracteres");
            if (cadena.indexOf(" ") == -1) {
                System.out.println("Una palabra");
            } else {
                System.out.println("Hay mas de una palabra");
            }//Fin Si
           
    }//Fin Programa
}
