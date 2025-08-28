package examples;
/*
 * File: TypePromotionExample.java
 *
 * Purpose:
 *   Demonstrates type promotion rules in Java during arithmetic
 *   and mixed-type operations.
 *
 * Key Concepts Covered:
 *   1. Automatic promotion of byte, short, and char to int in expressions.
 *   2. Mixed-type arithmetic (e.g., int with double).
 *   3. Promotion of operands to the "largest" type in the operation.
 *   4. Real-world style examples.
 */

public class TypePromotionExample {

    public static void main(String[] args) {

        System.out.println("=== Promotion of byte and short to int ===");
        byte b1 = 10;
        byte b2 = 20;
        // b1 + b2 → promoted to int
        int sum = b1 + b2;
        System.out.println("byte + byte → int: " + sum);

        short s1 = 1000;
        short s2 = 2000;
        // s1 + s2 → promoted to int
        int sumShorts = s1 + s2;
        System.out.println("short + short → int: " + sumShorts);

        // ----------------------------------------------------

        System.out.println("\n=== Char promotion to int ===");
        char c1 = 'A'; // Unicode 65
        char c2 = 'B'; // Unicode 66
        int charSum = c1 + c2; // promoted to int
        System.out.println("char 'A' + char 'B' → int: " + charSum);

        // ----------------------------------------------------

        System.out.println("\n=== Mixed-type arithmetic ===");
        int i = 50;
        double d = 12.5;
        double result = i + d; // int promoted to double
        System.out.println("int + double → double: " + result);

        float f = 5.5f;
        long l = 20L;
        float result2 = f + l; // long promoted to float
        System.out.println("float + long → float: " + result2);

        // ----------------------------------------------------

        System.out.println("\n=== Chain of promotions ===");
        byte smallByte = 42;
        char letter = 'C'; // Unicode 67
        int promotedResult = smallByte + letter; // both → int
        System.out.println("byte + char → int: " + promotedResult);

        // ----------------------------------------------------

        System.out.println("\n=== Real-world Example: Average Calculation ===");
        int score1 = 90;
        int score2 = 85;
        int score3 = 88;
        double average = (score1 + score2 + score3) / 3.0; // int promoted to double
        System.out.println("Average score (double): " + average);
    }
}
