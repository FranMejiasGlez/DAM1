
import java.util.GregorianCalendar;

/**
 *
 * @author Mejias Gonzalez Francisco
 * @author Jimenez Fuentes Pablo Aunque hay metodos que hemos hecho por
 * separado, hemos revisado todo juntos.
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

    /**
     *
     * @author Jimenez Fuentes Pablo
     *
     */
    public Saltador(int dorsal, String nombre, String pais, char sexo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.pais = pais;
        this.sexo = sexo;
    }//Fin Constructor
    //Metodos

    /**
     *
     * @author Mejias Gonzalez Francisco
     *
     */
    public boolean anotarSalto(double[] juez) {
        //Entorno
        byte i, j;
        double mayor, menor, media;
        //Algoritmo

        if (this.numeroSaltos <= 3) {
            this.ultimoSalto = new GregorianCalendar();
            //Encontrar mayor y menor
            mayor = juez[0];
            menor = juez[0];
            for (i = 1; i < juez.length; i++) {
                if (juez[i] > mayor) {
                    mayor = juez[i];
                }//Fin SI
                if (juez[i] < menor) {  // Siempre verifica el menor
                    menor = juez[i];
                }//Fin SI
            }//Fin Para
            //Buscar el primer valor mayor y menor
            i = 0;
            while (i < juez.length && juez[i] != mayor) {
                i++;
            }//Fin Mientras
            if (i < juez.length && juez[i] == mayor) {
                juez[i] = 0;
            }//Fin Si
            i = 0;
            while (i < juez.length && juez[i] != menor) {
                i++;
            }//Fin Mientras
            if (i < juez.length && juez[i] == menor) {
                juez[i] = 0;
            }//Fin Si

            //Calcular media
            media = 0;
            for (j = 0; j < juez.length; j++) {
                media = juez[j] + media;
            }//Fin Para
            media = media / 3;
            if (media > this.puntos) {
                this.puntos = media;
            }//Fin Si
            this.numeroSaltos++;
        }//Fin Si

        return this.numeroSaltos < 3;
    }//Fin Metodo

    /**
     *
     * @author Jimenez Fuentes Pablo
     *
     */
    @Override
    public boolean equals(Object o) {
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

    /**
     *
     * @author Mejias Gonzalez Francisco
     *
     */
    @Override
    public String toString() {
        String resultado;
        resultado = this.dorsal + " * " + this.nombre + " * " + this.pais
                + " * " + this.sexo + " * Saltos: " + this.numeroSaltos
                + String.format(" * Puntos: %.4f", this.puntos) + " * " + this.getFecha();
        return resultado;
    }//Fin Metodo

    /**
     *
     * @author Jimenez Fuentes Pablo
     *
     */
    @Override
    public int compareTo(Saltador s) {
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
     *
     * @author Mejias Gonzalez Francisco
     *
     */
    /**
     * @return the dorsal
     */
    public int getDorsal() {
        return this.dorsal;
    }

    /**
     *
     * @author Jimenez Fuentes Pablo
     *
     */
    /**
     * @return the nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     *
     * @author Mejias Gonzalez Francisco
     *
     */
    /**
     * @return the pais
     */
    public String getPais() {
        return this.pais;
    }

    /**
     *
     * @author Jimenez Fuentes Pablo
     *
     */
    /**
     * @return the sexo
     */
    public char getSexo() {
        return this.sexo;
    }//Fin Metodo

    /**
     *
     * @author Mejias Gonzalez Francisco
     *
     */
    /**
     * @return the puntos
     */
    public double getPuntos() {
        return this.puntos;
    }

    /**
     *
     * @author Jimenez Fuentes Pablo
     *
     */
    /**
     * @return the numeroSaltos
     */
    public int getNumeroSaltos() {
        return this.numeroSaltos;
    }

    /**
     *
     * @author Mejias Gonzalez Francisco
     *
     */
    public String getFecha() {
        //Entorno
        int dia, mes, anio;
        String mensaje;
        //Algoritmo
        if (this.ultimoSalto != null) {
            dia = this.ultimoSalto.get(GregorianCalendar.DAY_OF_MONTH);
            mes = this.ultimoSalto.get(GregorianCalendar.MONTH) + 1;
            anio = this.ultimoSalto.get(GregorianCalendar.YEAR);
            mensaje = "Fecha: " + dia + "/" + mes + "/" + anio;
        } else {
            mensaje = "No ha saltado aún";
        }//Fin Si
        return mensaje;
    }//Fin Metodo
}//Fin Clase

