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
        Empleado empleado, mayorSueldo, menorSueldo;
        String nombre, apellidos;
        float sueldo;
        int i;
        //Algoritmo
        listaEmple = new Empleado[3];
        for (i = 0; i < listaEmple.length; i++) {
            System.out.println("Introduce Nombre empleado: ");
            nombre = Leer.dato();
            System.out.println("Introduce Apellidos empleado: ");
            apellidos = Leer.dato();
            System.out.println("Introduce Sueldo empleado: ");
            sueldo = Leer.datoFloat();
            empleado = new Empleado(nombre, apellidos, sueldo);
            listaEmple[i] = empleado;
        }//Fin Para
        mayorSueldo = listaEmple[2];
        menorSueldo = listaEmple[2];
        for (int j = 0; j < listaEmple.length ; j++) {
            if (listaEmple[j].getSueldo() < mayorSueldo.getSueldo()) {
                menorSueldo = listaEmple[j];
            } else {
                if (listaEmple[j].getSueldo() > mayorSueldo.getSueldo()) {
                    mayorSueldo = listaEmple[j];
                } else {
                    mayorSueldo = listaEmple[j];
                }//Fin Si
            }//Fin Si
        }//Fin Para
        System.out.println(mayorSueldo.toString());
        System.out.println(menorSueldo.toString());
    }//Fin Programa
}
