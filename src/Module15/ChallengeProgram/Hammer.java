package Module15.ChallengeProgram;

/**
 * Defines a hammer object.
 *
 * @author Denielle Kirk Abaquita
 * @version 2 March 2018
 */

public class Hammer extends Tool {

    /** Default Constructor */
    public Hammer() {
        super();
    }

    /**
     * Constructor with parameters
     * @param name the name of the tool
     * @param cost the cost of the tool
     */
    public Hammer(String name, double cost) {
        super(name + " (Hammer)", cost);
    }

    @Override
    /** Shows how to use a saw */
    public void use() {
        System.out.println("Lift up high and slam down.");
    }

}
