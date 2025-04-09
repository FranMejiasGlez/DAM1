/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Prueba {

    public static void main(String[] args) {
        //Entorno
        Empleado uno;
        Encargado dos;
        //Algoritmo
        uno = new Empleado("Fran", "Mejias Gonzalez", 1000);
        System.out.println(uno.getNombre() + ", " + uno.getApellidos());
        dos = new Encargado();
        System.out.println(dos.getNombre() + ", " + dos.getApellidos()+", "+dos.getSueldoBase());
    }
}
