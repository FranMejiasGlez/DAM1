package ejercicio4;
import utilidades.Leer;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Prueba {

    public static boolean esCodigoUnico(String codigo, Disco[] coleccion) {
        //entorno
        boolean esCorrecto;
        //Algoritmo
        esCorrecto = true;
        for (int i = 0; i < coleccion.length; i++) {
            if (coleccion[i] != null && coleccion[i].getCodigo().equals(codigo)) {
                esCorrecto = false;
            }//Fin Si
        }//FIn Para
        return esCorrecto;
    }//Fin modulo

    public static byte menu() {
        //Entorno
        byte opcion;
        do {
            System.out.println("Añadir nuevo:");
            System.out.println("1: Vinilo");
            System.out.println("2: Dvd");
            System.out.println("3: Cd");
            System.out.println("4: Salir");
            opcion = (byte) Leer.datoShort();
        } while (opcion > 4 || opcion < 1);
        return opcion;
    }//Fin modulo

    public static Cd creaCd() {
        String codigo, sello, autor;
        float almacenamiento;
        System.out.println("Codigo:");
        codigo = Leer.dato();
        System.out.println("Sello:");
        sello = Leer.dato();
        System.out.println("Autor:");
        autor = Leer.dato();
        System.out.println("Almacenamiento:");
        almacenamiento = Leer.datoFloat();
        return new Cd(codigo, sello, autor, almacenamiento);
    }//Fin Modulo

    public static Dvd creaDvd() {
        String codigo, sello, autor;
        float almacenamiento;
        byte capas;
        System.out.println("Codigo:");
        codigo = Leer.dato();
        System.out.println("Sello:");
        sello = Leer.dato();
        System.out.println("Autor:");
        autor = Leer.dato();
        System.out.println("Almacenamiento:");
        almacenamiento = Leer.datoFloat();
        System.out.println("Capas:");
        capas = (byte) Leer.datoShort();
        return new Dvd(codigo, sello, autor, almacenamiento, capas);
    }//Fin Modulo

    public static Vinilo creaVinilo() {
        String codigo, sello, autor;
        byte diametro;
        short revolucionesMinuto;

        System.out.println("Codigo:");
        codigo = Leer.dato();
        System.out.println("Sello:");
        sello = Leer.dato();
        System.out.println("Autor:");
        autor = Leer.dato();
        System.out.println("Revoluciones por minuto:");
        revolucionesMinuto = Leer.datoShort();
        System.out.println("Diametro:");
        diametro = (byte) Leer.datoShort();
        return new Vinilo(codigo, sello, autor, diametro, revolucionesMinuto);
    }//Fin Modulo

    public static void main(String[] args) {
        //Entorno
        Disco[] coleccion;
        Vinilo vinilo1;
        Dvd dvd1;
        Cd cd1;
        byte opcion;
        int i;
        //Algoritmo
        i = 0;
        coleccion = new Disco[3];
        while (i < coleccion.length) {
            do {
                opcion = menu();
                switch (opcion) {
                    case 1:
                        vinilo1 = creaVinilo();
                        if (esCodigoUnico(vinilo1.getCodigo(), coleccion)) {
                            coleccion[i] = vinilo1;
                        } else {
                            System.out.println("Codigo ya existente");
                        }//Fin Si
                        break;
                    case 2:
                        dvd1 = creaDvd();
                        if (esCodigoUnico(dvd1.getCodigo(), coleccion)) {
                            coleccion[i] = dvd1;
                        } else {
                            System.out.println("Codigo ya existente");
                        }//Fin Si
                        break;
                    case 3:
                        cd1 = creaCd();
                        if (esCodigoUnico(cd1.getCodigo(), coleccion)) {
                            coleccion[i] = cd1;
                        } else {
                            System.out.println("Codigo ya existente");
                        }//Fin Si

                        break;
                }//Fin Segun Sea

            } while (opcion != 4);//Fin Repetir

        }//Fin Mientras
    }//Fin Programa
}