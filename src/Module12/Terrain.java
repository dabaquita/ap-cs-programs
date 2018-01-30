package Module12;

 /**
 * This class defines a basic Terrain.
 *
 * @author Denielle Kirk Abaquita
 * @version 29 January 2018
 */

public class Terrain
{
    // instance variables
    private int length, width;

    public Terrain() {

    }

    // Constructor for objects of class Terrain
    public Terrain(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    public String getTerrainSize()
    {
        return "Land has dimensions " + length + " X " + width;
    }
}
