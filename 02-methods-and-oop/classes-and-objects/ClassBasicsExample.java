/****************************************************
 * File: ClassBasicsExample.java
 * Purpose:
 *   To teach the basics of classes in Java.
 *
 * What is a Class?
 *   - A class is a blueprint or template for creating objects.
 *   - It defines the data (fields/variables) and the behavior
 *     (methods/functions) that objects of this type will have.
 *
 * Key Concepts Covered:
 *   1. Defining a class
 *   2. Fields (attributes or properties)
 *   3. Methods (behaviors)
 *   4. Creating objects
 *   5. Accessing fields and methods
 ****************************************************/

// Defining a class
public class ClassBasicsExample {

    /****************************************
     * 1. Fields (Attributes / Properties)
     ****************************************/
    // Fields represent the data or "state" of the object.
    // Each object created from this class will have its own
    // copy of these variables.

    String name;   // field to store name
    int age;       // field to store age

    /****************************************
     * 2. Methods (Behaviors)
     ****************************************/
    // Methods represent the actions/behaviors that the class can perform.

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    public void displayAge() {
        System.out.println("I am " + age + " years old.");
    }

    /****************************************
     * 3. Main Method: Creating Objects
     ****************************************/
    public static void main(String[] args) {
        // Creating an object:
        // Syntax: ClassName objectName = new ClassName();
        ClassBasicsExample person1 = new ClassBasicsExample();

        // Assign values to fields (attributes)
        person1.name = "Alice";
        person1.age = 25;

        // Call methods on the object
        person1.sayHello();   // prints "Hello, my name is Alice"
        person1.displayAge(); // prints "I am 25 years old."

        // Create another object
        ClassBasicsExample person2 = new ClassBasicsExample();
        person2.name = "Bob";
        person2.age = 30;

        person2.sayHello();   // prints "Hello, my name is Bob"
        person2.displayAge(); // prints "I am 30 years old."
    }
}
