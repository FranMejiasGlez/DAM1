package ejercicio4;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Vinilo extends Disco {
    //Atributos

    private byte diametro;
    private short revolucionesMinuto;
    //Constructores

    public Vinilo(String codigo, String sello, String autor, byte diametro, short revolucionesMinuto) {
        super(codigo, sello, autor);
        this.diametro = diametro;
        this.revolucionesMinuto = revolucionesMinuto;
    }//Fin Constuctor
    //Metodos

    /**
     * @return the diametro
     */
    public byte getDiametro() {
        return diametro;
    }

    /**
     * @param diametro the diametro to set
     */
    public void setDiametro(byte diametro) {
        this.diametro = diametro;
    }

    /**
     * @return the revolucionesMinuto
     */
    public short getRevolucionesMinuto() {
        return revolucionesMinuto;
    }

    /**
     * @param revolucionesMinuto the revolucionesMinuto to set
     */
    public void setRevolucionesMinuto(short revolucionesMinuto) {
        this.revolucionesMinuto = revolucionesMinuto;
    }
    
}
