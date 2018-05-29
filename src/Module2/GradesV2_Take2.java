package Module2;

/**
 * Denielle Kirk Abaquita
 * 12 August 2017
 *
 * This program calculates the total points
 * and average grade each time a new score is added
 * to the total through using arithmetic and assignment
 * operators as well as the increment operator.
 */

public class GradesV2_Take2 {

    public static void main(String[] args) {

        // Local Variables
        int numTests = 0;       // counts number of tests
        int testGrade = 0;      // individual test grade
        int totalPoints = 0;    // total points for all tests
        double average = 0.0;   // average grade


        // Calculate total points and average
        testGrade = 95;                         // first test grade is 95
        numTests += 1;                          // an additional test recorded to total taken
        totalPoints += testGrade;               // value of test grade is added to total
        average = totalPoints / numTests;       // calculates average of all test grades


        System.out.println("Test # " + numTests + "   Test Grade: " + testGrade + "   Total Points: " +
                totalPoints + "    Average Score: " + (int)average); // prints output


        // Calculate total points and average
        testGrade = 73;                         // second test grade is 73
        numTests += 1;                          // an additional test recorded to total taken
        totalPoints += testGrade;               // value of test grade is added to total
        average = totalPoints / numTests;       // calculates average of all test grades

        System.out.println("Test # " + numTests + "   Test Grade: " + testGrade + "   Total Points: " +
                totalPoints + "   Average Score: " + (int) average); // prints output


        // Calculate total points and average
        testGrade = 91;                         // third test grade is 91
        numTests += 1;                          // an additional test recorded to total taken
        totalPoints += testGrade;               // value of test grade is added to total
        average = (double) totalPoints / numTests;       // calculates average of all test grades

        System.out.println("Test # " + numTests + "   Test Grade: " + testGrade + "   Total Points: " +
                totalPoints + "   Average Score: " + average); // prints output


        // Calculate total points and average
        testGrade = 82;                         // fourth test grade is 82
        numTests += 1;                          // an additional test recorded to total taken
        totalPoints += testGrade;               // value of test grade is added to total
        average = (double) totalPoints / numTests;       // calculates average of all test grade

        System.out.println("Test # " + numTests + "   Test Grade: " + testGrade + "   Total Points: " +
                totalPoints + "   Average Score: " + average); // prints output

        // Calculate total points and average
        testGrade = 76;                         // fifth test grade is 76
        numTests += 1;                          // an additional test recorded to total taken
        totalPoints += testGrade;               // value of test grade is added to total
        average = (double) totalPoints / numTests;       // calculates average of all test grade

        System.out.println("Test # " + numTests + "   Test Grade: " + testGrade + "   Total Points: " +
                totalPoints + "   Average Score: " + average); // prints output

        // Calculate total points and average
        testGrade = 92;                         // sixth test grade is 92
        numTests += 1;                          // an additional test recorded to total taken
        totalPoints += testGrade;               // value of test grade is added to total
        average = (double) totalPoints / numTests;       // calculates average of all test grade

        System.out.println("Test # " + numTests + "   Test Grade: " + testGrade + "   Total Points: " +
                totalPoints + "   Average Score: " + average); // prints output

        // Calculate total points and average
        testGrade = 87;                         // seventh test grade is 87
        numTests += 1;                          // an additional test recorded to total taken
        totalPoints += testGrade;               // value of test grade is added to total
        average = (double) totalPoints / numTests;       // calculates average of all test grade

        System.out.println("Test # " + numTests + "   Test Grade: " + testGrade + "   Total Points: " +
                totalPoints + "   Average Score: " + average); // prints output

        // Calculate total points and average
        testGrade = 85;                         // eighth test grade is 85
        numTests += 1;                          // an additional test recorded to total taken
        totalPoints += testGrade;               // value of test grade is added to total
        average = (double) totalPoints / numTests;       // calculates average of all test grade

        System.out.println("Test # " + numTests + "   Test Grade: " + testGrade + "   Total Points: " +
                totalPoints + "   Average Score: " + average); // prints output

        // Calculate total points and average
        testGrade = 94;                         // fifth test grade is 94
        numTests += 1;                          // an additional test recorded to total taken
        totalPoints += testGrade;               // value of test grade is added to total
        average = (double) totalPoints / numTests;       // calculates average of all test grade

        System.out.println("Test # " + numTests + "   Test Grade: " + testGrade + "   Total Points: " +
                totalPoints + "   Average Score: " + average); // prints output

    } // end of main

} // end of classack
