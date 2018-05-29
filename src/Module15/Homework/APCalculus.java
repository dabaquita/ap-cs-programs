package Module15.Homework;

/**
 *  Extends Homework.java and represents
 *  homework for AP Calculus.
 *
 *  @author Denielle Kirk Abaquita
 *  @version 26 February 2018
 */

public class APCalculus extends Homework {

    // Constructor
    public APCalculus() {
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
     * Converts this object to a string
     * @return string value for the class
     */
    public String toString() {
        return this.getType() + " - read " + this.getPagesRead() + " pages.";
    }

}
