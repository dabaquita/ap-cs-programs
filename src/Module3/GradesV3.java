package Module3;

/**
 * Denielle Kirk Abaquita
 * 17 August 2017
 *
 * This program uses the Scanner class to
 * ask for user input in order to process it
 * for formatted output, creating an interactive
 * program.
 *
 */

import java.util.Scanner;

public class GradesV3 {

    public static void main(String[] args) {

        // Local Variables
        int numTests = 0;       // counts number of tests
        int testGrade = 0;      // individual test grade
        int totalPoints = 0;    // total points for all tests
        double average = 0.0;   // average grade

        // GradesV3 additions (Scanner plus user input prompt)
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your first and last name separated by spaces: ");
        String name = input.nextLine();

        System.out.print("Please enter the class subject separated by spaces: ");
        String subject = input.nextLine();

        System.out.print("Please enter your current grade (i.e. 11, 12): ");
        int grade = input.nextInt();

        System.out.print("Please enter three whole number test scores separated by spaces: ");
        int score1 = input.nextInt();
        int score2 = input.nextInt();
        int score3 = input.nextInt();

        // Prints out message
        System.out.println("\nHello " + name + " in grade " + grade + ". These are your results for test scores under "
                            + subject);


        // Calculate total points and average
        testGrade = score1;                         // first test grade is 95
        numTests += 1;                          // an additional test recorded to total taken
        totalPoints += testGrade;               // value of test grade is added to total
        average = totalPoints / numTests;       // calculates average of all test grades


        System.out.println("Test # " + numTests + "   Test Grade: " + testGrade + "   Total Points: " +
                totalPoints + "    Average Score: " + (int)average); // prints output


        // Calculate total points and average
        testGrade = score2;                         // second test grade is 73
        numTests += 1;                          // an additional test recorded to total taken
        totalPoints += testGrade;               // value of test grade is added to total
        average = totalPoints / numTests;       // calculates average of all test grades

        System.out.println("Test # " + numTests + "   Test Grade: " + testGrade + "   Total Points: " +
                totalPoints + "   Average Score: " + (int) average); // prints output


        // Calculate total points and average
        testGrade = score3;                         // third test grade is 91
        numTests += 1;                          // an additional test recorded to total taken
        totalPoints += testGrade;               // value of test grade is added to total
        average = (double) totalPoints / numTests;       // calculates average of all test grades

        System.out.println("Test # " + numTests + "   Test Grade: " + testGrade + "   Total Points: " +
                totalPoints + "   Average Score: " + average); // prints output


    } // end of main

} // end of classack
