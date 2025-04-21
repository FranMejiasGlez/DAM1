package ejercicio1;

import java.util.GregorianCalendar;

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Especial extends Camion {
    //Atributos

    private byte compartimentos;
    //Constructores

    public Especial() {
    }//Fin Constructor

    public Especial(String marca, String modelo,
            GregorianCalendar fechaMatriculacion, String matricula, float carga, byte compartimentos) {
        super(marca, modelo, fechaMatriculacion, matricula, carga);
        this.compartimentos = compartimentos;
    }//Fin Constructor
    //Metodos

    /**
     * @return the compartimentos
     */
    public byte getCompartimentos() {
        return compartimentos;
    }

    /**
     * @param compartimentos the compartimentos to set
     */
    public void setCompartimentos(byte compartimentos) {
        this.compartimentos = compartimentos;
    }

    @Override
    public float getCarga() {
        return super.getCarga() / this.compartimentos;
    }//Fin Metodo

    public String getDescripcion() {
        //Entorno
        String salida;
        Byte compartimentos;
        //Algoritmo
        compartimentos = this.getCompartimentos();
        salida = super.getMarca() + " - " + super.getModelo() + " - "
                + compartimentos.toString();
        return salida;
    }//Fin Metodo
}//Fin Clase
