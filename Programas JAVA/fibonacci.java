//Programa: fibonacci
//Autor: Francisco Mejias
public class fibonacci{
	public static int fibonacci(int nTermino){
//Entorno:
	int termino,i,terminoA,terminoB,terminoSiguiente,resultado;
//Algoritmo:
	terminoA = 0;
	terminoB = 1;
	terminoSiguiente=0;
	resultado=0;
	System.out.println(terminoA);
	System.out.println(terminoB);
	for(i=2 ; i <= nTermino-1; i++){
		terminoSiguiente = terminoA + terminoB;
		terminoA = terminoB;
		terminoB = terminoSiguiente;
		System.out.println(terminoSiguiente);
		resultado=terminoA + terminoB;
	}//Fin Para
	return resultado;
}//Fin Funcion
	public static void main(String[] args){
	//Entorno:
	int nTermino;
	//Algoritmo:
	System.out.print("Termino: ");
	nTermino = Leer.datoInt();
	System.out.print(fibonacci(nTermino));
	}//Fin Programa
}