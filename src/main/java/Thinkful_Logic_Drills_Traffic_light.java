public class Thinkful_Logic_Drills_Traffic_light {

    /**
     * https://www.codewars.com/kata/58649884a1659ed6cb000072/train/java
     */

    public static String updateLight(String current) {

        return (current.equals("red") ? "green"
                : current.equals("yellow") ? "red" : "yellow");
    }
}
