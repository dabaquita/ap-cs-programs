package Module13;

/**
 * This class defines a Rectangle object using
 * length and width.
 * The toString method has been added.
 *
 *
 * @author Poly Morphism
 * @version 06/13/17
 */
public class Rectangle4
{
    // instance variables
    private int length;
    private int width;

    public Rectangle4() { }

    // Constructor for objects of class Rectangle
    public Rectangle4(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength()
    {
        return length;
    }

    // return the width
    public int getWidth()
    {
        return width;
    }

    // String to display when object is printed.
    public String toString()
    {
        return "The rectangle's dimensions are " + length + " X " + width;
    }

    // Tests for the equality between two objects
    public boolean equals(Object c)
    {
        if( !( c instanceof Rectangle4 )) {
            return false;                               // returns false if c is not a Rectangle object
        }

        Rectangle4 d = (Rectangle4) c;                  // casts the c object into a Rectangle object

        return d.getLength() == getLength() && d.getWidth() == getWidth();
    }

}
