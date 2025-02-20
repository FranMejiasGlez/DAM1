/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Consumo {
    //Atributos:
        private float kms;
        private float litros;
        private float vmed;
        private float precio=1.50F;
    //Constructores:
        public Consumo(){
        }//Fin Constructor
        public Consumo(float kms,float litros,float vmed){
           this.kms=kms;
           this.litros=litros;
           this.vmed=vmed;
        }//Fin Constructor
    //Metodos:
        public float consumoMedio(){
            return this.litros*(100/this.kms);
        }//Fin Metodo
        public float consumoEuros(){
            return this.litros*this.precio;
        }//Fin Metodo
        public byte getTiempo(){
            return (byte)(this.kms/this.vmed);
        }//Fin Metodo
    //Getters/Setters:
        public void setKms(float kms){
            this.kms=kms;
        }//Fin Setter
        public void setLitros(float litros){
            this.litros=litros;
        }//Fin Setter
        public void setVmed(float vmed){
            this.vmed=vmed;
        }//Fin Setter
        public void setPrecio(float precio){
            this.precio=precio;
        }//Fin Setter
}//Fin Clase
