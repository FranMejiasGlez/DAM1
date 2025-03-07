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
            String cadena;
      //Algoritmo
            cadena="Hola esto es una prueba";
            //Mostrar los caracteres de una cadena 
            for (int i = 0; i < cadena.length(); i++) {
                System.out.println(cadena.charAt(i));
            }//Fin Para
            
            //Contar caracteres de una cadena (con espacios incluidos)
            System.out.println(cadena.length());
            
            //Mostrar la primera aparicion de un espacio en una cadena
            System.out.println(cadena.indexOf(' '));
            
            //Mostrar la posterior aparicion de un espacio en una cadena
            System.out.println(cadena.indexOf(' ',cadena.indexOf(' ')+1));
    }//Fin Programa
}