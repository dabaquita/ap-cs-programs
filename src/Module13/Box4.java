package Module13;

/**
 * This class defines a Box object by extending
 * Rectangle and includes height.
 * The toString method has been added.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */
public class Box4 extends Rectangle4
{
    // instance variables
    private int height;

    public Box4() { }

    // Constructor for objects of class Box
    public Box4(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // Return the height
    public int getHeight()
    {
        return height;
    }

    // Returns a string representation
    public String toString()
    {
        return "The box's dimensions are " + getLength() + " X " + getWidth() + " X " + height;
    }

    // Tests for the equality between objects
    public boolean equals(Object c)
    {
        if( !(c instanceof Box4)) {
            return false;                                                               // returns false if object is not a Cube object
        }

        Box4 d = (Box4) c;                                                              // explicitly casts the object as a Cube object

        return d.getHeight() == getHeight() && d.getLength() == getLength()
                && d.getWidth() == getWidth();                                          // if all is the same, return true
    }

}
