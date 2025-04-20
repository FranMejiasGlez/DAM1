package ejercicio2;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Television extends Electrodomestico {
    //Atributos

    float resolucion = 20F;
    boolean sintonizadorTDT = false;
    //Constructores

    public Television() {
    }//Fin Constructor

    public Television(float precio, int peso) {
        super(100F, peso);
    }//Fin Constructor

    public Television(float precioBase, String color,
            char consumoEnergetico, int peso, float resolucion,
            boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }//Fin Constructor
    //Metodos

    public float getResolucion() {
        return this.resolucion;
    }//Fin Metodo

    public boolean getSintonizadorTDT() {
        return this.sintonizadorTDT;
    }//Fin Metodo

    @Override
    public float precioFinal() {
        //entorno
        float precioFin;
        //algoritmo
        precioFin = super.precioFinal();
        if (this.resolucion > 40F) {
            precioFin = precioFin * 1.30F;
        }//Fin Si
        if (this.sintonizadorTDT == true) {
            precioFin = precioFin + 50;
        }//Fin Si
        return precioFin;
    }//Fin Metodo
}//Fin Clase
