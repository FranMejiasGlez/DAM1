/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Prueba {

    public static byte LeeByte() {
        //Entorno:
        short digito;
        //Algoritmo:
        System.out.println("digito:");
        digito = Leer.datoShort();
        while (digito < -128 || digito > 127) {
            System.out.println("Dato no valido, teclee otro:");
        }
        return (byte) digito;
    }//Fin Funcion

    public static int indexaDigito(int numero, byte digito) {
        //Entorno:
        int indexado;
        byte cifras;
        //Algoritmo:
        cifras = Utilidades.cifras(numero);
        indexado = (int) (digito * Math.pow(10, cifras) + numero);
        return indexado;
    }//Fin Funcion

    public static int anexaDigito(int numero, byte digito) {
        //Entorno:
        int anexado;
        //Algoritmo:
        anexado = numero * 10 + digito;
        return anexado;
    }//Fin Funcion

    public static boolean esPrimo(int numero) {
        boolean esPrimo = true; // Suponemos que el número es primo

        if (numero < 2) {
            esPrimo = false; // 0 y 1 no son primos
        } else {
            int raiz = (int) Math.sqrt(numero);
            for (int i = 2; i <= raiz; i++) {
                if (numero % i == 0) {
                    esPrimo = false; // Encontramos un divisor, ya no es primo
                }//Fin Si
            }//Fin Para
        }//Fin Si

        return esPrimo;
    }//Fin Funcion

    public static void main(String[] args) {
        //Entorno:
        byte digito;
        int numero, numeroIndexado, numeroAnexado, numeroMayor, numeroMenor;
        char caracter;
        boolean continuar;
        //Algoritmo:
        continuar = true;
        do {
            digito = Prueba.LeeByte();
            System.out.println("Numero: ");
            numero = Leer.datoShort();
            numeroIndexado = Prueba.indexaDigito(numero, digito);
            System.out.println(numeroIndexado);
            numeroAnexado = Prueba.anexaDigito(numero, digito);
            System.out.println(numeroAnexado);

            if (numeroAnexado > numeroIndexado) {
                numeroMayor = numeroAnexado;
                numeroMenor = numeroIndexado;
            } else {
                numeroMenor = numeroAnexado;
                numeroMayor = numeroIndexado;
            }//Fin Si
            System.out.println("Numero Mayor: " + numeroMayor);
            System.out.println("Numero Menor: " + numeroMenor);
            System.out.println("Numeros Primos entre ellos: ");
            for (int i = numeroMenor; i <= numeroMayor; i++) {
                if (esPrimo(i)) {
                    System.out.println(i);
                }//Fin Si
            }//Fin Para
             continuar = Utilidades.continuar();
        }while(continuar);
    }//Fin Programa
}
