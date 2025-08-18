# Arrays

## Overview

Arrays are fixed-size containers that store multiple values of the same data type.
They are one of the most basic data structures in Java and provide fast access to elements through indexing.
Arrays can be one-dimensional or multi-dimensional, allowing for complex data arrangements like matrices.

## Learning Outcomes

By the end of this section, you should be able to:

* Declare, instantiate, and initialize arrays.
* Access and modify array elements.
* Work with both single-dimensional and multi-dimensional arrays.
* Iterate over arrays using traditional and enhanced for-loops.

## Structure

```
arrays/
├── ArrayDemo.java
├── MultiDimensionalArray.java
└── README.md
```

## Key Concepts

### Declaring and Initializing Arrays

```java
int[] numbers = new int[5]; // Declaration with size
int[] values = {1, 2, 3, 4, 5}; // Declaration with initialization
```

### Accessing Elements

* Arrays use zero-based indexing.
* Access elements with `array[index]`.

```java
System.out.println(values[0]); // Prints 1
values[2] = 10; // Changes the 3rd element to 10
```

### Multi-Dimensional Arrays

* Arrays containing other arrays.
* Often used to represent tables or grids.

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
System.out.println(matrix[1][2]); // Prints 6
```

### Iterating Over Arrays

* Using a `for` loop:

```java
for (int i = 0; i < values.length; i++) {
    System.out.println(values[i]);
}
```

* Using an enhanced for-loop:

```java
for (int val : values) {
    System.out.println(val);
}
```

## Best Practices

* Always check array length before accessing elements to avoid `ArrayIndexOutOfBoundsException`.
* Use enhanced for-loops for readability when you don’t need the index.
* For large datasets requiring dynamic size changes, consider using collections like `ArrayList`.

## Related OCA Exam Objectives

* Declare, instantiate, initialize, and use single and multi-dimensional arrays.
* Iterate through arrays using different loop types.
