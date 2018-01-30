package Module12;

/**
 * This class extends Mountain.java and defines
 * a winter mountain terrain.
 *
 * @author Denielle Kirk Abaquita
 * @version 29 January 2018
 */

public class WinterMountain extends Mountain {

    // private instance variables
    private double myTemperature;

    // constructors
    public WinterMountain() {

    }

    public WinterMountain(int l, int w, int numOfMountains, double temp) {

        super(l, w, numOfMountains);
        myTemperature = temp;

    }

    // returns the object's information
    public String getInfo() {

        return getAttributes() + "and temperature " + myTemperature + " degrees";

    }

}
