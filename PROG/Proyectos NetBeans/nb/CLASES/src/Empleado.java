
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Empleado {
    //Atributos

    private String nombre;
    private String apellidos;
    private short departamento;
    private byte seccion;
    private float sueldo;
    //Constructores

    public Empleado() {
    }//Fin Construsctor

    public Empleado(String nombre, String apellidos, short departamento,
            byte seccion, float sueldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.departamento = departamento;
        this.seccion = seccion;
        this.sueldo = sueldo;
    }//Fin Constructor
    //Metodos

    public String mostrarDatos() {
        return "Nombre: " + this.nombre + "\nApellidos: " + this.apellidos
                + "\nDepartamento: " + this.departamento
                + "\nSeccion: " + this.seccion + "\nSueldo: " + this.sueldo;
    }//Fin Metodo
    //Getters&Setters

    public String getNombre() {
        return this.nombre;
    }//Fin Metodo

    public String getApellidos() {
        return this.apellidos;
    }//Fin Metodo

    public short getDepartamento() {
        return this.departamento;
    }//Fin Metodo

    public byte getSeccion() {
        return this.seccion;
    }//Fin Metodo

    public float getSueldo() {
        return this.sueldo;
    }//Fin Metodo

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Fin Metodo

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }//Fin Metodo

    public void setDepartamento(short departamento) {
        if (departamento <= 9999) {
            this.departamento = departamento;
        } else {
            System.out.println("Departamento entre 1 y 9999");
        }
    }//Fin Metodo

    public void setSeccion(byte seccion) {
        if (seccion <= 99) {
            this.seccion = seccion;
        } else {
            System.out.println("Seccion entre 1 y 99");
        }//Fin Si
    }//Fin Metodo

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }//Fin Metodo
}//Fin Clase
