package Module19.Challenge19;

import java.util.Arrays;

/**
 * Implementation class that defines a
 * student and his data.
 *
 * @author Denielle Kirk Abaquita
 * @version 18 April 2018
 */

public class StudentData {

    // Instance variables
    private String firstName;
    private String lastName;
    private double[] scores;
    private String grade;

    /** CONSTRUCTORS */
    public StudentData() {}

    public StudentData(String firstName, String lastName, double[] scores)
    {
        if (firstName.length() == 0 || lastName.length() == 0)
            throw new IllegalStateException("String parameters cannot be empty");

        // Initialize all instance variables
        this.firstName = firstName;
        this.lastName = lastName;
        this.scores = scores;
        this.grade = determineGrade(this.scores);
    }

    /** GETTERS AND SETTERS */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    /** String representation of the data object
     *  @return the string value of the student data object
     */
    @Override
    public String toString() {
        String grades = "";

        // Adds the scores to one string
        for (int i = 0; i < scores.length; i++)
        {
            grades += String.format("%.2f", scores[i]) + "  ";
        }

        return String.format("%s %s - %s: %s", firstName, lastName, grade, grades);
    }

    /**
     * Determines the letter grade based on a collection of scores in an array
     * @param scores of floating point values that represent scores
     */
    public static String determineGrade(double[] scores)
    {
        if (scores.length == 0)
            throw new IllegalArgumentException("Grade list cannot be empty");

        double total = 0, average;

        // Calculate the total of the array
        for (double num: scores)
        {
            total += num;
        }

        average = total / scores.length;                    // calculate the average of the array

        if (average >= 89.5 && average <= 100) {
            return "A";
        } else if (average >= 79.5 && average < 89.5) {
            return "B";
        } else if (average >= 69.5 && average < 79.5) {
            return "C";
        } else if (average >= 59.5 && average < 69.5) {
            return "D";
        } else {
            return "F";
        }
    }

}
