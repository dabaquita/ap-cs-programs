package Module18;

/**
 * Searching algorithms from FLVS
 *
 * @author Denielle Kirk Abaquita
 * @version 5 April 2018
 */

public class SearchingAlgorithms {

    /** MAIN METHOD */
    public static void main(String[] args)
    {
        int[] sortedArray = { 1, 2, 3, 4, 5, 6, 7, 8};


    }

    /**
     * SPEED: Average of n/2 iterations and worse case n
     * Sequentially searches for a number in an array
     * @param array - sorted ascending array
     * @param x - integer to be found
     * @return the index of the the integer found
     */
    public static int seqSearch(int[] array, int x)
    {
        int i = 0;

        while (i < array.length)
        {
            if (array[i] == x)
            {
                return i;
            }
            i++;
        }

        return -1;      // element not found
    }

    /**
     * SPEED: LOG BASE 2 Run time (Log base 2 n, where n is equal to the number of elements)
     * Recursively implements the binary search algorithm to find the index of an element
     * @param array - sorted ascending array
     * @param x - integer to be found
     * @param left - the starting index
     * @param right - the ending index
     * @return the integer's index
     */
    public static int binarySearchRecursive(int[] array, int x, int left, int right)
    {
        if (left > right)
            return -1;

        int mid = left + ( (right - left) / 2 );    // prevents integer overflow
        if (array[mid] == x) {
            return mid;
        } else if (x < array[mid]) {
            return binarySearchRecursive(array, x, left, mid - 1);
        } else {
            return binarySearchRecursive(array, x, mid + 1, right);
        }

    }

    /**
     * Correctly implements the binary search
     * @param array - sorted ascending array
     * @param x - integer to found
     * @return the integer's index
     */
    public static int binarySearchRecursive(int[] array, int x)
    {
        return binarySearchRecursive(array, x, 0, array.length - 1);
    }

    /** FROM EIMACS
     * Returns the position of the element equal to target or -1 if target
     *  is not in the array
     *  Precondition:  array a contains n values sorted in ascending order
     */
    public int binarySearch2(int[] a, int n, int target)
    {
        int left = 0;
        int right = n - 1;

        while (left <= right)
        {
            int middle = (left + right) / 2;
            if (target == a[middle])
                return middle;
            else if (target < a[middle])
                right = middle - 1;     // Continue search in the left half
            else
                left = middle + 1;      // Continue search in the right half
        }
        return -1;
    }

    /**
     * Implements the binary search algorithm (FLVS)
     * @param array - sorted ascending ints
     * @param target - integer to be found
     * @return index of the target if found
     */
    public static int binarySearch(int[] array, int target)
    {
        int high = array.length;
        int low = -1;
        int probe;

        while ( high - low > 1 )
        {
            probe = (high + low) / 2;   // position probe at the middle of searching area

            if (target < array[ probe ])
            {
                high = probe;
            } else {
                low = probe;
            }
        }

        if (low >= 0 && target == array[ low ])
            return low;
        else
            return -1;      // not found
    }


}
