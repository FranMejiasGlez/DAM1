/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Yeti{
//Atributos:
    private char color = 'B';
    private char sexo = 'M';
    private boolean hambriento = false;
    private static byte zona = 1;
 //Constructores:
    public void Yeti(char sexo){
    //Entorno:
    //Algoritmo:
        
    }//Fin Constructor
    public void Yeti(boolean hambriento){
    //Entorno:
    //Algoritmo:   
    }
    public void Yeti(char color,char sexo){
    //Entorno:
    //Algoritmo:
    }//Fin Constructor
    public void Yeti(char sexo,boolean hambriento){
    //Entorno:
    //Algoritmo:
    }//Fin Constructor
    public void Yeti(char color,char sexo,boolean hambriento,byte zona){
    //Entorno:
    //Algoritmo:
    }//Fin Constructor
 //Metodos:
    public void alimentarYeti(){
        //Entorno:
        //Algoritmo:
            if (this.hambriento==false){
               this.hambriento=true;
            }else{
               System.out.print("mmmm no gacias ya he comido");
            }
    }//Fin Metodo
    public void mostrarAtributos(){
        //Entorno:
        //Algoritmo:
            System.out.println("Color: "+this.color);
            System.out.println("Sexo: "+this.sexo);
            System.out.println("Hambre: "+this.hambriento);
            System.out.println("Zona: "+this.zona);
    }//Fin Metodo
}
