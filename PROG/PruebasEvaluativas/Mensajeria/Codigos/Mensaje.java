
import java.util.GregorianCalendar;

/**
 *
 * @author Mejias Gonzalez Francisco
 * @author Jiménez Fuentes Pablo
 */
public class Mensaje {
    //Atributos
    //@author Jiménez Fuentes Pablo
    private static String APIPA = "169.254.0.1";
    private String usuario;
    private GregorianCalendar fecha;
    private String ip;
    private String texto;
    //Constructores
    //@author Mejias Gonzalez Francisco
    public Mensaje() {
        this.usuario = "System";
        this.ip = Mensaje.getAPIPA();
        this.fecha = new GregorianCalendar();
        this.texto = Mensaje.encripta(Mensaje.reverse("POR DEFECTO"));
    }//Fin Constructor
    //@author Mejias Gonzalez Francisco
    public Mensaje(String usuario, String ip, String texto) {
        this.usuario = usuario;
        if (Mensaje.esValida(ip)) {
            this.ip = ip;
        } else {
            this.ip = Mensaje.getAPIPA();
        }//Fin Si
        this.texto = Mensaje.encripta(Mensaje.reverse(texto.toUpperCase()));
        this.fecha = new GregorianCalendar();
    }//Fin Constructor
    //Metodos
    //@author Mejias Gonzalez Francisco
    public String getUsuario() {
        return usuario;
    }//Fin Metodo
    //@author Jiménez Fuentes Pablo
    public String getFecha() {
        //Entorno
        int dia, mes, anio;
        //Algoritmo
        dia = this.fecha.get(GregorianCalendar.DAY_OF_MONTH);
        mes = this.fecha.get(GregorianCalendar.MONTH) + 1;
        anio = this.fecha.get(GregorianCalendar.YEAR);
        return "Fecha: " + dia + "/" + mes + "/" + anio;
    }//Fin Metodo
    //@author Mejias Gonzalez Francisco
    public String getIp() {
        return this.ip;
    }//Fin Metodo
    //@author Jiménez Fuentes Pablo
    public String getTexto() {
        return Mensaje.reverse(Mensaje.desencripta(this.texto));
    }//Fin Metodo
    //@author Mejias Gonzalez Francisco
    public static String getAPIPA() {
        return Mensaje.APIPA;
    }//Fin Metodo
    //@author Jiménez Fuentes Pablo
    private static boolean esValida(String ip) {
        //Entorno
        boolean valida = false;
        //Algoritmo
        if (ip.matches("((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)(\\.|$)){4}")) {
            valida = true;
        }//Fin Si
        return valida;
    }//Fin Metodo
    //@author Jiménez Fuentes Pablo
    private static String encripta(String msg) {
        //Entorno:
        String encriptado;
        char letra;
        final byte DESPLAZAMIENTO = 3;

        //Algoritmo:
        encriptado = "";
        for (short i = 0; i < msg.length(); i++) {
            letra = msg.substring(i, i + 1).toUpperCase().charAt(0);
            if (letra == ' ') {
                letra = 'C';
            } else {
                letra = (char) (letra + DESPLAZAMIENTO);
                if (letra > 'Z' + 1) {
                    letra = (char) (('A' - 1) + (letra - ('Z' + 1)));
                }//Fin Si
            }//Fin Si
            encriptado = encriptado + letra;
        }//Fin Para
        return encriptado;
    }//Fin Metodo
    //@author Jiménez Fuentes Pablo
    private static String desencripta(String msg) {
        //Entorno:
        String desencriptado;
        char letra;
        final byte DESPLAZAMIENTO = 3;

        //Algoritmo:
        desencriptado = "";
        for (short i = 0; i < msg.length(); i++) {
            letra = msg.substring(i, i + 1).toUpperCase().charAt(0);
            if (letra == 'C') {
                letra = ' ';
            } else {
                letra = (char) (letra - DESPLAZAMIENTO);
                if (letra < 'A') {
                    letra = (char) (('Z' + 2) - ('A' - letra));
                }//Fin Si
            }//Fin Si
            desencriptado = desencriptado + letra;
        }//Fin Para
        return desencriptado;
    }//Fin Metodo
    //@author Mejias Gonzalez Francisco
    private static String reverse(String cad) {
        //Entorno
        String salida, cadena, palabra, palabraInvertida;
        //Algoritmo
        cadena = cad;
        salida = "";
        while (cadena.indexOf(' ') != -1) {
            //Busca la primera palabra
            palabra = cadena.substring(0, cadena.indexOf(' '));
            palabraInvertida = "";
            //Construccion de la cadena invertida
            for (int i = palabra.length() - 1; i >= 0; i--) {
                palabraInvertida = palabraInvertida + palabra.substring(i, i + 1);
            }//Fin Para
            salida = salida + palabraInvertida + " ";
            //Reemplaza la primera palabra y el espacio con vacio
            cadena = cadena.substring(cadena.indexOf(' ') + 1);
        }//Fin Mientras
        // Invertir la última palabra
        palabraInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            palabraInvertida = palabraInvertida + cadena.charAt(i);
        }//Fin Para
        salida = salida + palabraInvertida;
        return salida.trim();
    }//Fin Metodo
}//Fin Clase