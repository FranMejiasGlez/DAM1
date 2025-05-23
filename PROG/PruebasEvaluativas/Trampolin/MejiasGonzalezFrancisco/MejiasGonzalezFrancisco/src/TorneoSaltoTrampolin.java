
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class TorneoSaltoTrampolin {

    public static byte menu() {
        //Entorno
        byte opcion;
        //Algoritmo
        System.out.println("1. Inscribir saltador.");
        System.out.println("2. Eliminar saltador.");
        System.out.println("3. Nuevo salto.");
        System.out.println("4. Puntos pais.");
        System.out.println("5. Mostrar saltador");
        System.out.println("6. Mostrar todos.");
        System.out.println("7. Salir.");
        System.out.println("\t Opcion:");
        //LEER XD
        return opcion;
    }//Fin Modulo

    public static void main(String[] args) {
        //Entorno
        byte opcion;
        Saltador saltador;
        int dorsal;
        String nombre, pais;
        char sexo;
        Clasificacion clasificacion;
        //Algoritmo
        opcion = TorneoSaltoTrampolin.menu();
        clasificacion = new Clasificacion();
        do {
            switch (opcion) {
                case 1:
                    do {
                        do {
                            System.out.println("Introduce dorsal: ");
                            //LEER XD
                        } while (clasificacion.buscar(dorsal) != null);//Fin Repetir
                        System.out.println("Introduce nombre: ");
                        //LEER XD
                        System.out.println("Introduce pais: ");
                        //LEER XD
                        System.out.println("Introduce sexo: ");
                        //LEER XD
                    } while (clasificacion.aniadir(new Saltador(dorsal, nombre, pais, sexo)) == false); //Fin Repetir
                    break;
                case 2:
                    System.out.println("Introduzca dorsal para eliminar: ");
                    //LEER XD
                    clasificacion.borrar(dorsal);
                    break;
                case 3:
                    //Entorno
                    double[] juez;
                    double puntos;
                    //Algoritmo
                    System.out.println("Introduzca dorsal del saltador: ");
                    dorsal=;//LEER XD
                    if (clasificacion.buscar(dorsal) == null) {
                        System.out.println("No existe el saltador");
                    } else {
                        juez = new double[5];
                        for (int i = 0; i < 5; i++) {
                            System.out.println("Introduce puntos: ");
                            puntos=//LEER XD
                            juez[i] = puntos;
                        }//Fin Para
                    }//Fin Si

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }//Fin Segun Sea
        } while (opcion != 7);//Fin Repetir
    }//Fin Programa
}
