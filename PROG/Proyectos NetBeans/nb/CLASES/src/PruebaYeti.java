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
      
        Yeti u,a;
    //Algoritmo:
        u = new Yeti('H');
        u.mostrarAtributos();
        System.out.println("Dandole de comer al Yeti...");
        u.alimentarYeti();
        u.mostrarAtributos();
        System.out.println("¿Quieres un poco más?");
        u.alimentarYeti();
        a = new Yeti('M');
        System.out.println(u.equals(a));
         System.out.println("toString de Yeti A");
        System.out.println(a.toString());
         System.out.println("tString de Yeti B");
        System.out.println(u.toString());
    }//Fin Programa
}
