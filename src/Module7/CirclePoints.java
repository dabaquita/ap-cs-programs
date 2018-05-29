package Module7;

/**
 * Calculates the (x, y) coordinates of points on
 * circle of a given radius.
 *
 * @author Denielle Kirk Abaquita
 * @version 16 October 2017
 *
 */

import java.util.Scanner;

public class CirclePoints {

    public static void main(String[] args) {

        // Variable and Object Declaration
        Scanner input = new Scanner(System.in);

        double radius = 0;
        double incrementX = 0;

        double x1;
        double y1;
        double y2;


        // Input Prompt
        System.out.print("Please input the radius of the circle (ex. 5): ");
        radius = Double.parseDouble(input.next());          // gets radius of the circle

        System.out.print("Please input the increment to show points on the circle (ex. 2): ");
        incrementX = Double.parseDouble(input.next());      // gets the increment of the circle point values


        // Processing and Output
        System.out.println("\nPoints on a Circle with a Radius of " + radius);
        System.out.printf("%10s%10s%10s%10s\n", "x1", "y1", "x1", "y2");
        System.out.println("******************************************");

        x1 = radius;
        while (x1 >= -1 * radius) {

            y2 = -1 * Math.sqrt(Math.pow(radius, 2) - Math.pow(x1, 2));     // operate to get values of y2 and y1 using Math class
            y1 = Math.abs(y2);

            System.out.printf("%10.2f%10.2f%10.2f%10.2f\n", x1, y1, x1, y2);

            x1 -= incrementX;                                               // decreases x1 by the increment given

        }


    } // end of main
} // end of class
