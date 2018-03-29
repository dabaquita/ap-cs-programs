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

    /**
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

    /** ACCORDING TO FLVS
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
     * Merge sort
     * @param source - array of ints to be sorted
     * @param order - 1: ascending, 2: descending
     * @return sorted array
     */
    public static int[] mergeSort(int[] source, int order)
    {


        return source;
    }



}   // end of class
