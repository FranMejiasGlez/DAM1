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
        this.lista[this.lista.length - 1] = alu;
    }//Fin Metodo

    public void eliminarAlumno(int pos) {
        //Entorno
        String eliminar, nombre;
        int i;
        //Algoritmo
        i = 0;
        if (pos != -1) {
            System.out.println("Encontrado alumno:\nNombre: "
                    + this.getAlumno(pos).getNombre()
                    + "\nNota: " + this.getAlumno(pos).getNota());
            do {
                System.out.println("Confirmar eliminacion: S/N");
                eliminar = Leer.dato();
            } while (!eliminar.equalsIgnoreCase("S")
                    && !eliminar.equalsIgnoreCase("N"));//Fin Mientras
            if (eliminar.equalsIgnoreCase("S")) {
                nombre = this.lista[pos].getNombre();
                this.lista[pos] = null;
                unElementoMenos();
                System.out.println("Eliminado alumno: " + nombre);
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
                && !this.lista[i].getNombre().equalsIgnoreCase(nom)) {
            i++;
        }//Fin MIentras
        if (i < this.lista.length
                && this.lista[i].getNombre().equalsIgnoreCase(nom)) {
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
