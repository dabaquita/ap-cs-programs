package Module13;

/**
 * This class defines an Isosceles Trapezoid
 * object.
 *
 * @author Denielle Kirk Abaquita
 * @version 5 February 2018
 */

public class IsosTrapezoid4 extends Rectangle4 {

    // Constructors
    private int myLength2;

    public IsosTrapezoid4() { }

    public IsosTrapezoid4(int b1, int b2, int s)
    {
        super(b1, s);
        myLength2 = b2;
    }

    // Return the value of the side

    // Return the value of the second base
    public int getLength2() { return myLength2;}

    // Returns a string representation
    public String toString() {

        return "The trapezoid's dimensions are: " + getLength() + " X " +
                getWidth() + " X " + myLength2 + " X " + getWidth();

    }

}
