package Ud10Act1;

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
    public int compareTo(Empleado empleado) {
        //Entorno
        int estado;
        //Algoritmo
        if (this.getSueldo() < empleado.getSueldo()) {
            estado = (int) (this.getSueldo() - empleado.getSueldo());
        } else {
            if (this.getSueldo() > empleado.getSueldo()) {
                estado = (int) (this.getSueldo() - empleado.getSueldo());
            } else {
                estado = (int) (this.getSueldo() - empleado.getSueldo());
            }//Fin Si
        } // Fin Si
        return estado;
    }//Fin Metodo

    @Override
    public boolean equals(Object obj) {
        //Entorno
        boolean esIgual;
        Empleado emple;
        String nomApe1, nomApe2;
        //ALgoritmo
        esIgual = false;
        nomApe1 = "";
        nomApe2 = "";
        if (obj instanceof Empleado) {
            emple=(Empleado)obj;
            nomApe1 = this.getNombre() + " " + this.getApellidos();
            nomApe2 = emple.getNombre() + " " + emple.getApellidos();
        }//Fin Si
        esIgual = nomApe1.equals(nomApe2);
        return esIgual;
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
