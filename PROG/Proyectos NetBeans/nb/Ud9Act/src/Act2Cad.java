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
            byte caracteres,i,posicion;
        //Algoritmo
            System.out.println("Introduce una frase o palabra: ");
            cadena = Leer.dato();
            cadena=cadena.trim().toLowerCase().replaceAll(" +","");
            caracteres = (byte)cadena.length();
            posicion=(byte)(caracteres-1);
            i=0;
            do{
                if (cadena.charAt(i)==cadena.charAt(posicion)) {
                    i++;
                    posicion--;
                }//Fin Si
            }while(i<posicion && cadena.charAt(i)==cadena.charAt(posicion));
            if (i<posicion) {
                System.out.println("No es un Palindromo");
            }else{
                System.out.println("Es un Palindromo");
            }//Fin Si
    }//Fin Programa
}
