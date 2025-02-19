/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Prueba {

    public static void main(String[] args) {
        byte numeroMenosDigitos = 3, j, digitoSecreto, digitoEstimado, digitosAcertados;
        short numeroSecreto, numeroEstimado;
        numeroSecreto=325;
        numeroEstimado=225;
        digitosAcertados = 0;
        for (j = 0; j < numeroMenosDigitos; j++) {
            digitoSecreto = (byte) (numeroSecreto / Math.pow(10, j) % 10);
            digitoEstimado = (byte) (numeroEstimado / Math.pow(10, j) % 10);
            if (digitoSecreto == digitoEstimado) {
                digitosAcertados++;
            }//Fin Si
        }//Fin Para
        System.out.println(digitosAcertados);
    }
}
