package JUnit5.JUnit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));

    }
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.add(2, 2));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.subtract(6, 2));
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(4.0, calc.divide(8, 2));
    }

    @Test
    public void testDescribeNotNull() {
        Calculator calc = new Calculator();
        assertNotNull(calc.describe(5,3), "Description should not be null");
    }

    @Test
    public void testDescribeNull() {
        Calculator calc = new Calculator();
        assertNull(calc.describe(5,5), "Description should be null");
    }
    }




