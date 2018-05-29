package Module14;

import Module13.Plain;

/**
 * Extends Plain.java and defines a
 * grassy plain.
 *
 * @author Denielle Kirk Abaquita
 * @version 29 January 2018
 */

public class GrassyPlainV2 extends Plain {

    // Private instance variables
    String color;

    // Constructors
    public GrassyPlainV2() {

    }

    public GrassyPlainV2(int l, int w, int numBuffaloes, String color) {

        super(l, w, numBuffaloes);
        this.color = color;

    }

    // Returns the object's information
    public String getInfo() {

        return getAttributes() + " and color " + color;

    }

}
