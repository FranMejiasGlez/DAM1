/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class GrupoAlumnos {

    public static void main(String[] args) {
        //Entorno 
        ListaAlumnos lista;
        int opcion;
        //Algoritmo
        lista = new ListaAlumnos();
        do {
            System.out.println("");
            do {
                System.out.println("Menú: ");
                System.out.println("1. Dar alta ");
                System.out.println("2. Dar baja");
                System.out.println("3. Mostrar alumnos");
                System.out.println("4. Mostrar nota media grupo");
                System.out.println("5. Salir");
                opcion = Leer.datoInt();
            } while (opcion < 1 || opcion > 5);//Fin Repetir
            switch (opcion) {
                case 1:
                    //Entorno
                    String nombre;
                    float nota;
                    Alumno alumno;
                    //Algoritmo
                    do {
                        System.out.println("Nombre alumno: ");
                        nombre = Leer.dato();
                    } while (!nombre.matches("[A-Z][a-z]+(?: [A-Z][a-z]+){0,2}"));//Fin Repetir
                    do {
                        System.out.println("Nota: ");
                        nota = Leer.datoFloat();
                    } while (nota < 0 || nota > 10);//Fin Repetir
                    alumno = new Alumno(nombre, nota);
                    lista.aniadirAlumno(alumno);
                    break;
                case 2:
                    //Entorno
                    //Algoritmo
                    System.out.println("Nombre de alumno a eliminar: ");
                    nombre = Leer.dato();
                    lista.eliminarAlumno(lista.buscarAlumno(nombre));
                    break;
                case 3:
                    if (lista.tamanioLista() != 0) {
                        for (int i = 0; i < lista.tamanioLista(); i++) {
                            System.out.println("Nombre: " + lista.getAlumno(i).getNombre() + "\n"
                                    + "Nota: " + lista.getAlumno(i).getNota());
                            System.out.println("");
                        }//Fin Para
                    } else {
                        System.out.println("Lista vacía");
                    }//Fin Si

                    break;
                case 4:
                    //Entorno
                    float media;
                    //Algoritmo
                    if (lista.tamanioLista() != 0) {
                        media = 0;
                        for (int i = 0; i < lista.tamanioLista(); i++) {
                            media = media + lista.getAlumno(i).getNota();
                        }//Fin Para
                        media = media / lista.tamanioLista();
                        System.out.println("Nota media de grupo: " + media);
                    } else {
                        System.out.println("Lista vacía");
                    }//Fin Si

                    break;
                default:
                    System.out.println("Fin programa");
            }//Fin Segun Sea
        } while (opcion != 5);//Fin Repetir
    }//Fin Programa
}
