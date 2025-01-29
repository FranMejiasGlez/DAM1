/**
 *
 * @author Francisco Mejias
 */
public class ProbarFunciones {
    public static void main(String[] args){
    //Entorno:
        int numero;
        byte posicion,dia,mes;
        short anio;
    //Algoritmo:
        //Probar Funcion: cifras 
        System.out.println("Numero: ");
        numero=Leer.datoInt();
        System.out.println("El numero de cifras es : "
                +Utilidades.cifras(numero));
        //Probar Funcion: sacarDigito
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
        //Probar Funcion: esBisiesto
        do{
            System.out.println("Año: ");
            anio=Leer.datoShort();
        } while(anio<0);
        if(Utilidades.esBisiesto(anio)){
            System.out.println("Año bisiesto");
        }else{
            System.out.println("Año no bisiesto");
        }//Fin Si
    }//Fin Programa
}
