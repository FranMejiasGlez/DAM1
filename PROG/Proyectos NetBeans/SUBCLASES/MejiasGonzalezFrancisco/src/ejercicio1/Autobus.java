package ejercicio1;


import java.util.GregorianCalendar;

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Autobus extends Vehiculo {
    //Atributos

    private byte plazas;

    //Constructores
    public Autobus() {
    }//Fin Constructor

    public Autobus(String marca, String modelo,
            GregorianCalendar fechaMatriculacion, String matricula, byte plazas) {
        super(marca, modelo, fechaMatriculacion, matricula);
        this.plazas = plazas;
    }//Fin Constructor

    //Metodos
    /**
     * @return the plazas
     */
    public byte getPlazas() {
        return this.plazas;
    }//Fin Metodo

    /**
     * @param plazas the plazas to set
     */
    public void setPlazas(byte plazas) {
        this.plazas = plazas;
    }
}//Fin Clase
