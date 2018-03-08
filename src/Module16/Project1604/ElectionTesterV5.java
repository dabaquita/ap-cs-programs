package Module16.Project1604;

/**
 * To evaluate the results of a mock
 * election with an array.
 *
 * @author Denielle Kirk Abaquita
 * @version 6 March 2018
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
     * Mutates the array to add an additional Candidate at a certain position within the array
     * @param array - list of Candidate objects
     * @param position - index for the placement of the new object
     * @param name - String name of the candidate
     * @param votes - int number of votes of candidate
     */
    public static void insertCandidate(Candidate[] array, int position, String name, int votes)
    {
        for (int i = array.length - 1; i > position; i--)
        {
            array[i] = array[i - 1];                    // replaces last object with previous object, last index is lost
        }

        array[position] = new Candidate(name, votes);

        System.out.println("\n<<< In position " + position + ", add " + name + ", " + votes + " votes. >>>");
    }

    /**
     * Mutates the array to insert a certain Candidate before another
     * @param array - list of Candidate objects
     * @param nameToFind - the candidate to place before
     * @param name - name of the new candidate
     * @param votes - number of votes of the new candidate
     */
    public static void insertCandidateBefore(Candidate[] array, String nameToFind, String name, int votes)
    {
        int index = 0;

        for (int i = 0; i < array.length; i++)          // finds the index of the candidate to be replaced
        {
            if (array[i].getName().equals(nameToFind))
            {
                index = i;
            }
        }

        String nameOfOriginal = array[index].getName();

        for (int i = array.length - 1; i >= index; i--)  // Replaces the last object with previous object
        {
            array[i] = array[i - 1];
        }

        array[index] = new Candidate(name, votes);      // Inserts a new candidate

        System.out.println("\n<<< Before " + nameOfOriginal + ", add " + array[index].getName() + ", " +
                            array[index].getVotes() + " >>>");
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

        // Testing the insert and replace methods
        insertCandidate(candidates, 2, "Ron Paul", 2300);
        createOutput(candidates);

        insertCandidateBefore(candidates, "Quintin Richards", "Denielle Abaquita", 7000);
        createOutput(candidates);



    }
}
