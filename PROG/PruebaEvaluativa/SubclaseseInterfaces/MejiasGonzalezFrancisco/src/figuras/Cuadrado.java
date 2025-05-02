package figuras;

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Cuadrado extends Rectangulo {
    //Atributos
    //Constructores
    @Override
    public String getTipoFigura() {
        return "Cuadrado";
    }//Fin Metodo

    public Cuadrado(float lado) {
        super(lado, lado);
    }//Fin Constructor
    //Metodos
}//Fin Clase
