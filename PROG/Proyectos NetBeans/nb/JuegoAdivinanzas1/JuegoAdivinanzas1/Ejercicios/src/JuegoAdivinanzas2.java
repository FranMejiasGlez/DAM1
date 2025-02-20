/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class JuegoAdivinanzas2 {

    public static byte LeeByte() {
        //Entorno:
        short numero;
        //Algoritmo:
        System.out.println("Introduce numero secreto");
        numero=Leer.datoShort();
        while (numero < 0 || numero > 99) {
            System.out.println("Numero debe estar entre 99 y 0");
        }
        return (byte) numero;
    }//Fin Funcion

    public static void main(String[] args) {
        //Entorno:
        byte numero, suposicion, intentos;
        //Algoritmo:
     
            
    }//Fin Programa
}
