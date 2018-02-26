package Module14.Homework;

/**
 * Abstract class defining a homework
 * reading assignment.
 *
 * @author Denielle Kirk Abaquita
 * @version 25 February 2018
 */

public abstract class Homework {

    // Instance variables
    private int numPagesRead;
    private String typeOfHW;

    // Constructor
    public Homework() {
        numPagesRead = 0;
        typeOfHW = "none";
    }

    /** Abstract method to create assignments */
    public abstract void createAssignment(int numPagesRead);

    /**
     * Setter method
     * @param numPagesRead passes as the value for instance variable
     */
    public void setPagesRead(int numPagesRead) {
        this.numPagesRead = numPagesRead;
    }

    /**
     * Getter method
     * @return number of pages read
     */
    public int getPagesRead() { return numPagesRead; }

}
