/****************************************************
 * File: MethodOverloadingExample.java
 * Purpose:
 *   To teach method overloading in Java.
 *
 * What is Method Overloading?
 *   - Method overloading means having multiple methods
 *     with the SAME NAME but DIFFERENT parameter lists.
 *   - The compiler decides which method to use based
 *     on the number and type of arguments passed.
 *
 * Why use it?
 *   - Improves code readability.
 *   - Allows one method name to handle multiple scenarios.
 *
 * Key Concepts Covered:
 *   1. Same method name with different parameter counts
 *   2. Same method name with different parameter types
 *   3. Real-world calculator example
 ****************************************************/

public class MethodOverloadingExample {

    /****************************************
     * 1. Overloading with Different Parameter Counts
     ****************************************/
    public static void printMessage() {
        System.out.println("Hello, World!");
    }

    public static void printMessage(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void printMessage(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    /****************************************
     * 2. Overloading with Different Parameter Types
     ****************************************/
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b; // concatenates strings
    }

    /****************************************
     * 3. Real-World Example: Calculator
     ****************************************/
    public static int calculate(int a, int b) {
        return a + b; // default: add two ints
    }

    public static int calculate(int a, int b, int c) {
        return a + b + c; // add three ints
    }

    public static double calculate(double a, double b) {
        return a * b; // multiply two doubles
    }

    /****************************************
     * MAIN METHOD
     ****************************************/
    public static void main(String[] args) {

        // 1. Overloading with different parameter counts
        System.out.println("=== Example 1: Overloading with Different Parameter Counts ===");
        printMessage();
        printMessage("Alice");
        printMessage("Bob", 25);

        // 2. Overloading with different parameter types
        System.out.println("\n=== Example 2: Overloading with Different Parameter Types ===");
        System.out.println("Add ints: 5 + 10 = " + add(5, 10));
        System.out.println("Add doubles: 5.5 + 4.5 = " + add(5.5, 4.5));
        System.out.println("Add strings: \"Java\" + \" Rocks\" = " + add("Java", " Rocks"));

        // 3. Real-world calculator
        System.out.println("\n=== Example 3: Real-World Calculator ===");
        System.out.println("Calculate (two ints): " + calculate(10, 20));
        System.out.println("Calculate (three ints): " + calculate(10, 20, 30));
        System.out.println("Calculate (two doubles): " + calculate(2.5, 4.0));
    }
}
