/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Triangulo implements FiguraGeometricaPI {
    //Atributos

    private float lado1, lado2;
    private double angulo;
    //Constructores

    public Triangulo(float lado1, float lado2, double angulo) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.angulo = angulo;
    }//Fin Constructor
    //Metodos

    @Override
    public String toString() {
        String str;
        str = "Triangulo: \nLado 1: "
                + this.getLado1() + "\nLado 2: " + this.getLado2();
        return str;
    }//Fin Metodo

    public float getLado1() {
        return lado1;
    }//Fin Metodo

    public float getLado2() {
        return lado2;
    }//Fin Metodo
}
