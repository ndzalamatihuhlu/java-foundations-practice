package examples;/*
 * File: DefaultValuesExample.java
 *
 * Purpose:
 *   Demonstrates default values of instance variables in Java.
 *
 * Key Concepts Covered:
 *   1. Default values of primitive types in instance variables.
 *   2. Default value of reference types (null).
 *   3. Local variables do not have default values (must be initialized).
 */

public class DefaultValuesExample {

    // ----------------------------------------------------
    // Instance variables (will get default values automatically)
    // ----------------------------------------------------
    byte defaultByte;          // 0
    short defaultShort;        // 0
    int defaultInt;            // 0
    long defaultLong;          // 0L
    float defaultFloat;        // 0.0f
    double defaultDouble;      // 0.0d
    char defaultChar;          // '\u0000' (null character)
    boolean defaultBoolean;    // false
    String defaultString;      // null (reference type)

    public static void main(String[] args) {
        DefaultValuesExample example = new DefaultValuesExample();

        System.out.println("=== Default Values of Instance Variables ===");
        System.out.println("byte: " + example.defaultByte);
        System.out.println("short: " + example.defaultShort);
        System.out.println("int: " + example.defaultInt);
        System.out.println("long: " + example.defaultLong);
        System.out.println("float: " + example.defaultFloat);
        System.out.println("double: " + example.defaultDouble);
        System.out.println("char (numeric value): " + (int) example.defaultChar);
        System.out.println("char (as char, may look blank): '" + example.defaultChar + "'");
        System.out.println("boolean: " + example.defaultBoolean);
        System.out.println("String (reference): " + example.defaultString);

        // ----------------------------------------------------
        // Local variables (no default values)
        // ----------------------------------------------------
        System.out.println("\n=== Local Variables (must be initialized) ===");

        // Uncommenting the line below will cause a compilation error,
        // because local variables must be explicitly initialized before use.
        // int localVar;
        // System.out.println(localVar);
    }
}
