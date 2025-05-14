
import java.util.GregorianCalendar;

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Mensaje {
    //Atributos

    private static String APIPA;
    private String usuario;
    private GregorianCalendar fecha;
    private String ip;
    private String texto;
    //Constructores

    public Mensaje() {
        Mensaje.APIPA = "169.254.0.0";
        this.usuario = "System";
        this.ip = Mensaje.getAPIPA();
        this.fecha = new GregorianCalendar();
        this.texto = "Por defecto";
    }//Fin Constructor

    public Mensaje(String usuario, String ip, String texto) {
        Mensaje.APIPA = "169.254.0.0";
        this.usuario = usuario;
        if (Mensaje.esValida(ip)) {
            this.ip = ip;
        } else {
            this.ip = Mensaje.getAPIPA();
        }//Fin Si
        this.texto = texto.toUpperCase();
        this.fecha = new GregorianCalendar();
    }//Fin Constructor
    //Metodos

    public String getUsuario() {
        return usuario;
    }//Fin Metodo

    public String getFecha() {
        //Entorno
        int dia, mes, anio;
        //Algoritmo
        dia = fecha.get(GregorianCalendar.DAY_OF_MONTH);
        mes = fecha.get(GregorianCalendar.MONTH);
        anio = fecha.get(GregorianCalendar.YEAR);
        return "Fecha: " + dia + "/" + mes + "/" + anio;
    }//Fin Metodo

    public String getIp() {
        return this.ip;
    }//Fin Metodo

    public String getTexto() {
        return this.texto;
    }//Fin Metodo

    public static String getAPIPA() {
        return Mensaje.APIPA;
    }//Fin Metodo

    private static boolean esValida(String ip) {
        boolean esValida = false;

        if (ip != null && ip.matches(
                "((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)")) {
            String[] partes = ip.split("\\.");
            esValida = partes.length == 4;
        }//Fin Si

        return esValida;
    }//Fin Metodo

    private static String encripta(String msg) {
        //Entorno
        final int CLAVE;
        String cadCifrada, cadena;
        //Algoritmo
        CLAVE = 3;
        cadena = msg;
        cadCifrada = "";
        for (int i = 0; i <= cadena.length() - 1; i++) {
            if (cadena.charAt(i) != ' ') {
                cadCifrada = cadCifrada
                        + (char) (cadena.charAt(i) - 'A' - CLAVE + 26) % 26;
            }
        }//Fin Para
        return cadCifrada;
    }//Fin Metodo

    private static String desencripta(String msg) {
        //Entorno
        final int CLAVE;
        String cadCifrada, cadena;
        //Algoritmo
        CLAVE = 3;
        cadena = msg;
        cadCifrada = "";
        for (int i = 0; i <= cadena.length() - 1; i++) {
            if (cadena.charAt(i) != ' ') {
                cadCifrada = cadCifrada
                        + (char) (cadena.charAt(i) - 'A' + CLAVE + 26) % 26;
            }
        }//Fin Para
        return cadCifrada;
    }

    private static String reverse(String cad) {
        //Entorno
        String salida, cadena, palabra, palabraInvertida;
        //Algoritmo
        cadena = cad;
        salida = "";
        palabraInvertida = "";
        while (cadena.indexOf(' ') != -1) {
            //Busca la primera palabra
            palabra = cadena.substring(0, cadena.indexOf(' '));
            //Construccion de la cadena invertida
            for (int i = palabra.length() - 1; i >= 0; i--) {
                palabraInvertida = palabraInvertida + palabra.substring(i, i + 1);
            }//Fin Para
            salida = salida + palabraInvertida + " ";
            //Reemplaza la primera palabra y el espacio con vacio
            cadena = cadena.replaceAll(cadena.substring(0, cadena.indexOf(' ')
                    + 1), "");
        }//Fin Mientras
        salida = salida + palabraInvertida;
        return salida.trim();
    }//Fin Metodo
}//Fin Clase