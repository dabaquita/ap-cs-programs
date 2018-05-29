package Module16.Project1604;

/**
 * To evaluate the results of a mock
 * election with an array.
 *
 * @author Denielle Kirk Abaquita
 * @version 8 March 2018
 */

public class ElectionTesterV7 {

    /**
     * Traverses through an array of Candidates to print:
     *      - prints out to string of each element
     * @param array - of Candidate objects
     */
    public static void printCandidates(Candidate[] array)
    {
        for(Candidate person: array)
        {
            if (person != null)
            {
                System.out.println(person);         // implicit call to the toString method
            }

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
            if (person != null)
            {
                voteCount += person.getVotes();
            }
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
            if (person != null)
            {
                if (person.getName().equals(nameToFind))
                {
                    person.setName(newName);
                }
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
            if (person != null)
            {
                if (person.getName().equals(nameToFind))
                {
                    person.setVotes(newVotes);
                }
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
            if (person != null)
            {
                if ( (person.getName().equals(nameToFind)))
                {
                    person.setName(newName);
                    person.setVotes(newVotes);
                }
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
     * Deletes a candidate object at a specified location and places null at the last index of array
     * @param array - list of Candidate objects
     * @param position - position used to delete a specific candidate
     */
    public static void deleteLocation(Candidate[] array, int position)
    {
        if ( (position >= 0) && (position < array.length))
        {
            for (int i = position; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = null;
            System.out.println("\n<<< Delete location " + position + " >>>");
        }
    }

    /**
     * Finds a particular candidate with a specific name and deletes it
     * @param array - list of Candidate objects
     * @param nameToFind - the name of the candidate to be deleted
     */
    public static void deleteCandidate(Candidate[] array, String nameToFind)
    {
        int position = 0;
        int index;

        // Finds the position of the candidate to be found
        for (index = 0; index < array.length; index++)
        {
            if ( (array[index] != null) && (array[index].getName().equals(nameToFind)) ) {     // if the element is real
                position = index;
                break;                                          // breaks the for loop
            } else if (array[index] == null) {                  // if the element is null
                position = -1;
                break;                                          // breaks the for loop
            }
        }

        // Deletes the candidate
        if ( (index !=  array.length) && (position >= 0))
        {
            // Moves items up array and get rid of the candidate
            for (index = position; index < array.length - 1; index++)
            {
                array[index] = array[index + 1];
            }
            array[array.length - 1] = null;                     // set the last element to null
            System.out.println("\n<<< Delete " + nameToFind + " >>>");
        }
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
            if (person != null)
            {
                System.out.printf("%-20s%20d%20.2f\n", person.getName(), person.getVotes(),
                        (person.getVotes() / totalVotes) * 100);
            }
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
