
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
    public Empleado(){
    }//Fin Constructor
    public Empleado(String nombre, String apellidos, short departamento,
            byte seccion, float sueldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.departamento = departamento;
        this.seccion = seccion;
        this.sueldo = sueldo;
    }//Fin Constructor
    //Metodos
    
        public void copia(Empleado original){
            this.nombre=original.nombre;
            this.apellidos=original.apellidos;
            this.sueldo=original.sueldo;
            this.departamento=original.departamento;
            this.seccion=original.seccion;
        }//Fin Metodo
        
    //Getters&Setters

    public String getNombre() {
        return this.nombre;
    }//Fin Metodo

    public String getApellidos() {
        return this.apellidos;
    }//Fin Metodo

    public float getSueldo() {
        return this.sueldo;
    }//Fin Metodo
}//Fin Clase
