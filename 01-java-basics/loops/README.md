# Operators and Conditionals

## Overview
This section covers Java operators for performing calculations, comparisons, logical evaluations, and assignments, as well as conditional statements for decision-making.  
Understanding operators and conditionals is crucial because they allow you to control the flow of your program based on conditions and computations.

## Learning Outcomes
By the end of this section, you should be able to:
- Use arithmetic, relational, logical, and assignment operators.
- Apply operator precedence and use parentheses to control evaluation order.
- Compare primitive types and object references correctly.
- Implement conditional branching using `if`, `if-else`, and `switch`.
- Apply the ternary conditional operator for concise decision-making.

## Structure
```
operators-and-conditionals/
├── OperatorsExample.java
├── IfElseExample.java
├── SwitchExample.java
└── README.md
```

## Key Concepts

### Types of Operators
1. **Arithmetic Operators** – `+`, `-`, `*`, `/`, `%`
2. **Relational Operators** – `==`, `!=`, `>`, `<`, `>=`, `<=`
3. **Logical Operators** – `&&`, `||`, `!`
4. **Assignment Operators** – `=`, `+=`, `-=`, `*=`, `/=`, `%=`
5. **Unary Operators** – `++`, `--`, `+`, `-`, `!`
6. **Ternary Operator** – `condition ? valueIfTrue : valueIfFalse`

### Operator Precedence
- Multiplication, division, and modulus have higher precedence than addition and subtraction.
- Parentheses can override precedence.
- Logical operators are evaluated after relational operators.

### Comparing Objects vs Primitives
- Primitives: use relational operators directly (`==`, `<`, `>`).
- Objects: use `.equals()` for value comparison and `==` for reference comparison.

### Conditional Statements
- **if / if-else** – Execute code blocks based on boolean conditions.
- **switch** – Choose from multiple execution paths based on a variable’s value (works with `byte`, `short`, `char`, `int`, `String`, and enums in Java SE 8).

## Best Practices
- Use `switch` when comparing against multiple constant values for clarity and performance.
- Always include a `default` case in `switch` statements.
- Keep conditions simple; complex conditions should be broken into smaller logical checks.
- When comparing floating-point numbers, use a tolerance value instead of `==` due to precision issues.

## Related OCA Exam Objectives
- Use Java operators; use parentheses to override operator precedence.
- Test equality between `String` objects and other objects using `==` and `.equals()`.
- Create `if` and `if/else` and ternary constructs.
- Use a `switch` statement.