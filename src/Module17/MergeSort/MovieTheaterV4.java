package Module17.MergeSort;

import Module17.InsertionSort.Movie;

/**
 * To use an insertion sort algorithm on an
 * array of Movie objects.
 *
 * @author Denielle Kirk Abaquita
 * @version 28 March 2018
 */

public class MovieTheaterV4 {

    public static void main(String[] args)
    {
        Movie[] theater =
                { new Movie("Jumanji", 1995, "TriStar Pictures"),
                        new Movie("Black Panther", 2018, "Marvel Studios"),
                        new Movie("The Theory of Everything", 2014, "Working Title Films"),
                        new Movie("Dodgeball: A True Underdog Story", 2004, "Red Hour Films"),
                        new Movie("Forrest Gump", 1994, "Wendy Finerman Productions"),
                        new Movie("Beauty and the Beast", 2017, "Disney"),
                        new Movie("Bruce Almighty", 2003, "Spyglass Entertainment"),
                        new Movie("A Knight's Tale", 2001, "Columbia Pictures"),
                        new Movie("Insidious", 2010, "Blumhouse Productions"),
                        new Movie("Jurassic Park", 1993, "Amblin Entertainment")
                    };

        // Prints out each movie
        printMovies(theater);

        // Sorts using titles

        System.out.println("\nMovies sorted in ascending order (By Title):");
        mergeSortTitle(theater, 0, theater.length - 1);
        printMovies(theater);

        System.out.println("\nMovies sorted in ascending order (By Year):");
        mergeSortYear(theater, 0, theater.length - 1);
        printMovies(theater);

        System.out.println("\nMovies sorted in ascending order (By Studio):");
        mergeSortStudio(theater, 0, theater.length - 1);
        printMovies(theater);

    }

