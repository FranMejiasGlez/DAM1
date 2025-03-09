
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Act7Cad {

    public static void main(String[] args) {
        //Entorno
        String cadena, diccionarioPares, contadorPares, par;
        int i, j, contadorAparicion;
        //Algoritmo
        cadena = "Hola que tal la ola";
        cadena = cadena.trim().toLowerCase();
        i = 0;
        contadorAparicion = 1;
        diccionarioPares = "";
        par = "";
        while (i < cadena.length() - 1) {
            par = cadena.substring(i, i + 2);
            System.out.println(par);
            //Si el par no contiene espacio
            if (par.indexOf(' ') == -1 && diccionarioPares.indexOf(par) == -1) {
                j=i+1;
                while (cadena.indexOf(par, j) != -1) {
                    contadorAparicion++;
                 j = cadena.indexOf(par, j)+1 ;
                }//Fin Mientras
                 System.out.println(par + " aparece " + contadorAparicion 
                         + " veces");
                 contadorAparicion = 1;
                 diccionarioPares = diccionarioPares + par + ';';
                 System.out.println(diccionarioPares);
            }//Fin Si 
                i++;
        }//Fin Mientras
    
    }//Fin Programa
}

