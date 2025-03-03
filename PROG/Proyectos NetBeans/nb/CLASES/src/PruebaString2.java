/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class PruebaString2 {
    public static void main(String[] args) {
        //Entorno
           String nom,ape1,ape2,nombre;
        //Algoritmo
            System.out.println("Programa igual pero pedirlos por teclado, "
                    + "construir el nombre completo y\n" +
"mostrarlo en mayúsculas y minúsculas.");
            System.out.println("");
            System.out.println("");
           System.out.println("Introduce tu nombre: ");
           nom=Leer.dato();
           nom=nom.trim();
           
           
           System.out.println("Introduce tu primer apellido: ");
           ape1=Leer.dato();
           System.out.println("Introduce tu segundo apellido: ");
           ape2=Leer.dato();
           
    }
}
