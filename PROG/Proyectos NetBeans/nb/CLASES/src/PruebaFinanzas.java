/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class PruebaFinanzas {
   public static void main(String[]args){
       //Entorno:
            Finanzas a,b;
       //Algoritmo:
             System.out.println("Valor vale de euro a dolar: 1.37");
            a = new Finanzas();
            System.out.println("El valor de 20 dolares en euros:"
                    +a.dolaresToEuros(20)+" Euros");
            System.out.println("Cambio de valor vale de euro a dolar: 2.5");
            b = new Finanzas(2.5);
            System.out.println("El valor de 20 euros en dolares:"+
                    +b.eurosToDolares(20)+" Dolares");
            System.out.println();
            
   }//Fin Programa
}
