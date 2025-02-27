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
            System.out.println("");
            cadena="Esto es una cadena";
            caracteres=(byte)cadena.length();
            System.out.println("La cadena tiene: "+caracteres+" caracteres");
            palabras=0;
            for (int i = 0; i < caracteres; i++) {
                cadena.charAt(i);
                if (cadena.charAt(i)==32) {
                    palabras++;
                }//Fin Si    
            }//Fin Para
            palabras++;
            System.out.println("La cadena tiene: "+palabras+" palabras");
    }
}
