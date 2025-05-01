package figuras;

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Ud1112Act1 {

    public static void main(String[] args) {
        //Entorno
        Triangulo triang1;
        Rectangulo rect1;
        Circulo circ1;
        TrianguloRectangulo triangRect1;
        Cuadrado cuadrado1;
        //Algoritmo
        //Rectangulo
        rect1 = new Rectangulo(5f, 3f);
        System.out.println(rect1.getTipoFigura());
        // System.out.println(rect1.toString());
        System.out.println("Area: " + rect1.area());
        System.out.println("Perimetro: " + rect1.perimetro());
        //Cuadrado
        cuadrado1 = new Cuadrado(4f);
        //  System.out.println(cuadrado1.toString());
        System.out.println(cuadrado1.getTipoFigura());
        System.out.println("Area: " + cuadrado1.area());
        System.out.println("Perimetro: " + cuadrado1.perimetro());
        //Circulo
        circ1 = new Circulo(2f);
        // System.out.println(circ1.toString());
        System.out.println(circ1.getTipoFigura());
        System.out.println("Area: " + circ1.area());
        System.out.println("Perimetro: " + circ1.perimetro());
        //Triangulo
        triang1 = new Triangulo(3f, 4f, 120.0);
        System.out.println(triang1.getTipoFigura());
        // System.out.println(triang1.toString());
        System.out.println("Area: " + triang1.area());
        System.out.println("Perimetro: " + triang1.perimetro());
        //Triangulo rectangulo
        triangRect1 = new TrianguloRectangulo(3f, 4f);
        System.out.println(triangRect1.getTipoFigura());
        //  System.out.println(triangRect1.toString());
        System.out.println("Area: " + triangRect1.area());
        System.out.println("Perimetro: " + triangRect1.perimetro());
        System.out.println("Hipotenusa: " + triangRect1.getHipotenusa());

    }//Fin Programa
}
