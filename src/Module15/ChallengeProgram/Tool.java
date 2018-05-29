package Module15.ChallengeProgram;

/**
 *
 */

public abstract class Tool implements Product, Comparable<Tool>
{

    // Instance variables
    private String name;
    private double cost;

    /** Default constructor */
    public Tool() {
        name = "";
        cost = 0.0;
    }

    /**
     * Constructor with parameters
     * @param name tool name
     * @param cost tool cost
     */
    public Tool(String name, double cost)
    {
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
    public abstract void use();

    @Override
    /** Compares all Tool objects based on cost */
    public int compareTo(Tool o) {

        if (getCost() < o.getCost()) {
            System.out.println("The first " + this.getName() + " is less expensive with cost" +
                    " of " + this.getCost());
            return -1;
        } else if (getCost() == o.getCost()) {
            System.out.println("Both " + this.getName() + " are the same cost" +
                    " at " + this.getCost());
            return 0;
        }

        System.out.println("The second " + o.getName() + " is less expensive with cost" +
                " of " + o.getCost());
        return 1;
    }
}
