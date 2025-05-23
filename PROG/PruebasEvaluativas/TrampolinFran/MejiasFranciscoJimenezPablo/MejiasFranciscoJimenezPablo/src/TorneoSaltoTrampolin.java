
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

/**
 *
 * @author Mejias Gonzalez Francisco
 * @author Jimenez Fuentes Pablo 
 * El main lo hemos hecho en conjunto hasta el final.
 */
public class TorneoSaltoTrampolin {

    public static char pedirSexo() throws IOException {
        //Entorno
        boolean esValido;
        String entradaDato;
        char sexo;
        BufferedReader teclado;
        //Algoritmo
        teclado = new BufferedReader(new InputStreamReader(System.in));
        do {
            esValido = true;
            entradaDato = "";
            sexo = 's';
            try {
                System.out.println("Introduce sexo: ");
                entradaDato = teclado.readLine().toUpperCase();
                sexo = entradaDato.charAt(0);
            } catch (StringIndexOutOfBoundsException sioobe) {
                System.out.println("Dato no válido, introduzca otro: ");
                esValido = false;
            }//Fin TryCatch
        } while (esValido == false || !entradaDato.matches("H|M"));//Fin Repetir
        return sexo;
    }//Fin Metodo

    public static byte menu() {
        //Entorno
        byte opcion;
        BufferedReader teclado;
        boolean valido;
        String entradaDato;
        File fich;

        //Algoritmo
        teclado = new BufferedReader(new InputStreamReader(System.in));
        opcion = 0;
        do {
            valido = true;
            try {
                System.out.println("1. Inscribir saltador.");
                System.out.println("2. Eliminar saltador.");
                System.out.println("3. Nuevo salto.");
                System.out.println("4. Puntos pais.");
                System.out.println("5. Mostrar saltador.");
                System.out.println("6. Mostrar todos.");
                System.out.println("7. Salir.");
                System.out.println("  Opcion:");
                entradaDato = teclado.readLine();//LEER XD
                opcion = Byte.parseByte(entradaDato);
            } catch (NumberFormatException nfe) {
                System.out.println("Dato no válido, introduzca otro: ");
                valido = false;
            } catch (IOException ioe) {
                System.out.println("Error E/S");
            }//Fin TryCatch
        } while (valido == false && opcion < 1 || opcion > 7);//Fin Repetir
        return opcion;
    }//Fin Modulo

