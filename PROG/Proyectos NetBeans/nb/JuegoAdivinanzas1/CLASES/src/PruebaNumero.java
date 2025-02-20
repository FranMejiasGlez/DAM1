/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class PruebaNumero {
  public static void main(String[] args){
      //Entorno:
            Numero a,b;
      //Algoritmo:
            a = new Numero();
            a.aniade(2);
            System.out.println("El valor es: ");
            System.out.println(a.getValor());
            System.out.println("El Doble es: ");
            System.out.println(a.getDoble());
            System.out.println("El Triple es: ");
            System.out.println(a.getTriple());
            System.out.println("El Cuadruple es: ");
            System.out.println(a.getCuadruple());
            System.out.println("Le sumamos 1 ");
            a.aniade(1);   
            System.out.println(a.getValor());
            System.out.println("El Doble es: ");
            System.out.println(a.getDoble());
            System.out.println("El Triple es: ");
            System.out.println(a.getTriple());
            System.out.println("El Cuadruple es: ");
            System.out.println(a.getCuadruple());
            System.out.println("Cambio el valor a 4: ");
            a.setValor(4);
            System.out.println(a.getValor());
            System.out.println("El Doble es: ");
            System.out.println(a.getDoble());
            System.out.println("El Triple es: ");
            System.out.println(a.getTriple());
            System.out.println("El Cuadruple es: ");
            System.out.println(a.getCuadruple());
            System.out.println("Le resto 1: ");
            a.resta(1);
            System.out.println(a.getValor());
            System.out.println("El Doble es: ");
            System.out.println(a.getDoble());
            System.out.println("El Triple es: ");
            System.out.println(a.getTriple());
            System.out.println("El Cuadruple es: ");
            System.out.println(a.getCuadruple());
            System.out.println("Construyo un nuevo objeto con valor definido: ");
            b = new Numero(10);
            System.out.println(b.getValor());
            System.out.println("El Doble es: ");
            System.out.println(b.getDoble());
            System.out.println("El Triple es: ");
            System.out.println(b.getTriple());
            System.out.println("El Cuadruple es: ");
            System.out.println(b.getCuadruple());
  }  
}
