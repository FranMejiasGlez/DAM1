/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Prueba {

    public static byte getCifrasIncognita(int numero) {
        //Entorno
        byte cifras;
        int i;
        //Algoritmo
        cifras = 1;
        i = 10;
        while (numero >= i) {
            i = i * 10;
            cifras++;
        }//Fin Mientras
        return cifras;
    }//Fin Metodo

    public static void main(String[] args) {
        int numero;
        numero = 1000;
        System.out.println(getCifrasIncognita(numero));
    }
}
