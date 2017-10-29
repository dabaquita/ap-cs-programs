package Module7;

/**
 * Determines the surface gravity (g) on each planet
 * in our solar system.
 *
 * @author Denielle Kirk Abaquita
 * @version 24 October 2017
 */

import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class PlanetGravity {


    // Calculate the value of gravity for each planet given a mass and diameter
    public static double[] calculateGravity(double[] mass, double[] diameter) {

        // Variables
        double[] gravity = new double[mass.length],
                radiusInMeters = new double[diameter.length];
        double gConstant = 6.67408E-11;

        // Processing
        for (int i = 0; i < gravity.length; i++) {

            radiusInMeters[i] = diameter[i] / 2 * 1000;     // converts the diameter into radius(m)

            // calculates gravity to the nearest hundredths place
            gravity[i] = (int) (100 * ((gConstant * mass[i]) / Math.pow(radiusInMeters[i], 2)) ) / 100.0 ;

        }

        return gravity;
    } // end of calculateGravity()


    // Formats the information into a table
    public static void formatTable(String[] planets, double[] diameter,
                                   double[] mass, double[] gravity) {

        System.out.printf("%37s\n", "Planetary Data");                              // table header
        System.out.printf("  %-13s%-20s%-15s%-15s  ", "Planet", "Diameter (km)",    // column headers
                            "Mass (kg)", "g (m/s^2)");
        System.out.println("\n-------------------------------------------------------------");

        for (int i = 0; i < planets.length; i++) {      // prints each item in each array on one line

            System.out.printf("\n  %-13s%-20.0f%-15.2E%-15.2f",
                                planets[i], diameter[i], mass[i], gravity[i]);

        }

    } // end of formatTable()


    public static void gravityToFile(double[] gravity ) throws IOException {

        // Variables
        PrintWriter outFile = new PrintWriter(new File("gravity.txt"));

        // Processing data into file
        for (double eachPlanet : gravity) {

            outFile.println(eachPlanet);

        }

        outFile.close();

    } // end of gravityToFile()


    // Main method
    public static void main(String[] args) throws IOException {

        // Variables
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter",
                "Saturn", "Uranus", "Neptune"};
        double[] diameterInKM = {4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532},
                 mass = {3.30E23, 4.869E24, 5.972E24, 6.4219E23, 1.9E27, 5.68E26, 8.683E25, 1.0247E26},
                 gravityArray;

        // Processing
        gravityArray = calculateGravity(mass, diameterInKM);     // getting the values of gravity array
        // for (double planetGravity : gravity) { System.out.println(planetGravity); }

        gravityToFile(gravityArray);                             // placing gravity data into text file

        // Output
        formatTable(planets, diameterInKM, mass, gravityArray);

    } // end of main method


}   // end of class
