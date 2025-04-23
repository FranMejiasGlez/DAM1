/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Ud10Act1 {

    public static void main(String[] args) {
        //Entorno
        Empleado[] listaEmple;
        Empleado empleado, mayorSueldo;
        String nombre, apellidos;
        float sueldo;
        int i;
        //Algoritmo
        listaEmple = new Empleado[3];
        mayorSueldo = new Empleado("No hay", "", 0F);
        for (i = 0; i < listaEmple.length; i++) {
            System.out.println("Introduce Nombre empleado: ");
            nombre = Leer.dato();
            System.out.println("Introduce Apellidos empleado: ");
            apellidos = Leer.dato();
            System.out.println("Introduce Sueldo empleado: ");
            sueldo = Leer.datoFloat();
            empleado = new Empleado(nombre, apellidos, sueldo);
        }//Fin Para
        for (int j = 0; j < listaEmple.length; j++) {
            if (listaEmple[j].CompareTo(listaEmple[j + 1]) == -1) {
                mayorSueldo = listaEmple[j + 1];
            } else {
                if (listaEmple[j].CompareTo(listaEmple[j + 1]) == +1) {
                    mayorSueldo = listaEmple[j];
                } else {
                    mayorSueldo = listaEmple[j];
                }//Fin Si
            }//Fin Si
        }//Fin Para
        System.out.println(mayorSueldo.toString());
    }//Fin Programa
}
