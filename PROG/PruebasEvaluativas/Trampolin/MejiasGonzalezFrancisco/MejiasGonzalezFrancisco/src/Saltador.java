
import java.util.GregorianCalendar;

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Saltador implements Comparable<Saltador> {
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
        byte i,j;
        double mayor, menor, media;
        boolean puedeSaltar;
        puedeSaltar = this.numeroSaltos < 3;
        if (puedeSaltar) {
            //Encontrar mayor y menor
            mayor = juez[0];
            menor = juez[0];
            for (i = 1; i < juez.length; i++) {
                if (juez[i] > mayor) {
                    mayor = juez[i];
                } else {
                    if (juez[i] < menor) {
                        menor = juez[i];
                    }//Fin Si
                }//Fin Si
            }//Fin Para
            media=0;
            for (j = 0; j < juez.length; j++) {
                if (juez[j]!=mayor||jues[j]!=menor) {
                    
                }
            }//Fin Para
            return puedeSaltar;
        }//Fin Metodo

        @Override
        public boolean equals
        (Object o
        
            ) {
        //Entorno
        Saltador s;
            boolean igual;
            //Algoritmo
            igual = false;
            if (o instanceof Saltador) {
                s = (Saltador) o;
                igual = this.getDorsal() == s.getDorsal();
            }//Fin Si
            return igual;
        }//Fin Metodo

        @Override
        public String toString
        
            () {
        return this.dorsal + " * " + this.nombre + " * " + this.pais
                    + " * " + this.sexo + " Saltos: " + this.numeroSaltos
                    + " * Puntos: " + this.puntos + " * " + this.ultimoSalto;
        }//Fin Metodo

        @Override
        public int compareTo
        (Saltador s
        
            ) {
        //Entorno
        int num;
            //Algoritmo
            num = this.getPais().compareTo(s.getPais());
            if (num == 0) {
                num = this.getNombre().compareTo(s.getNombre());
            }//Fin Si
            return num;
        }//Fin Metodo

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
    }//Fin Metodo

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