    /**
     * Prints an array of movies
     * @param array - array of movie objects
     */
    public static void printMovies(Movie[] array)
    {
        System.out.printf("\n%30s\n", "Movies");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");

        for (Movie movie: array) {
            System.out.println(movie.getTitle() + " " + "(" + movie.getYear() + ") from " +
                                movie.getStudio() + "\n");
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    /**
     * Sorts an array using merge sort by title
     * @param array - unsorted array
     * @param left - starting index
     * @param right - ending index
     */
    public static void mergeSortTitle( Movie[] array, int left, int right)
    {
        if (left >= right )                         // checks boundaries
            return;

        int mid = (left + right) / 2;               // gets the mid point of array

        mergeSortTitle( array, left, mid );         // recursively splits the left half into two and so on
        mergeSortTitle( array, mid + 1, right );    // recursively splits the right half into two and so on

        mergeByTitle( array, left, mid, right);     // sorts array by title and merges halves
    }

    /**
     * Sorts an using using merge sort by year
     * @param array - unsorted array
     * @param left - starting index
     * @param right - ending index
     */
    public static void mergeSortYear( Movie[] array, int left, int right)
    {
        if (left >= right)
            return;

        int mid = (left + right) / 2;

        mergeSortYear( array, left, mid);
        mergeSortYear( array, mid + 1, right);

        mergeByYear( array, left, mid, right);
    }

    /**
     * Sorts an array using merge sort by studio
     * @param array - unsorted array
     * @param left - starting index
     * @param right - ending index
     */
    public static void mergeSortStudio( Movie[] array, int left, int right)
    {
        if (left >= right)
            return;

        int mid = (left + right) / 2;

        mergeSortStudio( array, left, mid );
        mergeSortStudio( array, mid + 1, right);

        mergeByStudio( array, left, mid, right );
    }

    /**
     * Sorts an array using two halves and merges it into one
     * @param array - unsorted array
     * @param leftStart - the left most index
     * @param mid - the middle index
     * @param rightEnd - the right most index
     */
    public static void mergeByTitle( Movie[] array, int leftStart, int mid, int rightEnd)
    {
        Movie[] temp = new Movie[ rightEnd - leftStart + 1];

        int left = leftStart,       // the left starting index of the left half of the array
            right = mid + 1,        // the right starting index of the right half of array
            index = 0;              // the overall index of the temporary array

        while ( left <= mid || right <= rightEnd )      // while variables are in bounds
        {
            if ( left > mid )                           // if finished processing left half
            {
                temp[ index ] = array[ right ];         // place right element into temp array
                right++;
            }
            else if ( right > rightEnd )                // if finished processing right half
            {
                temp[ index ] = array[ left ];          // place left element into temp array
                left++;
            }
            else if ( array[ left ].getTitle().compareTo( array[ right ].getTitle() ) < 0)
            {   // both halves have values, so compare if left movie's title is less than right movie's title
                temp[ index ] = array[ left ];          // left goes into array before right
                left++;
            }
            else                                        // both halves have values, so compare is left > right
            {
                temp[ index ] = array[ right ];         // right goes into array before left
                right++;
            }
            index++;        // element has been added at previous index, so increment to go to next
        }

        // put sorted elements back into given array from left to right
        for (int k = leftStart; k <= rightEnd; k++)
        {
            array[ k ] = temp[ k - leftStart ];
        }
    }

    /**
     * Merge sorts by year
     * @param array - unsorted array
     * @param leftStart - starting index
     * @param mid - midpoint of the array
     * @param rightEnd - ending index
     */
    public static void mergeByYear( Movie[] array, int leftStart, int mid, int rightEnd)
    {
        Movie[] temp = new Movie[ rightEnd - leftStart + 1 ];

        int left = leftStart,               // starting index of left half
                right = mid + 1,            // starting index of right half
                index = 0;                  // index of the temporary array

        while ( left <= mid || right <= rightEnd )      // while left or right are in bounds
        {
            if (left > mid)                             // this means that left half is done being sorted
            {
                temp[ index ] = array[ right ];         // place right into temp array
                right++;
            }
            else if (right > rightEnd )                 // this means that the right half is done being sorted
            {
                temp[ index ] = array[ left ];          // place left into temp array
                left++;
            }
            else if ( array[ left ].getYear() < array[ right ].getYear())
            {   // both halves have values, so compare if year on left half is less than right half
                temp[ index ] = array[ left ];          // left goes into array before right
                left++;
            }
            else                                        // if year on right half is less than left
            {
                temp[ index ] = array[ right ];         // right goes into array before left
                right++;
            }
            index++;        // element has been added at previous index, so increment to go to next
        }

        // put sorted elements back into given array form left to right
        for (int k = leftStart; k <= rightEnd; k++)
        {
            array[ k ] = temp[ k - leftStart ];
        }
    }

    /**
     * Merge sorts by studio
     * @param array - unsorted array
     * @param leftStart - starting index
     * @param mid - middle index
     * @param rightEnd - ending index
     */
    public static void mergeByStudio( Movie[] array, int leftStart, int mid, int rightEnd )
    {
        Movie[] temp = new Movie[ rightEnd - leftStart + 1 ];

        int left = leftStart,                           // starting index of left half
                right = mid + 1,                        // starting index of right half
                index = 0;                              // index of temporary array

        while (left <= mid || right <= rightEnd )       // while either is in-bounds
        {
            if (left > mid)                             // if left is sorted
            {
                temp[ index ] = array[ right ];         // place element of right index at right half
                right++;
            }
            else if (right > rightEnd)                  // if right is sorted
            {
                temp[ index ] = array[ left ];          // place left element of left half into array
                left++;
            }
            else if ( array[ left ].getStudio().compareTo( array[ right ].getStudio() ) < 0)
            {   // both halves need to be sorted, so if left's studio is less than right's studio
                temp[ index ] = array[ left ];          // left goes into array before right
                left++;
            }
            else                                        // if right's studio is less than left's studio
            {
                temp[ index ] = array[ right ];         // right goes into array before left
                right++;
            }
            index++;        // element has been added at previous index, so increment to go to next position
        }

        // put sorted elements back into given array from left to right
        for (int k = leftStart; k <= rightEnd; k++)
        {
            array[ k ] = temp[ k - leftStart ];
        }
    }

}
