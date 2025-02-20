/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class PruebaTemperatura {
    public static void main(String[]args){
        //Entorno:
            Temperatura a;
        //Algoritmo:
            a=new Temperatura();
            System.out.println("");
            System.out.println("Pruebo a cambiar de 25ºC celsius a fahrenheit");
            System.out.println(a.celsiusToFahrenheit(25)+" ºF");
            System.out.println("Pruebo a cambiar de 100ºF fahrenheint a celsius");
            System.out.println(a.fahrenheitToCelsius(100)+" ºC");
    }//Fin Programa
}
