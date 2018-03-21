package Module17;

import Module17.InsertionSort.Movie;

/**
 * To use an insertion sort algorithm on an
 * array of Movie objects.
 *
 * @author Denielle Kirk Abaquita
 * @version 19 March 2018
 */

public class MovieTheaterV3 {

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
        printMovies(sortByTitle(theater, 1));       // ascending order

        System.out.println("\nMovies sorted in descending order (By Title):");
        printMovies(sortByTitle(theater, 2));       // descending order

        System.out.println("\nMovies sorted in ascending order (By Year):");
        printMovies(sortByYear(theater, 1));

        System.out.println("\nMovies sorted in descending order (By Year):");
        printMovies(sortByYear(theater, 2));

        System.out.println("\nMovies sorted in ascending order (By Studio):");
        printMovies(sortByStudio(theater, 1));

        System.out.println("\nMovies sorted in descending order (By Studio):");
        printMovies(sortByStudio(theater, 2));

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
     * Sorts an array by the title using insertion sort algorithm
     * @param source - an array of movie objects
     * @param sort - 1: ascending, 2: descending
     * @return newly sorted array
     */
    public static Movie[] sortByTitle(Movie[] source, int sort)
    {
        Movie[] dest = new Movie[source.length];

        if (sort == 1)
        {
            for (int i = 0; i < source.length; i++)
            {
                Movie next = source[i];
                String nextTitle = source[i].getTitle();
                int insertIndex = 0;
                int k = i;

                while (k > 0 && insertIndex == 0)
                {
                    if ( nextTitle.compareTo(dest[k - 1].getTitle()) > 0 )    // if the next is greater than previous
                    {
                        insertIndex = k;        // assign the insert index to be where k is
                    }
                    else
                    {
                        dest[k] = dest[k -1];
                    }
                    k--;
                }
                dest[insertIndex] = next;
            }

        } else if (sort == 2) {

            for (int i = 0; i < source.length; i++)
            {
                Movie next = source[i];
                String nextTitle = source[i].getTitle();
                int insertIndex = 0;
                int k = i;

                while (k > 0 && insertIndex == 0)
                {
                    if ( nextTitle.compareTo(dest[k - 1].getTitle()) < 0 )  // if the next is less than previous
                    {
                        insertIndex = k;        // assign the insert index to be where k is
                    }
                    else
                    {
                        dest[k] = dest[k -1];
                    }
                    k--;
                }
                dest[insertIndex] = next;
            }

        } else
        {
            System.out.println("Sort value not valid. Returning original array.");
        }

        return dest;
    }

    /**
     * Sorts an array by the year using insertion sort algorithm
     * @param source - an array of movie objects
     * @param sort - 1: ascending, 2: descending
     * @return newly sorted array
     */
    public static Movie[] sortByYear(Movie[] source, int sort)
    {
        Movie[] dest = new Movie[source.length];

        if (sort == 1)                  // ascending order
        {
            for (int i = 0; i < source.length; i++)
            {
                Movie next = source[i];
                int insertIndex = 0;
                int k = i;

                while (insertIndex == 0 && k > 0)
                {
                    if ( next.getYear() > dest[k - 1].getYear())
                    {
                        insertIndex = k;            // if next movie was released later, then place it in front of previous
                    }
                    else
                    {
                        dest[k] = dest[k - 1];      // if not, then move the previous movie to the next index
                    }
                    k--;
                }
                dest[insertIndex] = next;
            }

        }
        else if (sort == 2)          // descending order
        {
            for (int i = 0; i < source.length; i++)
            {
                Movie next = source[i];
                int insertIndex = 0;
                int k = i;

                while (insertIndex == 0 && k > 0)
                {
                    if ( next.getYear() < dest[k - 1].getYear())
                    {
                        insertIndex = k;            // if next movie was released earlier, place it in front of previous
                    }
                    else
                    {
                        dest[k] = dest[k - 1];      // if not, then move the previous movie to the next index
                    }
                    k--;
                }
                dest[insertIndex] = next;
            }

        } else {
            System.out.println("Sort value not valid. Returning original array.");
        }

        return dest;
    }

    /**
     * Sorts an array by the studio using insertion sort algorithm
     * @param source - an array of movie objects
     * @param sort - 1: ascending, 2: descending
     * @return newly sorted array
     */
    public static Movie[] sortByStudio(Movie[] source, int sort)
    {
        Movie[] dest = new Movie[source.length];

        if (sort == 1)      // ascending order
        {
            for (int i = 0; i < source.length; i++)
            {
                Movie next = source[i];
                int insertIndex = 0;
                int k = i;

                while (k > 0 && insertIndex == 0)
                {
                    if ( next.getStudio().compareTo(dest[k - 1].getStudio()) > 0 )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[k] = dest[k -1];
                    }
                    k--;
                }
                dest[insertIndex] = next;
            }

        } else if (sort == 2) {     // descending order

            for (int i = 0; i < source.length; i++)
            {
                Movie next = source[i];
                int insertIndex = 0;
                int k = i;

                while (k > 0 && insertIndex == 0)
                {
                    if ( next.getStudio().compareTo(dest[k - 1].getStudio()) < 0 )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[k] = dest[k -1];
                    }
                    k--;
                }
                dest[insertIndex] = next;
            }

        } else
        {
            System.out.println("Sort value not valid. Returning original array.");
        }

        return dest;
    }

}
