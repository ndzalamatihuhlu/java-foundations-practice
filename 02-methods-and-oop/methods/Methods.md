# Methods in Java

Methods are blocks of code that perform a specific task. They help make programs **organized, reusable, and readable**.
Think of a method like a **recipe**: you write it once, then use it whenever you need it.

---

## Structure of a Method

A method in Java has **six main components**:

### 1. Access Modifier

Defines the visibility of the method.

* **public** → accessible from anywhere
* **protected** → accessible within the same package and by subclasses
* **private** → accessible only within the same class
* **default** (no keyword) → accessible only within the same package

```java
public void myMethod() { ... }
protected void myMethod() { ... }
private void myMethod() { ... }
void myMethod() { ... } // default
```

---

### 2. Optional Modifiers

Provide special behavior.

* **static** → belongs to the class, not objects (can be called without creating an object).
* **final** → cannot be overridden in subclasses.
* **abstract** → declared without a body, must be implemented by subclasses (only allowed in abstract classes or interfaces).
* **synchronized** → can only be accessed by one thread at a time.
* **native** → implemented in another language like C (rare in beginner-level Java).

```java
public static void printMessage() { ... }
public final void cannotChange() { ... }
public abstract void mustBeImplemented();
```

---

### 3. Return Type

Specifies what the method gives back.

* **void** → returns nothing
* Any data type (int, double, String, boolean, Object, arrays, etc.)

```java
public void printMessage() { ... }
public int getNumber() { return 42; }
public String getGreeting() { return "Hello"; }
```

---

### 4. Method Name

* Identifies the method when calling it.
* By convention, written in **camelCase**.
* Should be descriptive of the method’s purpose.

```java
public void calculateSum() { ... }
public double findAverage() { ... }
```

---

### 5. Parameter List

* Input values given to the method, inside parentheses `()`.
* Each parameter has a type and a name.
* If no parameters, the parentheses are left empty.

```java
public void greetUser(String name) { ... }
public void introduceUser(String name, int age) { ... }
public void printMessage() { ... } // no parameters
```

---

### 6. Method Body

* The block of code inside `{ }`.
* Contains the logic or instructions the method executes.

```java
public int multiply(int a, int b) {
    int result = a * b;
    return result;
}
```

---

## Example: Complete Method Structure

```java
public static int addNumbers(int a, int b) {
    int sum = a + b;   // method body
    return sum;        // return type is int
}
```

* **public** → access modifier
* **static** → optional modifier
* **int** → return type
* **addNumbers** → method name
* **(int a, int b)** → parameter list
* **{ ... }** → method body

---

## Method Signature

* Defined by **method name + parameter list**.
* Example: `addNumbers(int a, int b)` is the signature.
* **Overloading**: methods with the same name but different parameter lists.

---

## Summary

* A method = reusable block of code.
* Six components: **Access Modifier, Optional Modifiers, Return Type, Method Name, Parameter List, Method Body**.
* Good methods have descriptive names, clear parameters, and do one task well.

---