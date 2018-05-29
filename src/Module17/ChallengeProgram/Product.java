package Module17.ChallengeProgram;

/**
 * Implementation class that defines an item.
 *
 * @author Denielle Kirk Abaquita
 * @version 29 March 2018
 */

public class Product {

    // instance variables
    private String name;
    private int number;
    private double price;
    private int quantity;

    /** CONSTRUCTORS */
    public Product() { }

    public Product(String name, int number, double price, int quantity) {
        this.name = name;
        this.number = number;
        this.price = (int) (100.0 * price) / 100.0;
        this.quantity = quantity;
    }

    /** GETTER METHODS */
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


    /** toString method */
    @Override
    public String toString() {
        return "\n" + name + ", " + number + " $" + price + ", " + quantity;
    }

}
