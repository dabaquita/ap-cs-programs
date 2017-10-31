package Module7;

/**
 * To calculate the value of pi
 * by simulating throwing darts
 * at a dart board.
 *
 * @author Denielle Kirk Abaquita
 * @version 30 October 2017
 */

import java.util.Scanner;

public class EstimatePi {

    // main method
    public static void main(String[] args) {

        // Variables
        int numOfDarts;
        int numOfTrials;
        double estimateOfPi;
        double[] resultsOfTrials;

        // Operations
        numOfDarts = promptUserNumOfDarts();
        numOfTrials = promptUserNumOfTrials();
        resultsOfTrials = executeTrials(numOfTrials, numOfDarts);
        estimateOfPi = averageEstimates(resultsOfTrials);

        // Output
        printResults(resultsOfTrials, estimateOfPi);

    }   // end of main


    // prompts for and returns user input for number of darts to be thrown
    public static int promptUserNumOfDarts() {

        // Variables
        Scanner input = new Scanner(System.in);
        int numOfDarts;

        // Processing
        System.out.print("How many darts per trial? (e.g. 1500): ");
        numOfDarts = Integer.parseInt(input.next());        // assigns the input to num of darts

        return numOfDarts;                                  // returns value of input

    }   // end of numOfDarts()


    // prompts for and returns user input for number of trials to take place
    public static int promptUserNumOfTrials() {

        // Variables
        Scanner input = new Scanner(System.in);
        int numOfTrials;

        // Processing
        System.out.print("How many trials? (e.g. 10): ");
        numOfTrials = Integer.parseInt(input.next());       // assigns input to num of trials

        return numOfTrials;                                 // returns value of input

    }   // end of numOfTrials()


    // tests the number of hits to the total number of throws and return an array of those results
    public static double[] executeTrials(int numOfTrials, int numOfDarts) {

        // Variables
        double x, y;
        int totalHits;
        double[] trialsValues = new double[numOfTrials];            // holds results (estimate of pi) of each trial

        // Processing
        for (int i = 0; i < numOfTrials; i++) {                     // gets pi value after each trial
            totalHits = 0;                                          // sets totalHits to 0 every trial

            for (int j = 0; j < numOfDarts; j++) {                  // tests for hits and increments totalHits

                x = Math.random();      // random numbers for use in Pythagorean Theorem
                y = Math.random();

                // System.out.println("x: " + Math.pow(x,2) + " y: " + Math.pow(y, 2));

                if ( (Math.pow(x, 2) + Math.pow(y, 2)) <= 1 ) {      // if x^2 + y^2 <= 1, then dart thrown is a hit
                    totalHits++;        // increments sum of hits
                }
            }   // end of for loop

            trialsValues[i] = 4 * ( (double) totalHits / numOfDarts);         // calculates the value of pi for each trial

        }   // end of for loop

        return trialsValues;            // returns the array of results

    }   // end of executeTrials()


    // calculates the average of all of the estimates within the trials
    public static double averageEstimates(double[] estimates) {

        // Variables
        double sum = 0;

        // Processing
        for (double piValue : estimates) {

            sum += piValue;     // calculates the sum of all values in array

        }   // end of for loop

        return sum / estimates.length;  // returns the average of all of the estimates

    }   // end of averageEstimates()


    // Prints the results of the trials
    public static void printResults(double[] results, double average) {

        for (int i = 0; i < results.length; i++) {                  // prints the results per line

            System.out.printf("\nTrial [" + (i + 1) + "]: pi = %1.6f", results[i]);

        }   // end of for loop

        System.out.printf("\n\nEstimate of pi = %1.6f\n", average);     // prints the average

    }   // end of printResults()

}   // end of class
