
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Grupo_8 Francisco Mejias Gonzalez
 */
public class TableroTest {

    public TableroTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of estaLleno method, of class Tablero.
     */
    @Test
    public void testEstaLleno() {
        System.out.println("estaLleno");
        Tablero instance = new Tablero();
        boolean expResult = false;
        boolean result = instance.estaLleno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of buscaVacio method, of class Tablero. Buscamos un hueco en la
     * columna 0 cuando el tablero esta recien creado.
     */
    @Test
    public void testBuscaVacio() {
        System.out.println("buscaVacio");
        byte col = 0;
        Tablero instance = new Tablero();
        byte expResult = 5;
        byte result = instance.buscaVacio(col);
        assertEquals(expResult, result);
    }

    /**
     * Test of buscaVacio method, of class Tablero. Buscamos un hueco en la
     * columna 0 cuando el tablero esta lleno.
     */
    @Test
    public void testBuscaVacio_lleno() {
        System.out.println("buscaVacio");
        char ficha = '\u263A';
        byte col;
        byte fil;
        col = 0;
        Tablero instance = new Tablero();
        for (fil = 0; fil < 6; fil++) {
            for (col = 0; col < 8; col++) {
                instance.colocaFicha(ficha, fil, col);
            }
        }
        // Verificar que todas las columnas están llenas
        for (col = 0; col < 8; col++) {
            byte result = instance.buscaVacio(col);
            assertEquals("La columna " + col + " debería estar llena", -1, result);
        }
    }

    /**
     * Test of colocaFicha method, of class Tablero. Probamos a colocar ficha en
     * un tablero vacio
     */
    @Test
    public void testColocaFicha() {
        System.out.println("colocaFicha");
        char ficha = ' ';
        byte fila = 0;
        byte columna = 0;
        Tablero instance = new Tablero();
        boolean expResult = true;
        boolean result = instance.colocaFicha(ficha, fila, columna);
        assertEquals(expResult, result);
    }

    /**
     * Test of haGanado method, of class Tablero. Probamos el resultado de poner
     * 4 fichas seguidas en la fila 0 de izq a derch
     */
    @Test
    public void testHaGanado() {
        System.out.println("haGanado");
        char ficha = '\u263A';
        byte fila = 0;
        byte columna;
        Tablero instance = new Tablero();
        boolean expResult = true;

        for (columna = 0; columna < 4; columna++) {
            instance.colocaFicha(ficha, fila, columna);
        }
        boolean result = instance.haGanado(ficha);
        assertEquals(expResult, result);
    }

    /**
     * Test of pintaTablero method, of class Tablero. Probamos a pintar el
     * tablero vacio
     */
    @Test
    public void testPintaTablero() {
        System.out.println("pintaTablero");
        Tablero instance = new Tablero();
        instance.pintaTablero();

    }
}