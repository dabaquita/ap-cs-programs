package Module13;

import java.util.ArrayList;

/**
 * Tests the each of the circle
 * implementation classes.
 *
 * @author Denielle Kirk Abaquita
 * @version 1 February 2018
 */

public class CircleTester {

    // Converts the circle object into appropriate class and outputs the center
    public static void showCenter(Circle2 c) {

        String name = c.getName();           // Gets the name of the direct class of c


        // Tests for the class and assigns the object c appropriately
        if (name.equals("Cylinder")) {

            System.out.println("For this Cylinder2 the " + c.getCenter());

        } else if (name.equals("Oval")) {

            System.out.println("For this Oval2 the " + c.getCenter());

        } else if (name.equals("Oval Cylinder")) {

            System.out.println("For this OvalCylinder2 the " + c.getCenter());

        } else {

            System.out.println("For this Circle2 the " + c.getCenter());

        }

    }   // end of showCenter()


    // Main method
    public static void main(String[] args) {

        // Declare and initialize ArrayList of circle objects
        ArrayList<Circle2> circleArray = new ArrayList<>();

        circleArray.add(new Circle2(2, 4, 6));
        circleArray.add(new Cylinder2(3, 5, 7, 5));
        circleArray.add(new Oval2(4, 8, 12, 10));
        circleArray.add(new OvalCylinder2(5, 10, 3, 3, 7));

        // Test the showCenter() method
        for (int i = 0; i < circleArray.size(); i++) {

            showCenter(circleArray.get(i));

        }

    }   // end of main

}   // end of class
