
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

    public static short indexaDigito(short numero, byte digito) {
        //Entorno:
        short indexado;
        byte cifras;
        //Algoritmo:
        cifras = Utilidades.cifras(numero);
        indexado = (short) (digito * Math.pow(10, cifras) + numero);
        return indexado;
    }//Fin Funcion

    public static short anexaDigito(short numero, byte digito) {
        //Entorno:
        short anexado;
        //Algoritmo:
        anexado = (short) (numero * 10 + digito);
        return anexado;
    }//Fin Funcion

    public static void main(String[] args) {
        //Entorno:
        byte digito, contador;
        short numero, numeroA, numeroB, auxiliar;
        char caracter;
        //Algoritmo:
        do {
            digito = Prueba.LeeByte();
            System.out.println("Numero: ");
            numero = Leer.datoShort();
            numeroA = Prueba.indexaDigito(numero, digito);
            System.out.println(numeroA);
            numeroB = Prueba.anexaDigito(numero, digito);
            System.out.println(numeroB);
            //ORDENAR NUMEROS DE MENOR A MAYOR
            if (numeroA > numeroB) {
                auxiliar = numeroA;
                numeroA = numeroB;
                numeroB = auxiliar;
                System.out.println("Menor: " + numeroA + " , Mayor: " + numeroB);
            } else {
                System.out.println("Menor: " + numeroA + " , Mayor: " + numeroB);
            }//Fin Si
            //BUSCAR PRIMOS ENTRE ELLOS
            System.out.println("Primos entre los dos numeros: ");
            do {  
                contador = 2;
                do {
                    if (numeroA % contador == 0) {
                        numeroA++;
                    } else {
                        contador++;
                    }//Fin Si
                } while (contador != (byte) Math.sqrt(numeroA));
                System.out.println(numeroA);
                numeroA++;
            } while (numeroA < numeroB);
            //PREGUNTA: ¿CONTINUAR?
            System.out.println("Continuar? S/N: ");
            caracter = Leer.datoChar();
        } while (Utilidades.continuar(caracter) == true);
    }//Fin Programa
}
