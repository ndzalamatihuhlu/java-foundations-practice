package examples;

/****************************************************
 * File: NestedLoopsExample.java
 * Purpose:
 *   Demonstrates the use of nested loops in Java.
 *   Nested loops are loops placed inside other loops,
 *   useful for working with grids, tables, and patterns.
 *
 * Key Concepts Covered:
 *   1. Basic nested loops
 *   2. Multiplication table
 *   3. Pattern printing (stars)
 *   4. Real-world example (matrix traversal)
 ****************************************************/

public class NestedLoopsExample {

    public static void main(String[] args) {

        /****************************************
         * 1. Basic Nested Loop
         ****************************************/
        System.out.println("=== Basic Nested Loop ===");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }

        /****************************************
         * 2. Multiplication Table
         ****************************************/
        System.out.println("\n=== Multiplication Table (1 to 5) ===");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print((row * col) + "\t");
            }
            System.out.println();
        }

        /****************************************
         * 3. Pattern Printing: Right-Angled Triangle
         ****************************************/
        System.out.println("\n=== Pattern: Right-Angled Triangle ===");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /****************************************
         * 4. Real-World Example: Matrix Traversal
         ****************************************/
        System.out.println("\n=== Matrix Traversal ===");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
