package practice;

import java.util.Scanner;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */
public class AddNumbers {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int runAgain =0;

        do{
            System.out.print("Enter the first number to add: ");
            double firstNumber = scanner.nextDouble();
            System.out.print("Enter the second number to add: ");
            double secondNumber = scanner.nextDouble();
            double total = firstNumber + secondNumber;
            System.out.println("Total is " + total);
            System.out.print("Would you like to start over? [1 for yes 0 for no]: ");
            runAgain = scanner.nextInt();
        }while(runAgain!=0);
        System.out.print("Thank you for using this program. Goodbye!");


        scanner.close();
    }
}