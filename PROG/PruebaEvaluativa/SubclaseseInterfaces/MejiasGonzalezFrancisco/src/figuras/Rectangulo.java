package figuras;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Rectangulo implements FiguraGeometrica {
    //Atributos

    private float base;
    private float altura;
    //Constructores 

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }//Fin Constructor

    //Metodos
    @Override
    public double area() {
        //Entorno
        double area;
        //Algoritmo
        area = this.getAltura() * this.getBase();
        return area;
    }//Fin Metodo

    public double perimetro() {
        //Entorno
        double perimetro;
        //Algoritmo
        perimetro = this.getBase() * 2 + this.getAltura() * 2;
        return perimetro;
    }

    @Override
    public String getTipoFigura() {
        //Entorno
        String str;
        //Algoritmo
        str = "Rectangulo: \nAltura: " + this.getAltura()
                + "\nBase: " + this.getBase();
        return str;
    }//Fin Metodo

    @Override
    public String toString() {
        String str;
        str = "Rectángulo: \nBase: "
                + this.getBase() + "\nAltura: " + this.getAltura();
        return str;
    }//Fin metodo

    public float getBase() {
        return base;
    }//Fin metodo

    public void setBase(float base) {
        this.base = base;
    }//Fin metodo

    public float getAltura() {
        return altura;
    }//Fin metodo

    public void setAltura(float altura) {
        this.altura = altura;
    }//Fin metodo
}//Fin Clase
