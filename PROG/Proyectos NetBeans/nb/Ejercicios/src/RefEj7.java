/*
 Programa: RefEj7
 Autor: Francisco Mejias
 Entorno:
 numero,posicion,digitos,resultado,auxiliar es numérico entero
 Algoritmo:
 Repetir 
 Escribir "Numero:"
 Leer numero
 Hasta numero >=0
 Escribir "Posicion: "
 Leer posicion
 digitos  <-- 1
 Mientras numero >=10 entonces
 numero <-- numero \ 10 
 digitos <-- digitos + 1
 Fin Mientras
 resultado <--auxiliar \ 10**(digitos - posicion )
 Escribir "El digito es : ",digito
 Fin Programa
 */
//Programa: RefEj7
//Autor: Francisco Mejias
public class RefEj7 {
    public static void main(String[] args) {
     //Entorno:
        int numero, auxiliar;
        byte posicion, j, digitos, resultado;
     //Algoritmo:
        do {
            System.out.println("Numero:");
            numero = Leer.datoInt();
            auxiliar = numero;
        } while (numero < 0);
        do {
            System.out.println("Posicion: ");
            posicion = (byte) Leer.datoShort();
        } while (posicion < 1);
        digitos = 1;
        while (numero >= 10) {
            numero = (int) numero / 10;
            digitos++;
        }//Fin Mientras
        j = (byte) (digitos - posicion);
        resultado = (byte) (auxiliar / Math.pow(10, j) % 10);
        System.out.println("El digito es : " + resultado);
     }//Fin Programa
}