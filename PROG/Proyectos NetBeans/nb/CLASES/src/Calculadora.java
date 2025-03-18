
/**
 *
 * @author Mejias Gonzalez Francisco
 */
/** 
*	Esta clase representa una calculadora.
*	Permite calcular según la llamada al método, la suma, resta,
*       multiplicación y división
*/

public class Calculadora {

    private double resultado;
/** 
*	Crea un Objeto Calculadora con atributos por defecto.
*	(Valor 0)
*/

    public Calculadora() {
        resultado = 0;
    }
/** 
*	Metodo que permite sumar dos números.	
* @param a Numero double
* @param b Numero double
* @return  resultado de la operacion.
*/

    public double sumar(double a, double b) {
        return a + b;
    }
/** 
*	Metodo que permite restar dos números.	
* @param a Numero double
* @param b Numero double
* @return  resultado de la operacion.
*/
    public double restar(double a, double b) {
        return a - b;
    }
/** 
*	Metodo que permite multiplicar dos números.
* @param a Numero double
* @param b Numero double
* @return  resultado de la operacion.
*/
    public double multiplicar(double a, double b) {
        return a * b;
    }
/** 
*	Metodo que permite dividir dos números.
* @param a Numero double
* @param b Numero double
* @return  resultado de la operacion.
* @throws lanza una execpion si la division es entre 0.
*/
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }
/** 
*	Metodo que devuelve el atributo resultado.
* @return resultado 
*/
    public double getResultado() {
        return resultado;
    }
/** 
*	Metodo que establece el atributo resultado.
* @param resultado Numero double
*/
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
/** 
*	Metodo que establece el atributo resultado a valor 0.
*/
    public void resetear() {
        resultado = 0;
    }
}//Fin Clase
