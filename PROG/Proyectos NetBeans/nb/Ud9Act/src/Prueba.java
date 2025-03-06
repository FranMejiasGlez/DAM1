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
            byte caracteres,i,posicion,cBien;
        //Algoritmo
          cadena="hola";
           for (int j = 0; j < cadena.length(); j++) {
               System.out.println(cadena.charAt(j));
               cadena=cadena.replace(cadena.charAt(j),'A');
               System.out.println(cadena);
        }
    }//Fin Programa
}

