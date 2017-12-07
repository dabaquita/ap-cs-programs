package Module8;

/**
 * To test Hurricane.java and mimic the purpose of HurricaneSelector.java
 * in some ways but using OOP.
 *
 * @author Denielle Kirk Abaquita
 * @version 30 November 2017
 */

import java.util.*;

public class HurricaneTester {

    // Main method
    public static void main(String[] args) {

        // Variable declarations and initializations
        ArrayList<Hurricane> hurricanes = new ArrayList<>();
        int[] categoryTotals = new int[5];

        double sumCategory = 0;
        double sumPressure = 0;
        double sumWindSpeed = 0;
        int numOfTerms = 0;
        double averageCategory;
        double averagePressure;
        double averageWindSpeed;

        int categoryMin = Integer.MAX_VALUE;
        int pressureMin = Integer.MAX_VALUE;
        double windSpeedMin = Double.MAX_VALUE;

        int categoryMax = Integer.MIN_VALUE;
        int pressureMax = Integer.MIN_VALUE;
        double windSpeedMax = Double.MIN_VALUE;

        // Initializing the hurricane list
        hurricanes.add(new Hurricane(1995, "Jun", 74.8, 987, "Allison"));
        hurricanes.add(new Hurricane(1998, "Aug", 80.55, 960, "Danielle"));
        hurricanes.add(new Hurricane(2001, "Oct", 138.09, 933, "Michelle"));
        hurricanes.add(new Hurricane(2008, "Jul", 126.59, 952, "Bertha"));
        hurricanes.add(new Hurricane(1996, "Aug", 120.83, 946, "Fran"));
        hurricanes.add(new Hurricane(2014, "Jul", 97.82, 973, "Arthur"));
        hurricanes.add(new Hurricane(2004, "Sep", 166.86, 910, "Ivan"));
        hurricanes.add(new Hurricane(2006, "Aug", 74.8, 992, "Ernesto"));
        hurricanes.add(new Hurricane(2012, "Oct", 115.08, 940, "Sandy"));
        hurricanes.add(new Hurricane(2007, "Sep", 92.06, 985, "Humberto"));

        // Processing
        for (int i = 0; i < hurricanes.size(); i++) {

            Hurricane hurricane = hurricanes.get(i);            // assign object to variable
            hurricane.calcCategory();                           // invokes method to calculate hurricane's category

            // counts the total number of hurricanes in each category
            if (hurricane.getCategory() == 1) {
                categoryTotals[0]++;
            } else if (hurricane.getCategory() == 2) {
                categoryTotals[1]++;
            } else if (hurricane.getCategory() == 3) {
                categoryTotals[2]++;
            } else if (hurricane.getCategory() == 4) {
                categoryTotals[3]++;
            } else if (hurricane.getCategory() == 5) {
                categoryTotals[4]++;
            }

            sumCategory += hurricane.getCategory();             // adds up category value
            sumPressure += hurricane.getPressure();             // adds up pressure value
            sumWindSpeed += hurricane.getWindSpeed();           // adds up wind speed value

            // tests for max's and min's of category, pressure, and wind speed
            if (hurricane.getCategory() < categoryMin) {
                categoryMin = hurricane.getCategory();
            } else if (hurricane.getCategory() > categoryMax) {
                categoryMax = hurricane.getCategory();
            }

            if (hurricane.getPressure() < pressureMin) {
                pressureMin = hurricane.getPressure();
            } else if (hurricane.getPressure() > pressureMax) {
                pressureMax = hurricane.getPressure();
            }

            if (hurricane.getWindSpeed() < windSpeedMin) {
                windSpeedMin = hurricane.getWindSpeed();
            } else if (hurricane.getWindSpeed() > windSpeedMax) {
                windSpeedMax = hurricane.getWindSpeed();
            }

            numOfTerms++;       // increment number of hurricanes to use for average calculation

        }   // end of for loop

        averageCategory = sumCategory / numOfTerms;             // calculates the average category
        averagePressure = sumPressure / numOfTerms;             // calculates the average pressure
        averageWindSpeed = sumWindSpeed / numOfTerms;           // calculates the average wind speed

        // Output
        System.out.printf("\n%45s", "Hurricanes");              // header output
        System.out.printf("\n%5s%10s%15s%15s%20s%20s\n", "Year", "Month", "Hurricane", "Category", "Pressure (mb)", "Wind Speed (mph)");
        System.out.println("==========================================================================================");

        for (Hurricane hurricane: hurricanes) {                 // prints out each hurricane's data

            System.out.printf("%5s%8s%17s%11d%18s%20.2f\n", hurricane.getYear(), hurricane.getMonth(),
                    hurricane.getName(), hurricane.getCategory(), hurricane.getPressure(), hurricane.getWindSpeed());


        }   // end of for loop

        System.out.println("==========================================================================================");
        System.out.printf("%20s%14.2f%18.2f%17.2f",     // prints average of category, pressure, and wind speed
                "Average:", averageCategory, averagePressure, averageWindSpeed);
        System.out.printf("\n%20s%11d%18d%20.2f",       // prints minimums
                "Minimum:", categoryMin, pressureMin, windSpeedMin);
        System.out.printf("\n%20s%11d%18d%20.2f\n",       // prints maximums
                "Maximum:", categoryMax, pressureMax, windSpeedMax);

        System.out.println("\nSummary of Categories:" +          // prints summary of categories
                "\n Cat 1: " + categoryTotals[0] +
                "\n Cat 2: " + categoryTotals[1] +
                "\n Cat 3: " + categoryTotals[2] +
                "\n Cat 4: " + categoryTotals[3] +
                "\n Cat 5: " + categoryTotals[4]);

    }

}   // end of class
