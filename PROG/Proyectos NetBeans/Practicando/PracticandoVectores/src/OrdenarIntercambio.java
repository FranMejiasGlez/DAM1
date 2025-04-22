
/**
 * METODO DE ORDEN POR INTERCAMBIO
 *
 * @author Mejias GOnzalez Francisco
 */
public class OrdenarIntercambio {

    public static void main(String[] args) {
        //Entorno
        int[] tabla = {5, 10, 8, 22, 1, 12, 15};
        int posicionMenor, aux;
        //Algoritmo
        //BUSQUEDA DEL ELEMENTO MAS PEQUEÑO
        for (int paso = 0; paso < tabla.length - 1; paso++) {
            posicionMenor = paso;
            for (int j = paso + 1; j < tabla.length; j++) {
                if (tabla[j] < tabla[posicionMenor]) {
                    posicionMenor = j;
                }//Fin Si
            }//Fin Para
            aux = tabla[paso];
            tabla[paso] = tabla[posicionMenor];
            tabla[posicionMenor] = aux;
        }//Fin Para
        for (int muestra = 0; muestra < tabla.length; muestra++) {
            System.out.println(tabla[muestra]);
        }//Fin Para
    }//Fin Programa
}
