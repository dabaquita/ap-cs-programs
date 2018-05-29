package Module15.ChallengeProgram;

/**
 * Abstract class for fruit objects.
 *
 * @author Denielle Kirk Abaquita
 * @version 1 March 2018
 */

public abstract class Vehicle implements Product {

    // Instance variables
    private String name;
    private double cost;

    /** Default Constructor */
    public Vehicle() {
        name = "";
        cost = 0.0;
    }

    /** Constructor with parameters
     * @param name the name of the vehicle
     * @param cost the cost of the vehicle
     */
    public Vehicle(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    /** Getter method for name */
    public String getName() { return name; }

    @Override
    /** Getter method for cost */
    public double getCost() { return cost; }

    /** Abstract class for driving */
    public abstract void drive();

}
