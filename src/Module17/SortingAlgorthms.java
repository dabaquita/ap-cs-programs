package Module17;

/**
 * A list of sorting algorithms in methods
 *
 * @author Denielle Kirk Abaquita
 * @version 20 March 2018
 */

public class SortingAlgorthms {

    /** MAIN METHOD */
    public static void main(String[] args)
    {
        int[] array = {1, 4, 5, 3, 2};

        // Selection sort algorithm
        printArray( selectionSort(array, 1) );
        printArray( selectionSort(array, 2));

        printArray( insertionSortInPlace(array, 1));

    }

    /**
     * Prints an array
     * @param array - array of ints
     */
    public static void printArray(int[] array) {
        for (int num: array ) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /** (n(n − 1)/2 comparisons, where n is number of elements, quadratic)
     * Selection sort algorithm that picks the largest
     * in the array and places it in the last and steadily
     * iterates over the length of the array from right to left,
     * decreasing the index.
     * @param source - the array of int values to be sorted
     * @param order - 1: ascending, 2: descending
     * @return sorted array
     */
    public static int[] selectionSort(int[] source, int order)
    {
        if (order == 1)
        {
            for ( int i = source.length - 1; i > 0; i-- )
            {
                int maxPosition = 0;

                // Loops to find the max int
                for (int k = 1; k <= i; k++)
                {
                    if (source[k] > source[maxPosition])
                    {
                        maxPosition = k;
                    }
                }

                // Swaps the last element with the max element
                int temp = source[i];                   // last element
                source[i] = source[maxPosition];        // places max element in last position
                source[maxPosition] = temp;             // places last element in the other position
            }
            System.out.println("\nSorted in ascending order. (Selection)");
        }
        else if (order == 2)
        {
            for (int i = source.length -1; i > 0; i--)
            {
                int minPosition = 0;

                for (int k = 1; k <= i; k++)
                {
                    if (source[k] < source[minPosition])
                    {
                        minPosition = k;
                    }
                }

                // Swaps the last element with the min element
                int temp = source[i];                   // last element
                source[i] = source[minPosition];        // places min element in last position
                source[minPosition] = temp;             // places last element in the other position
            }
            System.out.println("\nSorted in descending order. (Selection)");
        }

        return source;
    }

    /** ACCORDING TO FLVS (n(n − 1)/2 comparisons, where n is number of elements, quadratic)
     * Insertion sort algorithm that compares each
     * element with the next and inserts each before or
     * after according to a parameter.
     * @param source - array of ints to be sorted
     * @param order - 1: ascending, 2: descending
     * @return sorted array
     */
    public static int[] insertionSort(int[] source, int order)
    {
        int[] dest = new int[source.length];

        if (order == 1)
        {
            for (int i = 0; i < source.length; i++)
            {
                int next = source[i];
                int insertIndex = 0;
                int k = i;

                while (k > 0 && insertIndex == 0)
                {
                    if ( next > dest[k - 1])
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }
                dest[insertIndex] = next;
            }

            System.out.println("\nSorted in ascending order. (Insertion)");
        }
        else if (order == 2)
        {
            System.out.println("\nSorted in descending order. (Insertion)");
        }

        return dest;
    }

    /** FROM VIDEO
     * Insertion sort algorithm that compares each
     * element with the next and inserts each before or
     * after according to a parameter.
     * @param source - unsorted array
     * @param order - 1: ascending, 2: descedning
     * @return the sorted array
     */
    public static int[] insertionSortInPlace(int[] source, int order)
    {
        if (order == 1)
        {
            for (int i = 1; i < source.length; i++)
            {
                int value = source[ i ];
                int hole = i;

                while ( hole > 0 && source[ hole - 1 ] > value )
                {
                    source[ hole ] = source[ hole - 1];
                    hole--;
                }

                source[ hole ] = value;
            }

            System.out.println("\nSorted in ascending order. (Insertion)");
        }
        else if (order == 2)
        {
            for (int i = 1; i < source.length; i++)
            {
                int value = source[ i ];
                int hole = i;

                while ( hole > 0 && source[ hole - 1 ] < value )
                {
                    source[ hole ] = source[ hole - 1];
                    hole--;
                }

                source[ hole ] = value;
            }

            System.out.println("\nSorted in descending order. (Insertion)");
        }

        return source;
    }

    /**
     * Merge sort into ascending order
     * @param source - array of ints to be sorted
     * @param left - starting index
     * @param right - ending index
     * @return sorted array
     */
    public static void mergeSort(int[] source, int left, int right)
    {
        if (left >= right)
            return;

        int mid = (left + right) / 2;

        mergeSort(source, left, mid);
        mergeSort(source, mid + 1, right);

        // if (source[mid] > a[mid + 1]     // optional line to skip work when array is already sorted or partially sorted
        merge(source, left, mid, right);
    }

    /**
     * Merges halves of array
     * @param source - array of ints to be sorted
     * @param leftStart - starting index of left half
     * @param mid - mid point within entire array
     * @param rightEnd - ending index of right half
     */
    public static void merge(int[] source, int leftStart, int mid, int rightEnd)
    {
        int[] temp = new int[rightEnd - leftStart + 1];

        int left = leftStart,       // starting index of left half
                right = mid + 1,    // starting index of right half
                index = 0;          // index of temp array

        while (left <= mid || right <= rightEnd)        // while either inbounds
        {
            if (left > mid)
            {
                temp[ index ] = source[ right ];
                right++;
            }
            else if (right > rightEnd)
            {
                temp[ index ] = source[ left ];
                left++;
            }
            else if ( source[ left ] < source[ right ])
            {
                temp[ index ] = source[ left ];
                left++;
            }
            else        // if right element is less than left element
            {
                temp[ index ] = source[ right ];
                right++;
            }
            index++;
        }

        // put sorted elements back into given array
        for (int k = leftStart; k <= rightEnd; k++)
        {
            source[ k ] = temp[ k - leftStart];
        }
    }


}   // end of class
