
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Ud10Act7 {

    public static void main(String[] args) {
        //Entorno
        int numero, i;
        int[] tabla = {7, 8, 3, 0, 33};
        char continuar;
        //Algoritmo
        do {
            System.out.println("Que numero quieres consultar?: ");
            numero = Leer.datoInt();
            i = 0;
            while (tabla[i] != numero && i < tabla.length - 1) {
                i++;
            } //Fin Mientras
            if (tabla[i] == numero) {
                System.out.println("Posicion: " + i);
            } else {
                System.out.println("No se ecuentra el numero: " + numero);
            }//FIn Si
            do {
                System.out.println("¿Quieres continuar?: S/N");
                continuar = Leer.datoChar();
            } while (continuar != 's' && continuar != 'S' 
                    && continuar != 'n' && continuar != 'N');
        } while (continuar == 'S' || continuar == 's');
    }//Fin Programa
}
