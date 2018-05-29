package Module13;

/**
 * Extends Plain.java and defines a
 * grassy plain.
 *
 * @author Denielle Kirk Abaquita
 * @version 29 January 2018
 */

public class GrassyPlain extends Plain {

    // Private instance variables
    String myColor;

    // Constructors
    public GrassyPlain() {

    }

    public GrassyPlain(int l, int w, int numBuffaloes, String color) {

        super(l, w, numBuffaloes);
        myColor = color;

    }

    // Returns the object's information
    public String getInfo() {

        return getAttributes() + " and color " + myColor;

    }

}
