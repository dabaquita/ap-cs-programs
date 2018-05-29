package Module8;

/**
 * @purpose: This class is a client class that creates a carbon
 * dioxide footprint object that has instance variables of
 * gallons used, tons of CO2, and pounds of CO2. Additionally,
 * this program has mutator methods to calculate tons
 * of CO2 based off of gallons used and to calculate pounds
 * of CO2 from tons of CO2. Other than that, it has getter
 * methods to return gallons used, tons of CO2, and pounds
 * of CO2.
 *
 * @author AP Computer Science Module 8.09 // Denielle Kirk Abaquita
 * @version 23 November 2017
 *
 */

public class CO2FootprintV2
{
    // private instance variables
    private double myGallonsUsed, myTonsCO2, myPoundsCO2;

    /**
     * Constructor for objects of type CO2FootprintV2
     * @param gallons
     * Precondition: gallons have to be a positive value
     */
    CO2FootprintV2(double gallons)
    {
        myGallonsUsed = gallons;
    }

    /**
     * Mutator method to calculate myTonsCO2 from gallons used and 8.78 x 10^-3
     */
    public void calcTonsCO2()
    {
        myTonsCO2 = (8.78 * Math.pow(10, -3)) * myGallonsUsed;
    }

    /**
     * Mutator method to convert tons to pounds of CO2
     */
    public void convertTonsToPounds()
    {
        myPoundsCO2 = myTonsCO2 * 2205;
    }

    /**
     * Getter method to return the total amount of gallons used
     * @return total gallons used
     */
    public double getGallons()
    {
        return myGallonsUsed;
    }

    /**
     * Getter method to return the total amount of tons of CO2
     * @return total tons of CO2
     */
    public double getTonsCO2()
    {
        return myTonsCO2;
    }

    /**
     * Getter method to return the total amount of pounds of CO2
     * @return total pounds of CO2
     */
    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }
}

