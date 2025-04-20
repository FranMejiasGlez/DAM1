package ejercicio2;


/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Electrodomestico {
    //Atributos

    private float precioBase = 100F;
    private String color = "blanco";
    private char consumoEnergetico = 'F';
    private int peso = 5;
    //Constructores

    public Electrodomestico() {
    }//Fin Constructor

    public Electrodomestico(float precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }//Fin Constructor

    public Electrodomestico(float precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        if (comprobarColor(color)) {
            this.color = color;
        }//Fin Si
        if (comprobarConsumoEnergetico(consumoEnergetico)) {
            this.consumoEnergetico = consumoEnergetico;
        }//Fin Si
    }//Fin Constructor

    //Metodos
    private boolean comprobarConsumoEnergetico(char letra) {
        //Entorno
        boolean esCorrecto;
        //Algoritmo
        esCorrecto = false;
        if (String.valueOf(letra).toUpperCase().matches("[A-F]")) {
            esCorrecto = true;
        }//Fin SI
        return esCorrecto;
    }//Fin Metodo

    private boolean comprobarColor(String color) {
        //Entorno
        boolean esCorrecto;
        String coloresPermitidos;
        //Algoritmo
        coloresPermitidos = "blanco negro rojo azul gris";
        esCorrecto = false;
        if (color.toLowerCase().contains(coloresPermitidos)) {
            esCorrecto = true;
        }//Fin Si
        return esCorrecto;
    }//Fin Metodo

    public float precioFinal() {
        //Entorno
        float[] listaPreciosLetra = {100F, 80F, 60F, 50F, 30F, 10F};
        float[] listaPreciosPeso = {10F, 50F, 80F, 100F};
        float precioFinal;
        //Algoritmo
        precioFinal = this.precioBase;
        switch (this.consumoEnergetico) {
            case 'A':
                precioFinal = precioFinal + listaPreciosLetra[0];
                break;
            case 'B':
                precioFinal = precioFinal + listaPreciosLetra[1];
                break;
            case 'C':
                precioFinal = precioFinal + listaPreciosLetra[2];
                break;
            case 'D':
                precioFinal = precioFinal + listaPreciosLetra[3];
                break;
            case 'E':
                precioFinal = precioFinal + listaPreciosLetra[4];
                break;
            case 'F':
                precioFinal = precioFinal + listaPreciosLetra[5];
                break;
        }//Fin Segun Sea

        if (peso >= 0 && peso <= 19) {
            precioFinal = precioFinal + listaPreciosPeso[0];
        } else {
            if (peso >= 20 && peso <= 49) {
                precioFinal = precioFinal + listaPreciosPeso[1];
            } else {
                if (peso >= 50 && peso <= 79) {
                    precioFinal = precioFinal + listaPreciosPeso[2];
                } else {
                    if (peso >= 80) {
                        precioFinal = precioFinal + listaPreciosPeso[3];
                    }//Fin Si
                }//Fin Si
            }//Fin Si
        }//Fin Si
        return precioFinal;
    }//Fin Metodo
}//Fin Clase
