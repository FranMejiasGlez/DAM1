package ejercicio1;


import java.util.GregorianCalendar;

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public abstract class Vehiculo {
//Atributos

    private String marca, modelo, matricula;
    private GregorianCalendar fechaMatriculacion;
//Constructores

    public Vehiculo() {
    }//Fin Constructor

    public Vehiculo(String marca, String modelo,
            GregorianCalendar fechaMatriculacion, String matricula) {
        this.fechaMatriculacion = fechaMatriculacion;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }//Fin Constructor
//Metodos

    /**
     * @return the marca
     */
    public String getMarca() {
        return this.marca;
    }//Fin Metodo

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }//Fin Metodo

    /**
     * @return the modelo
     */
    public String getModelo() {
        return this.modelo;
    }//Fin Metodo

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }//Fin Metodo

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return this.matricula;
    }//Fin Metodo

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }//Fin Metodo

    /**
     * @return the fechaMatriculacion
     */
    public GregorianCalendar getFechaMatriculacion() {
        return this.fechaMatriculacion;
    }//Fin Metodo

    /**
     * @param fechaMatriculacion the fechaMatriculacion to set
     */
    public void setFechaMatriculacion(GregorianCalendar fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }//Fin Metodo
}//Fin Clase
