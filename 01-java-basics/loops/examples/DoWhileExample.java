package examples;

/****************************************************
 * File: DoWhileExample.java
 * Purpose:
 *   Demonstrates the use of the do-while loop in Java.
 *   A do-while loop executes the code block first,
 *   then checks the condition. This guarantees that
 *   the block runs at least once.
 *
 * Key Concepts Covered:
 *   1. Basic do-while loop
 *   2. Difference between while and do-while
 *   3. Real-world style example (menu selection)
 ****************************************************/

import java.util.Scanner;

public class DoWhileExample {

    public static void main(String[] args) {

        /****************************************
         * 1. Basic Do-While Loop
         ****************************************/
        System.out.println("=== Basic Do-While Loop ===");

        int counter = 1;
        do {
            System.out.println("Counter: " + counter);
            counter++;
        } while (counter <= 5);

        /****************************************
         * 2. Difference Between While and Do-While
         ****************************************/
        System.out.println("\n=== Difference Between While and Do-While ===");

        int number = 10;

        System.out.println("While loop check (number=10, condition: number < 5):");
        while (number < 5) {
            System.out.println("This will NOT execute.");
        }

        System.out.println("Do-while loop check (number=10, condition: number < 5):");
        do {
            System.out.println("This executes ONCE, even though condition is false.");
        } while (number < 5);

        /****************************************
         * 3. Real-World Example: Menu Selection
         ****************************************/
        System.out.println("\n=== Menu Selection Example ===");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Option A");
            System.out.println("2. Option B");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Option A.");
                    break;
                case 2:
                    System.out.println("You selected Option B.");
                    break;
                case 3:
                    System.out.println("Exiting menu. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);

        scanner.close();
    }
}
