# Advanced Object-Oriented Programming (OOP)

## Overview

This module covers advanced OOP concepts in Java, including inheritance, polymorphism, abstraction, and interfaces.
These concepts allow you to create flexible, reusable, and maintainable code by modeling real-world relationships between classes.

## Learning Outcomes

By the end of this module, you should be able to:

* Extend classes and inherit fields and methods.
* Override methods to change behavior in subclasses.
* Apply polymorphism for dynamic method calls.
* Use abstract classes to define partial implementations.
* Implement interfaces to define contracts that classes must follow.

## Structure

```
03-advanced-oop/
├── inheritance/
│   ├── Animal.java
│   ├── Dog.java
│   ├── Cat.java
│   ├── InheritanceDemo.java
│   └── README.md
├── polymorphism/
│   ├── Shape.java
│   ├── Circle.java
│   ├── Square.java
│   ├── PolymorphismDemo.java
│   └── README.md
├── abstraction/
│   ├── AbstractVehicle.java
│   ├── Car.java
│   ├── Bike.java
│   ├── AbstractionDemo.java
│   └── README.md
└── interfaces/
    ├── Printable.java
    ├── Document.java
    ├── InterfaceDemo.java
    └── README.md
```

## Key Concepts

### Inheritance

* Allows a class to acquire fields and methods from another class using `extends`.
* Supports reusability and logical class hierarchies.
* Subclasses can add or override behavior.

### Polymorphism

* Ability of a single reference type to refer to different object types at runtime.
* Achieved through method overriding.
* Enables dynamic method binding.

### Abstraction

* Use abstract classes to define methods without implementation.
* Subclasses provide specific implementations.
* Cannot instantiate abstract classes directly.

### Interfaces

* Define a contract that implementing classes must fulfill.
* Can contain abstract methods (implicitly `public abstract`).
* A class can implement multiple interfaces.

## Best Practices

* Use inheritance when a clear “is-a” relationship exists.
* Favor composition over inheritance when possible.
* Keep abstract classes focused on shared structure and behavior.
* Use interfaces for defining roles or capabilities that cut across class hierarchies.

## Related OCA Exam Objectives

* Implement inheritance and understand method overriding.
* Apply polymorphism to manage multiple object types.
* Create and use abstract classes and methods.
* Create and implement interfaces.
