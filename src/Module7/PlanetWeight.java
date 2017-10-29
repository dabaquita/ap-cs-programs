package Module7;

/**
 * Calculates weight on each planet
 * in the solar system.
 *
 * @author Denielle Kirk Abaquita
 * @version 26 October 2017
 */

import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class PlanetWeight {

    // main method
    public static void main(String[] args) throws IOException {

        // Variables
        File gravityFile = new File("gravity.txt");
        String[] planets = {"Mercury", "Venus", "Earth", "Mars",
                            "Jupiter", "Saturn", "Uranus", "Neptune"};
        double[] gravity = new double[planets.length],
                weightInLbs;
        double givenWeight;

        // Processing through methods
        gravity = readGravityData(gravityFile, gravity);
        givenWeight = userWeightPrompt();
        weightInLbs = weightInPlanets(gravity, givenWeight);

        // Output
        formatTable(planets, gravity, weightInLbs);

    }   // end of main


    // reads the data file that was created within PlanetGravity.java
    public static double[] readGravityData(File givenFile, double[] emptyArray) throws IOException {

        // Variables
        Scanner inFile = new Scanner(givenFile);

        // Processing
        int i = 0;
        while (inFile.hasNextLine()) {      // loops over entire gravity.txt file

            emptyArray[i] = Double.parseDouble(inFile.nextLine());        // assigns value of line to an array
            i++;                                                       // increments to go to next line

        }

        return emptyArray;     // returns the array of gravity values

    }   // end of readGravityData


    // Prompts the user for his/her weight and returns it
    public static double userWeightPrompt() {

        // Variables
        Scanner input = new Scanner(System.in);
        double weight = 0;

        // Processing
        System.out.print("Please enter your weight in pounds (e.g. 130): ");
        weight = Double.parseDouble(input.next());                      // parses string input into a double

        return weight;      // returns weight

    }   // end of userWeightPrompt


    // Uses planets' gravity and given weight to return a weight array on each planet
    public static double[] weightInPlanets (double[] gravity, double weight) {

        // Variables
        double[] weightArray = new double[gravity.length];
        double earthGravity = 9.79;

        // Processing
        for (int i = 0; i < gravity.length; i++) {

            // multiply planet's gravity with mass (found through weight and earth's gravity)
            weightArray[i] = gravity[i] * (weight / earthGravity);

        }

        return weightArray; // returns an array of weights corresponding to each planet

    }   // end of weightInPlanets


    // formats a table from given arguments
    public static void formatTable(String[] planets, double[] gravity, double[] weight) {

        System.out.printf("\n%38s", "My Weight on the Planets");                          // main header
        System.out.printf("\n%-20s%-20s%-20s", "Planet", "Gravity", "Weight (lbs)");      // column headers
        System.out.print("\n-------------------------------------------------------");

        for (int i = 0; i < planets.length; i++) {      // prints each line

            System.out.printf("\n%-20s%-20.2f%-20.2f", planets[i], gravity[i], weight[i]);

        }

    }   // end of formatTable

}

