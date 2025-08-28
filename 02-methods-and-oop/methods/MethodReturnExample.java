/****************************************************
 * File: MethodReturnExample.java
 * Purpose:
 *   To teach how return values work in Java methods.
 *
 * What is a Return Value?
 *   - A return value is the result a method gives back
 *     after completing its task.
 *   - Methods can return different types: int, double,
 *     boolean, String, objects, etc.
 *   - If a method does not return anything, we use "void".
 *
 * Key Concepts Covered:
 *   1. Methods that return primitive values
 *   2. Methods that return boolean values
 *   3. Methods that return objects
 *   4. Importance of the "return" statement
 ****************************************************/

public class MethodReturnExample {

    /****************************************
     * 1. Returning a Primitive Value
     ****************************************/
    public static int square(int number) {
        return number * number; // returns the square
    }

    public static double calculateAreaOfCircle(double radius) {
        double area = Math.PI * radius * radius;
        return area; // returns computed value
    }

    /****************************************
     * 2. Returning a Boolean
     ****************************************/
    public static boolean isEven(int number) {
        return number % 2 == 0; // true if divisible by 2
    }

    /****************************************
     * 3. Returning a String (Object)
     ****************************************/
    public static String greet(String name) {
        return "Hello, " + name + "! Welcome to Java methods.";
    }

    /****************************************
     * 4. Returning an Array (Object Reference)
     ****************************************/
    public static int[] createArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1; // fill array with 1...size
        }
        return arr; // returns the entire array
    }

    /****************************************
     * MAIN METHOD
     ****************************************/
    public static void main(String[] args) {

        // 1. Returning primitives
        System.out.println("=== Example 1: Returning Primitives ===");
        int result = square(6);
        System.out.println("Square of 6 = " + result);

        double circleArea = calculateAreaOfCircle(5.0);
        System.out.println("Area of circle with radius 5 = " + circleArea);

        // 2. Returning boolean
        System.out.println("\n=== Example 2: Returning Boolean ===");
        System.out.println("Is 10 even? " + isEven(10));
        System.out.println("Is 7 even? " + isEven(7));

        // 3. Returning String
        System.out.println("\n=== Example 3: Returning String ===");
        String message = greet("Alice");
        System.out.println(message);

        // 4. Returning an array
        System.out.println("\n=== Example 4: Returning Arrays ===");
        int[] numbers = createArray(5);
        System.out.print("Array returned: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 5. Importance of return
        System.out.println("\n=== Example 5: Importance of Return ===");
        // A return ends the method immediately and sends back a value.
        if (isEven(4)) {
            System.out.println("Method confirmed 4 is even.");
        }
    }
}
