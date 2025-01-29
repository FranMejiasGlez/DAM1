/**
 *
 * @author Francisco Mejias
 */
public class ProbarFunciones {
    public static void main(String[] args){
    //Entorno:
        int numero;
        byte posicion;
    //Algoritmo:
        //Probar la funcion: cifras 
        System.out.println("Numero: ");
        numero=Leer.datoInt();
        System.out.println("El numero de cifras es : "
                +Utilidades.cifras(numero));
        //Probar funcion: sacarDigito
        do {
            System.out.println("Numero:");
            numero = Leer.datoInt();
        } while (numero < 0);
        do {
            System.out.println("Posicion: ");
            posicion =(byte)Leer.datoShort();
        } while (posicion < 1);
        System.out.println("El digito es: "
                +Utilidades.sacarDigito(numero, posicion));
    }//Fin Programa
}
