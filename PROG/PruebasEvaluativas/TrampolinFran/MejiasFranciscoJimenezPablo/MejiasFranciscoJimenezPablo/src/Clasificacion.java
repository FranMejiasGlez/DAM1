
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mejias Gonzalez Francisco
 * @author Jimenez Fuentes Pablo Aunque hay metodos que hemos hecho por
 * separado, hemos revisado todo juntos.
 */
public class Clasificacion implements Iterable<Saltador> {
    //Atributos

    private List<Saltador> lista;
    //Constructores

    /**
     *
     * @author Jimenez Fuentes Pablo
     *
     */
    public Clasificacion() {
        lista = new LinkedList<>();
    }//Fin Constructor
    //Metodos

    /**
     *
     * @author Mejias Gonzalez Francisco
     *
     */
    public boolean haySaltador() {
        return !this.lista.isEmpty();
    }//Fin Metodo

    /**
     *
     * @author Jimenez Fuentes Pablo
     *
     */
    public Saltador buscar(int dorsal) {
        //Entorno
        Iterator<Saltador> iterador;
        Saltador encontrado, s;
        //Algoritmo
        encontrado = null;
        iterador = this.lista.iterator();
        while (iterador.hasNext()) {
            s = iterador.next();
            if (s.getDorsal() == dorsal) {
                encontrado = s;
            }//Fin Si
        }//Fin Mientras

        return encontrado;
    }//Fin Metodo

    /**
     *
     * @author Mejias Gonzalez Francisco
     *
     */
    public boolean aniadir(Saltador s) {
        //Entorno
        boolean aniadido;
        //Algoritmo
        aniadido = false;
        if (this.buscar(s.getDorsal()) == null) {
            this.lista.add(s);
            aniadido = true;
        }//Fin Si
        return aniadido;
    }//Fin Metodo

    /**
     *
     * @author Mejias Gonzalez Francisco
     *
     */
    public boolean borrar(int dorsal) {
        return this.lista.remove(this.buscar(dorsal));
    }//Fin Metodo

    /**
     *
     * @author Jimenez Fuentes Pablo
     *
     */
    public double getPuntosPais(String comunidad, char sexo) {
        //Entorno
        double puntosPais, totalSaltadores, media;
        Iterator<Saltador> iterador;
        //Algoritmo
        iterador = this.lista.iterator();
        puntosPais = 0;
        totalSaltadores = 0;
        Saltador s;
        while (iterador.hasNext()) {
            s = iterador.next();
            if (s.getPais().equals(comunidad) && s.getSexo() == sexo) {
                puntosPais = s.getPuntos() + puntosPais;
                totalSaltadores++;
            }//Fin Si
        }//Fin Mientras
        media = puntosPais / totalSaltadores;
        return media;
    }//Fin Metodo

    /**
     *
     * @author Jimenez Fuentes Pablo
     *
     */
    public void ordena() {
        if (this.haySaltador()) {
            Collections.sort(this.lista);
        }//Fin Si
    }//Fin Metodo

    /**
     *
     * @author Mejias Gonzalez Francisco
     *
     */
    @Override
    public Iterator<Saltador> iterator() {
        return lista.iterator();
    }//Fin Metodo
}//Fin ClaseS
