
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Ud10Act8 {

    public static void main(String[] args) {
        //Entorno
        Float nota;
        String notas, notaIndiv;
        short contadorNota, contador;
        int indice, i;
        //Algoritmo
        contador = 1;
        nota = 0F;
        notas = "";
        contadorNota = 0;
        do {
            System.out.println("Introduce Nota nº " + contador + ": ");
            nota = Leer.datoFloat();
            if (nota >= 0 && nota <= 10) {
                notas = notas + nota.toString() + ";";
                contador++;
            }//FIn SI
        } while (nota >= 0 && nota <= 10);// Fin Repetir 
        System.out.println("Lista de notas: " + notas);
        do {
            contadorNota = 0;
            notaIndiv = notas.substring(0, notas.indexOf(";"));//Se saca la nota 
            indice = notas.indexOf(notaIndiv);//Asigno al indice la posicion 
            //de la nota
            System.out.println("Nota: " + notaIndiv);
            while (indice != -1) {
                contadorNota++;
                indice = notas.indexOf(notaIndiv, indice + 1);
            }//Fin Mientras
            if (contadorNota == 1) {
                System.out.println(notaIndiv + " se repite: " + contadorNota
                        + " vez");
            } else {
                System.out.println(notaIndiv + " se repite: " + contadorNota
                        + " veces");
            }

            notas = notas.replaceAll(notaIndiv + ";", "");
            // System.out.println(notas);

        } while (!notas.isEmpty());//Fin Mientras
    }//Fin Programa
}
