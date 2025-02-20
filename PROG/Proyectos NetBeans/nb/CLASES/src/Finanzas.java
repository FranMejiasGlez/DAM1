/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Finanzas {
    //Atributos:
        private static double importeCambio=1.37;
    //Constructores:
        public Finanzas(){
        }//Fin Constructor
        public Finanzas(double dolares){
            Finanzas.importeCambio=dolares;
        }//Fin Constructor
    //Metodos:
        public double dolaresToEuros(double dolares){
            return dolares/Finanzas.importeCambio;
        }//Fin Metodo
        public double eurosToDolares(double euros){
            return euros*Finanzas.importeCambio;
        }//Fin Metodo
    //Getters/Setters:
}
