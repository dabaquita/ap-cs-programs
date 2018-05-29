package Module17.SelectionSort;

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
     * @param order - 1: ascending, 2: descending
     * @return newly sorted array
     */
    public static Movie[] sortByTitle(Movie[] source, int order)
    {
        if (order == 1)
        {
            for ( int i = source.length - 1; i > 0; i-- )
            {
                int maxPosition = 0;

                // Loops to find the max int
                for (int k = 1; k <= i; k++)
                {
                    if (source[k].getTitle().compareTo(source[maxPosition].getTitle()) > 0)
                    {
                        maxPosition = k;
                    }
                }

                // Swaps the last element with the max element
                Movie temp = source[i];                   // last element
                source[i] = source[maxPosition];        // places max element in last position
                source[maxPosition] = temp;             // places last element in the other position
            }

        }
        else if (order == 2)
        {
            for (int i = source.length -1; i > 0; i--)
            {
                int minPosition = 0;

                for (int k = 1; k <= i; k++)
                {
                    if (source[k].getTitle().compareTo(source[minPosition].getTitle()) < 0)
                    {
                        minPosition = k;
                    }
                }

                // Swaps the last element with the min element
                Movie temp = source[i];                   // last element
                source[i] = source[minPosition];        // places min element in last position
                source[minPosition] = temp;             // places last element in the other position
            }

        }

        return source;
    }

    /**
     * Sorts an array by the year using insertion sort algorithm
     * @param source - an array of movie objects
     * @param order - 1: ascending, 2: descending
     * @return newly sorted array
     */
    public static Movie[] sortByYear(Movie[] source, int order)
    {
        if (order == 1)
        {
            for ( int i = source.length - 1; i > 0; i-- )
            {
                int maxPosition = 0;

                // Loops to find the max int
                for (int k = 1; k <= i; k++)
                {
                    if (source[k].getYear() > source[maxPosition].getYear())
                    {
                        maxPosition = k;
                    }
                }

                // Swaps the last element with the max element
                Movie temp = source[i];                   // last element
                source[i] = source[maxPosition];        // places max element in last position
                source[maxPosition] = temp;             // places last element in the other position
            }

        }
        else if (order == 2)
        {
            for (int i = source.length -1; i > 0; i--)
            {
                int minPosition = 0;

                for (int k = 1; k <= i; k++)
                {
                    if (source[k].getYear() < source[minPosition].getYear())
                    {
                        minPosition = k;
                    }
                }

                // Swaps the last element with the min element
                Movie temp = source[i];                   // last element
                source[i] = source[minPosition];        // places min element in last position
                source[minPosition] = temp;             // places last element in the other position
            }

        }

        return source;
    }

    /**
     * Sorts an array by the studio using insertion sort algorithm
     * @param source - an array of movie objects
     * @param order - 1: ascending, 2: descending
     * @return newly sorted array
     */
    public static Movie[] sortByStudio(Movie[] source, int order)
    {
        if (order == 1)
        {
            for ( int i = source.length - 1; i > 0; i-- )
            {
                int maxPosition = 0;

                // Loops to find the max int
                for (int k = 1; k <= i; k++)
                {
                    if (source[k].getStudio().compareTo(source[maxPosition].getStudio()) > 0)
                    {
                        maxPosition = k;
                    }
                }

                // Swaps the last element with the max element
                Movie temp = source[i];                   // last element
                source[i] = source[maxPosition];        // places max element in last position
                source[maxPosition] = temp;             // places last element in the other position
            }

        }
        else if (order == 2)
        {
            for (int i = source.length -1; i > 0; i--)
            {
                int minPosition = 0;

                for (int k = 1; k <= i; k++)
                {
                    if (source[k].getStudio().compareTo(source[minPosition].getStudio()) < 0)
                    {
                        minPosition = k;
                    }
                }

                // Swaps the last element with the min element
                Movie temp = source[i];                   // last element
                source[i] = source[minPosition];        // places min element in last position
                source[minPosition] = temp;             // places last element in the other position
            }

        }

        return source;
    }

}
