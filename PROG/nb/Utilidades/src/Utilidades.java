/**
 *
 * @author Francisco Mejias
 */
public class Utilidades {
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
   public static byte sacarDigito(int numero, byte posicion){
    //Entorno:
        byte cifras,digitos,j,resultado;
        int auxiliar;
    //Algoritmo:
        digitos = 1;
        auxiliar = numero;
        while (numero >= 10) {
            numero = (int) numero / 10;
            digitos++;
        }//Fin Mientras
        j = (byte) (digitos - posicion);
        resultado = (byte) (auxiliar / Math.pow(10, j) % 10);
        return resultado;
     }//Fin Funcion
   public static boolean esBisiesto(short anio){
       //Entorno:
            boolean bisiesto;
       //Algoritmo:
          if(anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0){
              bisiesto=true;
          }else{
              bisiesto= false;
          }
          return bisiesto;
    }//Fin Funcion
  // public static boolean esFechaValida(byte d, byte m,short a){
       //Entorno:
         //  boolean esValido;
       //Algoritmo:
            
   //}
}
