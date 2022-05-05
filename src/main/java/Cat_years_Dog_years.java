public class Cat_years_Dog_years {
    /**
     * https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b/train/java
     */
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 0;
        int dogYears = 0;

        if (humanYears == 1) {
            dogYears = 15;
        } else if (humanYears == 2) {
            catYears = 24;
            dogYears = 24;
        } else {
            catYears = 24 + (4 * (humanYears - 2));
            dogYears = 24 + (5 * (humanYears - 2));
        }

        return new int[]{humanYears,catYears,dogYears};
    }

}
