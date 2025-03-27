
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Ud10Act3 {

    public static void main(String[] args) {
        //Entorno
        int[] tabla;
        String introduccion, salida;
        //Algoritmo
        tabla = new int[15];
        tabla[0] = (int) (Math.random() * 100);
        introduccion = tabla[0] + "";
        for (int i = 1; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * 100);
            introduccion = introduccion + "-" + tabla[i];
        }//Fin Para
        salida = tabla[tabla.length - 1] + "";
        for (int i = 1; i < tabla.length; i++) {
            salida = salida + "-" + tabla[tabla.length - (i + 1)];
        }//Fin Para
        System.out.println("Introduccion:");
        System.out.println(introduccion);
        System.out.println("Salida invertida:");
        System.out.println(salida);
    }//Fin Programa
}
