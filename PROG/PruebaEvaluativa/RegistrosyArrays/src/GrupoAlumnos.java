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
            do {
                System.out.println("Menú: ");
                System.out.println("1. Dar alta ");
                System.out.println("2. Dar baja");
                System.out.println("3. Mostrar alumnos");
                System.out.println("4. Mostrar nota media grupo");
                System.out.println("5. Salir");
                opcion = Leer.datoInt();
            } while (opcion < 1 || opcion > 5);
            switch (opcion) {
                case 1:
                    //Entorno
                    String nombre;
                    float nota;
                    Alumno alumno;
                    //Algoritmo
                    System.out.println("Nombre alumno: ");
                    nombre = Leer.dato();
                    System.out.println("Nota: ");
                    nota = Leer.datoFloat();
                    alumno = new Alumno(nombre, nota);
                    lista.aniadirAlumno(alumno);
                    break;
                case 2:
                    //Entorno

                    //Algoritmo
                    lista.eliminarAlumno(lista.buscarAlumno(nombre));
                    break;
                case 3:
                    for (int i = 0; i < lista.tamanioLista(); i++) {
                        System.out.println(lista);
                    }
                    break;
                case 4:
                    //Entorno
                    //Algoritmo
                    for (int i = 0; i < 10; i++) {
                        
                    }
                    break;
                default:
                    System.out.println("Fin programa");
            }//Fin Segun Sea
        } while (opcion != 5);//Fin Mientras
    }//Fin Programa
}
