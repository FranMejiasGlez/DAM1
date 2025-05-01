package figuras;


/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class TrianguloRectangulo extends Triangulo {
    //Atributos
    //Constructores

    public TrianguloRectangulo(float cateto1, float cateto2) {
        super(cateto1, cateto2, 90);
    }//Fin Constructor

    //Metodos
    @Override
    public String getTipoFigura() {
        //entorno
        String str;
        //Algoritmo
        str = "Triangulo rectangulo: \nLado 1: " + this.getLado1()
                + "\nLado 2: " + this.getLado2() + "\nAngulo: 90º";
        return str;
    }//Fin  Metodo

    public double getHipotenusa() {
        //Entorno
        double hipotenusa;
        float cateto1, cateto2;
        //Algoritmo
        cateto1 = this.getLado1();
        cateto2 = this.getLado2();
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        return hipotenusa;
    }//Fin Metodo
}
