# Variables and Data Types

## Overview
This section covers how Java stores and manages data through variables and data types.  
You will learn the difference between primitive types (which store values directly) and reference types (which store addresses pointing to objects). Understanding these concepts is essential for writing efficient and bug-free Java programs.

## Learning Outcomes
By the end of this section, you should be able to:
- Declare and initialize variables correctly.
- Understand the eight primitive data types in Java.
- Differentiate between primitive and reference types.
- Perform implicit and explicit type casting.
- Work with constants using the `final` keyword.
- Use wrapper classes such as `Integer`, `Double`, and `Boolean`.

## Structure
```
variables-and-data-types/
├── VariablesDemo.java
├── PrimitiveTypesExample.java
└── README.md
```

## Key Concepts

### Primitive Data Types
Java has eight primitive types:
1. `byte` – 8-bit integer
2. `short` – 16-bit integer
3. `int` – 32-bit integer
4. `long` – 64-bit integer
5. `float` – 32-bit floating point
6. `double` – 64-bit floating point
7. `char` – 16-bit Unicode character
8. `boolean` – `true` or `false`

### Reference Types
- Store the memory address of an object.
- Examples: `String`, arrays, user-defined classes.
- Can be `null`.

### Type Casting
- **Implicit casting** (widening) – safe, automatic conversion from smaller to larger type.  
  Example: `int x = 5; double y = x;`
- **Explicit casting** (narrowing) – manual conversion from larger to smaller type, possible data loss.  
  Example: `double d = 9.7; int i = (int) d;`

### Constants
- Declared using the `final` keyword.
- Value cannot be changed once assigned.

## Best Practices
- Use the smallest data type necessary for the job.
- Prefer `double` over `float` for precision unless memory is critical.
- Initialize variables before use to avoid compilation errors.
- Be careful with narrowing conversions to prevent data loss.

## Related OCA Exam Objectives
- Declare and initialize variables (including casting of primitive data types).
- Differentiate between object reference variables and primitive variables.
- Develop code that uses wrapper classes such as `Boolean`, `Double`, and `Integer`.