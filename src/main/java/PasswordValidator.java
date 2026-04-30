public final class PasswordValidator {
    public static boolean hasMinLength(String password, int min);
    public static boolean containsDigit(String password);
    public static boolean containsUpperAndLower(String password);
    public static boolean isCommonPassword(String password); // kleine interne Liste
}
