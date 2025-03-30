/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Ud10Act10 {
      public static void main(String[] args) {
        // Entorno
        int[] tabla = {7, 8, 3, 0, 33};
        int primero;
        // Algoritmo:
        primero = tabla[0];
        for (int i = 0; i < tabla.length-1; i++) {
            tabla[i] = tabla[i + 1]; // Mover el elemento anterior
                                        //a la posición actual
        }//Fin Para
        tabla[tabla.length-1] = primero;
        for (int i=0; i<tabla.length;i++) {
            System.out.print(tabla[i] + " ");
        }//Fin Para
    }//Fin Programa
}
