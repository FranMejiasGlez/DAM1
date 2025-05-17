
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Cola {
    //Atributos

    private Queue<Mensaje> tCola;
    //Constructores

    public Cola() {
        tCola = new LinkedList<>();
    }//Fin Constructor
    //Metodos

    public void meterEnCola(Object obj) {
        //Entorno
        Mensaje msg;
        //Algoritmo
        if (obj instanceof Mensaje) {
            msg = (Mensaje) obj;
            this.tCola.offer(msg);
        }//Fin Si

    }//Fin Metodo

    public Object sacarDeCola() {
        //Entorno
        Mensaje msg;
        //Algoritmo
        msg = this.tCola.poll();
        return msg;
    }//Fin 

    public boolean esColaVacia() {
        return this.tCola.isEmpty();
    }//Fin Metodo
}//Fin Clase

