
/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Ud6Act7 {

    public static void main(String[] args) {
        //entorno
        Empleado mayorSueldo,menorSueldo,empleado;
        //Empleado[] empleados;
        String nombre, apellidos;
        float sueldo;
        byte seccion;
        short departamento;
        //algoritmo
        mayorSueldo= new Empleado();
        menorSueldo= new Empleado();
        System.out.println("Introduce nombre empleado: ");
        nombre = Leer.dato();
        System.out.println("Introduce apellidos empleado: ");
        apellidos = Leer.dato();
        System.out.println("Introduce sueldo empleado: ");
        sueldo = Leer.datoFloat();
        System.out.println("Introduce departamento: ");
        departamento = Leer.datoShort();
        System.out.println("Introduce seccion: ");
        seccion = (byte) Leer.datoShort();
        empleado = new Empleado(nombre,apellidos,departamento,seccion,sueldo);
        mayorSueldo.copia(empleado);
        menorSueldo.copia(empleado);
        for (int i = 0; i < 2; i++) {
            System.out.println("Introduce nombre empleado: ");
            nombre = Leer.dato();
            System.out.println("Introduce apellidos empleado: ");
            apellidos = Leer.dato();
            System.out.println("Introduce sueldo empleado: ");
            sueldo = Leer.datoFloat();
            System.out.println("Introduce departamento: ");
            departamento = Leer.datoShort();
            System.out.println("Introduce seccion: ");
            seccion = (byte) Leer.datoShort();
            empleado=new Empleado(nombre,apellidos,departamento,seccion,sueldo);
            if (empleado.getSueldo()>mayorSueldo.getSueldo()) {
                mayorSueldo=empleado;
            }else{
                menorSueldo=empleado;
            }
        }//Fin Para
        System.out.println("Mayor Sueldo: "+mayorSueldo.getNombre()
                +" "+mayorSueldo.getApellidos()+" "+mayorSueldo.getSueldo());
        System.out.println("Menor Sueldo: "+menorSueldo.getNombre()
                +" "+menorSueldo.getApellidos()+" "+menorSueldo.getSueldo());
    }//Fin Programa
}
