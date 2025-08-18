# Lambdas

## Overview

A **lambda expression** in Java is a concise way to represent an anonymous function that can be passed around as data.
Lambdas were introduced in Java 8 and are primarily used to provide implementation for **functional interfaces** — interfaces with a single abstract method.
They help reduce boilerplate code, especially in event handling, collection processing, and functional-style programming.

## Learning Outcomes

By the end of this section, you should be able to:

* Understand the syntax and structure of lambda expressions.
* Use lambdas to implement functional interfaces.
* Pass lambdas as arguments to methods.
* Differentiate between lambdas and anonymous inner classes.
* Use method references as shorthand for simple lambdas.

## Structure

```
lambdas/
├── LambdaExample.java
└── README.md
```

## Key Concepts

### Syntax

```java
(parameters) -> expression
(parameters) -> { statements }
```

Examples:

```java
// Single parameter, single-line expression
name -> System.out.println(name)

// Multiple parameters
(a, b) -> a + b

// With block body
(a, b) -> {
    int sum = a + b;
    return sum;
}
```

### Functional Interfaces

* Required for using lambdas.
* Examples: `Runnable`, `Comparator`, `Predicate`, `Consumer`, `Supplier`.

```java
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}
```

```java
Greeting greet = name -> System.out.println("Hello " + name);
greet.sayHello("Alice");
```

### Method References

* Simplify lambda syntax when calling an existing method.

```java
list.forEach(System.out::println);
```

### Lambdas vs Anonymous Inner Classes

* Lambdas are more concise.
* Lambdas can only be used with functional interfaces.
* Anonymous classes can implement multiple methods (when extending/implementing multiple method interfaces or abstract classes).

## Best Practices

* Keep lambdas short and focused — if they grow too long, move logic into a method.
* Use method references when possible for readability.
* Leverage built-in functional interfaces from `java.util.function` instead of creating custom ones unnecessarily.

## Related OCA Exam Objectives

* Write code using lambda expressions.
* Apply lambda syntax with functional interfaces.
