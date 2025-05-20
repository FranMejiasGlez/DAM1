
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Clasificacion implements Iterable<Saltador> {
    //Atributos

    private List<Saltador> lista;
    //Constructores

    public Clasificacion() {
        lista = new LinkedList<>();
    }//Fin Constructor
    //Metodos

    public boolean haySaltador() {
        return !this.lista.isEmpty();
    }//Fin Metodo

    public Saltador buscar(int dorsal) {
        //Entorno
        byte i, posicion;
        //Algoritmo
        i = 0;
        posicion = -1;
        while (i < this.lista.size() && lista.get(i).getDorsal() != dorsal) {
            i++;
        }//Fin Mientras
        if (lista.get(i).getDorsal() == dorsal) {
            posicion = i;
        }//Fin Si
        return this.lista.get(posicion);
    }//Fin Metodo

    public boolean aniadir(Saltador s) {
        return this.lista.add(s);
    }//Fin Metodo

    public boolean borrar(int dorsal) {
        return this.lista.remove(this.buscar(dorsal));
    }//Fin Metodo

    public double getPuntosPais(String comunidad, char sexo) {
        //Entorno
        double puntosPais;
        byte i;
        //Algoritmo
        puntosPais = 0;
        for (i = 0; i < lista.size(); i++) {
            if (lista.get(i).getPais().equals(comunidad) && lista.get(i).getSexo() == sexo) {
                puntosPais = lista.get(i).getPuntos() + puntosPais;
            }//Fin Si
        }//Fin Para
        return puntosPais;
    }//Fin Metodo

    public ordena() {
    }//Fin Metodo

    @Override
    public Iterator<Saltador> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}//Fin Clase
