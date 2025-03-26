/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Adivinanza {
    //Atributos

    private int incognita, numeroPrueba;
    private byte intentos, cifrasIncognita;
    //Constructores

    public Adivinanza() {
        this.incognita = (int) (Math.random() * 1000000 + 1);
        this.intentos = 10;
    }//Fin Constructor

    //Metodos
    public void juega(int num) {
        this.numeroPrueba = num;
    }//Fin Metodo

    public boolean haGanado() {
        //Entorno
        boolean haGanado = false;
        //Algoritmo

        return haGanado;
    }//Fin Metodo

    public String getPista() {
        //Entorno
        String pista, numP, incog;
        Integer numeroPrueba1, incognita1;
        //Algoritmo
        numeroPrueba1 = this.numeroPrueba;
        incognita1 = this.incognita;
        numP = numeroPrueba1.toString();
        incog = incognita1.toString();
        while (numP.length() < incog.length()) {
            numP = ";" + numP;
        }//Fin Mientras
        pista = "";
        for (int i = 0; i <= incog.length()-1; i++) {
            if (numP.charAt(i) == incog.charAt(i)) {
                pista = pista + numP.charAt(i);
            }else{
                pista = pista + "*";
            }//Fin Si
        }//Fin Para
        return pista;
    }//Fin Metodo

    public static String meteAsteriscos(byte n) {
        //Entorno
        String pistaAsteriscos;
        //Algoritmo
        pistaAsteriscos = "";
        for (int i = 1; i <= n; i++) {
            pistaAsteriscos = pistaAsteriscos + "*";
        }//Fin Para
        return pistaAsteriscos;
    }//Fin Metodo

    public static byte cifras(int n) {
        //Entorno
        return (byte) Integer.toString(n).length();
    }//Fin Metodo
    //Getters&Setters

    public byte getCifrasIncognita() {
        //entorno
        Integer incognita;
        incognita = this.incognita;
        return (byte) incognita.toString().length();
    }//Fin Metodo

    public byte getIntentos() {
        return this.intentos;
    }//Fin Metodo

    public int getIncognigta() {
        return this.incognita;
    }//Fin Metodo
}//Fin Clase
