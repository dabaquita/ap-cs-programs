package Module16.Project1604;

import java.util.ArrayList;
import java.util.List;

/**
 * To evaluate the results of a mock
 * election with an array list.
 *
 * @author Denielle Kirk Abaquita
 * @version 6 March 2018
 */

public class ElectionTesterV8 {

    /**
     * Traverses through an array of Candidates to print:
     *      - prints out to string of each element
     * @param array - of Candidate objects
     */
    public static void printCandidates(List<Candidate> array)
    {
        for(int i = 0; i < array.size(); i++)
        {
            System.out.println(array.get(i));
        }
    }

    /**
     * Returns total votes for all candidates
     * @param array - array of candidates
     */
    public static int getTotalVotes(List<Candidate> array)
    {
        int voteCount = 0;

        for(int i = 0; i < array.size(); i++)
        {
            voteCount += array.get(i).getVotes();
        }

        return voteCount;
    }

    /**
     * Changes the value of a specific Candidate's name
     * @param array - full of Candidate objects
     * @param nameToFind - String name that refers to a specific Candidate
     * @param newName - replacement name
     */
    public static void changeName(List<Candidate> array, String nameToFind, String newName)
    {
        for (int i = 0; i < array.size(); i++)
        {
            if (array.get(i).getName().equals(nameToFind))
            {
                array.get(i).setName(newName);
            }
        }
        System.out.println("\n<<<Changing " + nameToFind + " to " + newName + ">>>");
    }

    /**
     * Changes the value of a specific Candidate's vote numberes
     * @param array - list of Candidate objects
     * @param nameToFind - String name that refers to a specific Candidate
     * @param newVotes - replacement number of votes
     */
    public static void changeVotes(List<Candidate> array, String nameToFind, int newVotes)
    {
        for (int i = 0; i < array.size(); i++)
        {
            if (array.get(i).getName().equals(nameToFind))
            {
                array.get(i).setVotes(newVotes);
            }
        }
        System.out.println("\n<<<Changing " + nameToFind + " number of votes to " + newVotes + ">>>");
    }

    /**
     * Changes both the values of votes and name of a specific Candidate
     * @param array - list of Candidate objects
     * @param nameToFind - String name that refers to a specific Candidate
     * @param newName - replacement name
     * @param newVotes - replacement number of votes
     */
    public static void changeBoth(List<Candidate> array, String nameToFind, String newName, int newVotes)
    {
        for (int i = 0; i < array.size(); i++)
        {
            if (array.get(i).getName().equals(nameToFind))
            {
                array.get(i).setName(newName);
                array.get(i).setVotes(newVotes);
            }
        }
        System.out.println("\n<<<Changing " + nameToFind + " to " + newName + ">>>");
        System.out.println("<<<Changing " + nameToFind + " number of votes to " + newVotes + ">>>");
    }

    /**
     * Mutates the array to add an additional Candidate at a certain position within the array
     * @param array - list of Candidate objects
     * @param position - index for the placement of the new object
     * @param name - String name of the candidate
     * @param votes - int number of votes of candidate
     */
    public static void insertCandidate(List<Candidate> array, int position, String name, int votes)
    {
        array.add(position, new Candidate(name, votes));
        array.remove(array.size() - 1);

        System.out.println("\n<<< In position " + position + ", add " + name + ", " + votes + " votes. >>>");
    }

    /**
     * Mutates the array to insert a certain Candidate before another
     * @param array - list of Candidate objects
     * @param nameToFind - the candidate to place before
     * @param name - name of the new candidate
     * @param votes - number of votes of the new candidate
     */
    public static void insertCandidateBefore(List<Candidate> array, String nameToFind, String name, int votes)
    {
        int index = 0;

        for (int i = 0; i < array.size(); i++)
        {
            if(array.get(i).getName().equals(nameToFind))
            {
                index = i;
            }
        }

        array.add(index, new Candidate(name, votes));
        array.remove(array.size() - 1);

        System.out.println("\n<<< Before " + nameToFind + ", add " + array.get(index).getName() + ", " +
                array.get(index).getVotes() + " >>>");
    }

    /**
     * Deletes a candidate object at a specified location and places null at the last index of array
     * @param array - list of Candidate objects
     * @param position - position used to delete a specific candidate
     */
    public static void deleteLocation(List<Candidate> array, int position)
    {
        array.remove(position);
        System.out.println("\n<<< Delete location " + position + " >>>");
    }

    /**
     * Finds a particular candidate with a specific name and deletes it
     * @param array - list of Candidate objects
     * @param nameToFind - the name of the candidate to be deleted
     */
    public static void deleteCandidate(List<Candidate> array, String nameToFind)
    {
        int position = 0;
        int index;

        // Finds the position of the candidate to be found
        for (index = 0; index < array.size(); index++)
        {
            if ( array.get(index).getName().equals(nameToFind) ) {
                position = index;
                break;                                          // breaks the for loop
            }
        }

        // Deletes the candidate
        if ( index !=  array.size() )
        {
            array.remove(position);
            System.out.println("\n<<< Delete " + nameToFind + " >>>");
        }
    }

    /**
     * Creates a table of the output
     */
    public static void createOutput(List<Candidate> array)
    {
        // Print out the raw data
        System.out.println("\nRaw Election Data:\n");
        printCandidates(array);

        // Calculate and print out election results
        System.out.println("\n\nElection Results:\n");
        System.out.printf("%-20s%20s%20s", "Candidate", "Votes", "% Total Votes");
        System.out.println("\n----------------------------------------------------------------\n");

        // Getting the total votes
        double totalVotes = getTotalVotes(array);

        for(int i = 0; i < array.size(); i++)
        {
            System.out.printf("%-20s%20d%20.2f\n", array.get(i).getName(), array.get(i).getVotes(),
                    (array.get(i).getVotes() / totalVotes) * 100);
        }

        System.out.println("\nTotal number of votes cast in election: " + totalVotes);
    }


    // Main Method
    public static void main(String[] args)
    {
        List<Candidate> candidates = new ArrayList<>();

        candidates.add(new Candidate("Antonio Sclafani", 6900));
        candidates.add(new Candidate("Dylan Murphy", 6899));
        candidates.add(new Candidate("Quintin Richards", 4500));
        candidates.add(new Candidate("Nicholas Szemer", 7000));
        candidates.add(new Candidate("Victoria Lanning", 6500));

        // Testing insertions
        insertCandidate(candidates, 2, "Ron Paul", 2300);
        createOutput(candidates);

        insertCandidateBefore(candidates, "Quintin Richards", "Denielle Abaquita", 7000);
        createOutput(candidates);


        // Testing deletions
        deleteLocation(candidates, 0);
        createOutput(candidates);

        deleteCandidate(candidates, "Nicholas Szemer");
        createOutput(candidates);

    }
}

