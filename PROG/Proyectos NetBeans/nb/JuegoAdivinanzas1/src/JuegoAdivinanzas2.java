/**
 * @author Equipo6
 */
public class JuegoAdivinanzas2 {

    public static byte cifras(int numero) {
        //Entorno:
        byte cifras;
        //Algoritmo:
        cifras = 1;
        while (numero >= 10) {
            numero = numero / 10;
            cifras++;
        }//Fin Mientras
        return cifras;
    }//Fin Funcion

    public static byte comparaNumeros(int numeroEstimado, int numeroSecreto){
        //Entorno:
        byte numeroMenosDigitos, digitosAcertados, digitoSecreto,
                digitoEstimado, j;
        //Algoritmo:
        digitosAcertados = 0;
        numeroMenosDigitos = cifras(numeroSecreto);
        if (numeroMenosDigitos > cifras(numeroEstimado)) {
            numeroMenosDigitos = cifras(numeroEstimado);
        }//Fin Si

        for (j = 0; j < numeroMenosDigitos; j++) {
            digitoSecreto = (byte) (numeroSecreto / Math.pow(10, j) % 10);
            digitoEstimado = (byte) (numeroEstimado / Math.pow(10, j) % 10);
            if (digitoSecreto == digitoEstimado) {
                digitosAcertados++;
            }//Fin Si
        }//Fin Para
        return digitosAcertados;
    }//Fin Funcion

    public static void main(String[] args) {
        //Entorno:
        int numeroSecreto, numeroEstimado;
        byte intentos;
        //Algoritmo:
        do {
            System.out.println("J1 Introduce un número de máximo 5 cifras: ");
            numeroSecreto = Leer.datoInt();
        } while (cifras(numeroSecreto) > 5 || cifras(numeroSecreto) < 1
                || numeroSecreto < 0);
        intentos = 10;
        do {
            do {
                System.out.println("J2 Introduce numero de máximo 5 cifras: ");
                numeroEstimado = Leer.datoInt();
            } while (cifras(numeroSecreto) > 5 || cifras(numeroSecreto) < 1 
                    || numeroEstimado < 0 );
            System.out.println(comparaNumeros(numeroEstimado, numeroSecreto)
                    +" Digitos bien colocados");
            intentos--;
            if(numeroSecreto != numeroEstimado){
            System.out.println("Has fallado, te quedan: "+intentos+" intentos");
            }//Fin Si
        }while (intentos !=0 && numeroSecreto != numeroEstimado);
        if (numeroSecreto==numeroEstimado){
            System.out.println("Has acertado! Has necesitado: "+(10-intentos)
                    +" intentos");
        }else{
             System.out.println("Has fallado! no te quedan intentos,"
                     + " el numero era :"+numeroSecreto);
        }//Fin Si
    }//Fin Programa
}
