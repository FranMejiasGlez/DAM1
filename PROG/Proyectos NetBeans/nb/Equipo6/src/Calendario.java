/**
 *
 * @author Mejias Gonzalez Francisco
 */
import java.util.GregorianCalendar;

public class Calendario {

    public static String nombreMes(int dia) {
        //Entorno
        String salida;
        //Algoritmo
        switch (dia) {
            case 1:
                salida = "ENERO";
                break;
            case 2:
                salida = "FEBRERO";
                break;
            case 3:
                salida = "MARZO";
                break;
            case 4:
                salida = "ABRIL";
                break;
            case 5:
                salida = "MAYO";
                break;
            case 6:
                salida = "JUNIO";
                break;
            case 7:
                salida = "JULIO";
                break;
            case 8:
                salida = "AGOSTO";
                break;
            case 9:
                salida = "SEPTIEMBRE";
                break;
            case 10:
                salida = "OCTUBRE";
                break;
            case 11:
                salida = "NOVIEMBRE";
                break;
            case 12:
                salida = "DICIEMBRE";
                break;
            default:
                salida = "Mes no valido";

        }//Fin Segun Sea
        return salida;
    }

    public static void main(String[] args) {
        //Entorno
        int mes, dia, anio, diasMaxMes, primerDiaMes, diaSemanaActual;
        String salida;
        GregorianCalendar calendario;
        //Algoritmo
        do {
            System.out.print("Introduce Año: ");
            anio = Leer.datoInt();
        } while (anio < 1583 || anio > 4000);//Fin Mientras
        do {
            System.out.print("Introduce Mes: ");
            mes = Leer.datoInt();
        } while (mes < 1 || mes > 12);//Fin Repetir
        System.out.println("");
        calendario = new GregorianCalendar(anio, mes - 1, 1);
        System.out.println("Mes: " + mes);
        System.out.println("Año: " + anio);
        diasMaxMes = calendario.getActualMaximum(GregorianCalendar.DAY_OF_MONTH)
                ;
        primerDiaMes = calendario.get(GregorianCalendar.DAY_OF_WEEK);
        salida = "";
        diaSemanaActual = primerDiaMes - 1;
        System.out.println("\tCALENDARIO DE " + nombreMes(mes).toUpperCase()
                + " DE " + anio);
        System.out.println("");
        System.out.println("LU\tMA\tMI\tJU\tVI\tSA\tDO");
        for (int j = 0; j < ((calendario.get(GregorianCalendar.DAY_OF_WEEK) + 5)
                % 7); j++) { //calculo de espacios en blanco al principio
            salida = salida + " " + "\t";
        }//Fin Para
        for (int i = 0; i < diasMaxMes; i++) {
            dia = 1 + i;
            salida = salida + dia + "\t";
            //  Si es domingo
            if (diaSemanaActual % 7 == 0) {
                salida = salida + "\n";
            }//Fin Si
            diaSemanaActual++;
        }//Fin Para
        System.out.println(salida);
    }//Fin Programa
}
