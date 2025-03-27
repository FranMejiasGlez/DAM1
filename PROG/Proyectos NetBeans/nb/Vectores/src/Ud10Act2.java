/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Ud10Act2 {

    public static void main(String[] args) {
        //Entorno
        int[] tabla;
        String salida;
        //Algoritmo
        tabla = new int[20];
        tabla[0]=(int)(Math.random()*100);
        salida=tabla[0]+"";
        for (int i = 1; i < tabla.length; i++) {
            tabla[i] =(int)(Math.random()*100);
            salida=salida+"-"+tabla[i];
        }//Fin Para
        System.out.println("Salida final:");
        System.out.println(salida);
        System.out.println();
    }//Fin Programa
}
