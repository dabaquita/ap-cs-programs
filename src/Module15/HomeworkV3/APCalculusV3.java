package Module15.HomeworkV3;

/**
 *  Extends Homework.java and represents
 *  homework for AP Calculus.
 *
 *  @author Denielle Kirk Abaquita
 *  @version 26 February 2018
 */

public class APCalculusV3 extends HomeworkV3 {

    // Constructor
    public APCalculusV3() {
        super();
    }

    /**
     * Implements the abstract method
     * @param numPagesRead is set for instance
     */
    public void createAssignment(int numPagesRead) {
        this.setPagesRead(numPagesRead);
        this.setType("AP Calculus");                // sets type of homework
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
