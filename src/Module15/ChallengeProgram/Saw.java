package Module15.ChallengeProgram;

/**
 * Defines a saw object.
 *
 * @author Denielle Kirk Abaquita
 * #version 2 March 2018
 */

public class Saw extends Tool {

    /** Default Constructor */
    public Saw() {
        super();
    }

    /**
     * Constructor with parameters
     * @param name the name of the tool
     * @param cost the cost of the tool
     */
    public Saw(String name, double cost) {
        super(name + " (Saw)", cost);
    }

    @Override
    /** Shows how to use a saw */
    public void use() {
        System.out.println("Swivel backwards and forwards.");
    }

}
