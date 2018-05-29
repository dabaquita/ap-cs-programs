package Module13;

/**
 * This class defines a Square object
 * by extending Rectangle and includes the
 * sides.
 *
 * @author Denielle Kirk Abaquita
 * @version 5 February 2018
 */

public class Square4 extends Rectangle4 {

    // Instance variables
    private int mySide;

    // Constructors
    public Square4() { }

    public Square4(int s)
    {
        super(s, s);
        mySide = s;
    }

    // return the side
    public int getSide() { return mySide; }

    // String to display when object is printed
    public String toString()
    {
        return "The square's dimensions are " + mySide + " X " + mySide;
    }

}
