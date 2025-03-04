/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Act2Cad {

    public static void main(String[] args) {
        //Entorno
            String cadena;
            byte caracteres,i,posicion,cBien;
        //Algoritmo
            System.out.println("Introduce una frase o palabra: ");
            cadena = Leer.dato();
            cadena=cadena.trim().toLowerCase().replaceAll("\\s+","");
            caracteres = (byte)cadena.length();
            posicion=(byte)(caracteres-1);
            cBien=0;
            for (i = 0; i < caracteres/2; i++) {
                if (cadena.charAt(i)==cadena.charAt(posicion)) {
                       cBien++;
                       posicion--;
                }else{
                    System.out.println("No es Palindromo");
                }//Fin Si
            }//Fin Para
            if (cBien==caracteres/2) {
                System.out.println("Palindromo");
            }//Fin Si
    }//Fin Programa
}
