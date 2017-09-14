package Module5;

/**
 * This program uses the Monte Carlo sampling method to estimate the average
 * number of animals observed before spotting one you are tracking
 * within a particular ecosystem.
 *
 * @author Denielle Kirk Abaquita
 * @version 13 September 2017
 *
 */

/**
 * Planning / Pseudocode
 *
 * import Scanner
 * import File
 * import PrintWriter
 * import IOException
 *
 * --- Main Method (throws IOException) ---
 *
 * --> Variables
 * Scanner input
 * PrintWriter outFile --> new PrintWriter(new File("observations.txt")
 * File fileName --> new File("observations.txt")
 * Scanner inFile
 *
 * int numOfTrials
 * int random (random number from 1 - 10 inclusive)
 * int totalCountPerTrial
 *
 * int trialObservation
 * int totalSquirrelsObserved
 * double averageNumOfSquirrels
 *
 *
 * --> Processing Part 1
 * Prompt user for numOfTrials greater than or equal to 1000
 *      store to numOfTrials
 *
 * for (numOfTrials; numOfTrials > 0; numOfTrials -= 1)
 *      boolean foxSquirrel is false
 *      while !foxSquirrel
 *          generate randomNum within [0, 10]
 *          if the randomNum is 10
 *              foxSquirrel is true
 *          increment totalCountPerTrial
 *      store totalCountPerTrial in text file observations.txt
 *
 * --> Processing Part 2
 * while there is still data in the next line to be read
 *      assign data to trialObservation
 *      add trialObservation to totalSquirrelsObserved
 *
 * assign averageNumOfSquirrels the value of (totalSquirrelsObserved / numOfTrials)
 *      multiplied by 100
 *
 *
 * --> Overall Output
 * "Welcome to the Squirrel Simulator"
 *
 * Prompt user from Processing Part 1
 *
 * "The results!"
 *
 * "The average number of squirrels observed until spotting a Fox Squirrel
 * at the city park is: " + averageNumOfSquirrels
 *
 *
 */

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class AnimalPopulation {

    public static void main(String[] args) {



    } // end of main

} // end of class
