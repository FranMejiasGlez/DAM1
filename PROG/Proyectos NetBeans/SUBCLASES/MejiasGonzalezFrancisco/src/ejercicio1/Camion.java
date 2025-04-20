package ejercicio1;


import java.util.GregorianCalendar;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Camion extends Vehiculo {
    //Atributos

    private float carga;
    //Constructores

    public Camion() {
    }//Fin Constructor

    public Camion(String marca, String modelo,
            GregorianCalendar fechaMatriculacion, String matricula, float carga) {
        super(marca, modelo, fechaMatriculacion, matricula);
        this.carga = carga;
    }//Fin Constructor
    //Metodos

    /**
     * @return the carga
     */
    public float getCarga() {
        return this.carga;
    }//Fin Metodo

    /**
     * @param carga the carga to set
     */
    public void setCarga(float carga) {
        this.carga = carga;
    }
}//Fin Clase
