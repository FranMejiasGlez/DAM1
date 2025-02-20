/*
 Programa: RefEj5
 Autor: Francisco Mejias
 Entorno:
 edad,numero es numérico entero
 Algoritmo:
 Repetir
 Escribir "Años: "
 Leer numero
 edad <-- edad + numero *360
 Hasta año >=0
 Repetir
 Escribir "Meses: "
 Leer numero
 edad <-- edad + numero *30
 Hasta meses >=0
 Escribir "La edad en dias es: ",dias
 Fin Programa
 */
//Programa: RefEj5
//Autor: Francisco Mejias
public class RefEj5 {
    public static void main(String[] args) {
    //Entorno:
        int edadDias, numero;
    //Algoritmo:
        edadDias = 0;
        do {
            System.out.println("Años: ");
            numero = Leer.datoInt();
            edadDias = edadDias + numero * 360;
        } while (numero < 0);
        do {
            System.out.println("Meses: ");
            numero = Leer.datoInt();
            edadDias = edadDias + numero * 30;
        } while (numero <0);
        System.out.println("La edad en dias es: " + edadDias);
    }//Fin Programa
}