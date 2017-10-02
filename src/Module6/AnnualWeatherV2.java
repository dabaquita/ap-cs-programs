package Module6;

/**
 * Displays the average temperature and the annual precipitation
 * for a selected city. The user chooses temperature type (F or C)
 * and precipitation type (in or cm).
 *
 * @author Denielle Kirk Abaquita
 * @version 30 September 2017
 */

import java.util.Scanner;

public class AnnualWeatherV2 {

    public static void main(String[] args) {

        // Variables and Object Declarations and Initializations
        Scanner input = new Scanner(System.in);
        String city = "Daytona";
        String state = "Florida";

        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};                                                              // Months string array
        double[] temperature = {58.4, 60.0, 64.7, 68.9, 74.8, 79.7, 81.7, 81.5, 79.9, 74.0, 67.0, 60.8};                // initialize with Fahrenheit values (DAYTONA)
        double[] precipitation = {3.1, 2.7, 3.8, 2.5, 3.3, 5.7, 5.2, 6.1, 6.6, 4.5, 3.0, 2.7};                          // initialize with inch values

        // String city = "Apalachicola";
        // String state = "Florida";
        // double[] temperature = {52.7, 55.3, 60.7, 66.8, 74.1, 80.0, 81.9, 81.7, 79.1, 70.2, 62.0, 55.2};
        // double[] precipitation = {4.9, 3.8, 5.0, 3.0, 2.6, 4.3, 7.3, 7.3, 7.1, 4.2, 3.6, 3.5};

        String tempLabel = "F";         // initialize to F
        String precipLabel = "in.";     // initialize to in

        double total = 0;
        double averageTemp;
        double totalPrecip = 0;

        String temperatureScale;
        String precipScale;


        // Processing - temperature scale and precip scale
        System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
        temperatureScale = input.next();

        System.out.print("Choose the precipitation scale (i = inches, c = centimeters: ");
        precipScale = input.next();

        if (temperatureScale.equalsIgnoreCase("c")) {   // if user inputs celsius

            for (int index = 0; index < temperature.length; index++) {          // converts temp list to celsius

                temperature[index] = (temperature[index] - 32) * (5.0/9);
                tempLabel = "C";
            }

        }

        if (precipScale.equalsIgnoreCase("c")) {        // if user inputs centimeters

            for (int index = 0; index < precipitation.length; index++) {        // converts precip to cm

                precipitation[index] *= 2.54;
                precipLabel = "cm.";
            }

        }


        // Processing - calculate average temperature and total precipitation
        for (int index = 0; index < temperature.length; index++) {

            total += temperature[index];
            totalPrecip += precipitation[index];

        } // end of for loop

        averageTemp = total / temperature.length;                               // calculates average temp


        // Output: display table of weather data including average and total
        System.out.println();
        System.out.println("\n        Weather Data");
        System.out.println("    Location: " + city + ", " + state);
        System.out.println("Month   Temperature (" + tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("************************************************");

        for(int index = 0; index < temperature.length; index++) {       // displays the average and precip count table for each month

            System.out.printf("%3s%16.1f%23.1f\n", month[index], temperature[index], precipitation[index]);

        }

        System.out.println("************************************************");
        System.out.printf("Average: %10.1f      Total: %10.1f", averageTemp, totalPrecip);

    }   // end of main

}   // end of class