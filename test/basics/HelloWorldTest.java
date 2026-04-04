import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void testHelloWorld() {
        String expected = "Hello, World!";
        String actual = "Hello, World!";
        assertEquals(expected, actual);
    }
}