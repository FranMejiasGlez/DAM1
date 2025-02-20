/*Programa: RefEj4
 Autor: Francisco Mejias
 Entorno: 
 CONST PI es numérico real (3.1416)
 radio,volumen,area es numérico real
 Algoritmo:
 Escribir "Unidades de medida iguales"
 Repetir
 Escribir "Radio: "
 Leer radio
 Hasta radio >0
 volumen <-- 1.33*PI*radio**3
 area <-- 4*PI*radio**2
 Escribir "Con Radio: ",radio," Volumen: ",volumen," Área: ",area
 Fin Programa
 */

//Programa: RefEj4
//Autor: Francisco Mejias
public class RefEj4 {
    public static void main(String[] args) {

    //Entorno: 
        final float PI = 3.1416F;
        float radio, volumen, area;
    //Algoritmo:
        System.out.println("Unidades de medida iguales");
        do {
            System.out.println("Radio: ");
            radio = Leer.datoFloat();
        } while (radio <= 0);
        volumen = (float) 1.33 * PI * radio * radio * radio;
        area = 4 * PI * radio * radio;
        System.out.println("Con Radio: " + radio + " Volumen: " + volumen
                + " Área: "+ area);
    }//Fin Programa
}