package Module16.Project1603;

import Module16.Project1602.Candidate;

import java.util.ArrayList;
import java.util.List;

/**
 * To evaluate the results of a mock
 * election with an array list.
 *
 * @author Denielle Kirk Abaquita
 * @version 6 March 2018
 */

public class ElectionTesterV6 {

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

        // Testing the change of candidates' names and votes
        changeName(candidates, "Antonio Sclafani", "Denielle Abaquita");
        createOutput(candidates);

        changeVotes(candidates, "Dylan Murphy", 6800);
        createOutput(candidates);

        changeBoth(candidates, "Quintin Richards", "Bob Dylan", 3200);
        createOutput(candidates);
    }
}

