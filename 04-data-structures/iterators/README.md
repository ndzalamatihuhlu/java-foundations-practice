# Iterators

## Overview

An **Iterator** in Java is an object that enables you to traverse through elements of a collection one at a time.
Iterators are part of the `java.util` package and provide a uniform way to loop through different types of collections without exposing their internal structure.
They also allow safe removal of elements during iteration.

## Learning Outcomes

By the end of this section, you should be able to:

* Obtain an iterator from a collection.
* Use `hasNext()` and `next()` methods to loop through elements.
* Remove elements from a collection while iterating.
* Understand when to use iterators versus enhanced for-loops.

## Structure

```
iterators/
├── IteratorExample.java
└── README.md
```

## Key Concepts

### Obtaining an Iterator

```java
List<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
Iterator<String> it = names.iterator();
```

### Traversing a Collection

* `hasNext()` – checks if more elements are available.
* `next()` – retrieves the next element.

```java
while (it.hasNext()) {
    System.out.println(it.next());
}
```

### Removing Elements Safely

* `remove()` – deletes the last element returned by `next()`.
* Avoid using `collection.remove()` directly while iterating, as it causes `ConcurrentModificationException`.

```java
while (it.hasNext()) {
    if (it.next().equals("Bob")) {
        it.remove();
    }
}
```

### Iterator vs Enhanced For-Loop

* **Enhanced For-Loop**: Easier to read, but cannot remove elements safely.
* **Iterator**: More control and safe element removal during iteration.

## Best Practices

* Use iterators when you need to remove elements during iteration.
* Always check `hasNext()` before calling `next()` to avoid `NoSuchElementException`.
* Prefer enhanced for-loops when only reading elements.

## Related OCA Exam Objectives

* Traverse collections using iterators.
* Use iterator methods (`hasNext`, `next`, `remove`) safely and effectively.
