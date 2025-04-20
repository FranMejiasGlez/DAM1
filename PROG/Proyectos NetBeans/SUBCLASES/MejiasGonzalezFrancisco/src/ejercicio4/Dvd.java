package ejercicio4;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Dvd extends Disco {
    //Atributos

    private float almacenamiento;
    private byte capas;
    //Constructores

    public Dvd(String codigo, String sello, String autor, float almacenamiento, byte capas) {
        super(codigo, sello, autor);
        this.almacenamiento = almacenamiento;
        this.capas = capas;
    }//Fin Constuctor
    
    //Metodos

    /**
     * @return the almacenamiento
     */
    public float getAlmacenamiento() {
        return almacenamiento;
    }

    /**
     * @param almacenamiento the almacenamiento to set
     */
    public void setAlmacenamiento(float almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    /**
     * @return the capas
     */
    public byte getCapas() {
        return capas;
    }

    /**
     * @param capas the capas to set
     */
    public void setCapas(byte capas) {
        this.capas = capas;
    }
    
}
