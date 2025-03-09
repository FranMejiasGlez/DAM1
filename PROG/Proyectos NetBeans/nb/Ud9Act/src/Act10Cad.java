
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Act10Cad {

    public static void main(String[] args) {
        //Entorno
        String cadena,letra;
        int i,valorCadenaPrinc,valorCadenaFin;
        //Algoritmo
        cadena = "Hola esto es una prueba para contar las letras que tiene esto"
                ;
        cadena = cadena.trim().toLowerCase().replace(" ", "");
        System.out.println(cadena);
        i = 0;
        while (i < cadena.length()-1) {
            valorCadenaPrinc=cadena.length();
            System.out.println(cadena.substring(i, i + 1));
            letra=cadena.substring(i, i + 1);
            cadena = cadena.replaceAll(cadena.substring(i, i + 1), "");
            System.out.println(cadena);
            valorCadenaFin=cadena.length();
            System.out.println("La letra: "+letra+", existe:"
                    +(valorCadenaPrinc-valorCadenaFin)+" veces");
        }//Fin Mientras
    }//Fin Programa
}
