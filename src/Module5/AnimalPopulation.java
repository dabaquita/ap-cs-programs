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
 * Convert to int value
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

    public static void main(String[] args) throws IOException {

        // Object and Variable Declarations and Initializations
        Scanner input = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter(new File("observations.txt"));
        File fileName = new File("observations.txt");
        Scanner inFile = new Scanner(fileName);

        int numOfTrials;
        int randomNum;
        int totalCountPerTrial;

        int trialObservation;
        int totalSquirrelsObserved = 0;
        double averageNumOfSquirrels;


        // Processing 1 (Creating text file and data within)
        System.out.println("Welcome to the Fox Squirrel Simulator\n");
        System.out.print("How many trials should be simulated?\n"
                            + "Enter a value greater than 1000: ");
        String tempStr = input.next();                                  // Holds string input value temporarily

        if (Integer.parseInt(tempStr) <= 1000) {                        // checks if number is less than 1000, prompts if it is

            System.out.println("\nPlease try again. Enter a number greater than 1000.\n");

            System.out.print("How many trials should be simulated?\n"
                    + "Enter a value greater than 1000: ");
            tempStr = input.next();

        }

        System.out.println("\nsimulating trials now... one moment please...\n");

        for(numOfTrials = Integer.parseInt(tempStr); numOfTrials > 0; numOfTrials -= 1) {        // converts and assigns to integer number of trials which is used to num of interations for loop
            boolean foxSquirrel = false;                                // initially false until there is a spotting of foxSquirrel at value of 10
            totalCountPerTrial = 0;                                     // initially 0 until trial starts in while loop

            while (!foxSquirrel) {                                      // while loop iterates until foxSquirrel is true

                randomNum = (int) (Math.random() * 11);                 // random number is generated

                if (randomNum == 10) {                                  // if the number is 10, a fox squirrel was spotted
                    foxSquirrel = true;
                }

                totalCountPerTrial++;                                   // total count in the trial until fox squirrel was spotted
            } // end of while loop

            outFile.println(totalCountPerTrial);                        // stores the count on a new line in observations.txt

        } // end of for loop

        outFile.close();                                                // closes observation.txt


        // Processing 2 (Data handling from observations.txt)
        while (inFile.hasNextInt()) {                                  // continues until all tokens are read

            trialObservation = inFile.nextInt();                        // stores Int data into a variable
            // System.out.println(trialObservation);

            totalSquirrelsObserved += trialObservation;                 // totals the number of squirrels observed when a fox squirrel is spotted

        } // end of while loop

        // System.out.println(totalSquirrelsObserved);

        inFile.close();                                                 // closes observation.txt

        numOfTrials = Integer.parseInt(tempStr);                        // parse integer value from tempStr
        averageNumOfSquirrels = (int) ( ((double) totalSquirrelsObserved / numOfTrials) * 100 ) / 100.0;     // average number of squirrels to 2 decimal places

        // Overall output
        System.out.println("The results!");
        System.out.println("The average number of squirrels observed until"
                            + " spotting a fox squirrel at the city park is: " + averageNumOfSquirrels);


    } // end of main

} // end of class
