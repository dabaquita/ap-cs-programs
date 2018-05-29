package Module13;

/**
 * This class defines a Cube object.
 *
 * @author Denielle Kirk Abaquita
 * @version 5 February 2018
 */

public class Cube4 extends Box4 {

    // Constructors
    private int mySide;

    public Cube4() { }

    public Cube4(int s)
    {
        super(s, s, s);             // assigns the value of the side to Box4() super

        mySide = s;
    }

    // Return the value of the side
    public int getSide() { return mySide; }

    // Returns a string representation
    public String toString()
    {
        return "The cube's dimensions are: " + mySide + " X " +
                mySide + " X " + mySide;
    }

}
