/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Circulo implements FiguraGeometricaPI {
    //Atributos
    private float radio;
    //Constructores

    public Circulo(float radio) {
        this.radio = radio;
    }//Fin Constructor
    //Metodos

    public float getDiametro() {
        //Entorno
        float diametro;
        //Algoritmo
        diametro = 2 * radio;
        return diametro;
    }//Fin metodo

    @Override
    public String toString() {
        String str;
        str = "Circulo: \nRadio: " + this.getDiametro() / 2;
        return str;
    }//Fin Metodo
}//Fin clase
