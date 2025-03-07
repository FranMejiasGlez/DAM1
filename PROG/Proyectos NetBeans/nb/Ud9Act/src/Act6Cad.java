
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Act6Cad {

    public static String descifraPalabra(String palabra, int clave) {
        //Entorno:

        String palabraDescifrada;
        //Algoritmo:
        palabraDescifrada = "";
        for (int i = 0; i <= palabra.length() - 1; i++) {
            palabraDescifrada = palabraDescifrada + (char) (palabra.charAt(i)
                    - clave);
        }//Fin Para
        return palabraDescifrada;
    }//Fin Metodo

    public static void main(String[] args) {
        //Entorno:
        String cadena, palabra, cadenaDescifrada;
        int clave;
        //Algoritmo:
        System.out.println("Introduce un texto para Descifrar: ");
        cadena = Leer.dato();
        System.out.println("Introduce el valor de la clave: ");
        clave = Leer.datoInt();
        cadena = cadena.trim() + " ";
        cadenaDescifrada = "";
         while (cadena.indexOf(' ') != -1) {
            palabra = cadena.substring(0, cadena.indexOf(' ')); 
            cadenaDescifrada = cadenaDescifrada 
                    + descifraPalabra(palabra, clave) + " ";
            cadena = cadena.substring(cadena.indexOf(' ') + 1); 
        }//Fin Mientras
        System.out.println(cadenaDescifrada);
    }//Fin Programa
}
