# Classes and Objects

## Overview

This section introduces the core building blocks of Object-Oriented Programming in Java — classes and objects.
A class serves as a blueprint, and an object is an instance of that blueprint. Together, they enable modular, reusable, and scalable code.

## Learning Outcomes

By the end of this section, you should be able to:

* Define a class with fields, methods, and constructors.
* Create objects from a class using the `new` keyword.
* Access and modify object fields and call methods.
* Differentiate between instance and static members.
* Apply encapsulation to control access to class members.

## Structure

```
classes-and-objects/
├── Car.java
├── CarTest.java
└── README.md
```

## Key Concepts

### Defining a Class

* A class can contain:

    * **Fields** – Variables that hold the state of the object.
    * **Methods** – Define behaviors or actions.
    * **Constructors** – Special methods to initialize new objects.

Example:

```java
public class Car {
    String model;
    int year;

    public void startEngine() {
        System.out.println("Engine started");
    }
}
```

### Creating Objects

* Use the `new` keyword to create an object:

```java
Car myCar = new Car();
```

### Accessing Members

* Instance members: accessed through the object reference.
* Static members: accessed via the class name.

### Encapsulation

* Make fields `private` to restrict direct access.
* Provide `public` getters and setters to control modifications.

Example:

```java
private int speed;
public int getSpeed() { return speed; }
public void setSpeed(int s) { speed = s; }
```

## Best Practices

* Keep fields private to preserve data integrity.
* Name classes using PascalCase (e.g., `Car`, `BankAccount`).
* Only include relevant fields and methods to avoid bloating the class.
* Initialize all necessary fields in constructors.

## Related OCA Exam Objectives

* Define the structure of a Java class.
* Create and use objects.
* Apply encapsulation principles to a class.
