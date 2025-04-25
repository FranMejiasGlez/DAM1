/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class ListaAlumnos {
    //Atributos

    private Alumno[] lista;
    private int numeroAlumnos;
    //Constructores

    public ListaAlumnos() {
        //Entorno
        //Algoritmo
        this.numeroAlumnos = 0;
        lista = new Alumno[this.numeroAlumnos];
    }//Fin Constructor

    //Metodos
    public void aniadirAlumno(Alumno alu) {
        unElementoMas();
        this.lista[lista.length - 1] = alu;
    }//Fin Metodo

    public void eliminarAlumno(int pos) {
        //Entorno
        String nombre, eliminar;
        int i, posicion;
        //Algoritmo
        i = 0;
        System.out.println("Introduzca Nombre: ");
        nombre = Leer.dato();
        posicion = buscarAlumno(nombre);
        if (posicion != -1) {
            System.out.println("Encontrado alumno:\n"
                    + this.getAlumno(posicion).getNombre()
                    + "\n" + this.getAlumno(posicion).getNota());
            System.out.println("Confirmar eliminacion: S/N");
            eliminar = Leer.dato();
            if (eliminar.equals("S|s")) {
                this.lista[posicion] = null;
                unElementoMenos();
            } else {
                System.out.println("No se ha eliminado el alumno");
            }//Fin Si
        } else {
            System.out.println("No se encuentra alumno");
        }//Fin Si
    }//Fin Metodo

    public Alumno getAlumno(int pos) {
        return lista[pos];
    }//Fin Metodo

    public int tamanioLista() {
        return this.numeroAlumnos;
    }//Fin Metodo

    public int buscarAlumno(String nom) {
        //Entorno
        int posicion, i;
        //Algoritmo
        posicion = -1;
        i = 0;
        while (i < this.lista.length - 1
                && !this.lista[i].getNombre().equals(nom)) {
            i++;
        }//Fin MIentras
        if (i < this.lista.length
                && this.lista[i].getNombre().equals(nom)) {
            posicion = i;
        }//Fin Si
        return posicion;
    }//Fin Metodo

    private void unElementoMas() {
        //Entorno
        Alumno[] aux;
        //Algoritmo
        aux = new Alumno[this.numeroAlumnos + 1];
        for (int indice = 0; indice < lista.length; indice++) {
            aux[indice] = lista[indice];
        }//Fin Para
        this.lista = aux;
        this.numeroAlumnos = this.lista.length;
    }//Fin Metodo

    private void unElementoMenos() {
        Alumno[] aux;
        //Algoritmo
        if (this.numeroAlumnos != 0) {
            aux = new Alumno[this.numeroAlumnos - 1];
            int j = 0;
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] != null) {
                    aux[j] = lista[i];
                    j++;
                }//Fin Si
            }//Fin Para
            this.lista = aux;
            this.numeroAlumnos = this.lista.length;
        }//Fin Si
    }//Fin Metodo
}
