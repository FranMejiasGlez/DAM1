/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Prueba {

    public static byte cifras(int num) {
        //Entorno
        return (byte) Integer.toString(num).length();
    }//Fin Metodo

    public static void main(String[] args) {
        //Entorno
        Adivinanza uno;
        Integer num;
        //Algoritmo
        System.out.println("!!JUEGO DE ADIVINANZAS¡¡\n"
                + "\nEl Sistema Genera un numero entre 1 y 1.000.000\n"
                + "\nCada digito bien colocado se desvelara,"
                + " tienes 10 intentos:"
                + "\n ");
        uno = new Adivinanza();
        System.out.println(uno.getPista());
        System.out.println(uno.getIncognigta());
        do {
            System.out.print("\nJugador te toca adivinar\n"
                    + "\nIntroduce un numero entre 1 y 1.000.000: \n");
            num = Leer.datoInt();
        } while (Prueba.cifras(num) > Prueba.cifras(uno.getIncognigta()));
        uno.juega(num);
        
        System.out.println(uno.getPista());
    }//Fin Programa
}
