/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Prueba {

    public static byte cifras(int n) {
        //Entorno
        byte cifras;
        int i;
        //Algoritmo
        cifras = 1;
        i = 10;
        while (n >= i) {
            i = i * 10;
            cifras++;
        }//Fin Mientras
        return cifras;
    }//Fin Metodo

    public static void main(String[] args) {
        //Entorno
        int incognita, numeroPrueba;
        String pista;
        Byte i, j,digito;
        //Algoritmo
        incognita = 1123;
        numeroPrueba = 1123;
        i = cifras(incognita);
        j = cifras(numeroPrueba);
        pista = "";

        if (incognita / Math.pow(10, cifras(incognita) % 10)
                == numeroPrueba / Math.pow(10, cifras(numeroPrueba)) % 10) {
            digito=(byte)(incognita / Math.pow(10, cifras(incognita) % 10));
            pista = pista + digito.toString();
        } else {
            pista = pista + "*";
        }

        i = 1;
        System.out.println(pista);
    }
}
