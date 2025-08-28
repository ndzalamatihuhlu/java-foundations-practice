# Wrapper Classes

## Overview

Wrapper classes in Java allow primitive data types to be treated as objects.
They are part of the `java.lang` package and provide utility methods for converting, parsing, and manipulating primitive values.
Wrapper classes are essential when working with collections, generics, or APIs that require objects instead of primitives.

## Learning Outcomes

By the end of this section, you should be able to:

* Understand the purpose of wrapper classes.
* Convert between primitives and wrapper objects.
* Use autoboxing and unboxing.
* Parse strings into numeric or boolean values.
* Utilize common methods provided by wrapper classes.

## Structure

```
wrapper-classes/
├── WrapperExample.java
└── README.md
```

## Key Concepts

### Primitive Types and Their Wrappers

| Primitive | Wrapper Class |
| --------- | ------------- |
| `byte`    | `Byte`        |
| `short`   | `Short`       |
| `int`     | `Integer`     |
| `long`    | `Long`        |
| `float`   | `Float`       |
| `double`  | `Double`      |
| `char`    | `Character`   |
| `boolean` | `Boolean`     |

### Autoboxing and Unboxing

* **Autoboxing** – Automatic conversion from primitive to wrapper object.

  ```java
  Integer num = 5; // int to Integer
  ```
* **Unboxing** – Automatic conversion from wrapper object to primitive.

  ```java
  int value = num; // Integer to int
  ```

### Parsing and Conversion

* Convert strings to primitives:

  ```java
  int x = Integer.parseInt("42");
  double y = Double.parseDouble("3.14");
  ```
* Convert primitives to strings:

  ```java
  String s = Integer.toString(100);
  ```

### Common Methods

* `compareTo()` – Compare two wrapper objects.
* `equals()` – Compare wrapper object values.
* `valueOf()` – Create wrapper objects from strings or primitives.
* `parseXxx()` – Parse strings into primitive types.

## Best Practices

* Use autoboxing for cleaner code but be mindful of performance in large loops.
* Avoid unnecessary boxing/unboxing in performance-critical code.
* Prefer primitive types when null values are not needed.

## Related OCA Exam Objectives

* Develop code that uses wrapper classes such as `Boolean`, `Double`, and `Integer`.
* Differentiate between object reference variables and primitive variables.
