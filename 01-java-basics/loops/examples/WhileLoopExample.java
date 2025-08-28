package examples;
/****************************************************
 * File: WhileLoopExample.java
 * Purpose:
 *   Demonstrates the use of the while loop in Java.
 *   A while loop repeatedly executes a block of code
 *   as long as its condition evaluates to true.
 *
 * Key Concepts Covered:
 *   1. Basic while loop
 *   2. Infinite loop (concept demonstration)
 *   3. Real-world style example (ATM PIN attempts)
 ****************************************************/

import java.util.Scanner;

public class WhileLoopExample {

    public static void main(String[] args) {

        /****************************************
         * 1. Basic While Loop
         ****************************************/
        System.out.println("=== Basic While Loop ===");

        int counter = 1;
        while (counter <= 5) {
            System.out.println("Counter: " + counter);
            counter++; // increment to avoid infinite loop
        }

        /****************************************
         * 2. Infinite Loop (⚠️ Concept Only)
         *    Uncomment to test but terminate manually.
         ****************************************/
        /*
        while (true) {
            System.out.println("This is an infinite loop!");
        }
        */

        /****************************************
         * 3. Real-World Example: ATM PIN Attempts
         ****************************************/
        System.out.println("\n=== ATM PIN Attempts Example ===");

        Scanner scanner = new Scanner(System.in);
        int correctPin = 1234;
        int enteredPin;
        int attempts = 0;
        int maxAttempts = 3;

        while (attempts < maxAttempts) {
            System.out.print("Enter your PIN: ");
            enteredPin = scanner.nextInt();
            attempts++;

            if (enteredPin == correctPin) {
                System.out.println("PIN accepted. Access granted!");
                break; // exit the loop
            } else {
                System.out.println("Incorrect PIN. Attempts left: " + (maxAttempts - attempts));
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Too many failed attempts. Account locked.");
        }

        scanner.close();
    }
}
