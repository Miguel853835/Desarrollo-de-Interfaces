/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import baraja.Baraja48DAM219;
import baraja.Carta48DAM219;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAM219
 */
public class Baraja48DAM219Test {
    
    public Baraja48DAM219Test() {
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
     * Test of barajar48 method, of class Baraja48DAM219.
     */
//    @Test
//    public void testBarajar48() {
//        System.out.println("barajar48");
//        Baraja48DAM219 instance = new Baraja48DAM219();
//        instance.barajar48();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of siguienteCarta48 method, of class Baraja48DAM219.
     */
//    @Test
//    public void testSiguienteCarta48() {
//        System.out.println("siguienteCarta48");
//        Baraja48DAM219 instance = new Baraja48DAM219();
//        Carta48DAM219 expResult = null;
//        Carta48DAM219 result = instance.siguienteCarta48();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of darCartas method, of class Baraja48DAM219.
     */
    @Test
    public void testDarCartasNegativas() {
    System.out.println("darCartas");
    int numCartas = -53;
    Baraja48DAM219 instance = new Baraja48DAM219();
    ArrayList<Carta48DAM219> expResult = new ArrayList<>(); 
    ArrayList<Carta48DAM219> result = instance.darCartas(numCartas);
    assertNotEquals(expResult, result);
    }
    
    @Test
    public void testDar0Cartas() {
    System.out.println("darCartas");
    int numCartas = 0;
    Baraja48DAM219 instance = new Baraja48DAM219();
    ArrayList<Carta48DAM219> expResult = new ArrayList<>(); 
    ArrayList<Carta48DAM219> result = instance.darCartas(numCartas);
    assertNotEquals(expResult, result);
    }
    
    @Test
    public void testDarCartas() {
    System.out.println("darCartas");
    int numCartas = 12;
    Baraja48DAM219 instance = new Baraja48DAM219();
    ArrayList<Carta48DAM219> expResult = new ArrayList<>(); 
    ArrayList<Carta48DAM219> result = instance.darCartas(numCartas);
    if(result == null){
        result = new ArrayList();
    }
    }
    @Test
    public void testDarDemasiadasCartas() {
    System.out.println("darCartas");
    int numCartas = 53;
    Baraja48DAM219 instance = new Baraja48DAM219();
    ArrayList<Carta48DAM219> expResult = new ArrayList<>(); 
    ArrayList<Carta48DAM219> result = instance.darCartas(numCartas);
    assertNotEquals(expResult, result);
    }

    /**
     * Test of cartasDisponibles48 method, of class Baraja48DAM219.
     */
//    @Test
//    public void testCartasDisponibles48() {
//        System.out.println("cartasDisponibles48");
//        Baraja48DAM219 instance = new Baraja48DAM219();
//        int expResult = 0;
//        int result = instance.cartasDisponibles48();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of mostrarCartasMonton48 method, of class Baraja48DAM219.
     */
//    @Test
//    public void testMostrarCartasMonton48() {
//        System.out.println("mostrarCartasMonton48");
//        Baraja48DAM219 instance = new Baraja48DAM219();
//        instance.mostrarCartasMonton48();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of mostrarCartasDisponibles48 method, of class Baraja48DAM219.
     */
//    @Test
//    public void testMostrarCartasDisponibles48() {
//        System.out.println("mostrarCartasDisponibles48");
//        Baraja48DAM219 instance = new Baraja48DAM219();
//        instance.mostrarCartasDisponibles48();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
    public static void main(){
        Baraja48DAM219Test bdt = new Baraja48DAM219Test();
        bdt.testDarCartasNegativas();
        bdt.testDar0Cartas();
        bdt.testDarCartas();
        bdt.testDarDemasiadasCartas();
    }
    
}
