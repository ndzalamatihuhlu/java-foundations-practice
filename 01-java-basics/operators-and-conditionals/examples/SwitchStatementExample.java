/*
 * File: SwitchStatementExample.java
 *
 * Purpose:
 *   This file demonstrates how to use the traditional switch statement in Java.
 *   Unlike the modern switch expression (Java 12+), the switch statement does not
 *   directly return values and requires 'break' statements to prevent fall-through.
 *
 *   Key Concepts Covered:
 *   1. Basic switch statement with break.
 *   2. Fall-through behavior when 'break' is omitted.
 *   3. Grouped case labels.
 *   4. Use of the default case.
 */

public class SwitchStatementExample {
    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1. Basic switch statement with break
        // ----------------------------------------------------
        System.out.println("=== Basic Switch Statement with Break ===");
        int day = 3; // Example: 1 = Monday, 2 = Tuesday, etc.

        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // Stops execution here
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // ----------------------------------------------------
        // 2. Fall-through Example (no break)
        // ----------------------------------------------------
        System.out.println("\n=== Fall-through Example ===");
        int number = 2;

        switch (number) {
            case 1:
                System.out.println("Case 1");
            case 2:
                System.out.println("Case 2");
            case 3:
                System.out.println("Case 3");
            default:
                System.out.println("Default case");
        }
        // Notice: When number = 2, output will include Case 2, Case 3, and Default case.
        // This is called "fall-through" behavior.

        // ----------------------------------------------------
        // 3. Grouped case labels
        // ----------------------------------------------------
        System.out.println("\n=== Grouped Case Labels ===");
        String fruit = "Apple";

        switch (fruit) {
            case "Apple":
            case "Mango":
            case "Banana":
                System.out.println("This is a fruit.");
                break;
            case "Carrot":
            case "Spinach":
                System.out.println("This is a vegetable.");
                break;
            default:
                System.out.println("Not sure what this is.");
        }

        // ----------------------------------------------------
        // 4. Default case demonstration
        // ----------------------------------------------------
        System.out.println("\n=== Default Case Example ===");
        int option = 9;

        switch (option) {
            case 1:
                System.out.println("Option 1 selected");
                break;
            case 2:
                System.out.println("Option 2 selected");
                break;
            default:
                System.out.println("Invalid option — please try again.");
        }
    }
}
