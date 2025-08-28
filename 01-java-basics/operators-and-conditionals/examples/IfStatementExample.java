/*
 * File: IfStatementExample.java
 *
 * Purpose:
 *   This file demonstrates the use of basic `if` statements in Java.
 *   The `if` statement allows conditional execution of code blocks.
 *
 *   Key Concepts Covered:
 *   1. Simple if statement
 *   2. Using relational operators with if
 *   3. Using logical operators with if
 *   4. Nested if statements
 *   5. Real-world example
 */

public class IfStatementExample {
    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1. Simple if statement
        // ----------------------------------------------------
        System.out.println("=== Simple If Statement ===");
        int number = 7;

        if (number > 5) {
            System.out.println("The number is greater than 5.");
        }

        // ----------------------------------------------------
        // 2. Using relational operators with if
        // ----------------------------------------------------
        System.out.println("\n=== Relational Operators with If ===");
        int x = 10;

        if (x == 10) {
            System.out.println("x is equal to 10.");
        }
        if (x != 5) {
            System.out.println("x is not equal to 5.");
        }
        if (x > 5) {
            System.out.println("x is greater than 5.");
        }
        if (x < 20) {
            System.out.println("x is less than 20.");
        }

        // ----------------------------------------------------
        // 3. Using logical operators with if
        // ----------------------------------------------------
        System.out.println("\n=== Logical Operators with If ===");
        int age = 25;
        boolean hasLicense = true;

        // AND (&&)
        if (age >= 18 && hasLicense) {
            System.out.println("You are allowed to drive.");
        }

        // OR (||)
        boolean hasPermission = false;
        if (age >= 18 || hasPermission) {
            System.out.println("You can enter the restricted area.");
        }

        // NOT (!)
        boolean isRaining = false;
        if (!isRaining) {
            System.out.println("You can go for a walk. It’s not raining.");
        }

        // ----------------------------------------------------
        // 4. Nested if statements
        // ----------------------------------------------------
        System.out.println("\n=== Nested If Statements ===");
        int score = 95;

        if (score >= 90) {
            if (score == 100) {
                System.out.println("Perfect score!");
            } else {
                System.out.println("Excellent! You scored above 90.");
            }
        }

        // ----------------------------------------------------
        // 5. Real-world Example: Bank withdrawal
        // ----------------------------------------------------
        System.out.println("\n=== Real-World Example: Bank Withdrawal ===");
        double balance = 500.0;
        double withdrawAmount = 200.0;

        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
}
