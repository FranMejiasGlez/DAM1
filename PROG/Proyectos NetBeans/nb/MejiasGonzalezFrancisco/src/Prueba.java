
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Prueba {

    public static void main(String[] args) {
    //Entorno:
         byte digito,cifras;
         short numero,anexo;
         char caracter;
    //Algoritmo:
        do {
            do {
                System.out.println("Digito: ");
                digito = (byte) Leer.datoShort();
            } while (digito < 0 || digito > 9);
            do {
                System.out.println("Numero: ");
                numero = Leer.datoShort();
            } while (numero < 0);
            cifras=(byte)(Utilidades.cifras(numero));
            anexo=(short)(digito * Math.pow(10,cifras));
            anexo= (short)(numero + anexo);
            System.out.println(anexo);
            System.out.println("¿Continuar? S/N: ");
            caracter = Leer.datoChar();
        } while (caracter != 'n' && caracter != 'N');
    }//Fin Programa
}
