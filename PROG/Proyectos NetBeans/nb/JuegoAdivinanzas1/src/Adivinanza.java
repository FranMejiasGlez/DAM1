
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
    }//Fin Constructor

    //Metodos
    public void juega(int num) {
        System.out.println("Jugador, adivina el numero: ");
        this.numeroPrueba = num;
    }//Fin Metodo

    public boolean haGanado() {
        
    }//Fin Metodo

    public String getPista() {
        
    }//Fin Metodo

    public static String meteAsteriscos(byte n) {
        //Entorno
        String pistaAsteriscos;
        //Algoritmo
        pistaAsteriscos="";
        for(int i = 0, i < n;i++){
            pistaAsteriscos=pistaAsteriscos+"*";
        }//Fin Para
        System.out.println(pistaAsteriscos);
    }//Fin Metodo

    //Getters&Setters
    public byte getCifrasIncognita() {
        //Entorno
        byte cifras;
        int i;
        //Algoritmo
        cifras = 1;
        i = 10;
        while (this.incognita >= i) {
            i = i * 10;
            cifras++;
        }//Fin Mientras
        return cifras;
    }//Fin Metodo

    public byte getIntentos() {
        return this.intentos;
    }//Fin Metodo
}
