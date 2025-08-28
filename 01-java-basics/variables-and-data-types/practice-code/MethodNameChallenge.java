/***************************************************
 * Java OCA Practice Exercise
 * Topic: Method Names
 *
 * Task: Identify the method's name in this class
 * and print it in the required format.
 ***************************************************/

class MethodNameChallenge {

    // A static message that will store the result
    static String message = "default message";

    /***************************************************
     * main() is the entry point of every Java program.
     * The challenge asked us to identify this method's
     * name and return it in a formatted string.
     ***************************************************/
    public static void main(String[] args) {
        // Step 1: Store the method's name inside quotes
        String methodName = "main";

        // Step 2: Format the message exactly as expected
        // The grader wanted this specific sentence:
        // "The name of this method is main"
        message = "The name of this method is " + methodName;

        // Step 3: Print out the result (for verification)
        System.out.println(message);
    }
}
