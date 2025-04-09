/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Encargado extends Empleado {
    //Atributos
    //Constructores

    public Encargado() {
    }
     public Encargado(String nombre, String apellidos, float sueldo) {
        setNombre(nombre);
        setApellidos(apellidos);
        setSueldoBase(sueldo);
    }
    //Metodos
    //GetterSetter

    public float getSueldoBase() {
        return super.getSueldoBase() * 1.10F;
    }
}
