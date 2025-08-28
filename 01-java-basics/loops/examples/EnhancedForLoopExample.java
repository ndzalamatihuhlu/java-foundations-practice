package examples;

/****************************************************
 * File: EnhancedForLoopExample.java
 * Purpose:
 *   Demonstrates the use of the enhanced for loop (for-each)
 *   in Java. The enhanced for loop is used to iterate
 *   directly over elements of arrays and collections.
 *
 * Key Concepts Covered:
 *   1. Basic enhanced for loop
 *   2. Iterating through arrays
 *   3. Iterating through collections
 *   4. Real-world style example (average score)
 ****************************************************/

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoopExample {

    public static void main(String[] args) {

        /****************************************
         * 1. Basic Enhanced For Loop with Array
         ****************************************/
        System.out.println("=== Enhanced For Loop with Array ===");
        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        /****************************************
         * 2. Enhanced For Loop with Strings
         ****************************************/
        System.out.println("\n=== Enhanced For Loop with String Array ===");
        String[] fruits = {"Apple", "Banana", "Cherry", "Mango"};

        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        /****************************************
         * 3. Enhanced For Loop with Collections
         ****************************************/
        System.out.println("\n=== Enhanced For Loop with Collection ===");
        List<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");

        for (String student : students) {
            System.out.println("Student: " + student);
        }

        /****************************************
         * 4. Real-World Example: Average Score
         ****************************************/
        System.out.println("\n=== Real-World Example: Average Score ===");
        int[] scores = {85, 90, 78, 92, 88};
        int total = 0;

        for (int score : scores) {
            total += score;
        }

        double average = (double) total / scores.length;
        System.out.println("Average Score = " + average);
    }
}
