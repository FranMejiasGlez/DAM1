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

    @Override
    public double perimetro() {
        //Entorno
        double perimetro;
        //Algoritmo
        perimetro = this.getBase() * 2 + this.getAltura() * 2;
        return perimetro;
    }

    @Override
    public String getTipoFigura() {
        return "Rectangulo";
    }//Fin Metodo

    @Override
    public String toString() {
        return "Base: " + this.getBase() + "\nAltura: " + this.getAltura();
    }//Fin metodo

    public float getBase() {
        return base;
    }//Fin metodo

    public float getAltura() {
        return altura;
    }//Fin metodo
}//Fin Clase
