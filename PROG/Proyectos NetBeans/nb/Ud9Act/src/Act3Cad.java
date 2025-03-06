/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Act3Cad {
    public static String inviertePalabra(String palabra){
        String cadenaInvertida;
        cadenaInvertida = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            cadenaInvertida = cadenaInvertida + palabra.substring(i, i + 1);
        }//Fin Para
        return cadenaInvertida;
    }//Fin Modulo
    public static void main(String[] args) {
        //Entorno
            String cadena,cadenaInvertida;
        //Algoritmo
            System.out.println("Introduzca una frase");
            cadena=Leer.dato();
            cadenaInvertida=" ";
            for (int i = 0; i < cadena.length()-1; i++) {
                cadenaInvertida = cadenaInvertida + inviertePalabra((cadena.substring(i, cadena.lastIndexOf(' '))));
                
            }//Fin Para
            System.out.println(cadenaInvertida);
     }//Fin Programa
}
