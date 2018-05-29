package Module4;

/**
 * Calculates total daily energy expenditure,
 * the amount of calories your body burns in 24 hours,
 * by using BMR (basal metabolic rate) and AF (activity factor).
 *
 * @author Denielle Kirk Abaquita
 * @version 2 September 2017
 *
 */

/**
 * Planning / Pseudocode
 *
 * import Scanner class
 *
 * ----- Main Method -----
 *
 * --> Variables
 * Scanner in
 *
 * String name
 * String bMRString
 * String gender
 * String aFLevel (after menu, work for both lower/uppercases)
 *
 * Double bMRDouble
 * Double activityFactor
 * Double tDEE
 *
 *
 * --> Processing
 * Printing the menu for AF
 *      [A] Resting (Sleeping, Reclining)
 *      [B] Sedentary (Minimal Movement)
 *      [C] Light (Sitting, Standing)
 *      [D] Moderate (Light Manual Labor, Dancing, Riding Bike)
 *      [E] Very Active (Team Sports, Hard Manual Labor)
 *      [F] Extremely Active (Full-time Athlete, Heavy Manual Labor)
 *
 * if aFLevel equalsIgnoreCase A
 *      Assign activityFactor to 1.0
 * else if aFLevel equalsIgnoreCase B
 *      Assign activityFactor to 1.3
 * else if aFLevel equalsIgnoreCase C
 *      if gender equalsIgnoreCase M
 *          Assign activityFactor to 1.6
 *      else
 *          Assign activityFactor to 1.5
 * else if aFLevel equalsIgnoreCase D
 *      if gender equalsIgnoreCase M
 *          Assign activityFactor to 1.7
 *      else
 *          Assign activityFactor to 1.6
 * else if aFLevel equalsIgnoreCase E
 *      if gender equalsIgnoreCase M
 *          Assign activityFactor to 2.1
 *      else
 *          Assign activityFactor to 1.9
 * else
 *      if gender equalsIgnoreCase M
 *          Assign activityFactor to 2.4
 *      else
 *          Assign activityFactor to 2.2
 *
 * Assign tDEE the product of bMRDouble and activityFactor
 *
 *
 * --> Output
 *
 * Print title for results
 * Print name, gender
 * Print bMR, activityFactor
 * Print tDEE
 *
 */

import java.util.Scanner;

public class TDEE {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Variables
        double bMRDouble;
        double activityFactor = 0;
        double tDEE;


        // Input
        System.out.print("Please enter your name: ");
        String name = in.nextLine();        // User full name

        System.out.print("Please enter your BMR: ");
        String bMRString = in.next();       // User BMR
        bMRDouble = Double.parseDouble(bMRString);

        System.out.print("Please enter your gender (M/F): ");
        String gender = in.next();          // User gender

        System.out.print("\nSelect Your Activity Level\n" +       // Activity Level Menu
                    "[A] Resting (Sleeping, Reclining)\n" +
                    "[B] Sedentary (Minimal Movement)\n" +
                    "[C] Light (Sitting, Standing)\n" +
                    "[D] Moderate (Light Manual Labor, Dancing, Riding Bike)\n" +
                    "[E] Very Active (Team Sports, Hard Manual Labor)\n" +
                    "[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)\n");
        System.out.print("Enter the letter corresponding to your activity level: ");
        String aFLevel = in.next();         // User Activity Level


        // Processing
        if (aFLevel.equalsIgnoreCase("A")) {
            if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")) {
                activityFactor = 1.0;       // Assigns 1.0 as the activity factor to both Males and Females of aFLevel A
            }
        } else if (aFLevel.equalsIgnoreCase("B")) {
            if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")) {
                activityFactor = 1.3;       // Assigns 1.3 as the a-factor to both Males and Females of aFLevel B
            }
        } else if (aFLevel.equalsIgnoreCase("C")) {
            if (gender.equalsIgnoreCase("M")) {
                activityFactor = 1.6;       // Assigns 1.6 to a-factor for Males in aFLevel C
            } else {
                activityFactor = 1.5;       // Assigns 1.5 to a-factor for Females in aFlevel C
            }
        } else if (aFLevel.equalsIgnoreCase("D")) {
            if (gender.equalsIgnoreCase("M")) {
                activityFactor = 1.7;       // Assigns 1.7 for Males in aFLevel D
            } else {
                activityFactor = 1.6;       // Assigns 1.6 for Females in aFLevel D
            }
        } else if (aFLevel.equalsIgnoreCase("E")) {
            if (gender.equalsIgnoreCase("M")) {
                activityFactor = 2.1;       // Assigns 2.1 for Males in aFLevel E
            } else {
                activityFactor = 1.9;       // Assigns 1.9 for Females in aFLevel E
            }
        } else if (aFLevel.equalsIgnoreCase("F")) {
            if (gender.equalsIgnoreCase("M")) {
                activityFactor = 2.4;       // Assigns 2.4 for Males in aFLevel F
            } else {
                activityFactor = 2.2;       // Assigns 2.2 for Females in aFLevel F
            }
        }

        tDEE = bMRDouble * activityFactor;      // tDEE is the product of bMRDouble and activityFactor


        // Output
        System.out.println("\n\nYour results: ");
        System.out.println("Name: " + name + "      Gender: " + gender.toUpperCase());
        System.out.println("BMR: " + bMRDouble + " calories      Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEE + " calories");


    } // end of main

} // end of class
