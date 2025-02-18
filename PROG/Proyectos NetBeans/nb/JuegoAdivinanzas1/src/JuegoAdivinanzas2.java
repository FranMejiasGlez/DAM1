//Programa: JuegoAdivinanzas1
//Autor: Mejias Gonzalez Francisco, Ruiz Alfonso, Martin Jaime, Ochavo Marcos, Maurolagoitia Ignacio
//Entorno:
	numeroSecreto,numeroEstimado,intentos es numérico entero
//Algoritmo:
	Escribir "Jugador 1 Introduce número entre 0 y 99:"
	Leer numeroSecreto
	Hacer 
		Escribir "Jugador 1: Introduce número entre 0 y 99:"
		Leer numeroEstimado
		intentos <-- 8
		Si numeroSecreto = numeroEstimado entonces
			intentos <-- intentos - 1
			Escribir "!Correcto! El número secreto era: "
                        ,numeroSecreto," Adivinaste en: "
					,(8 - intentos), " intentos"
		Sino
			Si numeroEstimado < numeroSecreto entonces
				intentos = intentos - 1
				Si intentos=1 entonces
                    Escribir "Última oportunidad. Adivina sabiamente"
                    Escribir "PISTA: El número secreto "
                            , "es mayor que el introducido, te quedan: "
                            , intentos , " intentos"
				Sino
					Escribir "Intento fallido"
					Escribir "PISTA: El número secreto es mayor que ",numeroEstimado,
						", te quedan: ",intentos," intentos"
				Fin Si
			Sino
				intentos = intentos - 1
				Si intentos=1 entonces
                    Escribir "Última oportunidad. Adivina sabiamente"
                    Escribir "PISTA: El número secreto "
                            , "es mayor que el introducido, te quedan: "
                            , intentos , " intentos"
				Sino
					Escribir "Intento fallido"
					Escribir "PISTA: El número secreto es menor que ",numeroEstimado,
						", te quedan: ",intentos," intentos"
				Fin Si
			Fin Si
		Fin Si
	Hasta intentos = 0 o numeroSecreto = numeroEstimado
	Si intentos = 0 y numeroSecreto != numeroEstimado entonces
		Escribir "Has agotado tus 8 intentos, el número era: "
		,numeroSecreto
	Fin Si
	Fin Programa

/**
 *
 * @author Administrador
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
        byte digitosSecreto,digitosEstimado,j,i,resultado;
    //Algoritmo:
        digitosSecreto = 1;
        digitosEstimado = 1;
        //Sacar digitos de Estimado
        while (numeroEstimado >= 10) {
            numeroEstimado = (short)(numeroEstimado / 10);
            digitosEstimado++;
        }//Fin Mientras
        //Sacar digitos Secreto
         while (numeroSecreto >= 10) {
            numeroSecreto = (short)(numeroSecreto / 10);
            digitosSecreto++;
        }//Fin Mientras
        i=(byte)(digitosEstimado-1);
        do{
            j=(byte)(numeroEstimado / Math.pow(10, i)%10);
        }while (i>=1);
        return resultado;
     }//Fin Funcion

    public static void main(String[]args){
        //Entorno:
            short numeroSecreto,numeroEstimado;
            byte intentos;
        //Algoritmo:
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
        
    }//Fin Programa
}
