/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Utilidades {
    public static byte cifras(int numero){
    //Entorno:
        byte cifras;
           //Algoritmo:
        cifras=1;
        while(numero>=10){
            numero=numero/10;
            cifras++;
        }//Fin Mientras
        return cifras;
}//Fin Funcion
   public static byte sacarDigito(int numero, byte posicion){
    //Entorno:
        byte cifras,digitos,j,resultado;
        int auxiliar;
    //Algoritmo:
        digitos = 1;
        auxiliar = numero;
        while (numero >= 10) {
            numero = (int) numero / 10;
            digitos++;
        }//Fin Mientras
        j = (byte) (digitos - posicion);
        resultado = (byte) (auxiliar / Math.pow(10, j) % 10);
        return resultado;
     }//Fin Funcion
   public static esFechaValida(byte dia,byte mes,short anio){
       //Entorno:
            byte d,m,a;
       //Algoritmo:
            
}//Fin Funcion
}
