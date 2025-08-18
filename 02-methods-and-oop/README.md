# Methods and Object-Oriented Programming (OOP)

## Overview

This module introduces methods for structuring reusable blocks of code and the fundamentals of Object-Oriented Programming (OOP) in Java.
You will learn how to define methods, pass data using parameters, return values, and design programs around objects, classes, and their interactions.

## Learning Outcomes

By the end of this module, you should be able to:

* Define and call methods with parameters and return values.
* Understand the concepts of classes, objects, fields, and methods.
* Create and use constructors to initialize objects.
* Use wrapper classes for working with primitive data as objects.
* Apply encapsulation principles to design maintainable code.

## Structure

```
02-methods-and-oop/
├── methods/
│   ├── MethodDemo.java
│   ├── CalculatorExample.java
│   └── README.md
├── classes-and-objects/
│   ├── Car.java
│   ├── CarTest.java
│   └── README.md
├── constructors/
│   ├── ConstructorExample.java
│   └── README.md
└── wrapper-classes/
    ├── WrapperExample.java
    └── README.md
```

## Key Concepts

### Methods

* **Definition** – Named blocks of code that perform specific tasks.
* **Syntax**:

  ```java
  returnType methodName(parameters) {
      // method body
  }
  ```
* Support for method overloading (same method name with different parameters).

### Classes and Objects

* **Class** – A blueprint for creating objects, containing fields and methods.
* **Object** – An instance of a class.
* Access class members using the dot (`.`) operator.

### Constructors

* Special methods that initialize objects.
* Have the same name as the class and no return type.
* Can be overloaded to provide multiple initialization options.

### Wrapper Classes

* Convert primitive types to objects (`Integer`, `Double`, `Boolean`, etc.).
* Provide utility methods for parsing, comparing, and converting values.

## Best Practices

* Keep methods focused on a single task.
* Use descriptive method and variable names.
* Apply encapsulation by keeping fields private and using getters/setters.
* Use wrapper classes when working with generics or APIs that require objects instead of primitives.

## Related OCA Exam Objectives

* Create methods with arguments and return values.
* Create and manipulate objects.
* Apply encapsulation principles to a class.
* Use wrapper classes such as `Boolean`, `Double`, and `Integer`.
