
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Utilidades {

    public static byte cifras(int numero) {
        //Entorno:
        byte cifras;
        //Algoritmo:
        cifras = 1;
        while (numero >= 10) {
            numero = numero / 10;
            cifras++;
        }//Fin Mientras
        return cifras;
    }//Fin Funcion

    public static byte sacaDigito(int numero, byte posicion) {
        //Entorno:
        byte digitos, j, resultado;
        int auxiliar;
        //Algoritmo:
        digitos = 1;
        auxiliar = numero;
        while (numero >= 10) {
            numero = (int) numero / 10;
            digitos++;
        }//Fin Mientras
        j = (byte) (digitos - posicion);
        resultado = (byte) (auxiliar / Math.pow(10, j) % 10);
        return resultado;
    }//Fin Funcion

    public static boolean esBisiesto(short anio) {
        //Entorno:
        boolean bisiesto;
        //Algoritmo:
        return bisiesto = anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0;
    }//Fin Funcion

    public static boolean esFechaValida(byte dia, byte mes, short anio) {
        //Entorno:
        boolean esValido;
        byte max;
        //Algoritmo:
        esValido = false;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                max = 31;
                if (dia <= max) {
                    esValido = true;
                    break;
                }//Fin Si
            case 4:
            case 6:
            case 9:
            case 11:
                max = 30;
                if (dia <= max) {
                    esValido = true;
                }
                break;
            case 2:
                max = 29;
                if (Utilidades.esBisiesto(anio)) {
                    if (dia <= max) {
                        esValido = true;
                    }
                } else {
                    max = 28;
                    if (dia <= max) {
                        esValido = true;
                    }
                }
                break;
        }//Fin Segun Sea
        return esValido;
    }//Fin Funcion

    public static int invierte(int numero) {
        //Entorno:
        int invertido;
        byte cifras;
        //Algoritmo:
        invertido = 0;
        cifras = cifras(numero);
        while (numero != 0) {
            if (numero % 10 != 0) {
                invertido = invertido * 10 + numero % 10;
                numero = numero / 10;
            }//Fin Si
        }//Fin Mientras
        return invertido;
    }//Fin Funcion

    public static boolean continuar() {
        //Entorno:
        char caracter;
		boolean esContinuar;
        //Algoritmo:
		esContinuar=false;
        do {
            System.out.println("Continuar? S/N: ");
            caracter = Leer.datoChar();
        } while (caracter != 's' && caracter != 'S' && caracter != 'n' && caracter != 'N');
		if(caracter =='s' || caracter =='S'){
			esContinuar=true;
		}//Fin Si
		return esContinuar;
    }//Fin Funcion

    public static void nombreMes(byte numero) {

        //Entorno
        //Algoritmo
        switch (numero) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("No existe Mes");
        }//Fin Segun Sea
    }//Fin Funcion

    public static boolean esCapicua(int numero) {
        //Entorno
        boolean esCapicua;
        byte cifraFinal, i;
        //Algoritmo
        i = 1;
        cifraFinal = cifras(numero);
        esCapicua = true;
        do {

            if (sacaDigito(numero, i) != sacaDigito(numero, cifraFinal)) {
                esCapicua = false;
            } else {
                i++;
                cifraFinal--;
            }
        } while (i < cifraFinal && esCapicua);
        return esCapicua;
    }//Fin Funcion
}//Fin Libreria
