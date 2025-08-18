# Decision Structures in Java

Decision structures (also known as control flow statements) allow a program to make choices based on conditions. They evaluate **boolean expressions** (`true` or `false`) and control which block of code executes.

---

## 1. If Statements
The simplest decision structure. Executes a block of code **only if the condition is true**.

**Syntax:**
```java
if (condition) {
    // code runs if condition is true
}
```

**Example:**
```java
int age = 18;
if (age >= 18) {
    System.out.println("You are eligible to vote.");
}
```

---

## 2. If-Else Statements
Adds an **alternative path** if the condition is false.

**Syntax:**
```java
if (condition) {
    // true block
} else {
    // false block
}
```

**Example:**
```java
int number = 5;
if (number % 2 == 0) {
    System.out.println("Even number");
} else {
    System.out.println("Odd number");
}
```

---

## 3. If-Else-If Statements
Used for **multiple conditions**. Checks conditions in order until one evaluates to true.

**Syntax:**
```java
if (condition1) {
    // block 1
} else if (condition2) {
    // block 2
} else {
    // fallback block
}
```

**Example:**
```java
int marks = 72;
if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 50) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
```

---

## 4. Switch Statements
Used when you need to compare a single variable against **many values**. Works with `int`, `char`, `String`, and enums.

**Syntax:**
```java
switch (variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // fallback code
}
```

**Example:**
```java
int day = 3;
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
    default: System.out.println("Other day");
}
```

---

## 5. Switch Expressions (Java 14+)
More concise than traditional switch. Can return a value directly.

**Syntax:**
```java
String day = switch (num) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    default -> "Other day";
};
```

---

## 6. Relational Operators
Used for comparisons. Always return a boolean (`true`/`false`).

| Operator | Meaning | Example | Result |
|----------|---------|---------|--------|
| `==`     | Equal to | `5 == 5` | true |
| `!=`     | Not equal to | `5 != 3` | true |
| `>`      | Greater than | `7 > 3` | true |
| `<`      | Less than | `2 < 5` | true |
| `>=`     | Greater or equal | `7 >= 7` | true |
| `<=`     | Less or equal | `4 <= 6` | true |

---

## 7. Logical Operators
Used to combine boolean expressions.

| Operator | Meaning | Example | Result |
|----------|---------|---------|--------|
| `&&`     | AND – true if **both** are true | `(5 > 2 && 8 > 6)` | true |
| `||`     | OR – true if **at least one** is true | `(5 > 10 || 8 > 6)` | true |
| `!`      | NOT – inverts boolean value | `!(5 > 2)` | false |

---

## 8. Short-Circuit Logic
`&&` and `||` operators **short-circuit**, meaning evaluation stops as soon as the result is known.

**Example:**
```java
int x = 10;
if (x > 5 || ++x > 15) {
    System.out.println("Condition true");
}
System.out.println("x = " + x); // x still 10 because ++x not executed
```

---

## 9. Practice Challenge: Change for a Dollar Game
- User enters number of pennies, nickels, dimes, and quarters.
- Program checks if their total equals **$1**.
- If yes → "You win!"
- If less → "You entered less than a dollar."
- If more → "You entered more than a dollar."  