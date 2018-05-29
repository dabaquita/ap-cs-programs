package Module15.HomeworkV4;

import java.util.ArrayList;
import java.util.List;

/**
 * To test the Homework project.
 *
 * @author Denielle Kirk Abaquita
 * @version 28 February 2018
 */

public class HomeworkTesterV4 {

    /** Compares all homework assignments in a given homework list */
    public static void compare(List<HomeworkV4> list) {

        for (int i = 0; i <= list.size(); i++)
        {
            HomeworkV4 item = list.remove(0);                           // remove current item at index 0 from list

            for (int j = 0; j < list.size(); j++)
            {
                int valueComparison = item.compareTo(list.get(j));      // compare with the other elements in list

                if (valueComparison == -1)
                {
                    System.out.println("The homework for " + item.getType() + " has LESS pages to read than " +
                            list.get(j).getType() + ".");
                } else if (valueComparison == 0) {
                    System.out.println("The homework for " + item.getType() + " and " +
                            list.get(j).getType() + " are the SAME number of pages.");
                } else {
                    System.out.println("The homework for " + item.getType() + " has MORE pages to read than " +
                            list.get(j).getType() + ".");
                }
            }
        }
    }

    public static void main(String[] args) {

        // Instances of each course subject in an Array List
        List<HomeworkV4> homework = new ArrayList<HomeworkV4>();
        homework.add(new APCalculusV4());
        homework.add(new APPhysicsV4());
        homework.add(new APGovV4());
        homework.add(new APStatsV4());

        // Output
        System.out.printf("%35s\n", "My Homework Reading To-Do");
        System.out.printf("----------------------------------------------\n");

        // Creation of assignments and output
        for (HomeworkV4 hw : homework) {
            int random = (int) (Math.random() * 10 + 2);
            hw.createAssignment(random);            // random reading assignment

            System.out.println("Before reading: " + hw.toString());     // prints out object before doing

            hw.doingHomework();
            System.out.println("After reading: " + hw.toString());      // object after doing
            System.out.println();
        }

        // Comparing my homework
        System.out.printf("\n\n%30s\n%s", "Comparing My Homework",
                            "-------------------------------------------------\n");
        compare(homework);      // compare homework

    }

}
