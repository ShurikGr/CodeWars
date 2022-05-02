public class Remove_exclamation_marks {

    /**
     * https://www.codewars.com/kata/57a0885cbb9944e24c00008e/train/java
     */

    static String removeExclamationMarks(String s) {
        char[] arr = s.toCharArray();
        int count = 0;
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '!') {
                str += arr[i];
            }
        }

        return str;
    }

}
