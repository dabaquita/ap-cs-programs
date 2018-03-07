package Module15.HomeworkV4;

/**
 *  Extends Homework.java and represents
 *  homework for AP Calculus.
 *
 *  @author Denielle Kirk Abaquita
 *  @version 28 February 2018
 */

public class APCalculusV4 extends HomeworkV4 {

    // Constructor
    public APCalculusV4() {
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

    /**
     * Compares instances of course subjects
     * @param hw - homework to be compared to the current instance
     * @return - value if current is less than, 0 value if equal, + value if greater than
     */
    public int compareTo(HomeworkV4 hw)
    {
        if (this.getPagesRead() < hw.getPagesRead()){
            return -1;
        } else if (this.getPagesRead() == hw.getPagesRead()) {
            return 0;
        }
        return 1;
    }

}
