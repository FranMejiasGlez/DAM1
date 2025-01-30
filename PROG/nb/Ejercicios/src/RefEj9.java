/*
 Programa: RefEj9
 Autor: Francisco Mejias
 Entorno:
    sumaPares,par es numérico entero
 Algoritmo:
    sumaPares <-- 0  
    Para par de 2 a 1001 con incremento 2 hacer 
        sumaPares <-- sumaPares + par  
    Fin Para
    Escribir "La suma es: ",sumaPares
 Fin Programa
 */
//Programa: RefEj9
//Autor: Francisco Mejias
public class RefEj9 {
    public static void main(String[] args) {
    //Entorno:
        int sumaPares,par;
    //Algoritmo:
        sumaPares = 0; 
        for(par=2;par<=1000;par+=2){ 
            sumaPares = sumaPares + par;  
        }//Fin Para
        System.out.println("La suma es: "+sumaPares);
    }//Fin Programa
}