package Module14.Prime_Numbers;

import java.util.ArrayList;

/**
 * Tests the PrimeNumbers class
 *
 * @author Denielle Kirk Abaquita
 * @version 19 February 2018
 */

public class PrimeNumbersTester {

    public static void main(String[] args) {

        // Declaration and Initializations
        PrimeNumbers prime = new PrimeNumbers();

        // Perform Operations
        prime.calcPrimeNumbers();
        ArrayList<Integer> primeNumbers = prime.getPrimeNumbers();

        System.out.println("\n\nHere is your list of prime numbers: \n");

        // Display the array list
        for (int i = 0; i < primeNumbers.size(); i++)
        {
            System.out.printf("%-5d ", primeNumbers.get(i));
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
        }

        System.out.println("\n\nNumber of prime numbers found: " + primeNumbers.size());

    }

}
