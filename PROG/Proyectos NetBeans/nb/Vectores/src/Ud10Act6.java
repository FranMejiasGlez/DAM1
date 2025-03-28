
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Ud10Act6 {

    public static void main(String[] args) {
        //Entorno
        int numero, mayor, posicion;
        int[] tabla;
        String salida, posiciones;
        //Algoritmo
        tabla = new int[5];
        do {
            System.out.println("Introduce numero entero: ");
            numero = Leer.datoInt();
            tabla[0] = numero;
        } while (numero <= 0);//Fin Repetir
        salida = tabla[0] + "";
        mayor = tabla[0];
        posicion = 0;

        for (int i = 1; i < tabla.length; i++) {
            do {
                System.out.println("Introduce numero entero: ");
                numero = Leer.datoInt();
                tabla[i] = numero;
            } while (numero <= 0);//Fin Repetir
            salida = salida + "-" + tabla[i];
            if (tabla[i] > mayor) {
                mayor = tabla[i];
                posicion = i;
            }//Fin Si
        }//Fin Para     
        posiciones = "";
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == mayor) {
                posiciones = posiciones + "-" + i;
            }//Fin Si
        }//Fin Para

        System.out.println("Tabla: " + salida);
        System.out.println("Mayor: " + mayor);
        System.out.println("Posiciones del mayor: " + posiciones);
    }//Fin Programa
}
