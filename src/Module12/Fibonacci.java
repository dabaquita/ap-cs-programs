package Module12;

/**
 * To recursively calculate the nth Fibonacci number
 *
 * @author Denielle Kirk Abaquita
 * @version 9 January 2018
 */

public class Fibonacci {

    /**
     * Default Constructor
     */
    public Fibonacci() {

    } // end of constructor


    /**
     * Recursively searches for a needed integer in the Fibonacci sequence
     *
     * @param n - at least 0 integer
     * @return number at the index of n in the Fibonacci sequence
     */
    public int returnFibonacci(int n) {

        if (n == 0) {                       // base case one
            return 0;
        } else if (n == 1) {                // base case two
            return 1;
        } else {                            // recursive call
            return returnFibonacci(n - 1) + returnFibonacci(n - 2);
        }
    }   // end of calcFibonacci


}   // end of class
