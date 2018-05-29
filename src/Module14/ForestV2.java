package Module14;

import Module13.Terrain;

/**
 * This class extends Terrain.java and defines
 * a forrest.
 *
 * @author Denielle Kirk Abaquita
 * @version 29 January 2018
 */

public class ForestV2 extends Terrain {

    // private instance variables
    private int numOfTrees;

    // constructors
    public ForestV2() {

    }

    public ForestV2(int l, int w, int numOfTrees) {

        super(l, w);
        this.numOfTrees = numOfTrees;

    }

    // returns the attributes of forest
    public String getAttributes() {

        return "Forest " + getTerrainSize() + " and has " + numOfTrees + " trees";

    }

}
