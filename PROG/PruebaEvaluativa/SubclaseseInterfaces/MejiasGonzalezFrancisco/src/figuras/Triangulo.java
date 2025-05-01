package figuras;

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
    public double area() {
        //Entorno
        double area;
        //Algoritmo
        area = 0.5 * this.getLado1() * this.getLado2() 
                * Math.sin(Math.toRadians(this.angulo));
        return area;
    }//Fin Metodo

    @Override
    public double perimetro() {
        //Entorno
        double perimetro;
        float lado3;
        double anguloRad;
        //Algoritmo
        anguloRad = Math.toRadians(this.angulo);
        lado3 = (float) Math.sqrt((Math.pow(this.getLado1(), 2)
                + Math.pow(this.getLado2(), 2) - 2 * this.getLado1()
                * this.getLado2() * Math.cos(anguloRad)));
        perimetro = this.getLado1() + this.getLado2() + lado3;
        return perimetro;
    }//Fin Metodo

    @Override
    public String getTipoFigura() {
        //Entorno
        String str;
        //Algoritmo
        str = "Triangulo: \nLado1: " + this.getLado1()
                + "\nLado2: " + this.getLado2() + "\nAngulo: " + this.angulo;
        return str;
    }//Fin Metodo

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
}//Fin Clase
