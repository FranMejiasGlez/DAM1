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
    public Yeti(Yeti j){
        this.color=j.color;
        this.sexo=j.color;
        this.hambriento=j.hambriento;
    }//Fin Constructor
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
            System.out.println("Zona: "+Yeti.zona);
    }//Fin Metodo
    public boolean equals(Object obj){
        //Entorno:
            Yeti j;
        //Algoritmo
        if (obj instanceof Yeti){
            j = (Yeti) obj;
        }
    return this.color == color  && this.sexo == sexo;
    }
    
    //Getters/Setters:
    public char getColor(){
        return this.color;
    }//Fin Getter
    public char getSexo(){
        return this.sexo;
    }//Fin Getter
    public boolean isHambriento(){
        return this.hambriento;
    }//Fin Getter
    public byte getZona(){
        return Yeti.zona;
    }//Fin Getter
    public void setColor(char color){
      this.color=color;
    }//Fin Setter
    public void setSexo(char sexo){
        this.sexo=sexo;
    }//Fin Setter
    public void setHambre(boolean hambriento){
         this.hambriento=hambriento;
    }//Fin Setter
    public void setZona(byte zona){
         Yeti.zona=zona;
    }//Fin Setter
    }
