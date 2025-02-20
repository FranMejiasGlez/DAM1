/**
 *
 * @author Francisco Mejias
 */
public class ProbarFunciones {
    public static void main(String[] args){
    //Entorno:
        int numero;
        byte posicion,dia,mes,numeroMes;
        short anio;
        char caracter;
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
        } while (posicion < 1||posicion >=127);
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
        //Probar Funcion: esFechaValida
        do{
            System.out.println("Dia: ");
            dia=(byte)Leer.datoShort();
        }while(dia <=0 || dia >=127);
        System.out.println("Mes: ");
        do{
            mes=(byte)Leer.datoShort();
        }while(dia <=0 || dia >=127);
        System.out.println("Año: ");
        anio=Leer.datoShort();
        if(Utilidades.esFechaValida(dia,mes,anio)){
            System.out.println("Es fecha valida");
        }else{
            System.out.println("Es fecha invalida");
        }
        //Probar Funcion: invierte
        System.out.println("Numero: ");
        numero=Leer.datoInt();
        System.out.println("El numero invertido es: "
                +Utilidades.invierte(numero));
       //Probar Funcion: continuar
        do{
            System.out.println("¿Continuar?: S/N");
            caracter=Leer.datoChar();
        }while(caracter !='s'&& caracter!='S'&& caracter 
                !='n'&& caracter !='N');    
        if (Utilidades.continuar(caracter)){
            System.out.println("El programa de pruebas de funciones"
                    + " continuara");
        }else{
            System.out.println("El programa de pruebas de funciones "
                    + "no continuara");
        }
        //Probar Funcion: nombreMes
      //  System.out.println("Introduzca un mes en formato numero: ");
        //numeroMes=(byte)Leer.datoShort();
       // System.out.println(Utilidades.nombreMes(numeroMes));
    }//Fin Programa
}
