/*
 * File: IfElseIfExample.java
 *
 * Purpose:
 *   This file demonstrates the use of the `if-else-if` ladder in Java.
 *   The `if-else-if` structure allows multiple possible conditions to be
 *   evaluated in sequence until one branch is executed.
 *
 *   Key Concepts Covered:
 *   1. Basic if-else-if ladder
 *   2. Using relational operators in conditions
 *   3. Grading system example
 *   4. Nested if-else-if
 *   5. Real-world scenario
 */

public class IfElseIfExample {
    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1. Basic if-else-if ladder
        // ----------------------------------------------------
        System.out.println("=== Basic If-Else-If Ladder ===");
        int number = 0;

        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }

        // ----------------------------------------------------
        // 2. Relational operators with if-else-if
        // ----------------------------------------------------
        System.out.println("\n=== Relational Operators Example ===");
        int x = 15;

        if (x < 10) {
            System.out.println("x is less than 10.");
        } else if (x >= 10 && x <= 20) {
            System.out.println("x is between 10 and 20.");
        } else {
            System.out.println("x is greater than 20.");
        }

        // ----------------------------------------------------
        // 3. Grading System Example
        // ----------------------------------------------------
        System.out.println("\n=== Grading System Example ===");
        int score = 78;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else if (score >= 60) {
            System.out.println("Grade: C");
        } else if (score >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // ----------------------------------------------------
        // 4. Nested if-else-if
        // ----------------------------------------------------
        System.out.println("\n=== Nested If-Else-If Example ===");
        int age = 25;
        boolean hasLicense = true;

        if (age >= 18) {
            if (hasLicense) {
                System.out.println("You are allowed to drive.");
            } else {
                System.out.println("You need a driver’s license to drive.");
            }
        } else {
            System.out.println("You are underage and cannot drive.");
        }

        // ----------------------------------------------------
        // 5. Real-World Scenario: Restaurant Discount
        // ----------------------------------------------------
        System.out.println("\n=== Real-World Example: Restaurant Discount ===");
        double billAmount = 120.0;

        if (billAmount >= 200) {
            System.out.println("You get a 20% discount!");
        } else if (billAmount >= 100) {
            System.out.println("You get a 10% discount!");
        } else if (billAmount >= 50) {
            System.out.println("You get a 5% discount!");
        } else {
            System.out.println("No discount available.");
        }
    }
}
