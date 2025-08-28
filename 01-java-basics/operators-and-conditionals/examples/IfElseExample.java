/*
 * File: IfElseExample.java
 *
 * Purpose:
 *   This file demonstrates the use of if, if-else, and nested if statements in Java.
 *   The if-else structure is one of the most common decision-making tools in programming.
 *
 *   Key Concepts Covered:
 *   1. Basic if statement
 *   2. If-else statement
 *   3. If-else if ladder
 *   4. Nested if statements
 *   5. Real-world example (grading system)
 */

public class IfElseExample {
    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1. Basic if statement
        // ----------------------------------------------------
        System.out.println("=== Basic If Statement ===");
        int number = 10;

        if (number > 5) {
            System.out.println("The number is greater than 5.");
        }

        // ----------------------------------------------------
        // 2. If-else statement
        // ----------------------------------------------------
        System.out.println("\n=== If-Else Statement ===");
        int age = 16;

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // ----------------------------------------------------
        // 3. If-else if ladder
        // ----------------------------------------------------
        System.out.println("\n=== If-Else If Ladder ===");
        int score = 75;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // ----------------------------------------------------
        // 4. Nested if statements
        // ----------------------------------------------------
        System.out.println("\n=== Nested If Statements ===");
        boolean isMember = true;
        double purchaseAmount = 120.0;

        if (isMember) {
            if (purchaseAmount > 100) {
                System.out.println("You qualify for a 20% discount.");
            } else {
                System.out.println("You qualify for a 10% discount.");
            }
        } else {
            System.out.println("Join our membership program to get discounts!");
        }

        // ----------------------------------------------------
        // 5. Real-world Example: Simple Grading
        // ----------------------------------------------------
        System.out.println("\n=== Real-World Example: Voting Eligibility ===");
        int citizenAge = 20;
        boolean registered = true;

        if (citizenAge >= 18) {
            if (registered) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You must register before voting.");
            }
        } else {
            System.out.println("You are not old enough to vote.");
        }
    }
}
