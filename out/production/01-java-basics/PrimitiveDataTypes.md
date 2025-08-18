# Java Primitive Data Types

Java has 8 primitive data types. These are the most basic forms of data storage in Java and are not objects. They are stored directly in memory and provide efficient handling of simple values.

---

## 1. byte
- **Default value**: 0
- **Size**: 8-bit
- **Type**: Integral
- **Range**: -128 to 127
- **Example**:
  ```java
  byte b = 100;
  ```

## 2. short
- **Default value**: 0
- **Size**: 16-bit
- **Type**: Integral
- **Range**: -32,768 to 32,767
- **Example**:
  ```java
  short s = 10000;
  ```

## 3. int
- **Default value**: 0
- **Size**: 32-bit
- **Type**: Integral
- **Range**: -2,147,483,648 to 2,147,483,647
- **Example**:
  ```java
  int i = 100000;
  ```

## 4. long
- **Default value**: 0L
- **Size**: 64-bit
- **Type**: Integral
- **Range**: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
- **Example**:
  ```java
  long l = 9999999L;
  ```

## 5. float
- **Default value**: 0.0f
- **Size**: 32-bit
- **Type**: Floating point
- **Range**: approximately ±3.40282347E+38F (6–7 decimal digits of precision)
- **Example**:
  ```java
  float f = 123.4f;
  ```

## 6. double
- **Default value**: 0.0d
- **Size**: 64-bit
- **Type**: Floating point
- **Range**: approximately ±1.79769313486231570E+308 (15 decimal digits of precision)
- **Example**:
  ```java
  double d = 12.4;
  ```

## 7. boolean
- **Default value**: false
- **Size**: JVM dependent (treated as 1-bit for logical values, but usually stored as 1 byte in memory)
- **Type**: Boolean
- **Possible values**: true or false
- **Example**:
  ```java
  boolean b = true;
  ```

## 8. char
- **Default value**: '\u0000'
- **Size**: 16-bit (because it uses Unicode)
- **Type**: Character
- **Range**: 0 to 65,535 (Unicode values)
- **Example**:
  ```java
  char c = 'C';
  ```

---

# Default Values

When declared as **class fields** and not initialized, Java provides defaults:
- Numeric types (byte, short, int, long, float, double) default to 0.
- boolean defaults to false.
- char defaults to '\u0000'.

**Note**: Local variables inside methods must be initialized before use, otherwise the compiler will throw an error.

---

# Determining Size and Range at Runtime

Wrapper classes provide constants for minimum and maximum values:

```java
System.out.println("Byte min: " + Byte.MIN_VALUE + " max: " + Byte.MAX_VALUE);
System.out.println("Short min: " + Short.MIN_VALUE + " max: " + Short.MAX_VALUE);
System.out.println("Int min: " + Integer.MIN_VALUE + " max: " + Integer.MAX_VALUE);
System.out.println("Long min: " + Long.MIN_VALUE + " max: " + Long.MAX_VALUE);
System.out.println("Float min: " + Float.MIN_VALUE + " max: " + Float.MAX_VALUE);
System.out.println("Double min: " + Double.MIN_VALUE + " max: " + Double.MAX_VALUE);
System.out.println("Character min: " + (int) Character.MIN_VALUE + " max: " + (int) Character.MAX_VALUE);
```

---

# Type Conversions

## Widening Conversion (Implicit)
When assigning a smaller type to a larger type, Java automatically converts it. No data is lost.

```java
int i = 100;
long l = i;       // int to long
float f = l;      // long to float
```

## Narrowing Conversion (Explicit)
When assigning a larger type to a smaller type, you must cast explicitly. Data may be lost.

```java
double d = 99.99;
int i = (int) d;   // results in 99, fractional part is lost
```

## Type Promotion in Expressions
- All byte, short, and char are promoted to int in expressions.
- If one operand is long, the result is long.
- If one operand is float, the result is float.
- If one operand is double, the result is double.

Example:

```java
byte b1 = 10;
byte b2 = 20;
int result = b1 + b2; // result is int, not byte
```

---

# Literals

- **Integer literals** are int by default. Add "L" or "l" to make it a long.
  ```java
  long num = 10000000000L;
  ```  
- **Floating point literals** are double by default. Add "f" or "F" to make it a float.
  ```java
  float price = 12.5f;
  ```  
- **Char literals** are enclosed in single quotes.
  ```java
  char c = 'A';
  ```  
- **Boolean literals** are only `true` and `false`.

---

# Additional Notes

- **Memory efficiency**: Choosing the right type improves memory usage. For example, `byte` or `short` is better than `int` if the values fit the range.
- **Unicode support**: `char` supports internationalization since it uses Unicode (16-bit).
- **Floating-point precision**: Use `float` for smaller ranges, `double` for high precision calculations.
- **Overflow and underflow**: Primitive types do not throw errors when values exceed their range. Instead, they wrap around. Example:
  ```java
  int x = Integer.MAX_VALUE;
  x = x + 1;  // results in Integer.MIN_VALUE
  ```  
- **Type casting hierarchy**:  
  byte → short → int → long → float → double (widening allowed automatically)  
  double → float → long → int → short → byte (narrowing requires explicit casting)

---
