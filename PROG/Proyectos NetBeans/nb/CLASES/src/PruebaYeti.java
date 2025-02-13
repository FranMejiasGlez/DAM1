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
      
        Yeti u;
    //Algoritmo:
        u = new Yeti('H');
        u.mostrarAtributos();
        System.out.println("Dandole de comer al Yeti...");
        u.alimentarYeti();
        u.mostrarAtributos();
        System.out.println("¿Quieres un poco más?");
        u.alimentarYeti();
        
    }//Fin Programa
}
