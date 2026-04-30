public final class PasswordValidator {
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
        char[] chars= password.toCharArray();

        for (char c:chars){
            if (Character.isLowerCase(c)){
                return true;
            }
        }
        return false;
    }

    public static boolean isCommonPassword(String password) // kleine interne Liste
    {
        return false;
    }
}
