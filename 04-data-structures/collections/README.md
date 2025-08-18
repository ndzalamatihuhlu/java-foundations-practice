# Collections

## Overview

Collections in Java provide dynamic, flexible data structures that can grow or shrink as needed.
They are part of the **Java Collections Framework** in the `java.util` package and include interfaces and classes for storing, retrieving, and manipulating groups of objects.
Collections eliminate the fixed size limitation of arrays and offer built-in methods for common operations.

## Learning Outcomes

By the end of this section, you should be able to:

* Understand the main collection interfaces (`List`, `Set`, `Map`).
* Use common implementations like `ArrayList`, `HashSet`, and `HashMap`.
* Add, remove, and search for elements in a collection.
* Iterate through collections using loops and iterators.
* Recognize when to choose a particular collection type.

## Structure

```
collections/
├── ListExample.java
├── SetExample.java
├── MapExample.java
└── README.md
```

## Key Concepts

### List

* Ordered, allows duplicates.
* Example implementation: `ArrayList`.

```java
List<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
System.out.println(names.get(0)); // Alice
```

### Set

* Unordered, no duplicate elements.
* Example implementation: `HashSet`.

```java
Set<Integer> numbers = new HashSet<>();
numbers.add(10);
numbers.add(20);
numbers.add(10); // Duplicate ignored
```

### Map

* Key-value pairs, no duplicate keys.
* Example implementation: `HashMap`.

```java
Map<String, Integer> scores = new HashMap<>();
scores.put("Alice", 90);
scores.put("Bob", 85);
System.out.println(scores.get("Alice")); // 90
```

### Iteration

* Enhanced for-loop:

```java
for (String name : names) {
    System.out.println(name);
}
```

* Using `Iterator`:

```java
Iterator<String> it = names.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

## Best Practices

* Use `List` when order matters and duplicates are allowed.
* Use `Set` when you need unique elements.
* Use `Map` when data is stored as key-value pairs.
* Always use generics to enforce type safety.

## Related OCA Exam Objectives

* Use core collection types (`List`, `Set`, `Map`) and their common implementations.
* Iterate through collections using loops and iterators.
