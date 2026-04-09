import basics.EvenOdd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenOddTest {

    @Test
    void checkEvenTest() {
        assertEquals("Even", EvenOdd.check(4));
    }

    @Test
    void checkOddTest() {
        assertEquals("Odd", EvenOdd.check(7));
    }

    @Test
    void checkZeroTest() {
        assertEquals("Even", EvenOdd.check(0));
    }

    @Test
    void checkNegativeTest() {
        assertEquals("Odd", EvenOdd.check(-3));
    }

}
