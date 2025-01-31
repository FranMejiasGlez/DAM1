/*
 Programa: RefEj3
 Autor: Francisco Mejias
 Entorno:
 horas,minutos,segundos,totalSegundos es numérico entero
 Algoritmo:
 Repetir
 Escribir "Horas: "
 Leer horas
 Hasta horas >=0
 Repetir
 Escribir "Minutos: "
 Leer minutos
 Hasta minutos >=0
 Repetir
 Escribir "Segundos: "
 Leer segundos
 Hasta segundos >=0 
 totalSegundos <-- horas*3600+minutos*60+segundos
 Escribir "El total de Segundos es: ",totalSegundos
 Fin Programa
 */
//Programa: RefEj3
//Autor: Francisco Mejias
public class RefEj3 {
    public static void main(String[] args) {
    //Entorno:
        int numero, totalSegundos;
    //Algoritmo:
        totalSegundos = 0;
        do {
            System.out.println("Horas: ");
            numero = Leer.datoInt();
            totalSegundos = totalSegundos + numero * 3600;
        } while (numero < 0);
        do {
            System.out.println("Minutos: ");
            numero = Leer.datoInt();
            totalSegundos = totalSegundos + numero * 60;
        } while (numero < 0);
        do {
            System.out.println("Segundos: ");
            numero = Leer.datoInt();
            totalSegundos = totalSegundos + numero;
        } while (numero < 0);
        System.out.println("El total de Segundos es: " + totalSegundos);
    }//Fin Programa
}