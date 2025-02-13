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
    public Yeti(){
    }
    public Yeti(char sexo){
    //Entorno:
    //Algoritmo:
        if(sexo == 'm'||sexo == 'M'||sexo == 'h'||sexo == 'H'){
            this.sexo=sexo;
        }
    }//Fin Constructor
    public Yeti(boolean hambriento){
    //Entorno:
    //Algoritmo:
        this.hambriento=hambriento;
    }
    public Yeti(char color,char sexo){
    //Entorno:
    //Algoritmo:
        this.color=color;
        if(sexo == 'm'||sexo == 'M'||sexo == 'h'||sexo == 'H'){
            this.sexo=sexo;
        }
    }//Fin Constructor
    public Yeti(char sexo,boolean hambriento){
    //Entorno:
    //Algoritmo:
        if(sexo == 'm'||sexo == 'M'||sexo == 'h'||sexo == 'H'){
            this.sexo=sexo;
        }
        this.hambriento=hambriento;
    }//Fin Constructor
    public Yeti(char color,char sexo,boolean hambriento,byte zona){
    //Entorno:
    //Algoritmo:
        this.color=color;
        if(sexo == 'm'||sexo == 'M'||sexo == 'h'||sexo == 'H'){
            this.sexo=sexo;
        }
        this.hambriento=hambriento;
        Yeti.zona=zona;
    }//Fin Constructor
 //Metodos:
    public void alimentarYeti(){
        //Entorno:
        //Algoritmo:
            if (!this.hambriento){
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
