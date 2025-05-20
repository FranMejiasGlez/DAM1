
import java.util.GregorianCalendar;

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Saltador implements Comparable {
    //Atributos

    private int dorsal;
    private String nombre;
    private String pais;
    private char sexo;
    private double puntos;
    private int numeroSaltos;
    private GregorianCalendar ultimoSalto;
    //Constructores

    public Saltador(int dorsal, String nombre, String pais, char sexo) {

        this.dorsal = dorsal;
        if (nombre.matches("[A-Zaz]+")) {
            this.nombre = nombre;
        }//Fin Si
        if (pais.matches("[A-Zaz]+")) {
            this.pais = pais;
        }//Fin Si
        if (sexo == 'M' || sexo == 'm' || sexo == 'H' || sexo == 'h') {
            this.sexo = sexo;
        }//Fin Si

    }//Fin Constructor
    //Metodos

    public boolean anotarSalto(double[] juez) {
        byte salto;
        double[] listaNota;
        salto = (byte) this.numeroSaltos;
        listaNota = new double[3];
        listaNota[salto] = juez;
        return this.numeroSaltos < 3;
    }

    @Override
    public boolean equals(Object o) {
    }

    @Override
    public String toString() {
        return this.dorsal + " * " + this.nombre + " * " + this.pais
                + " * " + this.sexo + " Saltos: " + this.numeroSaltos
                + " * Puntos: " + this.puntos + " * " + this.ultimoSalto;
    }//Fin Metodo

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the dorsal
     */
    public int getDorsal() {
        return this.dorsal;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return this.pais;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return this.sexo;
    }

    /**
     * @return the puntos
     */
    public double getPuntos() {
        return this.puntos;
    }

    /**
     * @return the numeroSaltos
     */
    public int getNumeroSaltos() {
        return this.numeroSaltos;
    }

    /**
     * @return the ultimoSalto
     */
    public GregorianCalendar getUltimoSalto() {
        return this.ultimoSalto;
    }//Fin Metodo

    public String getFecha() {
        //Entorno
        int dia, mes, anio;
        //Algoritmo
        dia = this.getUltimoSalto().get(GregorianCalendar.DAY_OF_MONTH);
        mes = this.getUltimoSalto().get(GregorianCalendar.MONTH) + 1;
        anio = this.getUltimoSalto().get(GregorianCalendar.YEAR);
        return "Fecha: " + dia + "/" + mes + "/" + anio;
    }//Fin Metodo
}//Fin Clase

