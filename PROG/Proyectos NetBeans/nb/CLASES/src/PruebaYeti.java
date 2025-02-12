/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class PruebaYeti {
     public static void main(String[] args){
    //Entorno:
        Yeti j;
    //Algoritmo:
        j = new Yeti();
        j.mostrarAtributos();
        System.out.println("Dandole de comer al Yeti...");
        j.alimentarYeti();
        j.mostrarAtributos();
        System.out.println("¿Quieres un poco más?");
        j.alimentarYeti();
    }//Fin Programa
}
