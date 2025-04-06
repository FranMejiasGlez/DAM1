
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Persona {
    //Atributos 

    String nombre, direccion;
    long telefono;

    //Constuctores
    public Persona(String nom, String dir, long tel) {
        this.nombre = nom;
        this.direccion = dir;
        this.telefono = tel;
    }//Fin Constructor
    //Metodos

    //GetterSetters
    public String obtenerNombre() {
        return this.nombre;
    }//Fin Getter

    public String obtenerDireccion() {
        return this.direccion;
    }//Fin Getter

    public long obtenerTelefono() {
        return this.telefono;
    }//Fin Getter

    public void asignarNombre(String nom) {
        this.nombre = nom;
    }//Fin Setter

    public void asignarDireccion(String dir) {
        this.direccion = dir;
    }//Fin Setter

    public void asignarTelefono(long tel) {
        this.telefono = tel;
    }//Fin Setter
}//Fin Clase
