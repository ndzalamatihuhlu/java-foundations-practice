package lectures_demo;

/**
 * ArithmeticOperatorsDemo
 * Demonstrates the use of arithmetic operators in Java.
 */
public class ArithmeticOperatorsDemo {

    public static void main(String[] args) {

        // 1. Basic arithmetic operations ------------------------
        int a = 10, b = 3;

        System.out.println("Addition (a + b): " + (a + b));       // 13
        System.out.println("Subtraction (a - b): " + (a - b));    // 7
        System.out.println("Multiplication (a * b): " + (a * b)); // 30
        System.out.println("Division (a / b): " + (a / b));       // 3 (integer division)
        System.out.println("Modulus (a % b): " + (a % b));        // 1 (remainder)
        System.out.println("Remainder (a % b): " + (a % b));

        System.out.println("\n \n ****************Line divider***************\n \n");
        // 2. Division with floating-point -----------------------
        double x = 10, y = 3;
        System.out.println("Floating-point division (x / y): " + (x / y)); // 3.333...


        // 3. Increment and Decrement ----------------------------
        int count = 5;

        System.out.println("\n \n ****************Line divider***************\n \n");


        // Post-increment: returns value first, then increments
        System.out.println("Post-increment (count++): " + (count++)); // 5, count becomes 6

        // Pre-increment: increments first, then returns value
        System.out.println("Pre-increment (++count): " + (++count)); // 7

        // Post-decrement: returns value first, then decrements
        System.out.println("Post-decrement (count--): " + (count--)); // 7, count becomes 6

        // Pre-decrement: decrements first, then returns value
        System.out.println("Pre-decrement (--count): " + (--count)); // 5

        System.out.println("\n \n ****************Line divider***************\n \n");

        // 4. Combining operations -------------------------------
        int result = (a + b) * 2; // (10 + 3) * 2 = 26
        System.out.println("Combined expression ((a + b) * 2): " + result);
    }
}
