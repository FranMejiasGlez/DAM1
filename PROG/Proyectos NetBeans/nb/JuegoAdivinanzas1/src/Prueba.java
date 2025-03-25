/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Prueba {

    public static void main(String[] args) {
        //Entorno
        Adivinanza uno;
        //Algoritmo
        System.out.println("!!JUEGO DE ADIVINANZAS¡¡"
                + "\nEl Sistema Genera un numero entre 1 y 1.000.000\n"
                + "\nCada digito bien colocado se desvelara, tienes 10 intentos:"
                + "\n ");
        uno = new Adivinanza();
        System.out.println(uno.getPista());
        System.out.println("\nJugador te toca adivinar: \n");

    }
}