    public static void main(String[] args) {
        //Entorno
        byte opcion;
        Saltador saltador;
        int dorsal;
        String entradaDato, nombre, pais;
        char sexo;
        Clasificacion clasificacion;
        BufferedReader teclado;
        boolean valido;
        double puntos;
        //Algoritmo
        dorsal = -1;
        puntos = -1;
        clasificacion = new Clasificacion();
        teclado = new BufferedReader(new InputStreamReader(System.in));
        try {
            do {
                opcion = TorneoSaltoTrampolin.menu();
                switch (opcion) {
                    case 1: //INSCRIBIR SALTADOR
                        do {

                            do {
                                valido = true;
                                try {
                                    System.out.println("Introduce dorsal: ");
                                    entradaDato = teclado.readLine();
                                    dorsal = Integer.parseInt(entradaDato);
                                } catch (NumberFormatException nfe) {
                                    System.out.println("Dato no válido, introduzca otro: ");
                                    valido = false;
                                }//Fin TryCatch
                            } while (valido == false || dorsal < 0);//Fin Repetir
                            nombre = "";
                            pais = "";
                            sexo = ' ';
                            if (clasificacion.buscar(dorsal) != null) {
                                System.out.println("Saltador ya estaba inscrito.");
                            } else {

                                do {
                                    System.out.println("Introduce nombre: ");
                                    nombre = teclado.readLine();//LEER XD
                                } while (!nombre.matches("[A-Z][a-záéíóúñ]+"));//Fin Repetir

                                do {
                                    System.out.println("Introduce pais: ");
                                    pais = teclado.readLine(); //LEER XD
                                } while (!pais.matches("[A-Z][a-záéíóúñ]+"));//Fin Repetir
                                sexo = ' ';
                                TorneoSaltoTrampolin.pedirSexo();
                            }//Fin Si
                        } while (clasificacion.aniadir(new Saltador(dorsal, nombre, pais, sexo)) == false); //Fin Repetir
                        break;

                    case 2: //ELIMINAR SALTADOR
                        do {
                            valido = true;
                            try {
                                System.out.println("Introduzca dorsal para eliminar: ");
                                entradaDato = teclado.readLine();
                                dorsal = Integer.parseInt(entradaDato);
                            } catch (NumberFormatException nfe) {
                                System.out.println("Dato no válido, introduzca otro: ");
                                valido = false;
                            }//Fin TryCatch
                        } while (valido == false);//Fin Repetir
                        if (clasificacion.borrar(dorsal) == true) {
                            System.out.println("Saltador borrado.");
                        } else {
                            System.out.println("Saltador no encontrado");
                        }//Fin Si

                        break;
                    case 3: //NUEVO SALTO
                        //Entorno
                        double[] juez;
                        //Algoritmo

                        do {
                            valido = true;
                            try {
                                System.out.println("Introduzca dorsal del saltador: ");
                                entradaDato = teclado.readLine();
                                dorsal = Integer.parseInt(entradaDato);
                            } catch (NumberFormatException nfe) {
                                System.out.println("Dato no válido, introduzca otro: ");
                                valido = false;
                            }//Fin TryCatch
                        } while (valido == false);//Fin Repetir

                        if (clasificacion.buscar(dorsal) == null) {
                            System.out.println("No existe el saltador");
                        } else {
                            juez = new double[5];
                            Saltador s;
                            for (int i = 0; i < 5; i++) {
                                do {
                                    valido = true;
                                    try {
                                        System.out.println("Introduzca puntos: ");
                                        entradaDato = teclado.readLine();
                                        puntos = Double.parseDouble(entradaDato);
                                    } catch (NumberFormatException nfe) {
                                        System.out.println("Dato no válido, introduzca otro: ");
                                        valido = false;
                                    }//Fin TryCatch
                                } while (valido == false && puntos > 10 || puntos < 1);//Fin Repetir
                                juez[i] = puntos;
                            }//Fin Para
                            s = clasificacion.buscar(dorsal);
                            if (s.anotarSalto(juez) == false) {
                                System.out.println(s.getNombre() + " no puede saltar más");
                            } else {
                                System.out.println("Salto anotado a " + s.getNombre());
                                clasificacion.buscar(dorsal).anotarSalto(juez);
                            }//Fin Si

                        }//Fin Si

                        break;
                    case 4: //PUNTOS PAIS
                        //Entorno
                        String resultado;
                        Boolean esValido;
                        //Algoritmo

                        if (clasificacion.haySaltador()) {
                            sexo = ' ';
                            do {
                                System.out.println("Introduce pais: ");
                                pais = teclado.readLine();
                            } while (!pais.matches("[A-Z][a-záéíóúñ]+"));//Fin Repetir

                            TorneoSaltoTrampolin.pedirSexo();
                            if (clasificacion.getPuntosPais(pais, sexo) == 0) {
                                System.out.println("No hay puntuacion para la opcion elegida.");
                            } else {
                                resultado = String.format("La media es: %.27", clasificacion.getPuntosPais(pais, sexo));
                                System.out.println(resultado);//FORMATO
                            }//Fin Si
                        } else {
                            System.out.println("No hay saltadores.");
                        }//FIn Si
                        break;
                    case 5: //MOSTRAR SALTADOR
                        do {
                            valido = true;
                            try {
                                System.out.println("Introduzca dorsal del saltador: ");
                                entradaDato = teclado.readLine();
                                dorsal = Integer.parseInt(entradaDato);
                            } catch (NumberFormatException nfe) {
                                System.out.println("Dato no válido, introduzca otro: ");
                                valido = false;
                            }//Fin TryCatch
                        } while (valido == false);//Fin Repetir
                        if (clasificacion.buscar(dorsal) != null) {
                            System.out.println(clasificacion.buscar(dorsal).toString());
                        } else {
                            System.out.println("No existe saltador.");
                        }//Fin Si
                        break;
                    case 6: //MOSTRAR TODO
                        //Entorno
                        Iterator<Saltador> iterador;
                        Saltador s;
                        FileWriter fSalida;
                        String linea,
                         asteriscos;
                        File f;

                        //Algoritmo
                        if (clasificacion.haySaltador()) {
                            clasificacion.ordena();
                            iterador = clasificacion.iterator();
                            f = new File("Ficheros");
                            f.mkdir();
                            fSalida = null;
                            try {
                                asteriscos = "\n****************************\n";
                                fSalida = new FileWriter(new File(f, "fichero.txt"));
                                System.out.println(asteriscos);
                                fSalida.write(asteriscos);
                                while (iterador.hasNext()) {
                                    s = iterador.next();
                                    linea = s.toString() + "\r\n";
                                    System.out.println(linea);
                                    fSalida.write(linea);
                                }//Fin Mientras
                                System.out.println(asteriscos);
                                fSalida.write(asteriscos);
                            } catch (FileNotFoundException fnfe) {
                                System.out.println("No existe el fichero");
                            } catch (IOException ioe) {
                                System.out.println("Error E/S");
                            } finally {
                                if (fSalida != null) {
                                    fSalida.close();
                                }//Fin Si
                            }//Fin Try
                        } else {
                            System.out.println("No hay saltadores.");
                        }//Fin Si
                        break;
                }//Fin Segun Sea
            } while (opcion != 7);//Fin Repetir
        } catch (IOException ioe) {
            System.out.println("Error E/S");
        }//Fin TryCatch
    }//Fin Programa
}
