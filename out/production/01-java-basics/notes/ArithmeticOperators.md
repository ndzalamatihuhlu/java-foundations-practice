# Arithmetic Operators in Java

Arithmetic operators are used to perform mathematical operations on numeric types.  
They work with **primitives** such as `int`, `double`, `float`, `long`, etc.

---

## List of Arithmetic Operators

| Operator | Description | Example | Result |
|----------|-------------|---------|--------|
| `+` | Addition | `5 + 3` | `8` |
| `-` | Subtraction | `5 - 3` | `2` |
| `*` | Multiplication | `5 * 3` | `15` |
| `/` | Division (quotient) | `10 / 3` | `3` (integer division) |
| `%` | Modulus (remainder) | `10 % 3` | `1` |
| `++` | Increment (adds 1) | `int x = 5; x++;` | `6` |
| `--` | Decrement (subtracts 1) | `int y = 5; y--;` | `4` |

---

## Key Notes

- **Division**:
    - Integer division drops the decimal (`10 / 3 = 3`).
    - If one operand is floating-point, the result will include decimals (`10.0 / 3 = 3.333...`).
- **Modulus `%`**:
    - Gives the remainder after division.
    - Works with integers and floating-point numbers.
- **Increment and Decrement**:
    - `x++` (post-increment) → returns value then increments.
    - `++x` (pre-increment) → increments first, then returns value.
    - Same applies for `--`.

---

## Examples

### Basic Arithmetic
```java

### Division with Floating Point

```java
double x = 10, y = 3;
System.out.println("Floating division: " + (x / y)); // 3.333...
```

### Increment and Decrement

```java
int count = 5;

System.out.println(count++); // prints 5, then count = 6
System.out.println(++count); // increments to 7, then prints 7
System.out.println(count--); // prints 7, then count = 6
System.out.println(--count); // decrements to 5, then prints 5
```

---

## Summary

* Arithmetic operators are the foundation of numeric computations in Java.
* Always remember integer vs floating-point division rules.
* Use modulus `%` to work with cycles, even/odd checks, and remainders.
* Be careful with increment/decrement order (`++x` vs `x++`).

```

```
