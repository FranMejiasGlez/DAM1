
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Agenda {

    public static void main(String[] args) {
        //Entorno:
        byte opcion;
        ListaTelefonos lista;
        String nombreBuscado;
        int ultimaPosicion;
        //Algoritmo:
        nombreBuscado = "";
        ultimaPosicion = -1;
        lista = new ListaTelefonos();
    
        do {
            do {
                System.out.println("\n");
                System.out.println("1.- Buscar.");
                System.out.println("2.- Buscar siguiente.");
                System.out.println("3.- Añadir.");
                System.out.println("4.- Eliminar.");
                System.out.println("5.- Salir.");
                System.out.print("Opcion:_");
                opcion = (byte) Leer.datoShort();
            } while (opcion > 5 || opcion < 1);//Fin Repetir
            switch (opcion) {
                case 1://BUSCAR
                    //entorno
                    String nombre;
                    int pos;
                    //Algoritmo
                    pos = 0;
                    System.out.print("Nombre:_");
                    nombre = Leer.dato();
                    nombreBuscado = nombre;
                    if (lista.longitud() != 0) {
                        if (lista.buscar(nombre, pos) != -1) {
                            ultimaPosicion = lista.buscar(nombre, pos);
                            System.out.println("Encontrado en posicion: "
                                    + lista.buscar(nombre, pos));
                        } else {
                            System.out.println("No se encuentra en la agenda.");
                        }
                    } else {
                        System.out.println("Agenda vacía.");
                    }//Fin Si

                    break;
                case 2://BUSCAR SIGUIENTE
                    //Entorno
                    int siguiente;
                    //Algoritmo
                    if (lista.longitud() != 0) {

                        if (nombreBuscado.isEmpty()) {
                            System.out.println("No hay datos de ultima busqueda"
                                    + ".");
                        } else {
                            siguiente=
                                    lista.buscar(nombreBuscado,(ultimaPosicion+1
                                    ));
                            if (siguiente == -1) {
                                System.out.println("No hay coincidencias.");
                            } else {
                                System.out.println("Encontrado en posicion: "
                                        +siguiente);
                                ultimaPosicion = siguiente;
                            }//Fin Si
                        }//Fin Si
                    } else {
                        System.out.println("Agenda vacia.");
                    }//Fin SI 
                    break;


                case 3://AÑADIR
                    //Entorno
                    String nom,
                     dir;
                    Persona p;
                    long tel;
                    //Algoritmo
                    System.out.print("Nombre:");
                    nom = Leer.dato();
                    System.out.print("Direccion:");
                    dir = Leer.dato();
                    System.out.print("Telefono:");
                    tel = Leer.datoLong();
                    p = new Persona(nom, dir, tel);
                    lista.aniadir(p);
                    break;
                case 4://ELIMINAR
                    //Entorno
                    long telefono;
                    //Algoritmo
                    System.out.print("Telefono:_");
                    telefono = Leer.datoLong();
                    if (lista.longitud() != 0) {
                        if (lista.eliminar(telefono) == true) {
                            System.out.println("Registro eliminado.");
                        } else {
                            System.out.println("Teléfono no encontrado.");
                        }//Fin Si
                    } else {
                        System.out.println("Agenda vacía.");
                    }//Fin Si

                    break;
            }//Fin Segun Sea
        } while (opcion != 5);//Fin Repetir
    }//Fin Programa
}
