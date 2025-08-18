# Methods

## Overview

This section focuses on defining, calling, and organizing methods in Java.
Methods allow you to structure your code into reusable, logical units, making programs easier to read, maintain, and debug.

## Learning Outcomes

By the end of this section, you should be able to:

* Create methods with parameters and return values.
* Distinguish between `void` and non-`void` methods.
* Understand method overloading and when to use it.
* Pass arguments by value to methods.
* Return computed results to the calling code.

## Structure

```
methods/
├── MethodDemo.java
├── CalculatorExample.java
└── README.md
```

## Key Concepts

### Method Structure

A method has:

1. **Access Modifier** – Defines visibility (`public`, `private`, etc.).
2. **Return Type** – The type of value returned (or `void` if none).
3. **Method Name** – Must follow Java naming conventions.
4. **Parameters** – Input values (optional).
5. **Method Body** – The block of code that executes.

Example:

```java
public int add(int a, int b) {
    return a + b;
}
```

### Calling Methods

* From the same class: call directly by name.
* From another class: create an object and call using the dot (`.`) operator.

### Method Overloading

* Defining multiple methods with the same name but different parameter lists.
* Return type alone is not enough to overload.

Example:

```java
public void print(String message) { }
public void print(int number) { }
```

### Passing Arguments

* Java passes arguments **by value**.
* For primitives, a copy of the value is passed.
* For objects, the reference is copied, allowing modification of the object’s state.

## Best Practices

* Keep methods small and focused on a single responsibility.
* Use descriptive names for clarity.
* Avoid excessive parameters; group related data into objects where possible.
* Document complex methods with comments.

## Related OCA Exam Objectives

* Create methods with arguments and return values.
* Apply method overloading.
* Pass arguments to methods and handle returned values.
