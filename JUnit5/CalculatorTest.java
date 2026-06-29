package JUnit5.JUnit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {


    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }
    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));

    }
    @Test
    public void testAdd() {
        assertEquals(4, calc.add(2, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(4, calc.subtract(6, 2));
    }

    @Test
    public void testDivide() {
        assertEquals(4, calc.divide(8, 2));
    }

    @Test
    public void testDescribeNotNull() {
        assertNotNull(calc.describe(5,3), "Description should not be null");
    }

    @Test
    public void testDescribeNull() {
        assertNull(calc.describe(5,5), "Description should be null");
    }
    }




