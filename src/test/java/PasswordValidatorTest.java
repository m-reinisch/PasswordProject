import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void hasMinLength_shouldBeTrue_whenAbc1defgand8() {
        String pw= "Abc1defg";
        int len= 8;
        boolean expected= true;
        boolean actual;

        actual= PasswordValidator.hasMinLength(pw, len);
        assertEquals(expected, actual);
    }

    @Test
    void containsDigit() {
    }

    @Test
    void containsUpperAndLower() {
    }

    @Test
    void isCommonPassword() {
    }
}