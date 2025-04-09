/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Empleado extends Persona {
    //Atributos

    private float sueldoBase;
    //Constructores

    public Empleado() {
    }

    public Empleado(String nombre, String apellidos, float sueldo) {
        setNombre(nombre);
        setApellidos(apellidos);
        this.sueldoBase = sueldo;
    }
    //Metodos
    //GetterSetter

    public float getSueldoBase() {
        return this.sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
}//Fin Clase
