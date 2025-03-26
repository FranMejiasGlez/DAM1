/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Adivinanza3 {
 public static String meteAsteriscos1(byte n) {
        //Entorno
        String pistaAsteriscos;
        //Algoritmo
        pistaAsteriscos = "";
        for (int i = 1; i <= n; i++) {
            pistaAsteriscos = pistaAsteriscos + "*";
        }//Fin Para
        return pistaAsteriscos;
    }//Fin Metodo
 
    public static byte cifras(int num) {
        //Entorno
        return (byte) Integer.toString(num).length();
    }//Fin Metodo

    public static void main(String[] args) {
        //Entorno
        Adivinanza partida;
        Integer num;
        //Algoritmo
        System.out.println("!!JUEGO DE ADIVINANZAS¡¡\n"
                + "\nSe genera un numero entre 1 y 1.000.000\n"
                + "\nCada digito bien colocado se mostrara,"
                + " tienes 10 intentos:"+ "\n ");
        partida = new Adivinanza();
        System.out.println(meteAsteriscos1(getCifrasIncognita()));
        //System.out.println(partida
.getIncognigta());
        do {
            System.out.print("\nJugador te toca adivinar: \n"
                    + "\nIntroduce un numero entre 1 y 1.000.000: \n");
            num = Leer.datoInt();
        } while (Adivinanza3.cifras(num) > Adivinanza3.cifras(partida.getIncognigta())
                ||num < 0);
        partida.juega(num);
        
        System.out.println(partida.getPista());
    }//Fin Programa
}
