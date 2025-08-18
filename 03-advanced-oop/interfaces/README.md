# Interfaces

## Overview

Interfaces in Java define a contract that classes must follow.
They specify method signatures without providing implementations, allowing different classes to implement the same set of behaviors in their own way.
Interfaces support multiple inheritance of type, making them a key tool for designing flexible and scalable systems.

## Learning Outcomes

By the end of this section, you should be able to:

* Declare and implement interfaces.
* Understand that interface methods are implicitly `public` and `abstract` (unless they are `default` or `static`).
* Use `default` methods to provide optional implementations.
* Implement multiple interfaces in a single class.
* Use interfaces to achieve loose coupling between components.

## Structure

```
interfaces/
├── Printable.java
├── Document.java
├── InterfaceDemo.java
└── README.md
```

## Key Concepts

### Defining an Interface

```java
public interface Printable {
    void print();
}
```

### Implementing an Interface

```java
public class Document implements Printable {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}
```

### Multiple Interface Implementation

* A class can implement multiple interfaces, separating different capabilities.

```java
public class MultiFunctionPrinter implements Printable, Scannable { }
```

### Default and Static Methods

* **Default methods** allow interfaces to include method bodies:

```java
default void printHeader() {
    System.out.println("Default Header");
}
```

* **Static methods** can be called without an instance:

```java
Printable.showInfo();
```

### Interface References

* Variables of interface type can refer to any object of a class that implements the interface.

Example:

```java
Printable p = new Document();
p.print();
```

## Best Practices

* Use interfaces for defining capabilities or roles that can apply to multiple, unrelated classes.
* Prefer small, focused interfaces (Interface Segregation Principle).
* Use default methods carefully to avoid breaking existing implementations when adding new functionality.

## Related OCA Exam Objectives

* Create and implement interfaces.
* Differentiate between abstract classes and interfaces.
* Apply interfaces to design flexible, loosely coupled applications.
