package Module18.BinarySearch;

import java.util.ArrayList;

/**
 * To test the music.java class using
 * sequential searching.
 *
 * @author Deniele Kirk Abaquita
 * @version 4 April 2018
 */

public class MusicTesterV3 {

    /** MAIN METHOD */
    public static void main(String[] args)
    {
        Music[] playlist = {

                new Music("Livin' On a Prayer", 1986, "Bon Jovi"),
                new Music("Careless Whisper", 1986, "Wham!"),
                new Music("Paradise", 2011, "Coldplay"),
                new Music("Viva la Vida", 2008, "Coldplay"),
                new Music("Not Afraid", 2010, "Eminem"),
                new Music("Fourth of July", 2015, "Fall Out Boy"),
                new Music("Marathon", 2016, "Lost Kings"),
                new Music("Closing Time", 1998, "Semisonic"),
                new Music("Man in the Mirror", 1987, "Michael Jackson"),
                new Music("Imagine", 1971, "John Lennon")

        };

        // Before any operation or searching
        printPlaylist(playlist);

        // By title
        System.out.println("\nFinding and Sorting by Title: ");
        sortTitle(playlist);
        printPlaylist(playlist);

        System.out.println("\"Livin' on a Prayer\": " + findTitle(playlist, "Livin' On a Prayer"));
        System.out.println("\"Don't Stop Believin'\": " + findTitle(playlist, "Don't Stop Believin'"));

        // By year
        System.out.println("\nFinding and Sorting by Year: " );
        sortYear(playlist);                           // sorts array to make sure it's ascending
        printPlaylist(playlist);

        System.out.println("\n1986: ");
        printPlaylist(findYear(playlist, 1986));

        System.out.println("\n2004: ");
        printPlaylist(findYear(playlist, 2004));

        // By name
        System.out.println("\nFinding and Sorting by Name: " );
        sortArtist(playlist);
        printPlaylist(playlist);

        System.out.println("\nColdplay: ");
        printPlaylist(findArtist(playlist, "Coldplay"));

        System.out.println("\nLinkin Park: ");
        printPlaylist(findArtist(playlist, "Linkin Park"));

    }

    /**
     * Prints out each element within a music array
     * @param array - array to be printed
     */
    public static void printPlaylist(Music[] array)
    {
        System.out.printf("\n%-25s %4s   %-20s \n", "Title", "Year", "Artist");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < array.length; i++)
        {
            if ( array[i] != null )
                System.out.println( array[ i ].toString() );
        }
    }

    /**
     * Insertion sort algorithm to sort a list of songs by title
     * @param source - original unsorted array
     */
    public static void sortTitle(Music[] source)
    {
        Music[] dest = new Music[source.length];

        for (int i = 0; i < source.length; i++)
        {
            int k = i;
            int insertIndex = 0;
            Music next = source[i];
            String nextTitle = next.getTitle();

            while (k > 0 && insertIndex == 0)
            {
                if ( nextTitle.compareTo(dest[ k - 1 ].getTitle()) > 0)
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

        // Transfer dest back to source
        for (int i = 0; i < source.length; i++)
        {
            source[ i ] = dest[ i ];
        }
    }

    /**
     * Insertion sort algorithm to sort a list of songs by year
     * @param source - unsorted array
     */
    public static void sortYear(Music[] source)
    {
        Music[] dest = new Music[source.length];

        for (int i = 0; i < source.length; i++)
        {
            int k = i;
            int insertIndex = 0;
            Music next = source[ i ];
            int nextYear = next.getYear();

            while (k > 0 && insertIndex == 0)
            {
                if ( nextYear > dest[k - 1].getYear() )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[k] = dest[ k - 1 ];
                }
                k--;
            }
            dest[insertIndex] = next;
        }

        // Transfer dest back to source
        for (int i = 0; i < source.length; i++)
        {
            source[ i ] = dest[ i ];
        }
    }

    /**
     * Insertion sort algorithm to sort a list of songs by artist
     * @param source - unsorted array
     */
    public static void sortArtist(Music[] source)
    {
        Music[] dest = new Music[source.length];

        for (int i = 0; i < source.length; i++)
        {
            int k = i;
            int insertIndex = 0;
            Music next = source[ i ];
            String nextArtist = next.getArtist();

            while (k > 0 && insertIndex == 0)
            {
                if ( nextArtist.compareTo(dest[k - 1].getArtist()) > 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[k] = dest[ k - 1 ];
                }
                k--;
            }
            dest[insertIndex] = next;
        }

        // Transfer dest back to source
        for (int i = 0; i < source.length; i++)
        {
            source[ i ] = dest[ i ];
        }
    }

    /**
     * Binary searches for a song based off of the title
     * @param array - array with a list of songs
     * @param title - the title to be found
     * @return the song's position
     */
    public static int findTitle(Music[] array, String title)
    {
        int high = array.length;
        int low = -1;
        int probe;

        while ( high - low > 1 )
        {
            probe = (high + low) / 2;   // position probe at the middle of high and low (search area)

            if ( title.compareTo(array[probe].getTitle()) < 0 )   // if target title is less than probe's title
            {
                high = probe;       // move the high limit to the value of probe
            } else {
                low = probe;        // move the low limit to the value of probe
            }
        }

        if (low >= 0 && title.equals(array[ low ].getTitle()))
            return low;
        else
            return -1;
    }

    /**
     * Binary searches for songs based off of the year
     * @param array - list of music
     * @param year - year to be used to find songs
     * @return - the list of songs found
     */
    public static Music[] findYear(Music[] array, int year)
    {
        Music[] list = new Music[array.length];

        int high = array.length;
        int low = -1;
        int probe;
        int i = 0;

        while ( high - low > 1 )
        {
            probe = (high + low) / 2;   // position probe at the middle of high and low (search area)

            if ( year < array[probe].getYear() )   // if target title is less than probe's title
            {
                high = probe;       // move the high limit to the value of probe
            } else {
                low = probe;        // move the low limit to the value of probe
            }

            if (low >= 0 && year == array[low].getYear())
            {
                list[i] = array[ low ];
                i++;
            }
        }

        return list;
    }

    /**
     * Binary searches for songs based off of the artist
     * @param array - list of music
     * @param name - name of the artist
     * @return - list of songs found
     */
    public static Music[] findArtist(Music[] array, String name)
    {
        Music[] list = new Music[array.length];

        int high = array.length;
        int low = -1;
        int probe;
        int i = 0;

        while ( high - low > 1 )
        {
            probe = (high + low) / 2;   // position probe at the middle of high and low (search area)

            if ( name.compareTo(array[probe].getArtist()) < 0 )   // if target title is less than probe's title
            {
                high = probe;       // move the high limit to the value of probe
            } else {
                low = probe;        // move the low limit to the value of probe
            }

            if (low >= 0 && name.equals(array[ low ].getArtist()))
            {
                list[ i ] = array[ low ];
                i++;
            }
        }

        return list;
    }

}
