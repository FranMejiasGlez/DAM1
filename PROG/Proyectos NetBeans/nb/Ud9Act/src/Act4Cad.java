/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Act4Cad {
    
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
        cadena=cadena+" ";
        cadenaInvertida = "";
        do {
            palabra = cadena.substring(0, cadena.indexOf(' '));
            cadenaInvertida = cadenaInvertida + inviertePalabra(palabra) + " ";
            cadena = cadena.replaceAll(cadena.substring(0, cadena.indexOf(' ') + 1), "");
        }while (cadena.indexOf(' ') != -1);
        System.out.println(cadenaInvertida.trim());
    }
}
