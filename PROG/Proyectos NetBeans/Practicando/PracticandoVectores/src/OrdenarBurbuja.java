/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 * @author Mejias Gonzalez Francisco
 */
public class OrdenarBurbuja {

    public static void main(String[] args) {
        //Entorno
        int[] tabla = {5, 10, 8, 22, 1, 12, 15};
        int aux;
        //Algoritmo
        for (int paso = 0; paso < tabla.length - 1; paso++) {
            for (int j = 0; j < tabla.length - 1 - paso; j++) {
                if (tabla[j] > tabla[j + 1]) {
                    aux = tabla[j];
                    tabla[j] = tabla[j + 1];
                    tabla[j + 1] = aux;
                }//Fin Si
            }//Fin Para
        }//Fin Para
        for (int muestra = 0; muestra < tabla.length; muestra++) {
            System.out.println(tabla[muestra]);
        }//Fin Para
    }//Fin Programa
}
