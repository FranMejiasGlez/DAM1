/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class TablaPOO {

    public static void main(String[] args) {
        //Entorno
        Alumno alum;
        Alumno[] alumnos;
        byte codigo,nota;
        //Algoritmo
        alumnos = new Alumno[3];
        for (int i = 0; i < alumnos.length -1; i++) {
               System.out.println("Introduce Cod: ");
               codigo=(byte)Leer.datoShort();
               System.out.println("Introduce Nota: ");
               nota=(byte)Leer.datoShort();
               alum=new Alumno(codigo,nota);
               alumnos[i]=alum;
        }//Fin Para
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i]);
        }//Fin Para
        System.out.println(alumnos[2]);
    }//Fin Programa
}
