import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*Desde aqui no hemos podido crear el test en Eclipse por lo que te dejamos el Test*/

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
        calculad1.ponNum1(1.);
        calculad1.ponNum2(2.);
        calculad1.setOp("SUMA");
    }


    @Test
    public void Resta()
    {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum1(2.);
        calculad1.ponNum2(2.);
        calculad1.setOp("RESTA");
        assertEquals(0., 0., calculad1.dameResultado());
    }
    
    @Test
    public void Multiplicacion()
    {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum1(2.);
        calculad1.ponNum2(2.);
        calculad1.setOp("MULTIPLICA");
        assertEquals(4., 4., calculad1.dameResultado());
    }
    
        @Test
    public void DIVIDE()
    {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum1(2.);
        calculad1.ponNum2(2.);
        calculad1.setOp("DIVIDE");
        assertEquals(1., 1., calculad1.dameResultado());
    }
    
            @Test
    public void POTENCIA()
    {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum1(2.);
        calculad1.ponNum2(2.);
        calculad1.setOp("POTENCIA");
        assertEquals(4., 4., calculad1.dameResultado());
    }
    
            @Test
    public void RAIZ()
    {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum1(2.);
        calculad1.ponNum2(2.);
        calculad1.setOp("RAIZ");
        assertEquals(1., 1., calculad1.dameResultado());
    }
    
            @Test
    public void LOGARITMO()
    {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum1(2.);
        calculad1.ponNum2(2.);
        calculad1.setOp("LOGARITMO");
        assertEquals(1., 1., calculad1.dameResultado());
    }
    
            @Test
    public void FACTORIAL()
    {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum1(2.);
        calculad1.ponNum2(2.);
        calculad1.setOp("FACTORIAL");
        assertEquals(1., 1., calculad1.dameResultado());
    }


            @Test
    public void SumaDecimal()
    {
        EjecutaCal ejecutaC1 = new EjecutaCal();

        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum1(2.213);
        calculad1.ponNum2(2.34);
        calculad1.setOp("SUMA");
        assertEquals(1., 1., calculad1.dameResultado());
    }

            @Test
    public void divisionEntreCero()
    {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum1(2);
        calculad1.ponNum2(0);
        calculad1.setOp("DIVIDE");
        assertEquals(1., 1., calculad1.dameResultado());
    }

            @Test
    public void divisionEntreCero()
    {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum1(2);
        calculad1.ponNum2(0);
        calculad1.setOp("DIVIDE");
        assertEquals(1., 1., calculad1.dameResultado());
    }

    
    //OTROS FACTORES DE RUPTURA
                @Test
    public void SumaNegativa()
    {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum1(-2.);
        calculad1.ponNum2(-2.);
        calculad1.setOp("SUMA");
        assertEquals(-4., -4., calculad1.dameResultado());
    }
    
                @Test
    public void SumaDecimal()
    {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum1(2.213);
        calculad1.ponNum2(2.34);
        calculad1.setOp("SUMA");
        assertEquals(1., 1., calculad1.dameResultado());
    }
    
    
                    @Test
    public void DivisionEntreCero()
    {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum1(0);
        calculad1.ponNum2(2);
        calculad1.setOp("DIVIDE");
        assertEquals(1., 1., calculad1.dameResultado());
    }
    
    /* Al introducir el caracter '2.' en el setter se lo come
     * Da un valor de 49.0
                @Test
    public void RestaLiteral()
    {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum1('2.');
        calculad1.ponNum2(2.);
        calculad1.setOp("RESTA");
        assertEquals(1., 1., calculad1.dameResultado());
    }
    */
   


       @Test()
    public void pruebaSumaLSuperior1(){
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.setOp("SUMA");
        calculad1.ponNum1(Double.MAX_VALUE);
        calculad1.ponNum2(2.);
        assertEquals(Double.MAX_VALUE, Double.MAX_VALUE, calculad1.dameResultado());
    }
    


        @Test()
    public void pruebaSumaLSuperior2()
    {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum1(Double.MAX_VALUE);
        calculad1.ponNum2(2.);
        calculad1.setOp("SUMA");
        assertEquals(Double.MAX_VALUE, Double.MAX_VALUE, calculad1.dameResultado());
    }
   
       @Test()
    public void pruebaSumaLInferior1(){
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum1(-Double.MAX_VALUE);
        calculad1.ponNum2(2.);
        calculad1.setOp("SUMA");
        assertEquals(-Double.MAX_VALUE, -Double.MAX_VALUE, calculad1.dameResultado());
    }


    @Test()
    public void pruebaSumaLInferior2(){
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculad1.ponNum2(-Double.MAX_VALUE);
        calculad1.ponNum1(2.);
        calculad1.setOp("SUMA");
        assertEquals(-Double.MAX_VALUE, -Double.MAX_VALUE, calculad1.dameResultado());
    }




    @Test()
    public void testFACTORIALMAX() {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculadora.ponNum1(333);
        calculadora.ponOperacion("FACTORIAL");
        calculadora.opera();

        assertEquals(Double.POSITIVE_INFINITY, calculad1.dameResultado());

    }

    @Test(expected = StackOverflowError.class)
    public void testFACTORIALnegativo() {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculadora.ponNum1(-19);
        calculadora.ponOperacion("FACTORIAL");
        calculadora.opera();
    }

    @Test(expected = StackOverflowError.class)
    public void testFACTORIALMIN() {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculadora.ponNum1(-468);
        calculadora.ponOperacion("FACTORIAL");
        calculadora.opera();

    }

    @Test()
    public void testRAIZ() {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculadora.ponNum1(9);
        calculadora.ponNum2(2);
        calculadora.ponOperacion("RAIZ");
        calculadora.opera();
        assertEquals(3, calculad1.dameResultado());
    }
    @Test()
    public void testRAIZ3() {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculadora.ponNum1(8);
        calculadora.ponNum2(3);
        calculadora.ponOperacion("RAIZ");
        calculadora.opera();
        assertEquals(2, calculad1.dameResultado());
    }



    @Test()
    public void testRAIZMAX() {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(2);
        calculadora.ponOperacion("RAIZ");
        calculadora.opera();
        assertEquals(1.3407807929942596E154, calculad1.dameResultado());
    }

    @Test
    public void testRAIZnegativa() {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculadora.ponOperacion("RAIZ");
        calculadora.ponNum1(-7);
        calculadora.ponNum2(2);
        calculadora.opera();
        assertEquals(Double.NaN, calculad1.dameResultado());
    }

    @Test()
    public void testLOGARITMOMAX() {
        calculadora.ponNum1(6);
        calculadora.ponNum2(Double.MAX_VALUE);
        calculadora.ponOperacion("LOGARITMO");
        calculadora.opera();
        assertEquals(396.13, calculad1.dameResultado());
    }

        @Test()
        public void testLOGARITMOMINIMO() {
        EjecutaCal ejecutaC1 = new EjecutaCal();
        Calculadora calculad1 = new Calculadora();
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(6);
        calculadora.ponOperacion("LOGARITMO");
        calculadora.opera();
        assertEquals(0, calculad1.dameResultado());

        }
}



