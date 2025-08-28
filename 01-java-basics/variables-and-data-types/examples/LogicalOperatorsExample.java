package examples;

/****************************************************
 * File: LogicalOperatorsExample.java
 * Purpose:
 *   To demonstrate how logical operators work in Java.
 *   Logical operators are used to combine or invert
 *   boolean expressions.
 *
 * Covered Concepts:
 *   1. AND (&&)
 *   2. OR (||)
 *   3. NOT (!)
 *   4. Truth table demonstrations
 *   5. Real-world style examples
 ****************************************************/

public class LogicalOperatorsExample {

    public static void main(String[] args) {

        /****************************************
         * 1. AND (&&) Operator
         * Returns true only if BOTH conditions are true.
         ****************************************/
        System.out.println("=== AND (&&) Operator ===");
        boolean cond1 = true;
        boolean cond2 = false;

        System.out.println("true && true  : " + (true && true));   // true
        System.out.println("true && false : " + (true && false));  // false
        System.out.println("cond1 && cond2: " + (cond1 && cond2)); // false

        /****************************************
         * 2. OR (||) Operator
         * Returns true if AT LEAST one condition is true.
         ****************************************/
        System.out.println("\n=== OR (||) Operator ===");
        System.out.println("true || true  : " + (true || true));   // true
        System.out.println("true || false : " + (true || false));  // true
        System.out.println("false || false: " + (false || false)); // false

        /****************************************
         * 3. NOT (!) Operator
         * Inverts a boolean value.
         ****************************************/
        System.out.println("\n=== NOT (!) Operator ===");
        System.out.println("!true  : " + (!true));   // false
        System.out.println("!false : " + (!false));  // true

        /****************************************
         * 4. Combining Logical Operators
         ****************************************/
        System.out.println("\n=== Combining Logical Operators ===");
        int age = 25;
        boolean hasLicense = true;

        // Must be at least 18 AND have a license
        if (age >= 18 && hasLicense) {
            System.out.println("Eligible to drive.");
        }

        // Must be under 18 OR not have a license
        if (age < 18 || !hasLicense) {
            System.out.println("Not eligible to drive.");
        } else {
            System.out.println("Meets at least one requirement for driving.");
        }

        /****************************************
         * 5. Real-World Example:
         *    Checking eligibility for a discount
         ****************************************/
        System.out.println("\n=== Real-World Example: Discount Eligibility ===");
        boolean isStudent = true;
        boolean isMember = false;

        if (isStudent || isMember) {
            System.out.println("You are eligible for a discount.");
        } else {
            System.out.println("No discount available.");
        }
    }
}
