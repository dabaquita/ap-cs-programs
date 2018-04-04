package Module17.ChallengeProgram;

/**
 * Uses various sorting methods from Module 17
 * on Product.java objects in arrays.
 *
 * @author Denielle Kirk Abaquita
 * @version 29 March 2018
 */

public class ProductTester {

    public static void main(String[] args)
    {
        Product[] inventory =
                {
                  new Product("Pencils", 123, 4.99, 25),
                  new Product("Pens", 124, 5.99, 34),
                  new Product("Laptop", 654, 649.99, 5),
                  new Product("Shoes", 323, 79.99, 7),
                  new Product("Glasses", 567, 129.99, 4),
                  new Product("Erasers", 122, 3.99, 67),
                  new Product("Keychain", 389, 2.99, 103),
                  new Product("Blanket", 876, 19.99, 54),
                  new Product("Headphones", 686, 59.99, 10),
                  new Product("Lined Paper", 121, 4.49, 21),
                };

        // Before any changes
        printTable(inventory);

        // Merge sort: Ascending by number
        sortByNumber(inventory, 0, inventory.length - 1);
        System.out.println("\n\nMerge sort in ascending order by number");
        printTable(inventory);

        // Insertion sort: Ascending by name
        sortByName(inventory, 1);
        System.out.println("\n\nInsertion sort in ascending order by name");
        printTable(inventory);

        // Insertion sort: Descending by name
        sortByName(inventory, 2);
        System.out.println("\n\nInsertion sort in descending order by name");
        printTable(inventory);

        // Selection sort: Ascending by price
        sortByPrice(inventory, 1);
        System.out.println("\n\nSelection sort in ascending order by price");
        printTable(inventory);

        // Selection sort: Descending by price
        sortByPrice(inventory, 2);
        System.out.println("\n\nSelection sort in descending order by price");
        printTable(inventory);

    }

    /**
     * Prints out an array of items in a table format
     * @param inventory - array of products
     */
    public static void printTable(Product[] inventory) {
        System.out.println("\n      Name, Number, Price, Quantity");
        System.out.println("---------------------------------------------");

        for (Product item: inventory)
        {
            System.out.println(item.toString());
        }
    }

    /**
     * Sorts the array by number using merge sort technique
     * @param array - unsorted array
     * @param left - starting index
     * @param right - ending index
     */
    public static void sortByNumber(Product[] array, int left, int right)
    {
        if (left >= right)
            return;

        int mid = (left + right) / 2;

        sortByNumber(array, left, mid);
        sortByNumber(array, mid + 1, right);

        merge(array, left, mid, right);
    }

    /**
     * Sorts the array by name in a specific order using insertion sort
     * @param array - unsorted array
     * @param order 1: ascending, 2: descending
     */
    public static void sortByName(Product[] array, int order)
    {
        Product[] dest = new Product[array.length];

        if (order == 1)
        {
            for (int i = 0; i < array.length; i++)
            {
                Product next = array[ i ];
                String nextName = next.getName();
                int insertIndex = 0, k = i;

                while (k > 0 && insertIndex == 0)
                {
                    if ( nextName.compareTo( dest[k - 1].getName() ) > 0)
                    {   // if the next item to be added is greater than the previous in dest
                        insertIndex = k;
                    } else {
                        dest[ k ] = dest[ k - 1 ];      // shift previous item to the right
                    }
                    k--;
                }
                dest[ insertIndex ] = next;
            }
        }
        else if (order == 2)
        {
            for (int i = 0; i < array.length; i++)
            {
                Product next = array[ i ];
                String nextName = next.getName();
                int insertIndex = 0, k = i;

                while (k > 0 && insertIndex == 0)
                {
                    if ( nextName.compareTo(dest[k - 1].getName()) < 0)
                    {   // if the next item to be added is less than the previous in dest
                        insertIndex = k;
                    } else {
                        dest[ k ] = dest[ k - 1];
                    }
                    k--;
                }
                dest[ insertIndex ] = next;
            }
        }

        // Transfer from dest to original array
        for (int i = 0; i < dest.length; i++)
        {
            array[ i ] = dest[ i ];
        }
    }

    /**
     * Sorts the array by price in a specific order using selection sort
     * @param array - unsorted array
     * @param order - 1: ascending, 2: descending
     */
    public static void sortByPrice(Product[] array, int order)
    {
        if (order == 1)
        {
            for (int i = array.length - 1; i > 0; i--)
            {
                int maxPosition = 0;

                // Loops to find the position of the item with the highest price
                for (int k = 1; k <= i; k++)
                {
                    if (array[k].getPrice() > array[maxPosition].getPrice())
                    {
                        maxPosition = k;
                    }
                }

                // Swaps the last element with the max element
                Product temp = array[i];            // last element
                array[i] = array[maxPosition];      // places max element in last position
                array[maxPosition] = temp;          // places last element in other position
            }
        }
        else if (order == 2)
        {
            for (int i = array.length - 1; i > 0; i++)
            {
                int minPosition = 0;

                for (int k = 1; k <= i; k++)
                {
                    if (array[k].getPrice() < array[minPosition].getPrice())
                    {
                        minPosition = k;
                    }
                }

                // Swaps the last element with the min element
                Product temp = array[i];            // last element
                array[i] = array[minPosition];      // places min element in last position
                array[minPosition] = temp;          // places last element in min position
            }
        }
    }


    /**
     * Merges two arrays into one (This is in ascending order)
     * @param array - unsorted array
     * @param leftStart - starting index of left half
     * @param mid - the middle index of entire array
     * @param rightEnd - the last index of the right half
     */
    public static void merge(Product[] array, int leftStart, int mid, int rightEnd)
    {
        Product[] temp = new Product[rightEnd - leftStart + 1];

        int left = leftStart,               // Initialize indices of left half, right half, and entire temp
                right = mid + 1,
                index = 0;

        while (left <= mid || right <= rightEnd)
        {
            if (left > mid)                             // Finished processing left half
            {
                temp[ index ] = array[ right ];
                right++;
            }
            else if (right > rightEnd)                  // Finished processing right half
            {
                temp[ index ] = array[ left ];
                left++;
            }
            else if (array[ left ].getNumber() < array[ right ].getNumber())        // left is less than right
            {
                temp[ index ] = array[ left ];
                left++;
            }
            else
            {
                temp[ index ] = array[ right ];
                right++;
            }
            index++;
        }

        // Place everything in the original array
        for (int k = leftStart; k <= rightEnd; k++)
        {
            array[ k ] = temp[ k - leftStart ];
        }
    }
}
