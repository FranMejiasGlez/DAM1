
/**
 *
 * @author Francisco Mejias
 */
public class Ud5Ej20 {

    public static void main(String[] args) {
        //Entorno:
        short a, b, c, aux;
        //Algoritmo:
        System.out.println("Numero 1: ");
        a = Leer.datoShort();
        System.out.println("Numero 2: ");
        b = Leer.datoShort();
        System.out.println("Numero 3: ");
        c = Leer.datoShort();
        if (a < b) {
            aux = b;
            b = a;
            a = aux;
            if (b < c) {
                aux = c;
                c = b;
                b = aux;
                if (a < b) {
                    aux = b;
                    b = a;
                    a = aux;
                }//Fin Si
            }//Fin Si
        }//Fin Si
        System.out.println(a
                + " " + b + " " + c);
    }//Fin Programa
}