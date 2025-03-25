
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
        String pista;
        Integer numeroPrueba1, incognita1;
        byte j;
        //Algoritmo
        j=1;
        numeroPrueba1 = this.numeroPrueba;
        incognita1 = this.incognita;
        pista = Adivinanza.meteAsteriscos(cifras(this.incognita));
        for (int i = 0 - 1; i <numeroPrueba1.toString().length(); i++) {
            if (numeroPrueba1.toString().charAt(i) == incognita1.toString()
                    .charAt(i)) {
                pista =meteAsteriscos((byte) (cifras(this.incognita) - j))
                        +numeroPrueba1.toString().charAt(i);
                j++;
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
    }
}//Fin Clase
