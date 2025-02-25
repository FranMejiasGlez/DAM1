/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Numero {
   //Atributos:
        private int valor;
   //Constructores:
        public Numero(){
        }//Fin Constructor
        public Numero(int valor){
            this.valor=valor;
        }//Fin Constructor
   //Metodos:
        public void aniade(int valor){
            this.valor=this.valor+valor;
        }//Fin Metodo
        public void resta(int valor){
            this.valor=this.valor-valor;
        }//Fin Metodo
        @Override
        public boolean equals(Object obj){
            //Entorno:
            boolean esIgual=false;
            Numero n1;
            //Algoritmo:
            if (obj instanceof Numero){
                n1 = (Numero)obj;
                esIgual=this.valor == n1.valor;
            }
            return esIgual;
        }//Fin Metodo
      //  @Override
       // public String toString(){
         //  return getClass().getName()+'@'+ ;
        //}//Fin Metodo 
   //Getter/Setters:
        public int getValor(){
            return this.valor;
        }//Fin Getter
        public int getDoble(){
            return this.valor*2;
        }//Fin Getter
        public int getTriple(){
            return this.valor*3;
        }//Fin Getter
        public int getCuadruple(){
            return this.valor*4;
        }//Fin Getter
        public void setValor(int valor){
           this.valor=valor;
        }//Fin Setter
}//Fin Clase
