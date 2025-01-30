/**
 *
 * @author Francisco Mejias
 */
public class Utilidades {
    public static byte cifras(int numero){
    //Entorno:
        byte cifras;
           //Algoritmo:
        cifras=1;
        while(numero>=10){
            numero=numero/10;
            cifras++;
        }//Fin Mientras
        return cifras;
}//Fin Funcion
   public static byte sacarDigito(int numero, byte posicion){
    //Entorno:
        byte cifras,digitos,j,resultado;
        int auxiliar;
    //Algoritmo:
        digitos = 1;
        auxiliar = numero;
        while (numero >= 10) {
            numero = (int) numero / 10;
            digitos++;
        }//Fin Mientras
        j = (byte) (digitos - posicion);
        resultado = (byte) (auxiliar / Math.pow(10, j) % 10);
        return resultado;
     }//Fin Funcion
   public static boolean esBisiesto(short anio){
       //Entorno:
            boolean bisiesto;
       //Algoritmo:
          if(anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0){
              bisiesto=true;
          }else{
              bisiesto= false;
          }
          return bisiesto;
    }//Fin Funcion
  public static boolean esFechaValida(byte dia, byte mes,short anio){
       //Entorno:
           boolean esValido;
       //Algoritmo:
           esValido=false;
            switch (mes){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    if (dia>=1 && dia <=31){
                        esValido=true;
                break;
                    }//Fin Si
                case 4: case 6: case 9: case 11:
                    if(dia >=1 && dia <=30){
                        esValido=true;
                    }
                 break;
                case 2:
                    if(Utilidades.esBisiesto(anio)){
                        if(dia>=1 && dia <=29)
                        esValido=true;
                    }
                break;
               }//Fin Segun Sea
            return esValido;
       }//Fin Funcion
  public static int potencia(int base, int exponente){
	//Entorno:
		int resultado;
	//Algoritmo
		resultado=1;
		if (exponente == 0){
			System.out.println("");
		}else{
			resultado = base * potencia(base,exponente-1);
		}//Fin Si
		return resultado;
	}//Fin Funcion
  public static int invierte(int numero){
      //Entorno:
            int invertido;
            byte cifras;
      //Algoritmo:
         invertido = 0;
        cifras = cifras(numero);
        while(numero!=0){
            if (numero % 10 != 0){
            invertido = invertido * 10 + numero % 10;
            numero = numero / 10;
            }//Fin Si
        }//Fin Mientras
            return invertido;
  }//Fin Funcion
  public static boolean continuar(char caracter){
      //Entorno:
            boolean esContinuar;
      //Algoritmo:
            esContinuar=false;
            if (caracter == 's' || caracter == 'S'){
                esContinuar=true;
            }
            return esContinuar;
  }//Fin Funcion
  /*public static char nombreMes(byte numeroMes){
   * //Entorno:
   * char nombre;
   * //Algoritmo:
   * nombre='a'+'a';
   * switch (nombre){
   * case 1:
   * nombre="E"+"n"+"e"+"r"+"o";
   * break;
   * case 2:
   * nombre='F'+'e'+'b'+'r'+'e'+'r'+'o';
   * break;
   * }//Fin Segun Sea
   * return nombre;  */
 //}//Fin Funcion
}
  

