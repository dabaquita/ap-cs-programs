package Module13;

/**
 * This class extends Terrain.java and defines
 * a mountain.
 *
 * @author Denielle Kirk Abaquita
 * @version 29 January 2018
 */

public class Mountain extends Terrain {

    // private instance variables
    private int myMountains;

    // constructors
    public Mountain() {

    }

    public Mountain(int l, int w, int numOfMountains) {

        super(l, w);
        myMountains = numOfMountains;

    }

    // returns the attributes of mountain
    public String getAttributes() {

        return "Mountain " + getTerrainSize() + " and has " + myMountains + " mountains";

    }

}
