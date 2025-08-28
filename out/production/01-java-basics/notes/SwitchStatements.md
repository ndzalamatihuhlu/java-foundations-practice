

# Switch Statements in Java

## 1. Purpose

* A `switch` statement is used to test a single variable or expression against multiple possible values.
* It is often cleaner than using multiple `if-else-if` statements.

---

## 2. Syntax

```java
switch (expression) {
    case value1:
        // code block
        break;
    case value2:
        // code block
        break;
    case value3:
        // code block
        break;
    default:
        // code block (if no case matches)
}
```

---

## 3. Rules

* The `expression` inside `switch` must evaluate to:

    * `byte`, `short`, `char`, `int`
    * `String` (Java 7+)
    * `enum` types
* Each `case` label must be unique and constant (no variables).
* `break` prevents “fall-through” (execution continuing into the next case).
* The `default` block is optional and runs if no case matches.

---

## 4. Example

```java
int day = 3;
String dayName;

switch (day) {
    case 1:
        dayName = "Monday";
        break;
    case 2:
        dayName = "Tuesday";
        break;
    case 3:
        dayName = "Wednesday";
        break;
    case 4:
        dayName = "Thursday";
        break;
    case 5:
        dayName = "Friday";
        break;
    default:
        dayName = "Weekend";
}

System.out.println("Today is " + dayName);
```

**Output:**

```
Today is Wednesday
```

---

## 5. Fall-through Example

```java
int number = 2;

switch (number) {
    case 1:
        System.out.println("One");
    case 2:
        System.out.println("Two");    // Matches here
    case 3:
        System.out.println("Three");  // Still executes (no break)
}
```

**Output:**

```
Two
Three
```

---

## 6. When to Use

* Use `switch` when:

    * You have a single variable to check against multiple values.
    * The logic is simple mapping (like days, months, menu choices).
* Use `if-else` when:

    * You need to test ranges (e.g., `score > 90`).
    * You need complex conditions with multiple variables.

---
