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
    void hasMinLength_shouldBeFalse_whenAbc1defand8() {
        String pw= "Abc1def";
        int len= 8;
        boolean expected= false;
        boolean actual;

        actual= PasswordValidator.hasMinLength(pw, len);
        assertEquals(expected, actual);
    }

    @Test
    void hasMinLength_shouldBeTrue_whenAbc1defghand8() {
        String pw= "Abc1defgh";
        int len= 8;
        boolean expected= true;
        boolean actual;

        actual= PasswordValidator.hasMinLength(pw, len);
        assertEquals(expected, actual);
    }

    @Test
    void hasMinLength_shouldBeFalse_whenEmptyand8() {
        String pw= "";
        int len= 8;
        boolean expected= false;
        boolean actual;

        actual= PasswordValidator.hasMinLength(pw, len);
        assertEquals(expected, actual);
    }

    @Test
    void hasMinLength_shouldBeFalse_whenNULLand8() {
        String pw= null;
        int len= 8;
        boolean expected= false;
        boolean actual;

        actual= PasswordValidator.hasMinLength(pw, len);
        assertEquals(expected, actual);
    }

    @Test
    void containsDigit_shouldBeFalse_whenContainsNoDigit() {
        String password= "Abcdefgh";
        boolean expected= false;
        boolean actual;

        actual= PasswordValidator.containsDigit(password);
        assertEquals(expected, actual);
    }

    @Test
    void containsDigit_shouldBeTrue_whenContains1Digit() {
        String password= "abcdefg1";
        boolean expected= true;
        boolean actual;

        actual= PasswordValidator.containsDigit(password);
        assertEquals(expected, actual);
    }

    @Test
    void containsDigit_shouldBeTrue_whenContains3Digits() {
        String password= "abcde3f2g1";
        boolean expected= true;
        boolean actual;

        actual= PasswordValidator.containsDigit(password);
        assertEquals(expected, actual);
    }

    @Test
    void containsDigit_shouldBeTrue_whenContainsOnlyDigits() {
        String password= "012345678";
        boolean expected= true;
        boolean actual;

        actual= PasswordValidator.containsDigit(password);
        assertEquals(expected, actual);
    }

    @Test
    void containsDigit_shouldBeFalse_whenNULL() {
        String password= null;
        boolean expected= false;
        boolean actual;

        actual= PasswordValidator.containsDigit(password);
        assertEquals(expected, actual);
    }

    @Test
    void containsUpperAndLower_shouldBeFalse_whenABCDEFG1() {
        String password= "ABCDEFG1";
        boolean expected= false;
        boolean actual;

        actual= PasswordValidator.containsUpperAndLower(password);
        assertEquals(expected, actual);
    }

    @Test
    void containsUpperAndLower_shouldBeFalse_whenabcdefg1() {
        String password= "abcdefg1";
        boolean expected= false;
        boolean actual;

        actual= PasswordValidator.containsUpperAndLower(password);
        assertEquals(expected, actual);
    }

    @Test
    void containsUpperAndLower_shouldBeTrue_whenPasswort1() {
        String password= "Passwort1";
        boolean expected= true;
        boolean actual;

        actual= PasswordValidator.containsUpperAndLower(password);
        assertEquals(expected, actual);
    }

    @Test
    void isCommonPassword() {
    }
}