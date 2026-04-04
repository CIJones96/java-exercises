import basics.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(8, calc.add(5, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(6, calc.subtract(10, 4));
    }

    @Test
    void testMultiply() {
        assertEquals(42, calc.multiply(6, 7));
    }

    @Test
    void testDivide() {
        assertEquals(7.5, calc.divide(15, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}