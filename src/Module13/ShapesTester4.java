package Module13;

/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */

import java.util.*;

public class ShapesTester4
{
    public static void main(String []args)
    {
        Rectangle4 one = new Box4(4, 10, 5);
        Rectangle4 two = new Rectangle4(5, 5);
        Rectangle4 three = new Square4(5);
        Rectangle4 four = new IsosTrapezoid4(8, 10, 12);
        Rectangle4 five = new Cube4(10);

        // Assigns shapes into an ArrayList
        ArrayList<Rectangle4> shapes = new ArrayList<>();

        shapes.add( one );
        shapes.add( two );
        shapes.add( three );
        shapes.add( four );
        shapes.add( five);

        // Prints shapes out
        System.out.println("\nMy shapes:\n");

        for(Rectangle4 rect: shapes)
        {
        	showEffectBoth(rect);
        }

        // Testing for equality
        System.out.println("\nTest for equality: ");

        for(int i = 0; i < shapes.size() - 1; i++) {

            if (shapes.get(i).equals(shapes.get(i + 1))) {
                System.out.println("Shapes[" + i + "] is equal to Shapes[" + (i + 1) + "]");
            } else {
                System.out.println("Shapes[" + i + "] is NOT equal to Shapes[" + (i + 1) + "]");
            }

        }


    }

    public static void showEffectBoth(Rectangle4 r)
    {
        System.out.println(r);
    }

}
