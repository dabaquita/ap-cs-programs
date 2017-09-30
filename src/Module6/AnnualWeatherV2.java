package Module6;

/**
 * Displays the average temperature and the annual precipitation
 * for a selected city. The user chooses temperature type (F or C)
 * and precipitation type (in or cm).
 *
 * @author Denielle Kirk Abaquita
 * @version 28 September 2017
 */

/**
 * Planning / Pseudocode
 *
 * --- Main Method ---
 *
 * --> Variables
 * String[] monthsInYear
 * double[] avgTempList
 * double[] avgPrecipList
 *
 * double totalTemp
 * double avgTemp
 * double totalPrecip
 *
 * --> Processing
 * for i = 0; i < avgTempList.length; i++
 *      totalTemp += avgTempList[i]
 *
 * avgTemp is totalTemp / avgTempList.length
 *
 * for i = 0; i < avgPrecipList.length; i++
 *      totalPrecip += avgPrecipList[i]
 *
 * --> Output
 * Print out header
 * Print out "*****" line
 *
 * for i = 0; i < monthsInYear.length; i++
 *
 *      print out first index of monthsInYear, avgTempList, avgPrecipList
 *
 * Print out "*****" line
 *
 * Print out avgTemp and totalPrecip
 *
 *
 */

import java.util.Scanner;

public class AnnualWeatherV2 {

    public static void main(String[] args) {

        // Variables and Object Declarations and Initializations
        Scanner in = new Scanner(System.in);
        String city = "Daytona";
        String state = "Florida";

        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};                                          // Months string array
        double[] temperature = {58.4, 60.0, 64.7, 68.9, 74.8, 79.7, 81.7, 81.5, 79.9, 74.0, 67.0, 60.8};                // initialize with Fahrenheit values (DAYTONA)
        double[] precipitation = {3.1, 2.7, 3.8, 2.5, 3.3, 5.7, 5.2, 6.1, 6.6, 4.5, 3.0, 2.7};                          // initialize with inch values

        String tempLabel = "F";         // initialize to F
        String precipLabel = "in.";     // initialize to in

        double total = 0;
        double averageTemp;
        double totalPrecip = 0;

        // Processing - calculate average temperature and total precipitation
        for (int index = 0; index < temperature.length; index++) {

            total += temperature[index];
            totalPrecip += precipitation[index];

        }

        averageTemp = total / temperature.length;


        // Output: display table of weather data including average and total
        System.out.println();
        System.out.println("        Weather Data");
        System.out.println("    Location: " + city + ", " + state);
        System.out.println("Month   Temperature (" + tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("************************************************");

        for(int index = 0; index < temperature.length; index++) {       // displays the average and precip count table for each month

            System.out.println(month[index] + "    " + temperature[index] + "     " + precipitation[index]);

        }

        System.out.println("************************************************");
        System.out.println("Average: " + averageTemp + "      Total: " + totalPrecip);

    }   // end of main

}   // end of class