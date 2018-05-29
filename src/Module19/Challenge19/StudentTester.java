package Module19.Challenge19;

/**
 * Tests the StudentData.java class
 * and its exception handling.
 *
 * @author Denielle Kirk Abaquita
 * @version 18 April 2018
 */

public class StudentTester {

    public static void main(String[] args)
    {
        double[] empty = new double[0];
        double[] fullOne = {96.2, 74.5, 75.23, 89.75, 99.7};
        double[] fullTwo = {43.5, 95.3, 85.3, 79.5, 97.23};
        double[] fullThree = {68.2, 76.34, 89.23, 74.2, 81.8};

        // StudentData exception = new StudentData("", "Love", fullOne);       // shows IllegalStateException
        // StudentData exception = new StudentData("Eve", "Love", empty);       // shows IllegalArgumentException
        StudentData john = new StudentData("John", "Smith", fullOne);
        StudentData amy = new StudentData("Amy", "Johnston", fullTwo);
        StudentData percy = new StudentData("Percy", "Jackson", fullThree);

        System.out.println("Student with letter grade and scores.");
        System.out.println(john + "\n" + amy + "\n" + percy);
    }

}
