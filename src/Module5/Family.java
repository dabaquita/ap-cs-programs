package Module5;

/**
 * This program calculates the probability that a family with two children
 * will consist of two boys, a boy and a girl, or two girls.
 *
 * @author Denielle Kirk Abaquita
 * @version 11 September 2017
 *
 */

/**
 * Planning / Pseudocode
 *
 * import Scanner
 * import File
 * import IOException
 *
 * --- Main Method (throws IOException) ---
 *
 * --> Variables
 * File fileName
 * Scanner inFile
 * String dataInFile
 *
 * int total2Boys
 * int total2Girls
 * int totalCombo
 * int totalData
 *
 * double percent2Boys
 * double percent2Girls
 * double percentCombo
 *
 *
 * --> Processing
 * while inFile.hasNextLine()
 *      assign dataInFile to the nextLine() of inFile
 *
 *      if dataInFile equals "BB"
 *          increment total2Boys
 *      else-if dataInFile equals "GG"
 *          increment total2Girls
 *      else
 *          increment totalCombo
 *
 *      increment totalData
 *
 * assign percent2Boys the value of ((double) total2Boys / totalData) * 100
 * assign percent2Girls the value of ((double) total2Girls / totalData) * 100
 * assign percentCombo the value of ((double) totalCombo / totalData) * 100
 *
 *
 * --> Output
 * "Composition statistics for families with two children"
 *
 * "Total number of families: "
 *
 * "Number of families with "
 *      "2 boys:                represents  %"
 *      "2 girls:               represents  %"
 *      "1 boy and 1 girl:      represents  %"
 *
 * close inFile
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Family {

    public static void main(String[] args) throws IOException {

        // Objects / Variables
        File fileName = new File("maleFemaleInFamily.txt");
        Scanner inFile = new Scanner(fileName);
        String dataInFile = "";

        int total2Boys = 0;
        int total2Girls = 0;
        int totalCombo = 0;
        int totalData = 0;

        double percent2Boys;
        double percent2Girls;
        double percentCombo;


        // Processing
        while (inFile.hasNextLine()) {              // performs while there is still data to be read
            dataInFile = inFile.nextLine();

            if (dataInFile.equals("BB")) {

                total2Boys++;                       // if data is BB, then add to total2Boys
                totalData++;                            // adds to total number of data read

            } else if (dataInFile.equals("GG")) {

                total2Girls++;                      // if data is GG, then add to total2Girls
                totalData++;                            // adds to total number of data read

            } else if (dataInFile.equals("GB") || dataInFile.equals("BG")) {

                totalCombo++;                       // if data is BG or GB, then add to totalCombo
                totalData++;                            // adds to total number of data read

            }

        }   // end of while loop

        percent2Boys = ((double) total2Boys / totalData) * 100;        // Calculates the percentage
        percent2Girls = ((double) total2Girls / totalData) * 100;
        percentCombo =  ((double) totalCombo / totalData) * 100;

        inFile.close();     // close file

        // Output
        System.out.println("Composition statistics for families with two children\n");
        System.out.println("Total number of families: " + totalData);

        System.out.println("\nNumber of families with");
        System.out.println("    2 boys: " + total2Boys + "  represents " + percent2Boys + "%");
        System.out.println("    2 girls: " + total2Girls + "  represents " + percent2Girls + "%");
        System.out.println("    1 boy and 1 girl: " + totalCombo + "  represents " + percentCombo + "%");


    } // end of main
} // end of class
