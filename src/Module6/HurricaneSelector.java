package Module6;

/**
 * To calculate the average category, pressure,
 * and wind speed of Atlantic hurricanes that have
 * occurred between a given year range and to tally the
 * number of storms in each category accroding to the Saffir-
 * Simpson scale.
 *
 * @author Denielle Kirk Abaquita
 * @version 8 October 2017
 */

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class HurricaneSelector {

    public static void main(String[] args) throws IOException {

        // Variables and Object Declarations
        Scanner input = new Scanner(System.in);
        File hurricaneData = new File("hurricanedata.txt");
        Scanner inHurricane = new Scanner(hurricaneData);

        PrintWriter outFile = new PrintWriter( new File("summary.txt"));

        String[] year = new String[156];     // Empty Arrays
        String[] month = new String[156];
        String[] windSpeed = new String[156];
        String[] pressure = new String[156];
        String[] name = new String[156];
        int[] category = new int[156];

        int countCat1 = 0;
        int countCat2 = 0;
        int countCat3 = 0;
        int countCat4 = 0;
        int countCat5 = 0;

        boolean rangeCorrect = false;
        int rangeOfYearsLower = 0;
        int rangeOfYearsUpper = 0;

        double sumCategory = 0;             // helps calculate average
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


        // Reading in data from txt file
        int tempIndex = 0;

        while (inHurricane.hasNextLine()) {

            // assigns items to arrays
            year[tempIndex] = inHurricane.next();
            month[tempIndex] = inHurricane.next();
            pressure[tempIndex] = inHurricane.next();
            windSpeed[tempIndex] = inHurricane.next();
            name[tempIndex] = inHurricane.next();

            tempIndex++;

        } // end of while loop

        // System.out.println(year[155]);
        inHurricane.close();


        // User input for range of years
        while (!rangeCorrect) {

            // prompts for user input
            System.out.print("Please enter a range of years (1995 2015): ");
            rangeOfYearsLower = Integer.parseInt(input.next());
            rangeOfYearsUpper = Integer.parseInt(input.next());

            if (rangeOfYearsLower >= 1995 && rangeOfYearsUpper <= 2015) { // checks if input is within range
                rangeCorrect = true;
            } else {    // if not within range, loop iterates again for proper input
                System.out.println("Range not valid. Please enter a range from 1995 to 2015.");
            }

        } // end of while loop


        // Display table output / peroform operations on averages
        System.out.printf("\n%35s%5s-%4s\n", "Hurricanes", rangeOfYearsLower, rangeOfYearsUpper);
        System.out.printf("%5s%15s%15s%20s%20s\n", "Year", "Hurricane", "Category", "Pressure (mb)", "Wind Speed (mph)");
        System.out.println("==========================================================================================");

        for (int index = 0; index < year.length; index++) {     // operates over each array starting from the first index

            if (Integer.parseInt(year[index]) >= rangeOfYearsLower
                    && Integer.parseInt(year[index]) <= rangeOfYearsUpper) {    // operates on only years within given range

                // Convert wind speed to MPH and determine category and count categories
                double windInMPH = Integer.parseInt(windSpeed[index]) * 1.15077945;        // convert knots to mph
                windSpeed[index] = Double.toString(windInMPH);                              // places mph in current index

                if (windInMPH >= 74 && windInMPH < 95.5) {                  // category 1
                    category[index] = 1;
                    countCat1++;
                } else if (windInMPH >= 95.5 && windInMPH < 110.5) {        // category 2
                    category[index] = 2;
                    countCat2++;
                } else if (windInMPH >= 110.5 && windInMPH < 129.5) {       // category 3
                    category[index] = 3;
                    countCat3++;
                } else if (windInMPH >= 129.5 && windInMPH < 156.5) {       // category 4
                    category[index] = 4;
                    countCat4++;
                } else if (windInMPH >= 156.5) {
                    category[index] = 5;
                    countCat5++;
                }

                System.out.printf("%5s%15s%11d%18s%20.2f\n",                       // prints data for each year
                        year[index], name[index], category[index], pressure[index], Double.parseDouble(windSpeed[index]));

                // Temporary variables casted from index
                int pressureInt = Integer.parseInt(pressure[index]);

                // sums of each hurricane data category to use in average
                sumCategory += category[index];
                sumPressure += pressureInt;
                sumWindSpeed += windInMPH;

                // finds the max and mins of each data category
                if (category[index] < categoryMin) {                       // max / min category
                    categoryMin = category[index];
                }
                if (category[index] > categoryMax) {
                    categoryMax = category[index];
                }

                if (pressureInt < pressureMin) {         // max / min pressure
                    pressureMin = pressureInt;
                }
                if (pressureInt > pressureMax) {
                    pressureMax = pressureInt;
                }

                if (windInMPH < windSpeedMin) {     // max / min wind speed
                    windSpeedMin = windInMPH;
                }
                if (windInMPH > windSpeedMax) {
                    windSpeedMax = windInMPH;
                }

                numOfTerms++;

            } // end of if statement for range

        } // end of for loop

        averageCategory = sumCategory / numOfTerms;         // Calculate all averages
        averagePressure = sumPressure / numOfTerms;
        averageWindSpeed = sumWindSpeed / numOfTerms;



        // OutFile
        outFile.println("Range: " + rangeOfYearsLower + "-"
                                + rangeOfYearsUpper);      // prints range
        outFile.println("Summary of Categories:" +          // prints summary of categories
                        "\n Cat 1: " + countCat1 +
                        "\n Cat 2: " + countCat2 +
                        "\n Cat 3: " + countCat3 +
                        "\n Cat 4: " + countCat4 +
                        "\n Cat 5: " + countCat5);
        outFile.close();                                    // closes file


        // Display calculated output
        System.out.println("==========================================================================================");
        System.out.printf("\n%20s%14.2f%18.2f%17.2f",     // prints average of category, pressure, and wind speed
                            "Average:", averageCategory, averagePressure, averageWindSpeed);
        System.out.printf("\n%20s%11d%18d%20.2f",       // prints minimums
                            "Minimum:", categoryMin, pressureMin, windSpeedMin);
        System.out.printf("\n%20s%11d%18d%20.2f",       // prints maximums
                            "Maximum:", categoryMax, pressureMax, windSpeedMax);

        System.out.println("\n\nSummary of Categories:" +          // prints summary of categories
                "\n Cat 1: " + countCat1 +
                "\n Cat 2: " + countCat2 +
                "\n Cat 3: " + countCat3 +
                "\n Cat 4: " + countCat4 +
                "\n Cat 5: " + countCat5);

    } // end of main

} // end of class
