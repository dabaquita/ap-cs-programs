package Module12;

/**
 * To recursively calculate the nth Fibonacci number by testing
 * the Fibonacci class.
 *
 * @author Denielle Kirk Abaquita
 * @version 9 January 2018
 */

import java.util.Scanner;

public class FibonacciTester {

    // main method
    public static void main(String[] args) {

        // Variables
        Scanner input = new Scanner(System.in);
        int indexInFib = -1;                                            // begins less than 0 to initiate input prompt
        Fibonacci fibObject = new Fibonacci();
        int fibonacciValue;

        // Processing
        while (indexInFib < 0 || indexInFib > 39) {
            System.out.print("\nPlease input an integer at least 0 and less than 40 (q to quit): ");

            String temp = input.next();

            if (temp.equalsIgnoreCase("q")) {
                return;
            } else {
                indexInFib = Integer.parseInt(temp);
            }

            // prompts the user to try again if the input is less than 0
            if (indexInFib < 0 || indexInFib > 39) {
                System.out.println("Number is not within range. Please try again.");
            }

        }   // end of while loop

        fibonacciValue = fibObject.returnFibonacci(indexInFib);         // assigns the fibonacci number

        // Output
        System.out.println("The value of " + indexInFib + " in the Fibonacci sequence is: " + fibonacciValue);

    }

}
