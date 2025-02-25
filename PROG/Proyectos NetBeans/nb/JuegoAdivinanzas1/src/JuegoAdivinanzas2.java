
   /* 
   Programa: JuegoAdivinanzas2
   Autor: Mejias Gonzalez Francisco
   Entorno:
            
            cifras, numeroSecreto,numeroAux, numeroEstimado, intentos
            es numérico entero
   Algoritmo:
        Repetir
            Escribir "J1 Introduce un número de máximo 5 cifras: "
            Leer numeroSecreto
            cifras <-- 1
            numeroAux <-- numeroSecreto
            Mientras numeroaux >= 10 hacer
                numeroAux <-- numeroAux \ 10;
            cifras <-- cifras + 1 
        Hasta cifras <= 5 y cifras >= 1
        intentos <-- 10
        Repetir
            Repetir
                Escribir "J2 Introduce numero de máximo 5 cifras: "
                Leer numeroEstimado
                cifras <-- 1
                numeroAux <-- numeroEstimado
                Mientras numeroaux >= 10 hacer
                    numeroAux<-- numeroAux \ 10;
                cifras <-- cifras + 1 
            Hasta  cifras <= 5 y cifras >= 1
                Escribir "Numero de digitos correctos: "
                    ,comparaNumeros(numeroEstimado, numeroSecreto));
            intentos = intentos - 1
            Si numeroSecreto != numeroEstimado entonces
                Escribir "Has fallado, te quedan: ",intentos," intentos"
            Fin Si
        Hasta intentos = 0 o numeroSecreto = numeroEstimado
        Si numeroSecreto = numeroEstimado entonces
            Escribir "Has acertado! Has necesitado: ",(10-intentos)," intentos"
        Sino
             Escribir "Has fallado! no te quedan intentos, el numero era: ",
                    ,numeroSecreto
        Fin Si
  Fin Programa
    * /
/**
 * @author Mejias Gonzalez Francisco
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

    public static byte comparaNumeros(short numeroEstimado, short numeroSecreto){
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
        short numeroSecreto, numeroEstimado;
        byte intentos;
        //Algoritmo:
        do {
            System.out.println("J1 Introduce un número de máximo 5 cifras: ");
            numeroSecreto = Leer.datoShort();
        } while (JuegoAdivinanzas2.cifras(numeroSecreto) > 5
                && JuegoAdivinanzas2.cifras(numeroSecreto) < 1);
        intentos = 10;
        do {
            do {
                System.out.println("J2 Introduce numero de máximo 5 cifras: ");
                numeroEstimado = Leer.datoShort();
            } while (JuegoAdivinanzas2.cifras(numeroSecreto) > 5
                    && JuegoAdivinanzas2.cifras(numeroSecreto) < 1);
            System.out.println("Numero de digitos correctos: "
                    + comparaNumeros(numeroEstimado, numeroSecreto));
            intentos--;
            if(numeroSecreto != numeroEstimado){
            System.out.println("Has fallado, te quedan: "+intentos+" intentos");
            }
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
