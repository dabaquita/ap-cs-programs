package Module18.SequentialSearch;

import java.util.ArrayList;

/**
 * To test the music.java class using
 * sequential searching.
 *
 * @author Deniele Kirk Abaquita
 * @version 4 April 2018
 */

public class MusicTesterV1 {

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
        System.out.println("\nFinding by Title: ");
        System.out.println("\"Livin' on a Prayer\": " + findTitle(playlist, "Livin' On a Prayer"));
        System.out.println("\"Don't Stop Believin'\": " + findTitle(playlist, "Don't Stop Believin'"));

        // By year
        System.out.println("\nFinding by Year: " );
        System.out.println("\n1986: ");
        printPlaylist(findYear(playlist, 1986));

        System.out.println("\n2004: ");
        printPlaylist(findYear(playlist, 2004));

        // By name
        System.out.println("\nFinding by Name: " );
        System.out.println("\nColdplay: ");
        printPlaylist(findArtist(playlist, "Coldplay"));

        System.out.println("\n2004: ");
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
            System.out.println( array[ i ].toString() );
        }
    }

    /**
     * Sequentially searches for a song based off of the title
     * @param array - array with a list of songs
     * @param title - the title to be found
     * @return the song
     */
    public static Music findTitle(Music[] array, String title)
    {
        int i = 0;

        while (i < array.length)
        {
            if ( array[ i ].getTitle().compareTo(title) == 0)
                return array[ i ];

            i++;
        }

        return null;        // not found
    }

    /**
     * Sequentially searches for songs based off of the year
     * @param array - list of music
     * @param year - year to be used to find songs
     * @return - the list of songs found
     */
    public static Music[] findYear(Music[] array, int year)
    {
        ArrayList<Music> playlist = new ArrayList<>();

        for (int i = 0; i < array.length; i++)
        {
            if (array[ i ].getYear() == year)
            {
                playlist.add(array[i]);
            }
        }

        Music[] rtn = new Music[playlist.size()];
        for (int i = 0; i < rtn.length; i++)
        {
            rtn[ i ] = playlist.get(i);
        }

        return rtn;
    }

    /**
     * Sequentially searches for songs based off of the artist
     * @param array - list of music
     * @param name - name of the artist
     * @return - list of songs found
     */
    public static Music[] findArtist(Music[] array, String name)
    {
        ArrayList<Music> playlist = new ArrayList<>();

        for (int i = 0; i < array.length; i++)
        {
            if (array[ i ].getArtist().compareTo(name) == 0)
            {
                playlist.add(array[i]);
            }
        }

        Music[] rtn = new Music[playlist.size()];
        for (int i = 0; i < rtn.length; i++)
        {
            rtn[ i ] = playlist.get(i);
        }

        return rtn;
    }

}
