package examples;
/****************************************************
 * File: ForLoopExample.java
 * Purpose:
 *   Demonstrates the use of the for loop in Java.
 *   A for loop is often used when the number of
 *   iterations is known in advance.
 *
 * Key Concepts Covered:
 *   1. Basic for loop
 *   2. Reverse iteration
 *   3. Nested for loops (multiplication table)
 *   4. Real-world style example (sum of numbers)
 ****************************************************/

public class ForLoopExample {

    public static void main(String[] args) {

        /****************************************
         * 1. Basic For Loop
         ****************************************/
        System.out.println("=== Basic For Loop ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        /****************************************
         * 2. Reverse Iteration
         ****************************************/
        System.out.println("\n=== Reverse Iteration ===");
        for (int i = 5; i >= 1; i--) {
            System.out.println("Countdown: " + i);
        }

        /****************************************
         * 3. Nested For Loops (Multiplication Table)
         ****************************************/
        System.out.println("\n=== Multiplication Table (1 to 5) ===");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print((row * col) + "\t"); // tab-separated
            }
            System.out.println(); // new line after each row
        }

        /****************************************
         * 4. Real-World Example: Sum of Numbers
         ****************************************/
        System.out.println("\n=== Sum of Numbers from 1 to 10 ===");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
