/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class TrianguloRectangulo extends Triangulo {
    //Atributos
    //Constructores

    public TrianguloRectangulo(float lado1, float lado2, double angulo,
            float cateto1, float cateto2) {
        super(lado1, lado2, angulo);
        cateto1 =;
        cateto2 =;

    }//Fin Constructor
   
    //Metodos
     public double getHipotenusa() {
        //Entorno
        double hipotenusa;
        //Algoritmo
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        return hipotenusa;
    }//Fin Metodo
}
