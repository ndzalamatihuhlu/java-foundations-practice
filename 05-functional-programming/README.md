# Functional Programming

## Overview

Functional programming in Java focuses on writing code using expressions and functions rather than imperative statements.
With Java 8, functional programming features such as **lambda expressions** and the **Streams API** were introduced, enabling a more concise and declarative style of coding.
These features make it easier to process collections, work with data transformations, and reduce boilerplate code.

## Learning Outcomes

By the end of this module, you should be able to:

* Understand the basics of functional programming in Java.
* Use lambda expressions to define inline implementations of functional interfaces.
* Apply the Streams API for filtering, mapping, and reducing data.
* Recognize the role of functional interfaces in enabling lambdas.
* Write cleaner and more readable code by adopting functional techniques.

## Structure

```
05-functional-programming/
├── lambdas/
│   ├── LambdaExample.java
│   └── README.md
└── streams/
    ├── StreamExample.java
    └── README.md
```

## Key Concepts

### Functional Interfaces

* An interface with exactly one abstract method.
* Examples: `Runnable`, `Callable`, `Comparator`, and custom interfaces.
* Annotated with `@FunctionalInterface` (optional but recommended).

### Lambda Expressions

* Concise way to represent an anonymous function.

```java
// Traditional anonymous class
Runnable r1 = new Runnable() {
    public void run() {
        System.out.println("Hello");
    }
};

// Lambda expression
Runnable r2 = () -> System.out.println("Hello");
```

### Method References

* Shorthand for calling an existing method.

```java
list.forEach(System.out::println);
```

### Streams API

* Provides a sequence of elements supporting functional-style operations.
* Common operations:

    * `filter()` – select elements that match a condition.
    * `map()` – transform elements.
    * `reduce()` – aggregate elements into a single result.

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.stream()
     .filter(name -> name.startsWith("A"))
     .forEach(System.out::println);
```

## Best Practices

* Use lambdas for short, self-contained behaviors.
* Prefer method references for clarity when reusing existing methods.
* Avoid overly complex lambda expressions; break into methods if needed.
* Use streams for data transformations but be mindful of performance for large datasets.

## Related OCA Exam Objectives

* Use lambda expressions to define the implementation of a functional interface.
* Apply functional programming concepts to collection processing.
