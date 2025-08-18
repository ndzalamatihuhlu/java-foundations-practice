# Local Variable Type Inference (`var`)

Local variable type inference in Java (introduced in **Java 10**) allows the compiler to determine the type of a variable from its initializer. Instead of explicitly writing the type, you use the keyword `var`.

---

## Key Rules

| Rule                                                       | Example                               | Valid / Invalid |
| ---------------------------------------------------------- | ------------------------------------- | --------------- |
| Must be initialized at declaration                         | `var x = 10;`                         | ✅ Valid         |
| Cannot declare without initializer                         | `var y;`                              | ❌ Invalid       |
| Cannot initialize with `null` only                         | `var z = null;`                       | ❌ Invalid       |
| Can be used in loops and blocks                            | `for (var i = 0; i < 5; i++) {}`      | ✅ Valid         |
| Type is inferred at **compile-time**, not runtime          | `var text = "Hello"; // String`       | ✅ Valid         |
| Works with generics                                        | `var list = new ArrayList<String>();` | ✅ Valid         |
| Not allowed for fields, method parameters, or return types | `public var method() {}`              | ❌ Invalid       |

---

## Benefits

* Reduces repetition, especially with generics or long type names.
* Makes code more concise while keeping static typing.
* Improves readability when the type is obvious from context.

---

## Limitations

* Should not be overused where it reduces readability.
* Does not make Java dynamically typed. The type is fixed at compile-time.
* Cannot be used to avoid understanding the underlying type.

---

## Examples

### Basic Usage

```java
var number = 42;          // inferred as int
var message = "Hello";    // inferred as String
System.out.println(number);
System.out.println(message);
```

### With Collections

```java
var list = new ArrayList<String>();
list.add("Alpha");
list.add("Beta");
System.out.println(list);  // ArrayList<String>
```

### With Maps

```java
var map = new HashMap<Integer, String>();
map.put(1, "One");
map.put(2, "Two");
System.out.println(map);  // HashMap<Integer, String>
```

### In Loops

```java
var values = List.of(10, 20, 30);
for (var value : values) {
    System.out.println(value);
}
```

### Invalid Usage

```java
// var x;              // Compile-time error: no initializer
// var y = null;       // Compile-time error: cannot infer type
// public var getData() { return "data"; } // Invalid outside local variables
```

---


## What is `var`?
Starting from **Java 10**, you can declare local variables with the `var` keyword. This enables **type inference**, where the **compiler** determines the actual data type based on the value assigned.

Example:
```java
var number = 10;        // inferred as int
var name = "Rorsuite";  // inferred as String
```



## Key Points

* Java is still **statically typed**, not dynamically typed.
* The type is determined **at compile time**, not runtime.
* Once the type is inferred, it cannot change:

```java
var count = 5;     // int
count = "hello";   // ❌ Compile-time error
```

---

## How does Java know the type?

➡️ **It infers the data type by the value assigned to the variable.**

---

## Example

```java
public class VarExample {
    public static void main(String[] args) {
        var season = "Winter";      // String
        var numberOfCups = 4;       // int
        var adjective = "cold";     // String

        String story = "On a " + adjective + " " + season +
                       " day, I drink a minimum of " + numberOfCups + " cups of coffee.";
        System.out.println(story);
    }
}
```

**Output:**

```
On a cold Winter day, I drink a minimum of 4 cups of coffee.
```
