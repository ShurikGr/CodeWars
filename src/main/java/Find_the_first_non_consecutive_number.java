public class Find_the_first_non_consecutive_number {

    /**
     * https://www.codewars.com/kata/58f8a3a27a5c28d92e000144/train/java
     */

    static Integer find(int[] arr) {
        Integer ii = null;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1] + 1) {
                ii = arr[i];
                break;
            }
        }




        return ii;
    }
}
