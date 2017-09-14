package Module4;

/**
 * This program calculates Body Mass Index (BMI)
 * given a person's height and weight.
 *
 * @author Denielle Kirk Abaquita
 * @version 25 August 2017
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
 * Scanner input
 *
 * String firstName
 * String lastName
 * String heightFeetStr
 * String heightInStr
 * String weightLbsStr
 *
 * double heightM
 * double weightKg
 * double bMI
 * String category
 *
 * --> Prompt and store user input
 * Assign firstName and lastName to
 *      next() and nextLine()
 * Assign weightLbsStr to next()
 * Assign heightFeetStr and heightInStr
 *      to nextInt() and nextInt()
 *
 *
 * --> Processing
 *
 *      Assign heightM the sum of (parseInt)heightFeetStr * 0.3
 *          and (parseInt)heightInStr * 0.025
 *      Assign weightKg the product of (parseInt)weightLbsStr and
 *          0.45
 *
 *      Assign bMI the value of weightKg / heightM^2
 *
 *      If bMI is less than 18.5,
 *          then the category is equal to underweight
 *      If bMI is greater than 18.5 but less than 25,
 *          then the category is equal to normal
 *      If bMI is greater than 25.9 but less than 30,
 *          then the category is equal to overweight
 *      Else
 *          then the categroy is equal to obese
 *
 * --> Output
 *
 *      Print title: Body Mass Index Calculator
 *      Print border below
 *
 *      Print firstName and lastName
 *      Print heightM
 *      Print weightKg
 *      Print bMI
 *      Print category
 *
 */

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Variables
        double heightM;
        double weightKg;
        double bMI;
        String category;


        // Prompt and store user input
        System.out.print("Enter your name (first last): ");
        String firstName = in.next();
        String lastName = in.nextLine();        // First and last name input

        System.out.print("Enter your weight in pounds (e.g. 175): ");
        String weightLbsStr = in.next();        // Weight in pounds

        System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
        String heightFeetStr = in.next();
        String heightInStr = in.next();     // Height in feet and inches


        // Processing input
        heightM = (Integer.parseInt(heightFeetStr) * 0.3) +
                    (Integer.parseInt(heightInStr) * 0.03);    // Convert from String height to double height in m
        weightKg = (Integer.parseInt(weightLbsStr) * 0.4534);     // Convert from String lbs to double weight in kg

        bMI = weightKg / (heightM * heightM);                   // Creates the value for BMI

        if (bMI <= 18.5) {      // Categorizes the bMI according to its value
            category = "Underweight";
        } else if (bMI <= 24.9) {
            category = "Healthy Weight";
        } else if (bMI <= 29.9) {
            category = "Overweight";
        } else {
            category = "Obese";
        }


        // Output Processing
        System.out.println("\nBody Mass Index Calculator");
        System.out.println("==========================");

        System.out.println("Name: " + firstName + lastName);
        System.out.println("Height (m): " + heightM);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("BMI: " + bMI);
        System.out.println("Category: " + category);
    }

}
