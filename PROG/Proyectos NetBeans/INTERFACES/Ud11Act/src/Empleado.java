/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Empleado implements Comparable<Empleado> {
    //Atributos

    private String nombre, apellidos;
    private float sueldo;
    //Constructores

    public Empleado(String nombre, String apellidos, float sueldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldo = sueldo;

    }//Fin Constructor

    //Metodos
    @Override
    public String toString() {
        //Entorno
        String string;
        //Algoritmo
        string = "Nombre: " + this.getNombre()
                + "\nApellidos: " + this.getApellidos()
                + "\nSueldo: " + this.getSueldo();
        return string;
    }//Fin Metodo

    @Override
    public int CompareTo(Empleado empleado) {
        //Entorno
        int estado;
        //Algoritmo
        if (this.getSueldo() < empleado.getSueldo()) {
            estado = -1;
        } else {
            if (this.getSueldo() < empleado.getSueldo()) {
                estado = +1;
            } else {
                estado = 0;
            }//Fin Si
        } // Fin SI
        return estado;
    }//Fin Metodo

    public String getNombre() {
        return this.nombre;
    }//Fin Getter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } //Fin Setter

    public String getApellidos() {
        return this.apellidos;
    }//Fin Getter

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    } //Fin Setter

    public float getSueldo() {
        return this.sueldo;
    }//Fin Getter

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    } //Fin Setter
}//Fin Clase
