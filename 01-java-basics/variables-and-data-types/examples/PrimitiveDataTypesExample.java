package examples;
/*
 * File: PrimitiveDataTypesExample.java
 *
 * Purpose:
 *   Demonstrates Java's 8 primitive data types:
 *   byte, short, int, long, float, double, char, boolean
 *
 * Key Concepts Covered:
 *   1. Declaration and initialization
 *   2. Ranges and wrapper class constants
 *   3. Default values (via class fields)
 *   4. Type casting (widening and narrowing)
 *   5. Type promotion in expressions
 *   6. Overflow and underflow
 *   7. Literals (decimal, binary, octal, hex, underscores)
 */

public class PrimitiveDataTypesExample {

    // Demonstrating default values (instance variables)
    byte defaultByte;
    short defaultShort;
    int defaultInt;
    long defaultLong;
    float defaultFloat;
    double defaultDouble;
    char defaultChar;
    boolean defaultBoolean;

    public static void main(String[] args) {
        PrimitiveDataTypesExample demo = new PrimitiveDataTypesExample();

        // ----------------------------------------------------
        // 1. Declaration and Initialization
        // ----------------------------------------------------
        System.out.println("=== Declaration and Initialization ===");
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 9999999999L; // long requires 'L' suffix

        float f = 123.45f;    // float requires 'f'
        double d = 12345.678; // default for floating-point literals

        char c = 'A'; // character literal
        boolean flag = true;

        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + flag);

        // ----------------------------------------------------
        // 2. Ranges of each type
        // ----------------------------------------------------
        System.out.println("\n=== Ranges ===");
        System.out.println("Byte range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Int range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Float range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("Char range: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);

        // ----------------------------------------------------
        // 3. Default values
        // ----------------------------------------------------
        System.out.println("\n=== Default Values (Instance Fields) ===");
        System.out.println("Default byte: " + demo.defaultByte);
        System.out.println("Default short: " + demo.defaultShort);
        System.out.println("Default int: " + demo.defaultInt);
        System.out.println("Default long: " + demo.defaultLong);
        System.out.println("Default float: " + demo.defaultFloat);
        System.out.println("Default double: " + demo.defaultDouble);
        System.out.println("Default char: '" + demo.defaultChar + "' (prints as empty)");
        System.out.println("Default boolean: " + demo.defaultBoolean);

        // ----------------------------------------------------
        // 4. Type Casting (Widening & Narrowing)
        // ----------------------------------------------------
        System.out.println("\n=== Type Casting ===");
        int num = 200;
        long widenedLong = num;   // widening (automatic)
        float widenedFloat = widenedLong; // long → float
        System.out.println("Widening: int → long → float = " + widenedFloat);

        double bigDouble = 99.99;
        int narrowedInt = (int) bigDouble; // narrowing (manual), fractional part lost
        System.out.println("Narrowing: double=" + bigDouble + " → int=" + narrowedInt);

        // ----------------------------------------------------
        // 5. Type Promotion in Expressions
        // ----------------------------------------------------
        System.out.println("\n=== Type Promotion ===");
        byte b1 = 10, b2 = 20;
        int sum = b1 + b2; // byte + byte promotes to int
        System.out.println("byte + byte promoted to int = " + sum);

        // ----------------------------------------------------
        // 6. Overflow and Underflow
        // ----------------------------------------------------
        System.out.println("\n=== Overflow and Underflow ===");
        int maxInt = Integer.MAX_VALUE;
        int overflowInt = maxInt + 1; // wraps around
        System.out.println("Overflow: " + maxInt + " + 1 = " + overflowInt);

        int minInt = Integer.MIN_VALUE;
        int underflowInt = minInt - 1; // wraps around
        System.out.println("Underflow: " + minInt + " - 1 = " + underflowInt);

        // ----------------------------------------------------
        // 7. Literals
        // ----------------------------------------------------
        System.out.println("\n=== Literals ===");
        int decimal = 42;
        int binary = 0b101010;   // Java 7+
        int octal = 052;         // prefix 0
        int hex = 0x2A;          // prefix 0x

        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);

        int readableInt = 1_000_000; // underscores for readability
        System.out.println("Underscore literal: " + readableInt);
    }
}
