package ejercicio4;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Cd extends Disco {
    //Atributosç

    private float almacenamiento;
    //Constructores

    public Cd(String codigo, String sello, String autor, float almacenamiento) {
        super(codigo, sello, autor);
        this.almacenamiento = almacenamiento;
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
    
}
