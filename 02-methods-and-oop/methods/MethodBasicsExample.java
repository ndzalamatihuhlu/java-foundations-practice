/****************************************************
 * File: MethodBasicsExample.java
 * Purpose:
 *   To teach the structure of a method in Java.
 *
 * Methods in Java have SIX main components:
 *
 * 1. Access Modifier
 *    - Defines who can access the method.
 *      Options:
 *      public    → accessible from anywhere
 *      protected → accessible within same package + subclasses
 *      private   → accessible only within the same class
 *      default   → (no keyword) accessible only within the same package
 *
 * 2. Optional Modifiers
 *    - Provide special functionality.
 *      static   → belongs to the class, can be called without an object
 *      abstract → declares method without implementation (must be in abstract class/interface)
 *      final    → method cannot be overridden in subclasses
 *      synchronized → method can only be accessed by one thread at a time
 *      native   → implemented in another language like C (rarely used in beginner Java)
 *
 * 3. Return Type
 *    - Defines what the method gives back.
 *      void     → no return value
 *      int, double, String, boolean, etc → must return that type
 *      Object, arrays, custom classes → methods can also return these
 *
 * 4. Method Name
 *    - The identifier used to call the method.
 *    - Written in camelCase by convention, descriptive of the task.
 *
 * 5. Parameter List
 *    - Input values passed into the method, inside parentheses ().
 *    - Each parameter has a data type and a name.
 *    - Example: (int age, String name)
 *    - Can also be empty () if no input is needed.
 *
 * 6. Method Body
 *    - The block of code inside { } that defines what the method does.
 *
 * NOTE: A method’s "signature" is its name + parameter list.
 ****************************************************/

public class MethodBasicsExample {

    /****************************************
     * 1. Access Modifiers Demonstration
     ****************************************/

    // Public method: can be accessed from anywhere
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Protected method: can be accessed in same package or subclass
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // Private method: only accessible within this class
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Default method (no modifier): accessible only in same package
    void defaultMethod() {
        System.out.println("This is a default (package-private) method.");
    }

    /****************************************
     * 2. Optional Modifiers Demonstration
     ****************************************/

    // Static method: belongs to the class, not an object
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Final method: cannot be overridden in subclasses
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }

    // (Demonstration note: abstract and native cannot be shown
    //  directly in a simple example without extra setup. Abstract
    //  requires an abstract class. Native is rare and OS dependent.)

    /****************************************
     * 3. Return Type Demonstration
     ****************************************/

    // Void method: does not return anything
    public void printMessage() {
        System.out.println("This method returns nothing.");
    }

    // Method returning an int
    public int getNumber() {
        return 42;
    }

    // Method returning a String
    public String getGreeting() {
        return "Hello from a method!";
    }

    /****************************************
     * 4. Method Name Demonstration
     ****************************************/
    // Example: camelCase descriptive naming
    public void calculateSum() {
        int a = 5, b = 10;
        System.out.println("Sum = " + (a + b));
    }

    /****************************************
     * 5. Parameter List Demonstration
     ****************************************/

    // Method with one parameter
    public void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method with multiple parameters
    public void introduceUser(String name, int age) {
        System.out.println("This is " + name + ", age " + age);
    }

    /****************************************
     * 6. Method Body Demonstration
     ****************************************/

    // Method body: enclosed in { }, contains logic
    public int multiplyNumbers(int x, int y) {
        int result = x * y; // logic
        return result;      // return the result
    }

    /****************************************
     * MAIN METHOD: Testing All Examples
     ****************************************/
    public static void main(String[] args) {
        // Create object (for non-static methods)
        MethodBasicsExample demo = new MethodBasicsExample();

        // 1. Access modifiers
        demo.publicMethod();
        demo.protectedMethod();
        demo.defaultMethod();
        // demo.privateMethod(); // ❌ cannot be called outside this class

        // 2. Optional modifiers
        staticMethod();  // called without an object
        demo.finalMethod();

        // 3. Return types
        demo.printMessage();
        int num = demo.getNumber();
        System.out.println("Returned number: " + num);
        String greeting = demo.getGreeting();
        System.out.println("Returned greeting: " + greeting);

        // 4. Method name (camelCase convention)
        demo.calculateSum();

        // 5. Parameter list
        demo.greetUser("Alice");
        demo.introduceUser("Bob", 30);

        // 6. Method body
        int product = demo.multiplyNumbers(7, 6);
        System.out.println("7 × 6 = " + product);
    }
}
