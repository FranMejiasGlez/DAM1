package ejercicio1;

import utilidades.Leer;
import java.util.GregorianCalendar;

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Prueba {

    public static Autobus pedirDatosAutobus() {
        //Entorno
        short anio;
        byte mes, dia, plazas;
        String marca, modelo, matricula;
        Autobus autobus;
        GregorianCalendar fechaMatriculacion;
        //Algoritmo
        System.out.println("Introduzca Año(AAAA): ");
        anio = Leer.datoShort();
        System.out.println("Introduzca Mes(MM): ");
        mes = (byte) Leer.datoShort();
        System.out.println("Introduzca dia(DD): ");
        dia = (byte) Leer.datoShort();
        System.out.println("Introduzca Marca: ");
        marca = Leer.dato();
        System.out.println("Introduzca Modelo: ");
        modelo = Leer.dato();
        System.out.println("Introduzca Matricula: ");
        matricula = Leer.dato();
        System.out.println("Introduza numero de plazas: ");
        plazas = (byte) Leer.datoShort();
        fechaMatriculacion = new GregorianCalendar(anio, mes, dia);
        autobus = new Autobus(marca, modelo, fechaMatriculacion, matricula, plazas);
        return autobus;
    }//Fin Modulo

    public static void muestraDatosAutobus(Autobus autobus) {
        System.out.println(autobus.getMarca().toUpperCase() + ", " + autobus.getModelo().toUpperCase()
                + ", "
                + autobus.getFechaMatriculacion().get(GregorianCalendar.YEAR)
                + "/"
                + autobus.getFechaMatriculacion().get(GregorianCalendar.MONTH)
                + "/"
                + autobus.getFechaMatriculacion().get(GregorianCalendar.DAY_OF_MONTH)
                + ", " + autobus.getMatricula().toUpperCase() + ", " + autobus.getPlazas());
    }//Fin Modulo

    public static Camion pedirDatosCamion() {
        //Entorno
        short anio;
        float carga;
        byte mes, dia;
        String marca, modelo, matricula;
        Camion camion;
        GregorianCalendar fechaMatriculacion;
        //Algoritmo
        System.out.println("Introduzca Año(AAAA): ");
        anio = Leer.datoShort();
        do {
            System.out.println("Introduzca Mes(MM): ");
            mes = (byte) Leer.datoShort();
        } while (mes < 1 || mes > 12);
        do {
            System.out.println("Introduzca dia(DD): ");
            dia = (byte) Leer.datoShort();
        } while (dia < 1 || dia > 31);
        System.out.println("Introduzca Marca: ");
        marca = Leer.dato();
        System.out.println("Introduzca Modelo: ");
        modelo = Leer.dato();
        System.out.println("Introduzca Matricula: ");
        matricula = Leer.dato();
        do {
            System.out.println("Introduza Carga(Kg): ");
            carga = Leer.datoFloat();
        } while (carga < 1);
        fechaMatriculacion = new GregorianCalendar(anio, mes, dia);
        camion = new Camion(marca, modelo, fechaMatriculacion, matricula, carga);
        return camion;
    }//Fin Modulo

    public static void muestraDatosCamion(Camion camion) {
        System.out.println(camion.getMarca().toUpperCase() + ", " + camion.getModelo().toUpperCase()
                + ", "
                + camion.getFechaMatriculacion().get(GregorianCalendar.YEAR)
                + "/"
                + camion.getFechaMatriculacion().get(GregorianCalendar.MONTH)
                + "/"
                + camion.getFechaMatriculacion().get(GregorianCalendar.DAY_OF_MONTH)
                + ", " + camion.getMatricula().toUpperCase() + ", " + camion.getCarga() + " Kg");
    }//Fin Modulo

    public static Especial pedirDatosEspecial() {
        //Entorno
        short anio;
        float carga;
        byte mes, dia, compartimentos;
        String marca, modelo, matricula;
        Especial especial;
        GregorianCalendar fechaMatriculacion;
        //Algoritmo
        System.out.println("Introduzca Año(AAAA): ");
        anio = Leer.datoShort();
        do {
            System.out.println("Introduzca Mes(MM): ");
            mes = (byte) Leer.datoShort();
        } while (mes < 1 || mes > 12);
        do {
            System.out.println("Introduzca dia(DD): ");
            dia = (byte) Leer.datoShort();
        } while (dia < 1 || dia > 31);
        System.out.println("Introduzca Marca: ");
        marca = Leer.dato();
        System.out.println("Introduzca Modelo: ");
        modelo = Leer.dato();
        System.out.println("Introduzca Matricula: ");
        matricula = Leer.dato();
        do {
            System.out.println("Introduza Carga(Kg): ");
            carga = Leer.datoFloat();
        } while (carga < 1);
        do {
            System.out.println("Introduza Compartimentos: ");
            compartimentos = (byte) Leer.datoShort();
        } while (compartimentos < 1);
        fechaMatriculacion = new GregorianCalendar(anio, mes, dia);
        especial = new Especial(marca, modelo, fechaMatriculacion, matricula, carga, compartimentos);
        especial.setCarga(carga);
        return especial;
    }//Fin Modulo

    public static void muestraDatosEspecial(Especial especial) {
        System.out.println(especial.getMarca().toUpperCase() + ", " + especial.getModelo().toUpperCase()
                + ", "
                + especial.getFechaMatriculacion().get(GregorianCalendar.YEAR)
                + "/"
                + especial.getFechaMatriculacion().get(GregorianCalendar.MONTH)
                + "/"
                + especial.getFechaMatriculacion().get(GregorianCalendar.DAY_OF_MONTH)
                + ", " + especial.getMatricula().toUpperCase() + ", " + especial.getCarga() + "Kg/Compartimento");
    }//Fin Modulo

    public static void main(String[] args) {
        //Entorno

        //Algoritmo

        //muestraDatosAutobus(pedirDatosAutobus());
        //muestraDatosCamion(pedirDatosCamion());
        muestraDatosEspecial(pedirDatosEspecial());

    }//Fin Programa
}
