/**
 *
 * @author Mejias Gonzalez Francisco
 * @author Jiménez Fuentes Pablo
 */
public class Mensajeria {
    //El main lo hicimos conjunto en llamada
    public static byte leeByte() {
        //Entorno
        short opcion;
        //Algoritmo
        do {
            System.out.println("Introduce una opcion: ");
            opcion = Leer.datoShort();
        } while (opcion < Byte.MIN_VALUE || opcion > Byte.MAX_VALUE);
        return (byte) opcion;
    }//Fin Modulo

    public static byte menu() {
        //Entorno
        byte opcion;

        //Algoritmo
        do {
            System.out.println("1. Envío instantáneo.");
            System.out.println("2. Enviar mensaje.");
            System.out.println("3. Recibir mensaje.");
            System.out.println("4. Salir.");
            opcion = Mensajeria.leeByte();
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }//Fin Modulo

    public static void main(String[] args) {
        //Entorno
        byte opcion;
        Cola colaMensajes;
        String nombre, ip, texto, salir;
        Mensaje msg;
        //Algoritmo
        
        colaMensajes = new Cola();
        do {
            salir = "";
            opcion = Mensajeria.menu();
            switch (opcion) {
                case 1:
                    colaMensajes.meterEnCola(new Mensaje());
                    System.out.println("Mensaje añadido a cola");
                    break;
                case 2:
                    System.out.println("Introduzca nombre usuario: ");
                    nombre = Leer.dato();
                    do{
                        System.out.println("Introduzca IP: ");
                        ip = Leer.dato();
                    }while(!ip.matches("([0-9]+[.]*)+"));
                    System.out.println("Introduzca texto: ");
                    texto = Leer.dato();
                    colaMensajes.meterEnCola(new Mensaje(nombre, ip, texto));
                    break;
                case 3:
                    if (colaMensajes.esColaVacia()) {
                        System.out.println("No hay más mensajes");
                    } else {
                        msg = (Mensaje) colaMensajes.sacarDeCola();
                        System.out.println("Usuario: " + msg.getUsuario());
                        System.out.println("Fecha: " + msg.getFecha());
                        System.out.println("IP: " + msg.getIp());
                        System.out.println("Texto: ");
                        System.out.println(msg.getTexto());
                    }//Fin Si
                    break;
                case 4:
                    if (!colaMensajes.esColaVacia()) {
                        do {
                            System.out.println("Hay mensajes pendientes de recibir "
                                    + "¿Salir de todas formas?(S/N)");
                            salir = Leer.dato().toUpperCase();
                        } while (!salir.matches("S|N"));
                    }//Fin Si
                    break;

            }//Fin Segun Sea
        } while (opcion != 4 || (salir.equals("N") && opcion == 4));
        //Esta linea nos estuvo dando problemas devido al compilador y lo 
            //arreglamos cerrando el neatbeans
    }//Fin Programa
}
