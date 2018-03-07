package Module15.HomeworkV3;

/**
 *  Extends Homework.java and represents
 *  homework for AP Physics.
 *
 *  @author Denielle Kirk Abaquita
 *  @version 26 February 2018
 */

public class APPhysicsV3 extends HomeworkV3 {

    // Instance variables

    // Constructor
    public APPhysicsV3() {
        super();
    }

    /**
     * Implements the abstract method
     * @param numPagesRead is set for instance
     */
    public void createAssignment(int numPagesRead) {
        this.setPagesRead(numPagesRead);
        this.setType("AP Physics");                // sets type of homework
    }

    /**
     * Completes part of the task by subtracting pages read
     */
    public void doingHomework() {
        this.setPagesRead(this.getPagesRead() - 2);
    }

    /**
     * Converts this object to a string
     * @return string value for the class
     */
    public String toString() {
        return this.getType() + " - read " + this.getPagesRead() + " pages.";
    }


}
