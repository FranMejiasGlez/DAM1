/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Act3Cad {

    public static String inviertePalabra(String palabra) {
        String cadenaInvertida;
        cadenaInvertida = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            cadenaInvertida = cadenaInvertida + palabra.substring(i, i + 1);
        }//Fin Para
        return cadenaInvertida;
    }//Fin Modulo

    public static void main(String[] args) {
        //Entorno
        String cadena, cadenaInvertida, palabra;
        //Algoritmo
        System.out.println("Introduzca una frase");
        cadena = Leer.dato();
        cadena=cadena.trim();
        cadenaInvertida = "";
        while (cadena.indexOf(' ') != -1){
            //Busca la primera palabra
            palabra = cadena.substring(0, cadena.indexOf(' ')); 
            //Construccion de la cadena invertida
            cadenaInvertida = cadenaInvertida + inviertePalabra(palabra) + " "; 
            //Reemplaza la primera palabra y el espacio con vacio
            cadena = cadena.replaceAll(cadena.substring(0, cadena.indexOf(' ') 
                    + 1), ""); 
        }//Fin Mientras
        cadenaInvertida = cadenaInvertida + inviertePalabra(cadena); 
        System.out.println(cadenaInvertida.trim());
    }//Fin Programa
}
