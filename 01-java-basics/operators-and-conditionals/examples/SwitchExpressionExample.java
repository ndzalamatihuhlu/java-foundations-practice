/*
 * File: SwitchExpressionExample.java
 *
 * Purpose:
 *   This file demonstrates the difference between the traditional switch statement
 *   and the modern switch expression introduced in Java 12+.
 *
 *   Key Concepts Covered:
 *   1. Traditional switch statement (with break).
 *   2. Fall-through behavior if 'break' is missing.
 *   3. Grouped case labels.
 *   4. Modern switch expression (with ->).
 *   5. Multiple statements in switch expressions (using yield).
 *   6. Using switch expressions to return values directly.
 */

public class SwitchExpressionExample {
    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1. Traditional switch statement
        // ----------------------------------------------------
        System.out.println("=== Traditional Switch Statement ===");
        int day = 3; // 1 = Monday, 2 = Tuesday, etc.

        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // prevents fall-through
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
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
        // Output shows all cases from '2' onward, because no breaks are used.

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
            default:
                System.out.println("Not sure what this is.");
        }

        // ----------------------------------------------------
        // 4. Modern switch expression (arrow -> syntax)
        // ----------------------------------------------------
        System.out.println("\n=== Switch Expression (Arrow Syntax) ===");
        int dayOfWeek = 5;
        String dayName = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

        System.out.println("Day name: " + dayName);

        // ----------------------------------------------------
        // 5. Multiple statements inside a switch expression
        //    Requires { } and 'yield'
        // ----------------------------------------------------
        System.out.println("\n=== Multiple Statements in Switch Expressions ===");
        float firstNumber = 10;
        float secondNumber = 4;
        String operation = "-";

        float result = switch (operation) {
            case "+" -> {
                System.out.println("Adding numbers...");
                yield firstNumber + secondNumber; // return value
            }
            case "-" -> {
                System.out.println("Subtracting numbers...");
                yield firstNumber - secondNumber;
            }
            case "*" -> {
                System.out.println("Multiplying numbers...");
                yield firstNumber * secondNumber;
            }
            case "/" -> {
                System.out.println("Dividing numbers...");
                if (secondNumber == 0) {
                    System.out.println("Error: Division by zero!");
                    yield 0;
                } else {
                    yield firstNumber / secondNumber;
                }
            }
            default -> {
                System.out.println("Unknown operation!");
                yield 0;
            }
        };

        System.out.println("Result of operation: " + result);

        // ----------------------------------------------------
        // 6. Using switch expression with grouped labels
        // ----------------------------------------------------
        System.out.println("\n=== Switch Expression with Grouped Labels ===");
        String season = "April";

        String seasonType = switch (season) {
            case "December", "January", "February" -> "Winter";
            case "March", "April", "May" -> "Spring";
            case "June", "July", "August" -> "Summer";
            case "September", "October", "November" -> "Autumn";
            default -> "Unknown season";
        };

        System.out.println("Season: " + seasonType);
    }
}
