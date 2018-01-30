package Module12;

/**
 * Extends Terrain.java and defines
 * a plain terrain.
 *
 * @author Denielle Kirk Abaquita
 * @version 29 January 2018
 */

public class Plain extends Terrain {

    // Private instance variables
    int myBuffaloes;

    // Constructors
    public Plain() {

    }

    public Plain(int l, int w, int numBuffaloes) {

        super(l, w);
        myBuffaloes = numBuffaloes;

    }

    // Returns the attributes of the plain
    public String getAttributes() {

        return "Plain " + getTerrainSize() + "and has " + myBuffaloes + " buffaloes";

    }

}
