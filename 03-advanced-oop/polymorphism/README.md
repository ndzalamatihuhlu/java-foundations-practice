# Polymorphism

## Overview

Polymorphism allows a single reference type to refer to objects of different classes at runtime.
It enables dynamic method dispatch, where the method that gets executed is determined by the object’s actual type rather than the reference type.
Polymorphism is a cornerstone of flexibility and extensibility in Object-Oriented Programming.

## Learning Outcomes

By the end of this section, you should be able to:

* Assign subclass objects to superclass references.
* Use overridden methods to achieve runtime method binding.
* Differentiate between compile-time and runtime polymorphism.
* Leverage polymorphism in collections and method parameters.

## Structure

```
polymorphism/
├── Shape.java
├── Circle.java
├── Square.java
├── PolymorphismDemo.java
└── README.md
```

## Key Concepts

### Runtime Polymorphism

* Achieved through method overriding.
* Example:

```java
Shape s1 = new Circle();
Shape s2 = new Square();
s1.draw(); // Calls Circle’s draw()
s2.draw(); // Calls Square’s draw()
```

* The decision on which method to execute happens at runtime.

### Compile-Time Polymorphism

* Achieved through method overloading (same method name, different parameters).
* Resolved at compile time.

### Benefits of Polymorphism

* Flexible and reusable code.
* Simplifies method signatures — methods can accept superclass types and work with any subclass.
* Encourages program scalability.

### Type Casting

* Upcasting: Assigning a subclass object to a superclass reference (implicit).
* Downcasting: Casting a superclass reference back to a subclass (explicit, requires caution).

Example:

```java
Shape shape = new Circle(); // Upcasting
Circle circle = (Circle) shape; // Downcasting
```

## Best Practices

* Program to an interface or superclass, not to a specific implementation.
* Avoid unnecessary downcasting; prefer polymorphic method calls.
* Use polymorphism to reduce duplicate code.

## Related OCA Exam Objectives

* Apply polymorphism to manage multiple object types at runtime.
* Override methods to change subclass behavior.
* Use superclass references for subclass objects.
