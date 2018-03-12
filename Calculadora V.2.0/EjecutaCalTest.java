

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class EjecutaCalTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EjecutaCalTest
{
    /**
     * Default constructor for test class EjecutaCalTest
     */
    public EjecutaCalTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void Suma()
    {
        EjecutaCal ejecutaC2 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum1(1);
        calculad1.ponNum2(2);
        calculad1.setOp("SUMA");
    }


    @Test
    public void Resta()
    {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum1(2);
        calculad1.ponNum2(2);
        calculad1.setOp("RESTA");
        assertEquals(0, calculad1.dameResultado());
    }
    
    @Test
    public void Multiplicacion()
    {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum1(2);
        calculad1.ponNum2(2);
        calculad1.setOp("MULTIPLICA");
        assertEquals(4, calculad1.dameResultado());
    }
    
        @Test
    public void DIVIDE()
    {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum1(2);
        calculad1.ponNum2(2);
        calculad1.setOp("DIVIDE");
        assertEquals(1, calculad1.dameResultado());
    }
    

}




