package figuras;


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

    @Override
    public double area() {
        //Entorno
        double area;
        //Algoritmo
        area = FiguraGeometricaPI.PI * Math.pow(this.radio, 2);
        return area;
    }//Fin Metodo

    @Override
    public String getTipoFigura() {
      return "Circulo";
    }//Fin Metodo

    @Override
    public double perimetro() {
        //Entorno
        double perimetro;
        //Algoritmo
        perimetro = 2 * FiguraGeometricaPI.PI * (this.getDiametro() / 2);
        return perimetro;
    }//Fin Metodo

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
        str = "Radio: " + this.getDiametro() / 2;
        return str;
    }//Fin Metodo
}//Fin clase
