/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Act1Cad {
    public static void main(String[] args) {
        //Entorno
            String cadena;
            byte resto;
        //Algoritmo
            cadena = "   EL  PERRO ES   BLANCO ";
            System.out.println("Cadena de: "+cadena.length()+" caracteres");
            resto=(byte)cadena.length();
            System.out.println("Trim y quitar espacios extra");
            cadena = cadena.replaceAll(" +", " ").trim();
            System.out.println("La cadena se reduce a: "+cadena.length()+" caracteres");
            resto= (byte)(resto - cadena.length());
            System.out.println("Numero de espacios para rellenar: "+resto);
            for (int i = 0; i < resto; i++){
                cadena =  cadena +" ";
            }//Fin Para
            System.out.println(cadena);       
    }//Fin Programa
}

