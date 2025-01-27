public class potencia{
	public static int potencia(int base, int exponente){
	//Entorno:
		int resultado,i;
	//Algoritmo
		resultado=1;
		if (exponente == 0){
			System.out.println("");
		}else{
			resultado = base * potencia(base,exponente-1);
		}//Fin Si
		return resultado;
	}//Fin Funcion
	public static void main(String[] args){
	//Entorno:
		int numero,exponente;
	//Algoritmo:
		System.out.print("Número: ");
		numero=Leer.datoInt();
		System.out.print("Exponente: ");
		exponente=Leer.datoInt();
		System.out.println("La potencia es: "+potencia(numero,exponente));
	}//Fin Programa
}	