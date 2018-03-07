package Module15.Homework;

import java.util.ArrayList;

/**
 * To test the Homework project.
 *
 * @author Denielle Kirk Abaquita
 * @version 26 February 2018
 */

public class HomeworkTester {

    public static void main(String[] args) {

        // Instances of each course subject in an Array List
        ArrayList<Homework> homework = new ArrayList<Homework>();
        homework.add(new APCalculus());
        homework.add(new APPhysics());
        homework.add(new APGov());
        homework.add(new APStats());

        // Output
        System.out.printf("%35s\n", "My Homework Reading To-Do");
        System.out.printf("----------------------------------------------\n");

        // Creation of assignments and output
        for (Homework hw : homework) {
            int random = (int) (Math.random() * 10);
            hw.createAssignment(random);           // random reading assignment

            System.out.println(hw.toString());     // prints out object
        }

    }

}
