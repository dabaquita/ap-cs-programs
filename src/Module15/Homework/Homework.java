package Module15.Homework;

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
     * Setter method
     * @param typeOfHW passes as the value for instance variable
     */
    public void setType(String typeOfHW) {
        this.typeOfHW = typeOfHW;
    }

    /**
     * Getter method
     * @return number of pages read
     */
    public int getPagesRead() { return numPagesRead; }

    /**
     * Getter method
     * @return type of homework
     */
    public String getType() { return typeOfHW; }

}
