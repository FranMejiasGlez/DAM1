
import java.util.Stack;

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Ud13Act3 {

    public static void main(String[] args) {
        //Entorno
        Stack<String> pila;
        String cad, parentesis;
        int siguiente;
        boolean balanceado;
        //Algoritmo
        pila = new Stack<>();
        cad = "((())hola)";
        siguiente = 0;
        balanceado = true;
        while (siguiente < cad.length() && balanceado) {
            parentesis = cad.substring(siguiente, siguiente + 1);
            if (parentesis.equals("(")) {
                pila.push(parentesis);
            } else {
                if (parentesis.equals(")")) {
                    if (pila.isEmpty()) {
                        balanceado = false;
                    } else {
                        pila.pop();
                    }//Fin Si
                }//Fin Si
            }//Fin Si
            siguiente++;
        }//Fin Mientras
        if (balanceado && pila.isEmpty()) {
            System.out.println("Parentesis equilibrados");
        } else {
            System.out.println("Parentesis desequilibrados");
        }//Fin Si
    }//Fin Programa
}
