package examples;

/****************************************************
 * File: RelationalOperatorsExample.java
 * Purpose:
 *   To demonstrate how relational operators work in Java.
 *   Relational operators are used to compare two values
 *   and return a boolean result (true/false).
 *
 * Covered Concepts:
 *   1. List of relational operators
 *   2. Comparisons with primitive types
 *   3. Comparisons with char values (ASCII/Unicode based)
 *   4. Comparisons between objects (== vs equals)
 *   5. Real-world style examples
 ****************************************************/

public class RelationalOperatorsExample {

    public static void main(String[] args) {

        /****************************************
         * 1. Basic Relational Operators
         ****************************************/
        int a = 10;
        int b = 20;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a < b : " + (a < b));   // true
        System.out.println("a > b : " + (a > b));   // false
        System.out.println("a <= b: " + (a <= b));  // true
        System.out.println("a >= b: " + (a >= b));  // false
        System.out.println("a == b: " + (a == b));  // false
        System.out.println("a != b: " + (a != b));  // true

        System.out.println("--------------------------------");

        /****************************************
         * 2. Relational Operators with Characters
         *    Java compares char values based on
         *    their Unicode (ASCII) values.
         ****************************************/
        char x = 'A'; // Unicode 65
        char y = 'C'; // Unicode 67

        System.out.println("x = " + x + " (65), y = " + y + " (67)");
        System.out.println("x < y : " + (x < y));   // true (65 < 67)
        System.out.println("x > y : " + (x > y));   // false
        System.out.println("x == y: " + (x == y));  // false
        System.out.println("x != y: " + (x != y));  // true

        System.out.println("--------------------------------");

        /****************************************
         * 3. Comparing Floating Point Numbers
         ****************************************/
        double d1 = 5.5;
        double d2 = 5.5;
        double d3 = 6.0;

        System.out.println("d1 == d2: " + (d1 == d2)); // true
        System.out.println("d1 < d3 : " + (d1 < d3));  // true
        System.out.println("d1 != d3: " + (d1 != d3)); // true

        System.out.println("--------------------------------");

        /****************************************
         * 4. Comparing Objects: == vs equals()
         *
         * ==  → compares memory reference (location)
         * equals() → compares actual content
         ****************************************/
        String str1 = new String("Java");
        String str2 = new String("Java");

        System.out.println("str1 == str2     : " + (str1 == str2));       // false (different memory objects)
        System.out.println("str1.equals(str2): " + (str1.equals(str2)));  // true  (same content)

        System.out.println("--------------------------------");

        /****************************************
         * 5. Real-World Example:
         *    Check if someone is eligible to vote
         ****************************************/
        int age = 17;
        boolean isEligible = age >= 18;

        System.out.println("Age = " + age);
        System.out.println("Is eligible to vote? " + isEligible); // false

        age = 20;
        isEligible = age >= 18;
        System.out.println("Age = " + age);
        System.out.println("Is eligible to vote? " + isEligible); // true
    }
}
