import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }

    @Test
    public void testMultiply() {
        assertEquals("testmultiply", 9, calc.multiply(3, 3));
    }

    @Test
    public void testDivision() {
        assertEquals("testdivision", 3, calc.division(9, 3));
    }

    @Test
    public void testSquareRoot() {
        assertEquals("testsquareRoot", 3.0, calc.squareRoot(9));
    }

    @Test
    public void testX2() {
        assertEquals("testsx2", 4.0, calc.x2(2));
    }

    @Test
    public void testDivisionByZero() {
        String message = "";
        {
            try {
                calc.division(5, 0);
            } catch (Exception e) {
                message = e.getMessage();
            }
        }

        assertEquals ("message report", "/ by zero", message);
    }

    @After
    public void consolePrintAfter () {
        System.out.println("Tests finished!!!");
        }
    }