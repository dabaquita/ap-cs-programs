package Module17.MergeSort;

/**
 * To practice both recursive and non-recursive
 * forms of merge sort with int arrays.
 *
 * @author Denielle Kirk Abaquita
 * @version 22 March 2018
 */

public class MergeSortPractice {

    /** MAIN METHOD */
    public static void main(String[] args)
    {

    }

    /**
     * Sorts an array with merge sort (FLVS)
     * @param array - unsorted array
     * @param left - starting index
     * @param right - ending index
     */
    public static void mergeSort( int[] array, int left, int right)
    {
        if ( left >= right )                    // checks boundaries
            return;

        int mid = ( left + right ) / 2;         // gets the mid point of the array

        mergeSort( array, left, mid );          // recursively splits the left array into two and so on
        mergeSort( array, mid + 1, right);      // recursively splits the right array into two and so on

        merge( array, left, mid, right);        // merges the halves of whatever array is currently in process
    }

    /**
     * Sorts an array using two halves and merges it into one (FLVS)
     * @param array - array to be sorted and split into two
     * @param leftStart - the left most index
     * @param mid - the middle index
     * @param rightEnd - the right most index
     */
    public static void merge( int[] array, int leftStart, int mid, int rightEnd)
    {
        int[] temp = new int[ rightEnd - leftStart + 1];

        int left = leftStart,           // the left starting index of the left half of the array
                right = mid + 1,        // the right starting index of the right side of the array
                index = 0;              // the overall index of the temporary array

        while ( left <=  mid || right <= rightEnd )
        {
            if ( left > mid )                           // finished processing left
            {
                temp[ index ] = array[ right ];
                right++;
            }
            else if ( right > rightEnd )                // when finished processing right
            {
                temp [ index ] = array[ left ];
                left++;
            }
            else if ( array[ left ] < array[ right ])   // both halves have values, so compare if left < right
            {
                temp [ index ] = array[ left ];
                left++;
            }
            else                                        // both halves have values, so compare if right < left
            {
                temp[ index ] = array[ right ];
                right++;
            }
            index++;        // element has been added at previous index so go to next index
        }

        // put elements back into the array from left to right
        for (int k = leftStart; k <= rightEnd; k++)
        {
            array[ k ] = temp[ k - leftStart];
        }
    }


    /**
     * Merges two sorted, ascending arrays from FLVS
     * @param l - first array
     * @param r - second array
     * @return combined array
     */ /*
    public static int[] mergeArrays (int[] l, int[] r)
    {
        int[] result = new int[l.length + r.length];

        int left, right = 0;
        int leftEnd = l.length;
        int rightEnd = r.length;

        for (left = 0; left < leftEnd; left++)   // iterates over length of a
        {
            while (right < rightEnd)
            {
                if ( l[left] < r[right] )        // if a's element is less, stop the loop
                {
                    break;
                }
                else                                // if b's is less, place it in merged array
                {
                    result[ left + right ] = r[ right ];
                    right++;
                }
            }
            result[ left + right ] = l[ left ];    // if a is less than b, place it in merged
        }

        // Once all a's elements are placed,
        // take all the rest of b's elements and plaee it in array
        while ( right < rightEnd )
        {
            result[ left + right ] = r[ right ];
            right++;
        }

        return result;
    } */


}
