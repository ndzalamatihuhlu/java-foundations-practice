// Java code​​​​​​‌‌‌​​​​​​‌‌​​​​‌​​‌​​‌​‌​ below
/***************************************************
 Write your answer here, and then test your code.
 Your job is to use a decision structure to test if
 the number of coins equals 1.00.
 ****************************************************/

class Answer {

    /***************************************************
     Change these boolean values to control whether you see
     the expected result and/or hints.
     ****************************************************/
    static boolean showExpectedResult = true;
    static boolean showHints = true;

    static boolean isADollar(int numOfPennies, int numOfNickels, int numOfDimes, int numOfQuarters) {
        /***************************************************
         Value of each coin
         ****************************************************/
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        double dollar = 1.00;

        boolean won = false;

        Double pennies = penny * numOfPennies;;
        Double nickels = nickel * numOfNickels;
        Double dimes = dime * numOfDimes;
        Double quarters = quarter * numOfQuarters;
        Double total = pennies + nickels + dimes + quarters;
        if (total == dollar) {
            won = true;
        }
        return won;
    }

}
