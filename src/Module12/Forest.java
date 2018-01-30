package Module12;

/**
 * This class extends Terrain.java and defines
 * a forrest.
 *
 * @author Denielle Kirk Abaquita
 * @version 29 January 2018
 */

public class Forest extends Terrain {

    // private instance variables
    private int myTrees;

    // constructors
    public Forest() {

    }

    public Forest(int l, int w, int numOfTrees) {

        super(l, w);
        myTrees = numOfTrees;

    }

    // returns the attributes of forest
    public String getAttributes() {

        return "Forest " + getTerrainSize() + " and has " + myTrees + " trees";

    }

}
