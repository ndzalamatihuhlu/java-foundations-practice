import java.util.Scanner;

// If-Else example
/*
 *IF-ELSE-IF
 * Display the letter grade for a student based on their test score
 */
public class IfElseExample {

    public static void main(String[] args) {
        // Get the test score
        System.out.println("Enter your test score below:");
        Scanner userInputScanner = new Scanner(System.in);
        double score = userInputScanner.nextInt();
        userInputScanner.close();

        // Determine the letter grade
        char grade;
        if (score >= 90) {
            grade = 'A';
            System.out.printf("Your score is %.2f", score);
        }
        else {
            if (score >= 80) {
                grade = 'B';
            }
            else if (score >= 70) {
                grade = 'C';
            }
            else if (score >= 60) {
                grade = 'D';
            }
            else if (score >= 50) {
                grade = 'E';
            }
            else if (score < 50) {
                grade = 'F';
        }
            System.out.printf("Your score is %.2f", score);
        }