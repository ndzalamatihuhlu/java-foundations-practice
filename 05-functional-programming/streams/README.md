# Streams

## Overview

The **Streams API** in Java, introduced in Java 8, provides a functional approach to processing collections and other data sources.
A stream represents a sequence of elements and supports operations for filtering, mapping, reducing, and collecting results, without modifying the underlying data source.
Streams encourage a **declarative programming style**, focusing on *what* to do rather than *how* to do it.

## Learning Outcomes

By the end of this section, you should be able to:

* Create streams from collections, arrays, and other sources.
* Use intermediate operations like `filter()`, `map()`, and `sorted()`.
* Use terminal operations like `forEach()`, `collect()`, and `reduce()`.
* Understand the difference between sequential and parallel streams.
* Apply method references and lambdas with streams.

## Structure

```
streams/
├── StreamExample.java
└── README.md
```

## Key Concepts

### Creating Streams

```java
// From a collection
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
Stream<String> stream1 = names.stream();

// From an array
Stream<Integer> stream2 = Arrays.stream(new Integer[]{1, 2, 3});
```

### Intermediate Operations

* Transform or filter the stream.
* Examples:

```java
names.stream()
     .filter(name -> name.startsWith("A"))
     .map(String::toUpperCase)
     .sorted()
     .forEach(System.out::println);
```

### Terminal Operations

* Produce a result or a side-effect.
* Examples:

```java
long count = names.stream().count();
List<String> upperNames = names.stream()
                               .map(String::toUpperCase)
                               .collect(Collectors.toList());
```

### Parallel Streams

* Process data in parallel for large datasets:

```java
names.parallelStream()
     .forEach(System.out::println);
```

* Not always faster — depends on dataset size and available CPU cores.

### Stream Pipeline

* **Source** → **Intermediate Operations** → **Terminal Operation**
* Streams are lazy; intermediate operations are executed only when a terminal operation is called.

## Best Practices

* Use streams for complex transformations and aggregations.
* Avoid modifying the source collection within a stream operation.
* Be mindful of readability — sometimes a traditional loop is clearer.
* Use parallel streams selectively after testing performance.

## Related OCA Exam Objectives

* Use the Streams API with lambda expressions and method references.
* Perform common operations like filtering, mapping, and collecting results.
