package example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Setup before test");
    }

    @After
    public void tearDown() {
        System.out.println("Cleanup after test");
    }

    @Test
    public void testAdd() {
        int result = calc.add(4, 6);
        assertEquals(10, result);  // Act + Assert
    }

    @Test
    public void testSubtract() {
        int result = calc.subtract(10, 3);
        assertEquals(7, result);
    }
}
