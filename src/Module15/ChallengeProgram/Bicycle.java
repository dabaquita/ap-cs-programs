package Module15.ChallengeProgram;

/**
 * Defines a bicycle object that extends
 * the Vehicle class.
 *
 * @author Denielle Kirk Abaquita
 * @version 2 March 2018
 */

public class Bicycle extends Vehicle {

    /** Default Constructor */
    public Bicycle() {
        super();
    }

    /** Constructor w/ parameters to set name and cost */
    public Bicycle(String name, double cost) {
        super(name + " (Bicycle)", cost);
    }

    @Override
    /** Defines how the car is driven */
    public void drive() {
        System.out.println("Two pedals and steering handles");
    }

}
