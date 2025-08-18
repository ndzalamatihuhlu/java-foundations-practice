# Inheritance

## Overview

Inheritance allows a class (subclass) to acquire the fields and methods of another class (superclass).
It promotes code reuse, logical hierarchy, and the ability to extend or modify existing behavior without rewriting code.

## Learning Outcomes

By the end of this section, you should be able to:

* Create a subclass using the `extends` keyword.
* Access inherited fields and methods.
* Override superclass methods in a subclass.
* Use the `super` keyword to call superclass constructors and methods.
* Understand method hiding and field shadowing.

## Structure

```
inheritance/
├── Animal.java
├── Dog.java
├── Cat.java
├── InheritanceDemo.java
└── README.md
```

## Key Concepts

### Basic Inheritance

```java
public class Animal {
    public void eat() {
        System.out.println("Animal eats");
    }
}

public class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}
```

* `Dog` inherits the `eat()` method from `Animal`.

### Method Overriding

* A subclass can provide its own implementation of an inherited method.
* Must have the same method name, return type, and parameters.
* Use `@Override` annotation for clarity.

### The `super` Keyword

* Call superclass constructors:

  ```java
  super();
  super(param1, param2);
  ```
* Access superclass methods:

  ```java
  super.eat();
  ```

### Field Shadowing

* If a subclass defines a field with the same name as in the superclass, the subclass field hides the superclass field.

## Best Practices

* Keep inheritance hierarchies shallow for maintainability.
* Override methods when behavior must change, not just for the sake of overriding.
* Use `super` judiciously to maintain intended functionality.

## Related OCA Exam Objectives

* Implement inheritance in Java.
* Override methods in subclasses.
* Use `super` to access superclass members and constructors.
