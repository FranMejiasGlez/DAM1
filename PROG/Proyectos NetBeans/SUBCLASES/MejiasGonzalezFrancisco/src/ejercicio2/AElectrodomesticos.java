     package ejercicio2;

import utilidades.Leer;

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class AElectrodomesticos {

    public static int menu() {
        //Entorno
        int opcion;
        //Algoritmo
        do {
            System.out.println("Añadir Electrodomestico: ");
            System.out.println("1: Television");
            System.out.println("2: Lavadora");
            System.out.println("3: Electrodomestico");
            System.out.println("4: Salir");
            opcion = Leer.datoInt();
        } while (opcion > 4 || opcion < 1);
        return opcion;
    }//Fin Modulo

    public static Electrodomestico creaElectro() {
        //entorno
        float precioBase;
        String color;
        char consumoEnergetico;
        int peso;
        //algoritmo
        precioBase = 100.0F;
        System.out.println("Color: ");
        color = Leer.dato();
        System.out.println("Consumo Energetico (Letra):");
        consumoEnergetico = Leer.datoChar();
        System.out.println("Peso: ");
        peso = Leer.datoInt();
        return new Electrodomestico(precioBase, color, consumoEnergetico, peso);
    }//Fin Metodo

    public static Lavadora creaLav() {
        //entorno

        float carga, precioBase;
        String color;
        char consumoEnergetico;
        int peso;
        //algoritmo
        precioBase = 100.0F;
        System.out.println("Carga: ");
        carga = Leer.datoFloat();
        System.out.println("Color: ");
        color = Leer.dato();
        System.out.println("Consumo Energetico (Letra):");
        consumoEnergetico = Leer.datoChar();
        System.out.println("Peso: ");
        peso = Leer.datoInt();
        return new Lavadora(precioBase, carga, peso, color,
                consumoEnergetico);
    }//Fin Modulo

    public static Television creaTv() {
        //entorno
        float resolucion, precioBase;
        boolean sintonizadorTDT = false;
        String color;
        char consumoEnergetico, tdt;
        int peso;
        //algoritmo
        precioBase = 100.0F;
        System.out.println("Resolucion: ");
        resolucion = Leer.datoFloat();
        System.out.println("SintonizadorTDT (S|N): ");
        tdt = Leer.datoChar();
        if (String.valueOf(tdt).matches("s|S")) {
            sintonizadorTDT = true;
        }//Fin Si
        System.out.println("Color: ");
        color = Leer.dato();
        System.out.println("Consumo Energetico (Letra):");
        consumoEnergetico = Leer.datoChar();
        System.out.println("Peso: ");
        peso = Leer.datoInt();
        return new Television(precioBase, color,
                consumoEnergetico, peso, resolucion, sintonizadorTDT);
    }//Fin Modulo

    public static void main(String[] args) {
        //entorno
        Electrodomestico[] electrodomesticos;
        int i, opcion;
        Television tv;
        Lavadora lav;
        Electrodomestico elec;
        float totalLav, totalTv, totalElec;
        //algoritmo
        i = 0;
        totalLav = 0;
        totalTv = 0;
        totalElec = 0;
        electrodomesticos = new Electrodomestico[10];
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    if (i < electrodomesticos.length) {
                        tv = creaTv();
                        electrodomesticos[i] = tv;
                        System.out.println(electrodomesticos[i]);
                        i++;
                    }//Fin Si
                    break;
                case 2:
                    if (i < electrodomesticos.length) {
                        lav = creaLav();
                        electrodomesticos[i] = lav;
                        System.out.println(electrodomesticos[i].toString());
                        i++;
                    }//Fin Si
                    break;
                case 3:
                    if (i < electrodomesticos.length) {
                        elec = creaElectro();
                        electrodomesticos[i] = elec;
                        System.out.println(electrodomesticos[i].toString());
                        i++;
                    }//Fin Si
                    break;
            }//Fin Segun Sea
        } while (opcion != 4 && i <= electrodomesticos.length);
        for (int j = 0; j < electrodomesticos.length; j++) {
            if (electrodomesticos[j] != null) {
                totalElec = totalElec + electrodomesticos[j].precioFinal();
                if (electrodomesticos[j] instanceof Television) {
                    totalTv = totalTv + electrodomesticos[j].precioFinal();
                } else {
                    if (electrodomesticos[j] instanceof Lavadora) {
                        totalLav = totalLav + electrodomesticos[j].precioFinal();
                    }//Fin Si
                }//Fin Si 
            }//Fin Si
        }//Fin Para
        System.out.println("Total Electrodomesticos: " + totalElec + " €");
        System.out.println("Total Televisiones: " + totalTv + " €");
        System.out.println("Total Lavadoras: " + totalLav + " €");

        i = 0;
    }//Fin Programa
}
