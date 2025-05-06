
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
        listaTelefonos = new linkedList<>();
        this.nElementos = 0;
    }//Fin Constructor

    //Metodos
    private void unElementoMas(Persona[] listaActual) {
        //Entorno
        Persona[] aux;
        //Algoritmo

        aux = new Persona[this.longitud() + 1];
        for (int indice = 0; indice < listaActual.length; indice++) {
            aux[indice] = listaActual[indice];
        }//Fin Para
        this.listaTelefonos = aux;
        this.nElementos = this.listaTelefonos.length;
    }//Fin Metodo

    private void unElementoMenos(Persona[] listaActual) {
        Persona[] aux;
        //Algoritmo
        if (this.longitud() != 0) {
            aux = new Persona[this.nElementos - 1];
            int j = 0;
            for (int i = 0; i < listaActual.length; i++) {
                if (listaActual[i] != null) {
                    aux[j] = listaActual[i];
                    j++;
                }//FIn SI
            }//Fin Para
            this.listaTelefonos = aux;
            this.nElementos = this.listaTelefonos.length;
        }//Fin Si

    }//Fin Metodo

    public void aniadir(Persona p) {
        //Entorno
        //Algoritmo
        this.unElementoMas(this.listaTelefonos);
        this.listaTelefonos[this.nElementos - 1] = p;
    }//Fin Metodo

    public boolean eliminar(long tel) {
        //Entorno
        boolean haSidoEliminado;
        int i;
        //Algoritmo
        haSidoEliminado = false;
        for (i = 0; i < this.listaTelefonos.length; i++) {
            if (this.listaTelefonos[i].obtenerTelefono() == tel) {
                this.listaTelefonos[i] = null;
                this.unElementoMenos(this.listaTelefonos);
                haSidoEliminado = true;
            }//Fin Si
        }//Fin Para

        return haSidoEliminado;
    }//Fin Metodo

    public int buscar(String str, int pos) {
        //Entorno
        int posicion, i;
        //Algoritmo
        posicion = -1;
        while (pos < this.listaTelefonos.length
                && !this.listaTelefonos[pos].obtenerNombre().equals(str)) {
            pos++;
        }//Fin MIentras
        if (pos < this.listaTelefonos.length
                && this.listaTelefonos[pos].obtenerNombre().equals(str)) {
            posicion = pos;
        }//Fin Si
        return posicion;
    }//Fin Metodo
    //GetterSetters

    public int longitud() {
        return this.nElementos;
    }//Fin Getter

    public Persona valorEn(int pos) {
        //Entorno
        //Algoritmo

        if (pos < this.nElementos || pos > this.nElementos) {
            System.out.println("Indice fuera de rango");
        }//Fin Si


            return this.listaTelefonos[pos];
        
    }//Fin Getter

    public void ponerValorEn(int pos, Persona p) {
        //Algoritmo
        if (pos < this.nElementos || pos > this.nElementos) {
            System.out.println("Indice fuera de rango");
        } else {
            this.listaTelefonos[pos] = p;
        }//Fin Si

    }//Fin Setter
}//Fin Clase
