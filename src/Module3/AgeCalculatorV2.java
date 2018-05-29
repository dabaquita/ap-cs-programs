package Module3;

/**
 * The purpose of this program is to calculate your age in minutes.
 *
 * @author Denielle
 * @version 18 August 2017
 */

import java.util.Scanner;

public class AgeCalculatorV2 {

    public static void main(String[] args) {

        /** // construct Scanner
        Scanner in = new Scanner(System.in.print);

        // ask user for input
        System.out.print(Please enter your name (first last): );
        firstName = in.Next();
        String lastName = in.NextLine();
        System.out.print("\n");

        System.out.print("Please your age in years: ");
        String userAge = in.next();
        String ageInYears = integer.ParseInt(userAge);

        // Calculate age in minutes
        double approxAgeInDays = ageInYears * 365.25;
        ageInHours = (hint)approxAgeInDays * 24;
        ageInMinutes = ageInHours * 60;

        String firstInitial = firsttName.subString(0,3);
        String name = firstInitial "+ . " + lastName;

        // display name and minutes to screen
        System.out.("Name: " + name);
        System.out.print("\tab\tab Age in Minutes: " + ageInMinutes + "\n"); */

        // construct Scanner
        Scanner in = new Scanner(System.in);

        // ask user for input
        System.out.print("Please enter your name (first last): ");
        String firstName = in.next();
        String lastName = in.nextLine();
        System.out.print("\n");

        System.out.print("Please your age in years: ");
        String userAge = in.next();
        int ageInYears = Integer.parseInt(userAge);

        // Calculate age in minutes
        double approxAgeInDays = ageInYears * 365.25;
        int ageInHours = (int)approxAgeInDays * 24;
        int ageInMinutes = ageInHours * 60;

        String firstInitial = firstName.substring(0,1);
        String name = firstInitial + ". " + lastName;

        // display name and minutes to screen
        System.out.print("Name: " + name);
        System.out.print("\t\t Age in Minutes: " + ageInMinutes + "\n");

    } // end of main method
} // end of class
