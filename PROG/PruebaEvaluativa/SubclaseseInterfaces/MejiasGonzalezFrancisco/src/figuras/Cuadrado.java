package figuras;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Cuadrado extends Rectangulo {
    //Atributos
    //Constructores

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
        perimetro = this.getAltura() * 4;
        return perimetro;
    }//Fin Metodo

    @Override
    public String getTipoFigura() {
        //Entorno
        String str;
        //Algoritmo
        str = "Cuadrado:\nLado: " + super.getAltura();
        return str;
    }//Fin Metodo

    public Cuadrado(float lado) {
        super(lado, lado);

    }//Fin Constructor
    //Metodos
}//Fin Clase
