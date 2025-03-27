
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Ud10Act7 {

    public static void main(String[] args) {
        //Entorno
        int numero, i;
        int[] tabla = {7, 8, 3, 0, 33};
        char continuar;
        //Algoritmo
        System.out.println("Que numero quieres consultar?: ");
        numero = Leer.datoInt();
        i = 0;
        do {
            if (tabla[i]==numero) {
                System.out.println("Posicion: "+i);
            }
        } while (tabla[i] != numero && i < tabla.length);


    }//Fin Programa
}
