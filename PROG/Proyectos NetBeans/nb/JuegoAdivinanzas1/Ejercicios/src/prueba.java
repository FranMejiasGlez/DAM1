/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author francisco mejias
 */
public class prueba {

    public static int potencia(int base, int exponente) {
        //Entorno:
        int resultado, i;
        //Algoritmo
        resultado = 1;
        if (exponente == 0) {
            System.out.println("");
        } else {
            resultado = base * potencia(base, exponente - 1);
        }//Fin Si
        return resultado;
    }//Fin Funcion
 public static byte cifras(int numero){
    //Entorno:
        byte cifras;
           //Algoritmo:
        cifras=1;
        while(numero>=10){
            numero=numero/10;
            cifras++;
        }//Fin Mientras
        return cifras;
}//Fin Funcion
    public static void main(String[] args) {
        //entorno
        int numero, invertido;
        byte cifras;
        //algoritmo
        System.out.println("numero: ");
        numero = Leer.datoInt();
        "El numero invertido es: "+invertido);
    }//Fin Programa
}