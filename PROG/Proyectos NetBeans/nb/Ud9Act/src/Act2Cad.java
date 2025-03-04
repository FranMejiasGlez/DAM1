/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Act2Cad {
    public static byte sacarDigito(int numero, byte posicion){
    //Entorno:
        byte digitos,j,resultado;
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
    public static void main(String[] args) {
        //Entorno
            String cadena;
            byte caracteres,caracter;
        //Algoritmo
            cadena = "aba";
            caracteres = (byte)cadena.length();
            for (int i = 0; i < caracteres-1; i++) {
                if (cadena.charAt(i)== cadena.charAt(caracteres-1)) {
                    System.out.println("Es Palindromo");
                }//Fin Si
      
            }//Fin Para
            
            
    }//Fin Programa
}
