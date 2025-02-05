
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Prueba {
    
    public static short indexarDigito(short numero, byte digito){
        //Entorno:
        short anexo;
        byte cifras;
        //Algorimo:
        cifras = (byte) (Utilidades.cifras(numero));
        anexo = (short) (digito * Math.pow(10, cifras));
        anexo = (short) (numero + anexo);
        return anexo;
    }//Fin Funcion

    public static short anexarDigito(short numero, byte digito) {
        //Entorno:
        short anexo;
        //Algoritmo:
        anexo = (short) (10 * numero);
        anexo = (short) (anexo + digito);
        return anexo;
    }//Fin Funcion

    public static void main(String[] args) {
        //Entorno:
        byte digito, divisores, contador;
        char caracter;
        short numero, numeroIndexado, numeroAnexado, numeroMenor, numeroMayor,
                auxiliar;
        //Algoritmo:
        //Programa 1: Indexar digito al principio de un numero dado
        //(entero positivo)
        System.out.println("Programa 1: Indexar digito al principio de"
                + " un numero dado (entero positivo)");
        do {
            do {
                System.out.println("Digito: ");
                digito = (byte) Leer.datoShort();
            } while (digito < 0 || digito > 9);
            do {
                System.out.println("Numero: ");
                numero = Leer.datoShort();
            } while (numero < 0);
            numeroIndexado = Prueba.indexarDigito(numero, digito);
            numeroAnexado = Prueba.anexarDigito(numero, digito);
            numeroMayor=numeroIndexado;
            numeroMenor=numeroAnexado;
            //Ordenar numeros
            if (numeroIndexado < numeroAnexado) {
                auxiliar = numeroAnexado;
                numeroMayor = numeroAnexado;
                numeroMenor = numeroIndexado;
            } else {
                if (numeroIndexado > numeroAnexado) {
                    numeroMenor = numeroAnexado;
                    numeroMayor = numeroIndexado;
                }
            }//Fin Si
            divisores = 2;
            contador = 1;
            do {
                if (numeroIndexado % contador == 0) {
                    divisores++;
                    System.out.println(" " + contador + " ");
                } else {
                    contador++;
                }
            } while (contador <= numeroMayor);
            System.out.println("¿Continuar? S/N: ");
            caracter = Leer.datoChar();
        } while (caracter != 'n' && caracter != 'N');

    }//Fin Programa
}
