package Module14.Frequency_Analysis;

/**
 * Calculates the frequency of all letters in
 * a .txt document.
 *
 * @author Denielle Kirk Abaquita
 * @version 20 February 2018
 */

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class FreqAnalysis {

    // Private instance and class variables
    private static final String[] ALPHABET = {"A", "B", "C", "D", "E",
                                            "F", "G", "H", "I", "J",
                                            "K", "L", "M", "N", "O",
                                            "P", "Q", "R", "S", "T",
                                            "U", "V", "W", "X", "Y", "Z"};

    private Scanner input = new Scanner(System.in);
    private File text;
    private Scanner inFile;
    private PrintWriter outFile;

    private int[] count = new int[ALPHABET.length];
    private double[] frequency = new double[ALPHABET.length];

    private int totalLetters = 0;

    /**
     * Constructor that prompts for a txt file name and creates an analysis
     */
    public FreqAnalysis() throws IOException
    {
        // Prompt user
        System.out.print("Please provide the name of the file (without .txt): ");
        text = new File(input.next() + ".txt");

        this.createAnalysis();                                      // call to calculate count and frequency
    }

    /**
     * Initializes the count and frequency arrays
     * as well as calls to print them in a file
     */
    public void createAnalysis() throws IOException
    {
        inFile = new Scanner(text);                       // assigns Scanner to read text file

        // Calculates the count of each letter within the text
        while (inFile.hasNext())
        {
            String token = inFile.next();                           // holds each subsequent word in the file

            // iterates over entire word for each letter
            for (int i = 0; i < token.length(); i++)
            {
                String letter = token.substring(i, i + 1);          // holds each letter in each word

                // iterates over the entire alphabet to check for letter equivalence
                for (int j = 0; j < ALPHABET.length; j++)
                {
                    if (letter.equalsIgnoreCase(ALPHABET[j])) {
                        count[j]++;                                 // increments the count for each letter
                    }
                }
            }
        }
        inFile.close();             // close the file

        // Calculate the total amount of letters
        this.calculateTotalLetters();

        // Calculates the frequency of each letter
        this.calculateFrequency();

        // Prints all results to a file
        this.printToFile();
    }

    /**
     * Calculates the total amount of letters
     */
    public void calculateTotalLetters()
    {
        for (int i = 0; i < count.length; i++)
        {
            totalLetters += count[i];
        }
    }

    /**
     * Calculates the frequency of each
     */
    public void calculateFrequency()
    {
        for (int i = 0; i < count.length; i++)
        {   // Calculates to 2 decimal places as a percentage
            frequency[i] = 100 * ((double) count[i] / totalLetters);
        }
    }

    /**
     * Prints out the values of ALPHABET, count, and frequency into an out file
     */
    public void printToFile() throws IOException
    {
        String root = text.getName().substring(0, text.getName().indexOf("."));     // isolates text before .txt
        outFile = new PrintWriter(new File(root + "Freq.txt"));                      // creates new file

        for (int i = 0; i < ALPHABET.length; i++)
        {
            outFile.printf("%-5s%-5d%-5.2f%s\n", ALPHABET[i], count[i], frequency[i], "%");
        }
        outFile.close();
    }

    /**
     * Prints all output of the instance of FreqAnalysis onto screen
     */
    public void printToScreen()
    {
        for (int i = 0; i < ALPHABET.length; i++)
        {
            System.out.printf("%-8s%-3s%-8s%-5d%-8s%-5.2f\n", "Letter:", ALPHABET[i],
                                "Count:", count[i], "Freq:", frequency[i]);
        }
    }

}   // end of class
