import java.util.Arrays;

public class ALTerNAtiNG_CaSe {
    /**
     * https://www.codewars.com/kata/56efc695740d30f963000557/train/java
     */
    public static String toAlternativeString(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                str1 += Character.toLowerCase(str.charAt(i));
            } else {
                str1 += Character.toUpperCase(str.charAt(i));
            }
        }

        return str1;
    }
}