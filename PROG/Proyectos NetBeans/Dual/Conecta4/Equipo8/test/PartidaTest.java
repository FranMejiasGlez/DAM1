
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
public class PartidaTest {

    public PartidaTest() {
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
     * Test of getTurno method, of class Partida.
     */
    @Test
    public void testGetTurno() {
        System.out.println("getTurno");
        Partida instance = new Partida();
        byte expResult = 0;
        byte result = instance.getTurno();
        assertEquals(expResult, result);

    }

    /**
     * Test of esFinPartida method, of class Partida.
     */
    @Test
    public void testEsFinPartida() {
        System.out.println("esFinPartida");
        Partida instance = new Partida();
        boolean expResult = false;
        boolean result = instance.esFinPartida();
        assertEquals(expResult, result);

    }

    /**
     * Test of tirada method, of class Partida.
     */
    @Test
    public void testTirada() {
        System.out.println("tirada");
        byte col = 0;
        Partida instance = new Partida();
        boolean expResult = true;
        boolean result = instance.tirada(col);
        assertEquals(expResult, result);

    }

    /**
     * Test of getGanador method, of class Partida.
     */
    @Test
    public void testGetGanador() {
        System.out.println("getGanador");
        Partida instance = new Partida();
        byte expResult = -1;
        byte result = instance.getGanador();
        assertEquals(expResult, result);
    }
}