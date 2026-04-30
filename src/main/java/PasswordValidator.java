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

    public static boolean containsDigit(String password) {
        return false;
    }

    public static boolean containsUpperAndLower(String password) {
        return false;
    }

    public static boolean isCommonPassword(String password) // kleine interne Liste
    {
        return false;
    }
}
