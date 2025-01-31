/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class prueba2 {
    public static void main(String[] args){
        //Entorno:
            byte dia;
        //Algoritmo:
         do{
            System.out.println("Dia: ");
            dia=(byte)Leer.datoShort();
        }while(dia <0 || dia >=127);
         System.out.println("El dia es: "+dia);
}//Fin Programa
}
