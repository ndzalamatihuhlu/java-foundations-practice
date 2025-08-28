/*
 * File: LiteralsExample.java
 *
 * Purpose:
 *   Demonstrates different types of literals in Java.
 *
 * Key Concepts Covered:
 *   1. Integer literals (decimal, binary, octal, hexadecimal, underscores)
 *   2. Floating-point literals (float, double, scientific notation)
 *   3. Character literals (direct, Unicode, escape sequences)
 *   4. Boolean literals
 *   5. String literals
 */

public class LiteralsExample {

    public static void main(String[] args) {
        // ----------------------------------------------------
        // 1. Integer Literals
        // ----------------------------------------------------
        System.out.println("=== Integer Literals ===");

        int decimal = 42;       // normal decimal literal
        int binary = 0b101010;  // binary literal (prefix 0b, Java 7+)
        int octal = 052;        // octal literal (prefix 0)
        int hex = 0x2A;         // hexadecimal literal (prefix 0x)
        int withUnderscores = 1_000_000; // underscores for readability

        System.out.println("Decimal: " + decimal);
        System.out.println("Binary (0b101010): " + binary);
        System.out.println("Octal (052): " + octal);
        System.out.println("Hexadecimal (0x2A): " + hex);
        System.out.println("With underscores: " + withUnderscores);

        // ----------------------------------------------------
        // 2. Floating-Point Literals
        // ----------------------------------------------------
        System.out.println("\n=== Floating-Point Literals ===");

        float f = 3.14f;             // float literal (must end with f or F)
        double d1 = 3.14159;         // double literal (default for decimals)
        double d2 = 2.5e3;           // scientific notation (2.5 × 10^3 = 2500.0)
        double d3 = 1.2E-4;          // scientific notation (1.2 × 10^-4 = 0.00012)

        System.out.println("Float literal: " + f);
        System.out.println("Double literal: " + d1);
        System.out.println("Scientific notation (2.5e3): " + d2);
        System.out.println("Scientific notation (1.2E-4): " + d3);

        // ----------------------------------------------------
        // 3. Character Literals
        // ----------------------------------------------------
        System.out.println("\n=== Character Literals ===");

        char c1 = 'A';               // single character literal
        char c2 = '\u0041';          // Unicode representation of 'A'
        char c3 = '\n';              // escape sequence (newline)
        char c4 = '\t';              // escape sequence (tab)

        System.out.println("Character 'A': " + c1);
        System.out.println("Unicode '\\u0041': " + c2);
        System.out.println("Escape sequence newline (printed before this)");
        System.out.print(c3); // new line effect
        System.out.println("Escape sequence tab: Before" + c4 + "After");

        // ----------------------------------------------------
        // 4. Boolean Literals
        // ----------------------------------------------------
        System.out.println("\n=== Boolean Literals ===");

        boolean isJavaFun = true;
        boolean isFishFlying = false;

        System.out.println("Boolean true: " + isJavaFun);
        System.out.println("Boolean false: " + isFishFlying);

        // ----------------------------------------------------
        // 5. String Literals
        // ----------------------------------------------------
        System.out.println("\n=== String Literals ===");

        String greeting = "Hello, Java!";
        String multiLine = "Line1\nLine2\nLine3"; // newline escape sequence
        String withQuotes = "She said, \"Java is powerful!\"";

        System.out.println("String: " + greeting);
        System.out.println("Multiline (with \\n): \n" + multiLine);
        System.out.println("String with quotes: " + withQuotes);
    }
}
