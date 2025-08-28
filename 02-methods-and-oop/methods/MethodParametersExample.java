/****************************************************
 * File: MethodParametersExample.java
 * Purpose:
 *   To teach how method parameters work in Java.
 *
 * What are Parameters?
 *   - Parameters are inputs to a method.
 *   - They make methods more flexible because the method
 *     can work with different values each time you call it.
 *
 *   Think of parameters like "ingredients" in a recipe:
 *   You can bake the same cake recipe, but with different
 *   flavors depending on the ingredients you pass in.
 *
 * Key Concepts Covered:
 *   1. Single parameter methods
 *   2. Multiple parameters
 *   3. Passing primitive values
 *   4. Passing reference types (objects)
 *   5. Pass-by-value in Java
 ****************************************************/

public class MethodParametersExample {

    /****************************************
     * 1. Single Parameter Method
     ****************************************/
    public static void printSquare(int number) {
        System.out.println("Square of " + number + " = " + (number * number));
    }

    /****************************************
     * 2. Multiple Parameter Method
     ****************************************/
    public static void printSumAndDifference(int a, int b) {
        int sum = a + b;
        int difference = a - b;
        System.out.println("Sum: " + sum + ", Difference: " + difference);
    }

    /****************************************
     * 3. Passing Primitive Values
     ****************************************/
    // When you pass a primitive, Java copies its value.
    public static void changeValue(int x) {
        x = x + 10; // this change only affects the local copy
        System.out.println("Inside method, x = " + x);
    }

    /****************************************
     * 4. Passing Reference Types (Objects)
     ****************************************/
    // Arrays and objects behave differently because they are references.
    public static void changeFirstElement(int[] arr) {
        arr[0] = 99; // modifies the original array
        System.out.println("Inside method, first element = " + arr[0]);
    }

    /****************************************
     * MAIN METHOD
     ****************************************/
    public static void main(String[] args) {

        // 1. Single parameter
        System.out.println("=== Example 1: Single Parameter ===");
        printSquare(5);
        printSquare(12);

        // 2. Multiple parameters
        System.out.println("\n=== Example 2: Multiple Parameters ===");
        printSumAndDifference(15, 5);
        printSumAndDifference(20, 30);

        // 3. Passing primitive values
        System.out.println("\n=== Example 3: Passing Primitives ===");
        int num = 50;
        System.out.println("Before calling method, num = " + num);
        changeValue(num); // only affects local copy inside the method
        System.out.println("After calling method, num = " + num);

        // 4. Passing reference types
        System.out.println("\n=== Example 4: Passing References ===");
        int[] numbers = {1, 2, 3};
        System.out.println("Before calling method, first element = " + numbers[0]);
        changeFirstElement(numbers); // modifies the actual array
        System.out.println("After calling method, first element = " + numbers[0]);

        // 5. Key takeaway:
        System.out.println("\n=== Summary ===");
        System.out.println("Java is ALWAYS pass-by-value.");
        System.out.println("- For primitives: the value itself is copied.");
        System.out.println("- For objects: the reference is copied, so methods can change object contents.");
    }
}
