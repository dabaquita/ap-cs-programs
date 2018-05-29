package Module9;

/**
 * To use Projectile.java as an implementation class of
 * a projectile object to calculate each instance's
 * trajectory based on launch angles and launch velocities,
 * neatly printing them in a table format.
 *
 * @author Denielle Kirk Abaquita
 * @version 6 December 2017
 */

public class CatapultTester {

    // Main method
    public static void main(String[] args) {

        // Variables
        int[] speeds = {50, 60, 70, 80, 90, 100, 110, 120};             // initializing a speed array (kph)
        int[] angles = {25, 30, 35, 40, 45, 50, 55, 60};                // initializing an angle array (degrees)
        double[][] distances = new double[speeds.length][angles.length];                          // holds distance

        Catapult fruitCatapult;

        // Processing
        for (int i = 0; i < distances.length; i++) {    // iterates over each row

            // iterates over each column
            for (int j = 0; j < distances[0].length; j++) {     // for each speed (row), calculate the distances for all angles (columns)

                fruitCatapult = new Catapult(speeds[i], angles[j]);             // makes a catapult object

                fruitCatapult.calcDistance();                                   // calculates the distance traveled
                distances[i][j] = fruitCatapult.getDistance();                  // places distance in the appropriate location

            }   // end for angles for loop

        }   // end of speeds for loop

        // Output
        System.out.printf("%55s\n", "Project Distance (meters)");               // table header
        System.out.printf("%5s", "KPH");

        for (int angle: angles) {                       // prints the angles header
            System.out.printf("%10s", angle + " deg");
        }

        System.out.print("\n========================================================================================");

        for (int i = 0; i < distances.length; i++) {    // prints the entire table

            System.out.printf("\n%5d", speeds[i]);        // prints the left KPH

            for (int j = 0; j < distances[0].length; j++) {

                System.out.printf("%10.2f", distances[i][j]);

            }   // end of column for loop

        }   // end of row for loop

    }   // end of main

}
