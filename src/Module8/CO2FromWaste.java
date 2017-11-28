package Module8;

/**
 * Creates a CO2FromWaste class that calculates the amount of
 * CO2 produced in a year from waste by a household and compares
 * how recycling can reduce the CO2 footprint.
 *
 * @author Denielle Kirk Abaquita
 * @version 27 November 2017
 */

public class CO2FromWaste {

    // Private Instance Variables
    private int myNumPeople;
    private boolean myPaper, myPlastic, myGlass, myCans;
    private double myTotalEmission = 0, myReduction = 0, myNetEmission = 0;

    /**
     * Constructor for CO2FromWaste
     * @param numPeople - number of people in the household
     * @param paper - is paper recycled
     * @param plastic - is plastic recycled
     * @param glass - is glass recycled
     * @param cans - are cans recycled
     */
    public CO2FromWaste(int numPeople, boolean paper,
                        boolean plastic, boolean glass, boolean cans) {

        myNumPeople = numPeople;
        myPaper = paper;
        myPlastic = plastic;
        myGlass = glass;
        myCans = cans;

    }   // end of constructor


    public int getNumPeople() {
        return myNumPeople;
    }

    public boolean getPaper() {
        return myPaper;
    }

    public boolean getPlastic() {
        return myPlastic;
    }

    public boolean getGlass() {
        return myGlass;
    }

    public boolean getCans() {
        return myCans;
    }

    public double getTotalEmission() {
        return myTotalEmission;
    }

    public double getReduction() {
        return myReduction;
    }

    public double getNetEmission() {
        return myNetEmission;
    }


    /**
     * Mutator method that calculates the gross waste emission
     */
    public void calcTotalEmission() {

        myTotalEmission = myNumPeople * 1018;       // 1018 lbs of emission per person

    }

    /**
     * Mutator method that calculates the amount of waste reduction based on recycling
     */
    public void calcReduction() {

        // total reduction per person if paper, plastic, glass, or cans are recycled
        if (myPaper) {
            myReduction += (184 * myNumPeople);
        }
        if (myPlastic) {
            myReduction += (25.6 * myNumPeople);
        }
        if (myGlass) {
            myReduction += (46.6 * myNumPeople);
        }
        if (myCans) {
            myReduction += (165.8 * myNumPeople);
        }

    }

    /**
     * Mutator method that calculates the net emission from waste and reduction
     */
    public void calcNetEmission() {

        myNetEmission = myTotalEmission - myReduction;  // calculates net emission

    }
}
