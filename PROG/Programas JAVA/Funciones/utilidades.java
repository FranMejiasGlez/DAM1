public class utilidades{
	public static byte leeByte(byte n){
	//Entorno:
		short numero;
	//Algoritmo:
		while(n<-128 || n>127){
			numero=n;
		}//Fin Mientras
		return (byte)numero;
	}//Fin Funcion
	public static void main (String[] args){
	//Entorno:
		short n;
	//Algoritmo:
	System.out.print("Numero:");
	n=Leer.datoShort();
	}//Fin Programa
}