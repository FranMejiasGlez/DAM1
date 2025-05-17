
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Mejias Gonzalez Francisco
 * @author Jiménez Fuentes Pablo
 */
public class Cola {
    //Atributos
    //@author Mejias Gonzalez Francisco
    private Queue<Mensaje> tCola;
    //Constructores
    //@author Jiménez Fuentes Pablo
    public Cola() {
        tCola = new LinkedList<>();
    }//Fin Constructor
    //Metodos
    //@author Mejias Gonzalez Francisco
    public void meterEnCola(Object obj) {
        //Entorno
        Mensaje msg;
        //Algoritmo
        if (obj instanceof Mensaje) {
            msg = (Mensaje) obj;
            this.tCola.offer(msg);
        }//Fin Si

    }//Fin Metodo
    //@author Jiménez Fuentes Pablo
    public Object sacarDeCola() {
        //Entorno
        Mensaje msg;
        //Algoritmo
        msg = this.tCola.poll();
        return msg;
    }//Fin 
    //@author Mejias Gonzalez Francisco
    public boolean esColaVacia() {
        return this.tCola.isEmpty();
    }//Fin Metodo
}//Fin Clase

