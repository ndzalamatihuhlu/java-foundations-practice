/*
 * File: TypeCastingExample.java
 *
 * Purpose:
 *   Demonstrates type casting and type conversion rules in Java.
 *
 * Key Concepts Covered:
 *   1. Widening (implicit casting)
 *   2. Narrowing (explicit casting)
 *   3. Type promotion in expressions
 *   4. Casting between primitives
 *   5. Common pitfalls with casting
 */

public class TypeCastingExample {

    public static void main(String[] args) {
        // ----------------------------------------------------
        // 1. Widening (Implicit Casting)
        // ----------------------------------------------------
        System.out.println("=== Widening (Implicit Casting) ===");

        byte b = 10;             // 8-bit
        int i = b;               // byte → int (widening)
        long l = i;              // int → long
        float f = l;             // long → float
        double d = f;            // float → double

        System.out.println("byte → int → long → float → double = " + d);

        // ----------------------------------------------------
        // 2. Narrowing (Explicit Casting)
        // ----------------------------------------------------
        System.out.println("\n=== Narrowing (Explicit Casting) ===");

        double bigDouble = 12345.6789;
        int narrowedInt = (int) bigDouble; // fractional part lost
        short narrowedShort = (short) narrowedInt; // may overflow

        System.out.println("double: " + bigDouble);
        System.out.println("double → int (fraction lost): " + narrowedInt);
        System.out.println("int → short (possible overflow): " + narrowedShort);

        // ----------------------------------------------------
        // 3. Type Promotion in Expressions
        // ----------------------------------------------------
        System.out.println("\n=== Type Promotion in Expressions ===");

        byte x = 5;
        byte y = 10;
        // Arithmetic operations promote byte → int
        int sum = x + y;  // result is int
        System.out.println("byte + byte → int: " + sum);

        char c1 = 'A'; // 65
        char c2 = 'B'; // 66
        int charSum = c1 + c2; // promoted to int
        System.out.println("'A' + 'B' = " + charSum);

        // ----------------------------------------------------
        // 4. Casting Between Primitives
        // ----------------------------------------------------
        System.out.println("\n=== Casting Between Primitives ===");

        int intVal = 130;
        byte castedByte = (byte) intVal; // overflow, wraps around
        System.out.println("int 130 → byte = " + castedByte);

        float floatVal = 45.99f;
        int intFromFloat = (int) floatVal; // truncates decimal
        System.out.println("float 45.99 → int = " + intFromFloat);

        // ----------------------------------------------------
        // 5. Pitfalls and Special Cases
        // ----------------------------------------------------
        System.out.println("\n=== Pitfalls & Special Cases ===");

        int largeInt = Integer.MAX_VALUE;
        int overflow = largeInt + 1; // wraps around to negative
        System.out.println("Integer.MAX_VALUE + 1 = " + overflow);

        double infinity = 1.0 / 0;   // results in Infinity (not exception)
        double nan = 0.0 / 0.0;      // results in NaN (Not a Number)

        System.out.println("1.0 / 0 = " + infinity);
        System.out.println("0.0 / 0.0 = " + nan);
    }
}
