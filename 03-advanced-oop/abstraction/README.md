# Abstraction

## Overview

Abstraction is the process of hiding implementation details while exposing only essential features.
In Java, abstraction is implemented using **abstract classes** and **abstract methods**.
It allows developers to define a template for a group of related classes while letting each subclass provide its own specific implementation.

## Learning Outcomes

By the end of this section, you should be able to:

* Create abstract classes and methods.
* Extend abstract classes and implement abstract methods.
* Combine abstract and non-abstract methods within the same class.
* Understand when to use abstraction instead of interfaces.
* Recognize that abstract classes cannot be instantiated directly.

## Structure

```
abstraction/
├── AbstractVehicle.java
├── Car.java
├── Bike.java
├── AbstractionDemo.java
└── README.md
```

## Key Concepts

### Abstract Classes

* Declared with the `abstract` keyword.
* Can contain both abstract (no body) and concrete (with body) methods.
* May have constructors, fields, and methods like a normal class.

Example:

```java
public abstract class AbstractVehicle {
    public abstract void startEngine();
    public void stopEngine() {
        System.out.println("Engine stopped");
    }
}
```

### Abstract Methods

* Declared without a body.
* Must be implemented by any non-abstract subclass.

```java
public abstract void startEngine();
```

### Extending Abstract Classes

* A concrete subclass must provide implementations for all inherited abstract methods.
* Subclasses can also override concrete methods if needed.

### Partial Implementation

* Abstract classes are useful when you want to share some common code but still enforce method definitions in subclasses.

## Best Practices

* Use abstraction when multiple related classes share structure and partial behavior.
* Avoid making all methods abstract — include shared logic in concrete methods.
* Keep abstract class responsibilities focused and coherent.
* If no shared implementation is required, consider using interfaces instead.

## Related OCA Exam Objectives

* Create abstract classes and methods.
* Implement abstract methods in concrete subclasses.
* Apply abstraction principles to reduce code duplication and enforce structure.
