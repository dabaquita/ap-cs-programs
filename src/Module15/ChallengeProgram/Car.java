package Module15.ChallengeProgram;

/**
 * Defines a car object that extends
 * the Vehicle class.
 *
 * @author Denielle Kirk Abaquita
 * @version 2 March 2018
 */

public class Car extends Vehicle {

    /** Default Constructor */
    public Car() {
        super();
    }

    /** Constructor w/ parameters to set name and cost */
    public Car(String name, double cost) {
        super(name + " (Car)", cost);
    }

    @Override
    /** Defines how the car is driven */
    public void drive() {
        System.out.println("Two pedals and a steering wheel");
    }

}
