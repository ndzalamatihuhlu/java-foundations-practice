/****************************************************
 * File: ScopeOfVariablesExample.java
 * Purpose:
 *   To teach variable scope in Java.
 *
 * What is Scope?
 *   - Scope defines where a variable can be accessed in your code.
 *   - A variable is only available (or "visible") inside the
 *     block of code where it is declared.
 *
 * Key Concepts Covered:
 *   1. Local variables
 *   2. Method parameters
 *   3. Instance variables (fields)
 *   4. Block scope (variables inside { } only exist there)
 *   5. Real-world style example
 ****************************************************/

public class ScopeOfVariablesExample {

    // -------------------------------------------------
    // 1. Instance Variable (field)
    //    Belongs to an object. Accessible by all methods
    //    inside the class.
    // -------------------------------------------------
    private String name;

    // Constructor to set instance variable
    public ScopeOfVariablesExample(String name) {
        this.name = name;
    }

    // -------------------------------------------------
    // 2. Method with Parameter
    //    Parameters are local to the method.
    // -------------------------------------------------
    public void greetUser(String greeting) {
        // Local variable (inside method only)
        String message = greeting + ", " + name;
        System.out.println(message);
    }

    // -------------------------------------------------
    // 3. Demonstrating Block Scope
    // -------------------------------------------------
    public void demonstrateBlockScope() {
        int x = 10; // local to this method

        if (x > 5) {
            int y = 20; // local to this block only
            System.out.println("Inside block: x = " + x + ", y = " + y);
        }

        // System.out.println(y); // ❌ ERROR: y not visible here
        System.out.println("Outside block: x = " + x);
    }

    // -------------------------------------------------
    // MAIN METHOD
    // -------------------------------------------------
    public static void main(String[] args) {

        /****************************************
         * 1. Instance Variable Scope
         ****************************************/
        System.out.println("=== Instance Variable Scope ===");
        ScopeOfVariablesExample person1 = new ScopeOfVariablesExample("Alice");
        ScopeOfVariablesExample person2 = new ScopeOfVariablesExample("Bob");

        person1.greetUser("Hello"); // uses "name" = Alice
        person2.greetUser("Hi");    // uses "name" = Bob

        /****************************************
         * 2. Method Parameter Scope
         ****************************************/
        System.out.println("\n=== Method Parameter Scope ===");
        person1.greetUser("Good Morning"); // "greeting" exists only inside greetUser method

        /****************************************
         * 3. Local Variable Scope
         ****************************************/
        System.out.println("\n=== Local Variable Scope ===");
        person1.demonstrateBlockScope();

        /****************************************
         * 4. Block Scope Example
         ****************************************/
        System.out.println("\n=== Block Scope Example ===");
        int outer = 100;
        {
            int inner = 200; // only available inside this block
            System.out.println("Outer = " + outer + ", Inner = " + inner);
        }
        // System.out.println(inner); // ❌ ERROR: not accessible here
    }
}
