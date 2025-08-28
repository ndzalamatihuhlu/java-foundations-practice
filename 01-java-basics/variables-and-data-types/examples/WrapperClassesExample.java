package examples;
/*
 * File: WrapperClassesExample.java
 *
 * Purpose:
 *   Demonstrates Java wrapper classes for primitive types.
 *
 * Key Concepts Covered:
 *   1. Autoboxing and unboxing
 *   2. Useful methods in wrapper classes
 *   3. Conversions between Strings and numbers
 *   4. Constants (MIN_VALUE, MAX_VALUE)
 *   5. Comparing wrapper objects
 */

public class WrapperClassesExample {

    public static void main(String[] args) {
        // ----------------------------------------------------
        // 1. Autoboxing and Unboxing
        // ----------------------------------------------------
        System.out.println("=== Autoboxing and Unboxing ===");

        int primitiveInt = 42;
        Integer wrappedInt = primitiveInt; // Autoboxing (primitive → wrapper)
        int unboxedInt = wrappedInt;       // Unboxing (wrapper → primitive)

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Unboxed int: " + unboxedInt);

        // ----------------------------------------------------
        // 2. Useful Methods in Wrapper Classes
        // ----------------------------------------------------
        System.out.println("\n=== Useful Methods ===");

        String str = "123";
        int parsedInt = Integer.parseInt(str);  // Convert String → int
        double parsedDouble = Double.parseDouble("3.14159");

        System.out.println("Parsed int: " + parsedInt);
        System.out.println("Parsed double: " + parsedDouble);

        // ValueOf (returns wrapper object)
        Integer valueOfInt = Integer.valueOf("456");
        System.out.println("Integer.valueOf(\"456\"): " + valueOfInt);

        // toString (convert number → String)
        String intAsString = Integer.toString(789);
        System.out.println("Integer.toString(789): " + intAsString);

        // ----------------------------------------------------
        // 3. Wrapper Class Constants
        // ----------------------------------------------------
        System.out.println("\n=== Wrapper Class Constants ===");
        System.out.println("Integer MIN: " + Integer.MIN_VALUE + ", MAX: " + Integer.MAX_VALUE);
        System.out.println("Double MIN: " + Double.MIN_VALUE + ", MAX: " + Double.MAX_VALUE);
        System.out.println("Boolean values: " + Boolean.TRUE + " and " + Boolean.FALSE);

        // ----------------------------------------------------
        // 4. Comparing Wrapper Objects
        // ----------------------------------------------------
        System.out.println("\n=== Comparing Wrapper Objects ===");

        Integer a = 100;
        Integer b = 100;
        Integer c = 200;

        // "==" compares object references (can be tricky for small numbers due to caching)
        System.out.println("a == b ? " + (a == b)); // true (cached between -128 and 127)
        System.out.println("a == c ? " + (a == c)); // false (different objects)

        // .equals() compares values
        System.out.println("a.equals(b) ? " + a.equals(b)); // true
        System.out.println("a.equals(c) ? " + a.equals(c)); // false

        // ----------------------------------------------------
        // 5. Boxing with different primitive types
        // ----------------------------------------------------
        System.out.println("\n=== Boxing Different Types ===");

        Double wrappedDouble = 45.67;   // Autoboxing
        Boolean wrappedBoolean = true;  // Autoboxing
        Character wrappedChar = 'Z';    // Autoboxing

        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Wrapped Boolean: " + wrappedBoolean);
        System.out.println("Wrapped Character: " + wrappedChar);
    }
}
