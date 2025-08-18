package lectures_demo;

/**
 * PrimitiveDataTypesDemo
 * Demonstrates Java primitive data types, their ranges,
 * conversions, literals, overflow behavior, and default values.
 */
public class PrimitiveDataTypesDemo {

    // Default values of primitive types (static fields)
    static byte defaultByte;
    static short defaultShort;
    static int defaultInt;
    static long defaultLong;
    static float defaultFloat;
    static double defaultDouble;
    static boolean defaultBoolean;
    static char defaultChar;

    public static void main(String[] args) {

        // 0. Default values ------------------------------------
        System.out.println("=== Default Values of Primitive Types ===");
        System.out.println("Default byte: " + defaultByte);
        System.out.println("Default short: " + defaultShort);
        System.out.println("Default int: " + defaultInt);
        System.out.println("Default long: " + defaultLong);
        System.out.println("Default float: " + defaultFloat);
        System.out.println("Default double: " + defaultDouble);
        System.out.println("Default boolean: " + defaultBoolean);
        System.out.println("Default char (as character): '" + defaultChar + "'");
        System.out.println("Default char (numeric code): " + (int) defaultChar);

        // 1. Integer types ------------------------------------
        byte b = 100;         // 8-bit
        short s = 10000;      // 16-bit
        int i = 100000;       // 32-bit
        long l = 9999999999L; // 64-bit (must use 'L' for long literals)

        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);

        // Display min and max values using wrapper classes
        System.out.println("Byte range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Int range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        // 2. Floating point types -----------------------------
        float f = 123.45f;    // 32-bit, must use 'f'
        double d = 12345.678; // 64-bit, default for floating literals

        System.out.println("Float: " + f);
        System.out.println("Double: " + d);

        // Show min and max values
        System.out.println("Float range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        // 3. Boolean type -------------------------------------
        boolean flag = true; // only true or false
        System.out.println("Boolean value: " + flag);

        // 4. Char type ----------------------------------------
        char c = 'A';           // character literal
        char unicodeChar = '\u03A9'; // Unicode for Greek capital letter Ω

        System.out.println("Character: " + c);
        System.out.println("Unicode Character: " + unicodeChar);

        // Char min and max values
        System.out.println("Char range: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);

        // 5. Type Conversions ---------------------------------

        // Widening (implicit): smaller to larger type
        int num = 200;
        long widenedLong = num;   // int → long
        float widenedFloat = widenedLong; // long → float
        System.out.println("Widening Conversion: int=" + num + " long=" + widenedLong + " float=" + widenedFloat);

        // Narrowing (explicit): larger to smaller type
        double bigDouble = 99.99;
        int narrowedInt = (int) bigDouble; // fractional part lost
        System.out.println("Narrowing Conversion: double=" + bigDouble + " int=" + narrowedInt);

        // 6. Type promotion in expressions -------------------
        byte b1 = 10;
        byte b2 = 20;
        // b1 + b2 becomes int, so must store in int
        int sum = b1 + b2;
        System.out.println("Type Promotion: byte + byte = int → " + sum);

        // 7. Overflow and Underflow --------------------------
        int maxInt = Integer.MAX_VALUE;
        int overflowInt = maxInt + 1; // wraps around
        System.out.println("Overflow example: " + maxInt + " + 1 = " + overflowInt);

        int minInt = Integer.MIN_VALUE;
        int underflowInt = minInt - 1; // wraps around
        System.out.println("Underflow example: " + minInt + " - 1 = " + underflowInt);

        // 8. Literals ----------------------------------------
        int decimal = 42;        // decimal literal
        int binary = 0b101010;   // binary literal (Java 7+)
        int octal = 052;         // octal literal (prefix 0)
        int hex = 0x2A;          // hexadecimal literal (prefix 0x)

        System.out.println("Decimal: " + decimal);
        System.out.println("Binary (0b101010): " + binary);
        System.out.println("Octal (052): " + octal);
        System.out.println("Hexadecimal (0x2A): " + hex);

        float floatLiteral = 3.14f;   // float literal
        double doubleLiteral = 3.14159; // double literal
        long longLiteral = 123456789L; // long literal with L suffix

        System.out.println("Float literal: " + floatLiteral);
        System.out.println("Double literal: " + doubleLiteral);
        System.out.println("Long literal: " + longLiteral);
    }
}
