
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class ListaTelefonos {
    //Atributos

    private List<Persona> listaTelefonos;
    private int nElementos;
    //Constuctores

    public ListaTelefonos() {
        listaTelefonos = new LinkedList<>();
        this.nElementos = 0;

    }//Fin Constructor

    //Metodos
    private void unElementoMas() {
        //Entorno
        //Algoritmo
        this.listaTelefonos.add(null);
        this.nElementos++;

    }//Fin Metodo

    private void unElementoMenos() {
//        Persona[] aux;
        int i;
        //Algoritmo
        if (!this.listaTelefonos.isEmpty()) {
            for (i = 0; i < this.listaTelefonos.size(); i++) {
                if (this.listaTelefonos.get(i) == null) {
                    this.listaTelefonos.remove(i);
                }//Fin  Si
            }//Fin Para
        }//Fin Si
    }//Fin Metodo

    public void aniadir(Persona p) {
        //Entorno
        //Algoritmo
        this.unElementoMas();
        this.listaTelefonos.set(this.listaTelefonos.size() - 1, p);
    }//Fin Metodo

    public boolean eliminar(long tel) {
        //Entorno
        boolean haSidoEliminado;
        int i;
        //Algoritmo
        haSidoEliminado = false;
        for (i = 0; i < this.listaTelefonos.size(); i++) {
            if (this.listaTelefonos.get(i).obtenerTelefono() == tel) {
                this.listaTelefonos.set(i, null);
                this.unElementoMenos();
                haSidoEliminado = true;
            }//Fin Si
        }//Fin Para
        return haSidoEliminado;
    }//Fin Metodo

    public int buscar(String str, int pos) {
        //Entorno
        int posicion;
        //Algoritmo
        posicion = -1;
        while (pos < this.listaTelefonos.size()
                && !this.listaTelefonos.get(pos).obtenerNombre().equals(str)) {
            pos++;
        }//Fin Mientras
        if (pos < this.listaTelefonos.size()
                && this.listaTelefonos.get(pos).obtenerNombre().equals(str)) {
            posicion = pos;
        }//Fin Si
        return posicion;
    }//Fin Metodo
    //GetterSetters

    public int longitud() {
        return this.listaTelefonos.size();
    }//Fin Getter

    public Persona valorEn(int pos) {
        //Entorno
        Persona p;
        //Algoritmo
        p = null;
        if (pos < this.nElementos || pos > this.nElementos) {
            System.out.println("Indice fuera de rango");
        } else {
            p = this.listaTelefonos.get(pos);
        }//Fin Si


        return p;

    }//Fin Getter

    public void ponerValorEn(int pos, Persona p) {
        //Algoritmo
        if (pos < this.listaTelefonos.size() || pos > this.listaTelefonos.size()) {
            System.out.println("Indice fuera de rango");
        } else {
            this.listaTelefonos.set(pos, p);
        }//Fin Si

    }//Fin Setter
}//Fin Clase
