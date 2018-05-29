package Module16.Project1604;

/**
 * Purpose:  This class defines a Candidate by its name and number of votes.
 *
 * @author < your name >
 * @version < today's date >
 */

public class Candidate
{
    // instance variables
    private int numVotes;
    private String name;

    // Default
    public Candidate() {

    }

    // Constructor for objects of class Candidate
    public Candidate(String name, int numVotes)
    {
        // initialize instance variables
        this.name = name;
        this.numVotes = numVotes;
    }

    public String getName()
    {
        return name;
    }

    public int getVotes()
    {
        return numVotes;
    }

    public void setVotes(int n)
    {
        numVotes = n;
    }

    public void setName(String n)
    {
        name = n;
    }

    public String toString()
    {
        return name + " received " + numVotes + " votes.";
    }
}
