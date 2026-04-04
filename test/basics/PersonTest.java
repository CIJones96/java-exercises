import basics.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person = new Person("Chris", 28, "Java Developer");

    @Test
    void testGetName() {
        assertEquals("Chris", person.getName());
    }

    @Test
    void testGetAge() {
        assertEquals(28, person.getAge());
    }

    @Test
    void testGetOccupation() {
        assertEquals("Java Developer", person.getOccupation());
    }

    @Test
    void testIntroduce() {
        person.introduce();
    }
}