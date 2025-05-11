
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class FrecuenciaPalabra {
    //atributos

    private List<Palabra> listaPalabras;
    private int numPalabras = 0;
    //Constructores

    public FrecuenciaPalabra() {
        this.listaPalabras = new LinkedList<>();
        this.numPalabras = 0;
    }//Fin Constructor
    //Metodos

    /**
     * Añade un elemento mas a la lista
     */
    private void unaPalabraMas() {
        //Entorno
        //Algoritmo
        this.listaPalabras.add(null);
        this.numPalabras++;
    }//Fin Metodo

    private void insertarPalabra(Palabra p) {
        this.listaPalabras.set(this.listaPalabras.size() - 1, p);
    }//Fin Metodo

    public void cuentaPalabra(String cad) {
        //Entorno
        int siguiente, espacio;
        Palabra p;
        String palabra;
        //Algoritmo
        siguiente = 0;
        espacio = cad.indexOf(" ");
        //Busca las palabras
        while (espacio != -1) {
            palabra = cad.substring(siguiente, espacio);
            siguiente = espacio + 1;
            espacio = cad.indexOf(" ", siguiente);
            //Si existe la palabra en la lista incrementa
            if (buscarPalabra(palabra) != -1) {
                this.listaPalabras.get(buscarPalabra(palabra)).incrementaFrecuencia();
                //Si no existe crea palabra y aumenta lista e inserta
            } else {
                p = new Palabra(palabra);
                unaPalabraMas();
                insertarPalabra(p);
            }//Fin Si
        }//Fin Mientras
    }//Fin Metodo

    /**
     * @return
     */
    private int buscarPalabra(String cad) {
        //entorno
        int salida, i;
        //algoritmo
        salida = -1;
        i = 0;
        //Busco la palabra pasada por parametro
        while (i < this.listaPalabras.size()
                && !cad.equals(this.listaPalabras.get(i).obtenerPalabra())) {
            i++;
        }//FIN MIENTRAS
        //Si es igual a la palabra en la lista en i posicion
        if (i < this.listaPalabras.size()
                && cad.equals(this.listaPalabras.get(i).obtenerPalabra())) {
            salida = i;
        }//FIN SI

        return salida;
    }//Fin Metodo
    //Getter/Setter

    /**
     * @return El objeto en posicion de la lista
     */
    public Palabra obtenerObjPalabra(int pos) {
        return this.listaPalabras.get(pos);
    }//Fin  Getter

    /**
     * @return El numPalabras
     */
    public int obtenerNumPalabras() {
        return this.listaPalabras.size();
    }//Fin Getter
    /**
     * Cuenta las palabras de la cadena
     */
}//Fin Clase

