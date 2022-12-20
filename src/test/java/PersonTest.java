import org.junit.jupiter.api.Test;


public class PersonTest {

    @Test
    public void testName() {
        Person pers = new Person(Juan);
        String result = pers.getName();
        assertEquals(Juan, result);
    }

}
