/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class PruebaContador {
    public static void main(String[] args){
        //Entorno:
            Contador a,b,c,d;
        //Algoritmo:
            System.out.println("Probar contador por defecto");
            a = new Contador();
            System.out.println("El valor del contador inicial es: "+
                    a.obtenerCuenta());
            System.out.println("Incremento la cuenta dos veces");
            a.incrementaCuenta();
            a.incrementaCuenta();
            System.out.println("El valor del contador incrementado es: "+
                    a.obtenerCuenta());
            System.out.println("Pruebo a inicializar el contador en 10");
            a.iniciaCuenta(10);
            System.out.println("El valor del contador inicializado es: "+
                    a.obtenerCuenta()); 
            System.out.println("Incremento la cuenta 2 veces ");
            a.incrementaCuenta();
            a.incrementaCuenta();
            System.out.println("El valor del contador incrementado es: "+
                    a.obtenerCuenta());
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Probar contador modificando incremento a 2: ");
            b = new Contador((byte)2);
            System.out.println("El valor del contador inicial es: "+
                    b.obtenerCuenta());
            System.out.println("Incremento la cuenta dos veces");
            b.incrementaCuenta();
            b.incrementaCuenta();
            System.out.println("El valor del contador incrementado es: "+
                    b.obtenerCuenta());
            System.out.println("Pruebo a inicializar el contador en 10");
            b.iniciaCuenta(10);
            System.out.println("El valor del contador inicializado es: "+
                    b.obtenerCuenta()); 
            System.out.println("Incremento la cuenta 2 veces ");
            b.incrementaCuenta();
            b.incrementaCuenta();
            System.out.println("El valor del contador incrementado es: "+
                    b.obtenerCuenta());
            System.out.println("");
            System.out.println("");
            System.out.println("");
             System.out.println("Pruebo a inicializar desde un valor 100 e incremento 3");
             c = new Contador(100,(byte)(3));
             System.out.println("El valor del contador inicializado e incrementado es: "+
                    c.obtenerCuenta());
             System.out.println("Incremento la cuenta dos veces");
            c.incrementaCuenta();
            c.incrementaCuenta();
            System.out.println("El valor del contador incrementado es: "+
                    c.obtenerCuenta());
            System.out.println("Pruebo a inicializar el contador en 100");
            c.iniciaCuenta(100);
             System.out.println("El valor del contador inicializado es: "+
                    c.obtenerCuenta()); 
            System.out.println("Incremento la cuenta 2 veces ");
            c.incrementaCuenta();
            c.incrementaCuenta();
            System.out.println("El valor del contador incrementado es: "+
                    c.obtenerCuenta());
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("Pruebo a copiar el último Contador");
             d = new Contador();
             System.out.println("Muestro el valor del nuevo Contador que"
                     + " tiene los valores del anterior");
             System.out.println(d.obtenerCuenta());
              
    }//Fin Programa
}
