package ejercicio2;


/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Lavadora extends Electrodomestico {
    //Atributos

    private float CARGA = 5F;

    //Constructores
    public Lavadora() {
    }//Fin Constructor

    public Lavadora(float precio, int peso) {
        super(precio, peso);

    }//Fin Constructor

    public Lavadora(float precioBase, float carga, int peso, String color,
            char consumoEnergetico) {
        super(precioBase, color, consumoEnergetico, peso);
        this.CARGA = carga;
    }//Fin Constructor

    //Metodos
    public float getCarga() {
        return this.CARGA;
    }//Fin Metodo

    @Override
    public float precioFinal() {
        //entorno
        float precioFin;
        //Algoritmo
        precioFin = super.precioFinal();
        if (this.CARGA > 30) {
            precioFin = precioFin + 50;
        }//Fin Si
        return precioFin;
    }//Fin Metodo
}//Fin Clase
