
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Prueba {
    public static byte LeeByte(){
        //Entorno:
            short digito;
        //Algoritmo:
            System.out.println("digito:");
            digito=Leer.datoShort();
            while(digito <-128 || digito >127){
                System.out.println("Dato no valido, teclee otro:");  
            }
            return (byte)digito;
    }//Fin Funcion
    public static short indexaDigito(short numero,byte digito){
        //Entorno:
            short indexado;
            byte cifras;
        //Algoritmo:
            cifras=Utilidades.cifras(numero);
            indexado=(short)(digito*Math.pow(10,cifras)+numero);  
            return indexado;
    }//Fin Funcion
    public static short anexaDigito(short numero,byte digito){
        //Entorno:
            short anexado;
        //Algoritmo:
            anexado=(short)(numero*10+digito);  
            return anexado;
    }//Fin Funcion
    public static void main(String[] args) {
    //Entorno:
         byte digito;
         short numero,numeroIndexado,numeroAnexado;
         char caracter;
    //Algoritmo:
         do{
            digito=Prueba.LeeByte();
            System.out.println("Numero: ");
            numero=Leer.datoShort();
            numeroIndexado=Prueba.indexaDigito(numero, digito);
            System.out.println(numeroIndexado);
            numeroAnexado=Prueba.anexaDigito(numero, digito);
            System.out.println(numeroAnexado);
            System.out.println("Continuar? S/N: ");
            caracter=Leer.datoChar();
         }while(Utilidades.continuar(caracter)==true);
         
    }//Fin Programa
}
