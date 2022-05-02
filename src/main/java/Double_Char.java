public class Double_Char {

    /**
     * https://www.codewars.com/kata/56b1f01c247c01db92000076
     */

    public static String doubleChar(String s){
        char[] arr = s.toCharArray();
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
            str += arr[i];
        }

        return str;
    }
}
