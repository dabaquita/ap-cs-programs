package Module15.HomeworkV3;

import java.util.ArrayList;
import java.util.List;

/**
 * To test the Homework project.
 *
 * @author Denielle Kirk Abaquita
 * @version 26 February 2018
 */

public class HomeworkTesterV3 {

    public static void main(String[] args) {

        // Instances of each course subject in an Array List
        List<HomeworkV3> homework = new ArrayList<HomeworkV3>();
        homework.add(new APCalculusV3());
        homework.add(new APPhysicsV3());
        homework.add(new APGovV3());
        homework.add(new APStatsV3());

        // Output
        System.out.printf("%35s\n", "My Homework Reading To-Do");
        System.out.printf("----------------------------------------------\n");

        // Creation of assignments and output
        for (HomeworkV3 hw : homework) {
            int random = (int) (Math.random() * 10 + 2);
            hw.createAssignment(random);           // random reading assignment

            System.out.println("Before reading: " + hw.toString());     // prints out object before doing

            hw.doingHomework();
            System.out.println("After reading: " + hw.toString());      // object after doing
            System.out.println();
        }

    }

}
