/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class PruebaConsumo {
  public static void main(String[]args){
      //Entorno
            Consumo a,b,c;
      //Algoritmo
            System.out.println("");
            System.out.println("Instancio nuevo objeto de la clase  Consumo");
            a = new Consumo();
            System.out.println("Pongo valor de kms recorridos a 500");
            a.setKms(500);
            System.out.println("Pongo valor de litros consumidos a 80");
            a.setLitros(80);
            System.out.println("Pongo valor de velocidad media a 50km/h");
            a.setVmed(50);
            System.out.println("Calculo El comsumo medio: ");
            System.out.println(a.consumoMedio()+" Litros/100kms");
            System.out.println("Calculo sabiendo que el precio del litro "
                    + "está a 1.50 Euros");
            System.out.println(a.consumoEuros()+" Euros");
            System.out.println("Calculo el tiempo que he tardado en recorrer los kms");
            System.out.println(a.getTiempo()+" horas");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Instancio una nueva clase que tenga los valores de:"
                    + "1000 kms, 100 litros consumidos, 200 km/h");
            b = new Consumo(1000,100,200);
            System.out.println("Calculo El comsumo medio: ");
            System.out.println(b.consumoMedio()+" Litros/100kms");
            System.out.println("Calculo sabiendo que el precio del litro "
                    + "está a 1.50 Euros");
            System.out.println(b.consumoEuros()+" Euros");
            System.out.println("Calculo el tiempo que he tardado en recorrer los kms");
            System.out.println(b.getTiempo()+" horas"); 
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Cambio el precio del repostaje a 50 céntimos "
                    + "(Que barbaridad)");
            b.setPrecio(0.5F);
             System.out.println("Calculo sabiendo que el precio del litro "
                    + "está a 0.50 Euros");
            System.out.println(b.consumoEuros()+" Euros");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Comprobar si A y B son Iguales: "+a.equals(b));
            System.out.println("Creo un nuevo objeto por defecto como A: ");
            System.out.println("Instancio nuevo objeto de la clase  Consumo");
            c = new Consumo();
            System.out.println("Pongo valor de kms recorridos a 500");
            c.setKms(500);
            System.out.println("Pongo valor de litros consumidos a 80");
            c.setLitros(80);
            System.out.println("Pongo valor de velocidad media a 50km/h");
            c.setVmed(50);
            System.out.println("Comprobar si A y C son Iguales: "+a.equals(c));
          
  }//Fin Programa  
}
