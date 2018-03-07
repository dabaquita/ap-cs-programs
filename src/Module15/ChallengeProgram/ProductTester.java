package Module15.ChallengeProgram;

import java.util.ArrayList;
import java.util.List;

/**
 * Tests the products that were defined
 * in other classes.
 *
 * @author Denielle Kirk Abaquita
 * @version 2 March 2018
 */

public class ProductTester {

    /** Takes inventory by counting for quantity of same products.
     *  Total cost is also calculated.
     *  Output displays item name, quantity, and total cost.
     */
    public static void takeInventory(List<Product> list, String name) {

        // Initialize count variables
        int count = 0;
        double totalCost = 0.0;

        for(int i = 0; i < list.size(); i++)
        {
            // If the name of the given is equal to the element, then count
            if (list.get(i).getName().equals(name))
            {
                count++;
                totalCost += list.get(i).getCost();
            }
        }

        // Print out inventory for item
        System.out.printf("%s: Quantity = %d, Total cost = $%-10.2f\n\n",
                            name, count, totalCost);

    }

    /** MAIN METHOD */
    public static void main(String[] args)
    {
        // Organizing all products in an arraylist
        List<Product> products = new ArrayList<Product>();
        products.add(new Saw("Black & Decker Auto", 134.99));
        products.add(new Hammer("Jack", 199.99));
        products.add(new Car("Tesla", 31999.99));
        products.add(new Bicycle("Schwinn", 399.99));
        products.add(new Car("Tesla", 109000));
        products.add(new Hammer("Jack", 249.95));

        // Takes the inventory of the entire product list
        System.out.printf("%25s\n", "Inventory");
        System.out.println("--------------------------------------------");

        for (int i = 0; i < products.size(); i++) {
            takeInventory(products, products.get(i).getName());
        }

        // Tests the compareTo method
        Tool hammer1 = new Hammer("Jack", 199.99);
        Tool hammer2 = new Hammer("Jack", 249.95);

        System.out.printf("\n\n%30s\n", "Comparing Tools");
        System.out.println("--------------------------------------------");

        hammer1.compareTo(hammer2);

    }

}
