package lectures_demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * LocalVariableTypeReferenceDemo
 * Demonstrates the use of 'var' in Java (local variable type inference).
 * Introduced in Java 10.
 */
public class LocalVariableTypeReferenceDemo {

    public static void main(String[] args) {

        // 1. Basic usage of var -----------------------------------
        var number = 42;          // inferred as int
        var message = "Hello";    // inferred as String

        System.out.println("Number: " + number);
        System.out.println("Message: " + message);

        // 2. With collections -------------------------------------
        var list = new ArrayList<String>(); // inferred as ArrayList<String>
        list.add("Alpha");
        list.add("Beta");
        System.out.println("List contents: " + list);

        // 3. With maps -------------------------------------------
        var map = new HashMap<Integer, String>(); // inferred as HashMap<Integer, String>
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println("Map contents: " + map);

        // 4. In for-each loops -----------------------------------
        var values = List.of(10, 20, 30); // inferred as List<Integer>
        for (var value : values) {
            System.out.println("Loop value: " + value);
        }

        // 5. Type inference in expressions -----------------------
        var result = 3.14 * 2; // inferred as double
        System.out.println("Result of expression: " + result);

        // 6. Invalid examples (uncommenting will cause compile errors)
        // var x;             // ❌ Error: must be initialized
        // var y = null;      // ❌ Error: cannot infer type from null
        // public var method() { return "Invalid"; } // ❌ Not allowed outside local variables
    }
}
