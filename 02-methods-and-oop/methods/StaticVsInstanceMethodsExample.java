/****************************************************
 * File: StaticVsInstanceMethodsExample.java
 * Purpose:
 *   To teach the difference between static methods
 *   and instance methods in Java.
 *
 * What is a Static Method?
 *   - Belongs to the class, not to a specific object.
 *   - Can be called using the class name.
 *   - Often used for utility/helper methods.
 *
 * What is an Instance Method?
 *   - Belongs to an object created from a class.
 *   - Requires creating an object to call it.
 *   - Often used to work with object data (fields).
 *
 * Key Concepts Covered:
 *   1. Static methods
 *   2. Instance methods
 *   3. Comparing static vs instance
 *   4. Real-world style examples
 ****************************************************/

public class StaticVsInstanceMethodsExample {

    // -------------------------------------------------
    // Static method (class-level, no object needed)
    // -------------------------------------------------
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // -------------------------------------------------
    // Instance variables (object data)
    // -------------------------------------------------
    private String name;

    // Constructor
    public StaticVsInstanceMethodsExample(String name) {
        this.name = name;
    }

    // -------------------------------------------------
    // Instance method (requires an object to call it)
    // -------------------------------------------------
    public void introduceYourself() {
        System.out.println("Hello, my name is " + name);
    }

    // -------------------------------------------------
    // MAIN METHOD
    // -------------------------------------------------
    public static void main(String[] args) {

        /****************************************
         * 1. Static Methods
         ****************************************/
        System.out.println("=== Static Methods ===");
        // Call directly using class name (recommended)
        int sum = StaticVsInstanceMethodsExample.addNumbers(10, 20);
        System.out.println("10 + 20 = " + sum);

        // Can also call without class name inside same class
        System.out.println("30 + 40 = " + addNumbers(30, 40));

        /****************************************
         * 2. Instance Methods
         ****************************************/
        System.out.println("\n=== Instance Methods ===");
        // Create objects to use instance methods
        StaticVsInstanceMethodsExample person1 = new StaticVsInstanceMethodsExample("Alice");
        StaticVsInstanceMethodsExample person2 = new StaticVsInstanceMethodsExample("Bob");

        // Call instance method on objects
        person1.introduceYourself();
        person2.introduceYourself();

        /****************************************
         * 3. Static vs Instance Comparison
         ****************************************/
        System.out.println("\n=== Static vs Instance Comparison ===");
        System.out.println("Static: addNumbers(50, 60) = " + StaticVsInstanceMethodsExample.addNumbers(50, 60));
        System.out.println("Instance: introduceYourself()");
        person1.introduceYourself();

        /****************************************
         * 4. Real-World Example
         ****************************************/
        System.out.println("\n=== Real-World Example ===");
        // Static method as utility (Math class is a real example)
        double result = Math.sqrt(25); // static method, no object needed
        System.out.println("Square root of 25 (using Math.sqrt): " + result);

        // Instance method for unique behavior per object
        StaticVsInstanceMethodsExample student = new StaticVsInstanceMethodsExample("Charlie");
        student.introduceYourself(); // specific to this object
    }
}
