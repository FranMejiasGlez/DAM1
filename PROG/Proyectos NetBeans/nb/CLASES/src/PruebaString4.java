/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class PruebaString4 {
    public static void main(String[] args) {
        //Entorno
           int numero,caracteres;
           char caracter;
           String cadena;
           
        //Algoritmo
           System.out.println("Programa que pida por "
                   + "teclado un número entero y cambie cada aparición\n" +
"de un 2 por una A y de un 5 por Z.");
           System.out.println("");
           System.out.println("");
           System.out.println("Introduce un numero: ");
           numero=Leer.datoInt();
           cadena = Integer.toString(numero);
           caracteres = cadena.length();
           System.out.println("Longitud: "+caracteres);
           cadena=cadena.replace('2','A').replace('5','Z');
           System.out.println(cadena);
        
    }//Fin Programa
}
