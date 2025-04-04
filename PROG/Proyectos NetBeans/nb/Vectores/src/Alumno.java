/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Alumno {
    //Atributos

    private byte cod, nota;
    //Constructores

    public Alumno(byte codigo, byte nota) {
        this.cod = codigo;
        this.nota = nota;
    }//Fin Constructor
    //Metodos

//    @Override
//    public String toString() {
//        //Entorno
//        String salida;
//        //Algoritmo
//       // salida ="Cod: "+thi
//        return salida;
//    }
//    //GetterSetter

    public byte getNota() {
        return this.nota;
    }//Fin Getter
    
    public byte getCod() {
        return this.cod;
    }//Fin Getter
}//Fin Clase
