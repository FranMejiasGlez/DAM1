/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Contador {
    //Atributos:
        private int valor;
        private byte incremento=1;
    //Constructores:
        public Contador(){
        }//Fin Constructor
        public Contador(byte incremento){
            this.incremento=incremento;
        }//Fin Constructor
        public Contador(int valor,byte incremento){
            this.valor=valor;
            this.incremento=incremento;
        }//Fin Constructor
        public Contador(Contador original){
        //    this.valor = original;
        //    this.incremento = original;
        }//Fin Constructor
    //Metododos:
        public void incrementaCuenta(){
            this.valor=this.valor+this.incremento;
        }//Fin Metodo
        public void iniciaCuenta(int valor){
            this.valor=valor;
        }//Fin Metodo
    //Getters/Setters:
        public int obtenerCuenta(){
            return this.valor;
        }//Fin Getter    
}//Fin Clase
