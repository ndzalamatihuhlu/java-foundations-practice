# Data Structures

## Overview

Data structures in Java are ways of organizing and storing data so it can be accessed and modified efficiently.
This module covers arrays, collections, and iterators — fundamental tools for handling groups of related data in Java applications.

## Learning Outcomes

By the end of this module, you should be able to:

* Declare, initialize, and manipulate arrays.
* Use Java Collection Framework classes like `ArrayList`, `HashSet`, and `HashMap`.
* Iterate through data using enhanced for-loops and `Iterator` objects.
* Understand the differences between arrays and collections.
* Choose appropriate data structures for different use cases.

## Structure

```
04-data-structures/
├── arrays/
│   ├── ArrayDemo.java
│   ├── MultiDimensionalArray.java
│   └── README.md
├── collections/
│   ├── ListExample.java
│   ├── SetExample.java
│   ├── MapExample.java
│   └── README.md
└── iterators/
    ├── IteratorExample.java
    └── README.md
```

## Key Concepts

### Arrays

* Fixed-size containers for elements of the same type.
* Can be single-dimensional or multi-dimensional.
* Access elements via index positions (zero-based).

Example:

```java
int[] numbers = {1, 2, 3};
System.out.println(numbers[0]); // 1
```

### Collections

* Part of `java.util` package.
* Dynamic size; can store objects of different types (if generics are not enforced).
* Common types:

    * **List** – Ordered, allows duplicates (`ArrayList`, `LinkedList`).
    * **Set** – Unordered, no duplicates (`HashSet`, `LinkedHashSet`).
    * **Map** – Key-value pairs (`HashMap`, `TreeMap`).

### Iterators

* Objects used to traverse collections.
* Provide safe removal of elements during iteration.

```java
Iterator<String> it = list.iterator();
while (it.hasNext()) {
        System.out.println(it.next());
        }
```

## Best Practices

* Use arrays when the size is fixed and performance is critical.
* Use collections for dynamic and more complex data handling.
* Choose the right collection type for your data characteristics (ordering, duplicates, key-value).
* Always use generics with collections to enforce type safety.

## Related OCA Exam Objectives

* Declare, instantiate, and use arrays and multi-dimensional arrays.
* Use `ArrayList`, `HashSet`, `HashMap`, and other core collection types.
* Iterate over arrays and collections using loops and iterators.
