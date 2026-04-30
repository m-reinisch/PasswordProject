import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class PasswordValidator {
//    static final Set<String> common= new HashSet<>();

    /** Test whether a text has at least a certain length.
     *
     * @param password text to check
     * @param min required length
     * @return true, if text has required length, else false
     */
    public static boolean hasMinLength(String password, int min){

        if (password==null) {
          return false;
        } else if(password.length()>=min) {
            return true;
        } else {
            return false;
        }
    }

    /** Test whether a text contains at least one digit.
     *
     * @param password text to check
     * @return true, if text contains at least one digit, else false
     */
    public static boolean containsDigit(String password) {
        char[] chars;

        if (password==null){
            return false;
        } else {
            chars= password.toCharArray();
        }
        for (char c:chars){
            if (Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

     /** Test whether a text contains at least one uppercase and one lowercase letter.
     *
     * @param password text to check
     * @return true, if text contains upper- and lowercase, else false
     */
    public static boolean containsUpperAndLower(String password) {
        char[] chars;
        boolean upper= false;
        boolean lower= false;

        if (password==null){
            return false;
        } else {
            chars= password.toCharArray();
        }
        for (char c:chars){
            if (Character.isLowerCase(c)){
                lower= true;
            } else if (Character.isUpperCase(c)){
                upper= true;
            }
        }
        if (lower&&upper){
            return true;
        }
        return false;
    }

    /** Checks if text is in the common list.
     *
     * @param password text to check
     * @return true, when text in list, else false
     */
    public static boolean isCommonPassword(String password){ // kleine interne Liste
        String[] common= {"password", "Passwort1", "12345678", "Aa345678", "Passwort123"};

        for (String p:common){
            if(password.equalsIgnoreCase(p)){
                return true;
            }

        }
        return false;
    }
}
