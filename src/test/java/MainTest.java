import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isValid_shouldBeTrue_whenAbcdef1g() {
        String password= "Abcdef1g";
        boolean expected= true;
        boolean actual;

        actual= Main.isValid(password);
        assertEquals(expected, actual);
    }
}