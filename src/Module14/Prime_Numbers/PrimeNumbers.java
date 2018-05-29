package Module14.Prime_Numbers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Calculates and count the quantity of prime
 * numbers between a given range.
 *
 * @author Denielle Kirk Abaquita
 * @version 19 February 2018
 */

public class PrimeNumbers {

    // Private Instance Variables
    private Scanner input = new Scanner(System.in);
    private int lower;
    private int upper;
    private ArrayList<Integer> primeNumbers = new ArrayList<>();

    /**
     * Constructor that prompts for entering of lower and upper values
     */
    public PrimeNumbers() {
        System.out.print("Please enter a lower limit: ");     // gets the lower limit
        lower = Integer.parseInt(input.next());

        System.out.print("Please enter an upper limit: ");    // gets the upper limit
        upper = Integer.parseInt(input.next());
    }

    /**
     * Getter method
     * @return primeNumbers array list
     */
    public ArrayList<Integer> getPrimeNumbers() {
        return primeNumbers;
    }

    /**
     * Tests for a prime number
     * @param num - takes in any integer number
     * @return boolean value if it prime or not
     */
    public static boolean isPrime(int num)
    {
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calculates all prime numberes and assign them to the ArrayList
     */
    public void calcPrimeNumbers()
    {
        // Tests for each number within the range
        for (int i = lower; i <= upper; i++)
        {
            if ( isPrime(i) ) {                     // if the number is prime,
                primeNumbers.add(i);                // then add to array list
            }
        }
    }

}   // end of class
