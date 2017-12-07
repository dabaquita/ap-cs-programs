package Module8;

/**
 * To calculate the average category, pressure,
 * and wind speed of Atlantic hurricanes that have
 * occurred between a given year range and to tally the
 * number of storms in each category accroding to the Saffir-
 * Simpson scale. This time, however, it will be in OOP.
 *
 * @author Denielle Kirk Abaquita
 * @version 29 November 2017
 */

public class Hurricane {

    // Private instance variables
    private int myYear;
    private String myMonth;
    private double myWindSpeed;
    private int myPressure;
    private String myName;
    private int myCategory;

    /**
     * Hurricane object contructor
     * @param year - the year that the hurricane occurred
     * @param month - the month that the hurricane occurred
     * @param windSpeed - the wind speed in mph of the hurricane
     * @param pressure - the pressure of the hurricane
     * @param name - the name of the hurricane
     */
    public Hurricane(int year, String month, double windSpeed,
                     int pressure, String name) {

        myYear = year;
        myMonth = month;
        myWindSpeed = windSpeed;
        myPressure = pressure;
        myName = name;

    }

    /**
     * Getter method for myYear
     * @return the year the hurricane occurred
     */
    public int getYear() {
        return myYear;
    }

    /**
     * Getter method for myMonth
     * @return the month the hurricane occurred
     */
    public String getMonth() {
        return myMonth;
    }

    /**
     * Getter method for myWindSpeed
     * @return the wind speed of the hurricane in mph
     */
    public double getWindSpeed() {
        return myWindSpeed;
    }

    /**
     * Getter method for myPressure
     * @return the pressure of the hurricane
     */
    public int getPressure() {
        return myPressure;
    }

    /**
     * Getter method for myName
     * @return the name of the hurricane
     */
    public String getName() {
        return myName;
    }

    /**
     * Getter method for myCategory if available
     * @return the category of the hurricane
     */
    public int getCategory() {
        return myCategory;
    }

    /**
     * Mutator method to set category value based on wind speed
     */
    public void calcCategory()  {

        if (myWindSpeed >= 74 && myWindSpeed < 95.5) {
            myCategory = 1;
        }
        if (myWindSpeed >= 95.5 && myWindSpeed < 110.5) {
            myCategory = 2;
        }
        if (myWindSpeed >= 110.5 && myWindSpeed < 129.5) {
            myCategory = 3;
        }
        if (myWindSpeed >= 129.5 && myWindSpeed < 156.5) {
            myCategory = 4;
        }
        if (myWindSpeed >= 156.5) {
            myCategory = 5;
        }

    }

    /**
     * Method to get the values of the hurricane and return it as a string
     * @return the values of the Hurricane in a String format
     */
    public String toString() {

        return myYear + "   " + myMonth + "   " + myName + "   " +
                myCategory + "   " + myPressure + "   " + myWindSpeed;

    }




}   // end of class
