/** Main class of PasswordProject
 *
 *  starting point for password validation
 * @author Michael Reinisch
 */
public class Main {
    static void main() {
        System.out.println("Hello World!");
    }

    /** Checks the password for validity.
     *
     * @param password to check
     * @return true, if valid, else false
     */
    public static boolean isValid(String password){
        boolean test1= false;
        boolean test2= false;
        boolean test3= false;
        boolean test4= false;

        test1= PasswordValidator.hasMinLength(password, 8);
        test2= PasswordValidator.containsDigit(password);
        test3= PasswordValidator.containsUpperAndLower(password);
        test4= PasswordValidator.isCommonPassword(password);
        if (test1 && test2 && test3 && (!test4)){
            return true;
        }
        return false;
    }
}
