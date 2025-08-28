# Loops in Java

Loops allow repeating a block of code multiple times. They are useful when performing tasks that require iteration, such as processing data in collections, generating patterns, or running calculations repeatedly.

---

## 1. While Loop

* Tests the condition **before** executing the loop body.
* Executes zero or more times depending on the condition.

**Syntax:**

```java
while (condition) {
    // code block
}
```

**Example:**

```java
int counter = 1;
while (counter <= 5) {
    System.out.println("Counter: " + counter);
    counter++;
}
```

---

## 2. Do-While Loop

* Executes the loop body **at least once**.
* Tests the condition **after** execution.

**Syntax:**

```java
do {
    // code block
} while (condition);
```

**Example:**

```java
int number = 10;
do {
    System.out.println("Number: " + number);
    number++;
} while (number < 10);
```

---

## 3. For Loop

* Used when the number of iterations is known.
* Combines initialization, condition, and update in one line.

**Syntax:**

```java
for (initialization; condition; update) {
    // code block
}
```

**Example:**

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Iteration: " + i);
}
```

**Reverse Iteration:**

```java
for (int i = 5; i >= 1; i--) {
    System.out.println("Countdown: " + i);
}
```

---

## 4. Enhanced For Loop (For-Each)

* Iterates directly over elements of arrays or collections.
* Useful when you don’t need the index.

**Syntax:**

```java
for (type element : collection) {
    // code block
}
```

**Example:**

```java
int[] numbers = {10, 20, 30};
for (int num : numbers) {
    System.out.println("Number: " + num);
}
```

---

## 5. Nested Loops

* Loops inside loops.
* Useful for grids, tables, and patterns.

**Example:**

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print("(" + i + "," + j + ") ");
    }
    System.out.println();
}
```

**Pattern Printing:**

```java
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

---

## 6. Loop Control Statements

* **break** → exits the loop immediately.
* **continue** → skips the current iteration and moves to the next.

**Example:**

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // skip printing 3
    }
    if (i == 5) {
        break; // stop loop when i = 5
    }
    System.out.println(i);
}
```

---

## 7. Summary

* **while** → condition checked first, runs zero or more times.
* **do-while** → condition checked after, runs at least once.
* **for** → best when iterations are counted or known.
* **enhanced-for** → best for arrays/collections.
* **nested loops** → useful for tables, patterns, or multi-dimensional data.
* **break/continue** → modify loop control flow.
