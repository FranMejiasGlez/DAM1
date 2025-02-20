

/**
 *
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

    public static byte comparaNumeros(short numeroEstimado,short numeroSecreto){
        //Entorno:
        byte numeroMenosDigitos, digitosAcertados,digitoSecreto, digitoEstimado,j;
        //Algoritmo:
        digitosAcertados = 0;
        numeroMenosDigitos = cifras(numeroSecreto);
        if (numeroMenosDigitos > cifras(numeroEstimado)) {
            numeroMenosDigitos = cifras(numeroEstimado);
        }//Fin Si
            if (numeroSecreto == numeroEstimado) {
                System.out.println("Acierto!");
            } else {
                //Bucle
             for(j=0;j<numeroMenosDigitos;j++){
                digitoSecreto =(byte)(numeroSecreto / Math.pow(10,j)%10 );
                digitoEstimado =(byte)(numeroEstimado / Math.pow(10,j)%10);
                if (digitoSecreto == digitoEstimado) {
                    digitosAcertados++;
                }//Fin Si
             }//Fin Para
        }//Fin Si
        return digitosAcertados;
    }//Fin Funcion

    public static void main(String[]args){
        //Entorno:
            short numeroSecreto,numeroEstimado;
            byte intentos;
        //Algoritmo:
            /*numeroSecreto=325;
            System.out.println(sacarDigito(numeroSecreto,cifras(numeroSecreto)));
            * */
        do{    
            System.out.println("J1 Introduce un número de máximo 5 cifras: ");
            numeroSecreto=Leer.datoShort();
        }while(JuegoAdivinanzas2.cifras(numeroSecreto)>5 
               && JuegoAdivinanzas2.cifras(numeroSecreto)<1);
        do{
            System.out.println("J1 Introduce numero de máxico 5 cifras: ");
            numeroEstimado=Leer.datoShort();
        }while(JuegoAdivinanzas2.cifras(numeroSecreto)>5 
               && JuegoAdivinanzas2.cifras(numeroSecreto)<1);
        System.out.println("Numero de digitos correctos: "
                +comparaNumeros(numeroEstimado, numeroSecreto));        
    }//Fin Programa
}
