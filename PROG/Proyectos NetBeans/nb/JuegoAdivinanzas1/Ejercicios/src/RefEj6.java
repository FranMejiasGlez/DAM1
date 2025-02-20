/*
 Programa: RefEj6
 Autor: Francisco Mejias
 Entorno:
 hora es numérico entero
 Algoritmo:
 Escribir "Hora: "
 Leer hora
 Si hora >=0 y <=24 entonces
 Si hora >=0 y hora <12 entonces
 Escribir "Buenos Dias"
 Sino 
 Si hora >=12 y hora <18 entonces
 Escribir "Buenas Tardes"
 Sino
 Si hora >=18 y hora <24 entonces
 Escribir "Buenas Noches"
 Fin Si
 Fin Si
 Fin Si
 Sino      
 Escribir "Hora fuera de rango"
 Fin Si
 Fin Progama
 */
//Programa: RefEj6
//Autor: Francisco Mejias
public class RefEj6 {
    public static void main(String[] args) {
    //Entorno:
        byte hora;
    //Algoritmo:
        System.out.print("Hora: ");
        hora = (byte) Leer.datoShort();
        if (hora >= 0 & hora <= 24) {
            if (hora >= 0 & hora < 12) {
                System.out.println("Buenos Dias");
            } else {
                if (hora >= 12 & hora < 18) {
                    System.out.println("Buenas Tardes");
                } else {
                    if (hora >= 18 & hora < 24);
                    System.out.println("Buenas Noches");
                }//Fin Si
            }// Fin Si
        } else {
            System.out.print("Hora fuera de rango");
        }//Fin Si
        }//Fin Programa
}