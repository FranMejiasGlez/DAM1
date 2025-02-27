/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class PruebaString {
    public static void main(String[] args) {
        //Entorno
            String nom,ape1,ape2,nombre;
        //Algoritmo
            System.out.println("Programa que cree 4 variables nom, ape1,"
                    + " ape2 que deben contener tu\n" +
"nombre y tus apellidos y construir el nombre completo en nombre y mostrarlo");
            System.out.println("");
            System.out.println("");
            nom ="Francisco";
            ape1="Mejias";
            ape2="Gonzalez";
            nombre=nom+" "+ape1+" "+ape2;
            System.out.println(nombre);
            System.out.println(nom.concat(" "+ape1.concat(" "+ape2)));
                        
    }//Fin Programa
}
