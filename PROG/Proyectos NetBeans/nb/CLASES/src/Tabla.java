/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Tabla {

    public static void main(String[] args) {
        //Entorno
        int[] tabla = {5, 23, 8, 12, 7};
        Integer salida;
        String mostrar;
        //Algoritmo
        salida = 0;
        mostrar = "";
        salida = tabla[0];
        mostrar = salida.toString();
        for (int i = 1; i < tabla.length; i++) {
            salida = tabla[i];
            mostrar = mostrar + "-" + salida.toString();
        }//Fin Para
        System.out.print(mostrar);
        System.out.println("");
        System.out.println("Introduce valor: ");
        tabla[0] = Leer.datoInt();
        salida = tabla[0];
        mostrar = salida.toString();
        for (int i = 1; i < tabla.length; i++) {
            System.out.println("Introduce valor: ");
            tabla[i] = Leer.datoInt();
            salida = tabla[i];
            mostrar = mostrar + "-" + salida.toString();
        }//Fin Para
        System.out.print(mostrar);
    }//Fin Programa
}
