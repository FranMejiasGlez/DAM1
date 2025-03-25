
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
        System.out.println("Jugador, adivina el numero: ");
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
        //Algoritmo
        pista=Adivinanza.meteAsteriscos(cifras(this.incognita));
       return pista ;
    }//Fin Metodo

    public static String meteAsteriscos(byte n) {
        //Entorno
        String pistaAsteriscos;
        //Algoritmo
        pistaAsteriscos="";
        for (int i = 1; i <= n; i++) {
            pistaAsteriscos=pistaAsteriscos+"* ";
        }//Fin Para
        return pistaAsteriscos;
    }//Fin Metodo

    public static byte cifras(int n) {
        //Entorno
        return (byte)Integer.toString(n).length();
    }//Fin Metodo
    //Getters&Setters

    public byte getCifrasIncognita() {
        //entorno
        Integer incognita;
        incognita = this.incognita;
        return (byte)incognita.toString().length();
    }//Fin Metodo

    public byte getIntentos() {
        return this.intentos;
    }//Fin Metodo
    public int getIncognigta(){
    return this.incognita;
    }
}//Fin Clase
