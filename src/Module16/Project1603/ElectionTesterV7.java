package Module16.Project1603;

import Module16.Project1602.Candidate;

/**
 * To evaluate the results of a mock
 * election with an array.
 *
 * @author Denielle Kirk Abaquita
 * @version 8 March 2018
 */

public class ElectionTesterV5 {

    /**
     * Traverses through an array of Candidates to print:
     *      - prints out to string of each element
     * @param array - of Candidate objects
     */
    public static void printCandidates(Candidate[] array)
    {
        for(Candidate person: array)
        {
            System.out.println(person);         // implicit call to the toString method
        }
    }

    /**
     * Returns total votes for all candidates
     * @param array - array of candidates
     */
    public static int getTotalVotes(Candidate[] array)
    {
        int voteCount = 0;

        for(Candidate person: array)
        {
            voteCount += person.getVotes();
        }

        return voteCount;
    }

    /**
     * Changes the value of a specific Candidate's name
     * @param array - full of Candidate objects
     * @param nameToFind - String name that refers to a specific Candidate
     * @param newName - replacement name
     */
    public static void changeName(Candidate[] array, String nameToFind, String newName)
    {
        for (Candidate person: array)
        {
            if (person.getName().equals(nameToFind))
            {
                person.setName(newName);
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
    public static void changeVotes(Candidate[] array, String nameToFind, int newVotes)
    {
        for (Candidate person: array)
        {
            if (person.getName().equals(nameToFind))
            {
                person.setVotes(newVotes);
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
    public static void changeBoth(Candidate[] array, String nameToFind, String newName, int newVotes)
    {
        for (Candidate person: array)
        {
            if (person.getName().equals(nameToFind))
            {
                person.setName(newName);
                person.setVotes(newVotes);
            }
        }
        System.out.println("\n<<<Changing " + nameToFind + " to " + newName + ">>>");
        System.out.println("<<<Changing " + nameToFind + " number of votes to " + newVotes + ">>>");
    }
    
    /**
    * Deletes a candidate object at a specified location and places null at the last index of array
    * @param array - list of Candidate objects
    * @param position - position used to delete a specific candidate 
    */
    public static void deleteLocation(Candidate[] array, int position)
    {
        if ( (position > 0) && (position < array.length))
        {
            for (int i = position; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = null;
            System.out.println("<<< Delete location " + position + " >>>");
        }
    }
    
    /**
    * Deletes a candidate object based on the name
    * @param array - list of Candidate objects
    * @param name - name of the candidate to be deleted
    */
    public static void deleteCandidate(Candidate[] array, String name)
    {
        int position = -1; 
        
        for ( int i = 0; i < array.length - 1; i++)
        {
            if (array[i].getName().equals(name)) {
                position = i;
                break;
            } 
        }
        
        if (position != -1)
        {
            for (int i = position; i < array.length - 1; i++)
            {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = null;
            System.out.println("<<< Delete " + name + " >>>");
        }
    }
    
    /**
    * Finds a particular candidate with a specific name and deletes it 
    * @param array - list of Candidate objects
    * @param nameToFind - the name of the candidate to be deleted
    */
    public static void findAndDeleteCandidate(Candidate[] array, String nameToFind)
    {
        int position = 0;
        
        // Finds the position of the candidate to be found
        for (int i = 0; i < array.length; i++)
        {
            if ( (array[i] != null) && (array[i].getName().equals(nameToFind) ) {
                position = index;
                break;      // breaks the for loop
            } else if (array[i] == null) {
                location = -1;
                break;      // breaks the for loop
            }
        }
                
        // Deletes the candidate 
    }

    /**
     * Creates a table of the output
     */
    public static void createOutput(Candidate[] array)
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

        for(Candidate person: array)
        {
            System.out.printf("%-20s%20d%20.2f\n", person.getName(), person.getVotes(),
                    (person.getVotes() / totalVotes) * 100);
        }

        System.out.println("\nTotal number of votes cast in election: " + totalVotes);
    }


    // Main Method
    public static void main(String[] args)
    {
        Candidate[] candidates = {new Candidate("Antonio Sclafani", 6900),
                                    new Candidate("Dylan Murphy", 6899),
                                    new Candidate("Quintin Richards", 4500),
                                    new Candidate("Nicholas Szemer", 7000),
                                    new Candidate("Victoria Lanning", 6500)};

        createOutput(candidates);

        // Testing the change of candidates' names and votes
        changeName(candidates, "Antonio Sclafani", "Denielle Abaquita");
        createOutput(candidates);

        changeVotes(candidates, "Dylan Murphy", 6800);
        createOutput(candidates);

        changeBoth(candidates, "Quintin Richards", "Bob Dylan", 3200);
        createOutput(candidates);
    }
}
