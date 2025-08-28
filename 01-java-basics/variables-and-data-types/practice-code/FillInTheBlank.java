/**
 * FillInTheBlank
 * A simple practice exercise that demonstrates how to build
 * a story string using variables and string concatenation.
 */
public class FillInTheBlank {

    public static void main(String[] args) {
        // Example 1
        String season1 = "winter";
        int cups1 = 4;
        String adjective1 = "cold";

        // Example 2
        String season2 = "summer";
        int cups2 = 0;
        String adjective2 = "rainy";

        // Print results
        System.out.println(fillInTheBlank(season1, cups1, adjective1));
        System.out.println(fillInTheBlank(season2, cups2, adjective2));
    }

    /**
     * Builds a complete story sentence using the given inputs.
     *
     * @param season       the season of the year
     * @param numberOfCups the number of cups of coffee
     * @param adjective    a descriptive adjective
     * @return the completed story
     */
    public static String fillInTheBlank(String season, int numberOfCups, String adjective) {
        return "On a "
                + adjective
                + " " + season
                + " day, I drink a minimum of "
                + numberOfCups
                + " cups of coffee.";
    }
}
