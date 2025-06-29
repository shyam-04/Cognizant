import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void checkUserDetails() {
        String username = "jaffron_98";
        String email = "jaffron@example.com";
        int age = 25;

        assertEquals("jaffron_98", username);
        assertTrue(age > 18);
        assertFalse(age < 0);
        assertNotNull(email);
        String middleName = null;
        assertNull(middleName);
    }
}
