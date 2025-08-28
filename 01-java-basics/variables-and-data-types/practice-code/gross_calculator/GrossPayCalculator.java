package gross_calculator;

import java.util.Scanner;

/**
 * A simple program to calculate gross pay.
 * Steps:
 * 1. Get the number of hours worked
 * 2. Get the hourly pay rate
 * 3. Multiply hours and pay rate
 * 4. Display result
 */
public class GrossPayCalculator {

    public static void main(String[] args) {
        // 1. Get the number of hours worked
        int hours = 0;
        System.out.println("How many hours did you work this month?");
        Scanner userInput = new Scanner(System.in);
        hours = userInput.nextInt();

        // 2. Get the hourly pay rate
        double payRate = 0;
        System.out.println("What was your hourly rate?");
        userInput = new Scanner(System.in);
        payRate = userInput.nextDouble();

        // 3. Multiply hours and pay rate
        double grossPay = hours * payRate;

        // 4. Display result
        System.out.println("Gross Pay: R" + grossPay);
        userInput.close();
    }
}
