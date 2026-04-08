import basics.StringReverser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringReverserTest {

    @Test
    void testReverseHello() {
        assertEquals("olleh", StringReverser.reverse("hello"));
    }

    @Test
    void testReverseName() {
        assertEquals("sirhC", StringReverser.reverse("Chris"));
    }

    @Test
    void testReverseEmpty() {
        assertEquals("", StringReverser.reverse(""));
    }

    @Test
    void testReverseSingleChar() {
        assertEquals("a", StringReverser.reverse("a"));
    }
}


