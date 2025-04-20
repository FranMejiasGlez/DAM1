package ejercicio4;


/**
 *
 * @author Mejias Gonzalez Francisco
 */
public abstract class Disco {
    //Atributos

    private String codigo;
    private String sello;
    private String autor;
    //Constructores

    public Disco(String codigo, String sello, String autor) {
        this.codigo = codigo;
        this.autor = autor;
        this.sello = sello;
    }//Fin Constructor

    //Metodos
    public boolean esCodigoUnico(String codigo) {
        //Entorno
        boolean esCorrecto;
        //Algoritmo
        return esCorrecto = this.getCodigo().equals(codigo);
    }//Fin Metodo

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the sello
     */
    public String getSello() {
        return sello;
    }

    /**
     * @param sello the sello to set
     */
    public void setSello(String sello) {
        this.sello = sello;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
}//Fin Clase
