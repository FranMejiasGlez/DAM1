
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Act8Cad {

    public static void main(String[] args) {
        //Entorno
        String cadena, rotacion;
        int j;
        //Algoritmo
        cadena = "HOLA";
        cadena = cadena.trim().toLowerCase();
        rotacion = "";
        for (int i = 0; i <= cadena.length(); i++) { 
            rotacion = cadena.substring(cadena.length() - i, cadena.length())
                    + cadena.substring(0, cadena.length() - i);
            System.out.println(rotacion);
        }//Fin Para
    }//Fin Programa
}
