package Module9;

/**
 * To calculate the trajectory of a projectile based
 * on launch angles and launch velocities.
 *
 * @author Denielle Kirk Abaquita
 * @version 5 December 2017
 */

public class Catapult {

    // Private instance variables
    private double mySpeed;                             // in KPH
    private double myAngle;                             // in degrees
    private double myDistanceTraveled;                  // in meters

    /**
     * Default onstructor object
     */
    Catapult() {

    }

    /**
     * Constructor object for a projectile
     * @param speed in KPH
     * @param angle in degrees
     */
    Catapult(double speed, double angle) {

        mySpeed = speed;
        myAngle = angle;

    }

    /**
     * Getter method
     * @return the speed of the object in KPH
     */
    public double getSpeed() {
        return mySpeed;
    }

    /**
     * Getter method
     * @return the angle of the object in degrees
     */
    public double getAngle() {
        return myAngle;
    }

    /**
     * Getter method
     * @return the distance traveled by the object in meters
     */
    public double getDistance() {
        return myDistanceTraveled;
    }

    /**
     * Mutator that calculates the distance traveled by the object from angle and speed
     */
    public void calcDistance() {

        // convert speed to m/s
        double speedMS = (mySpeed * 1000) / (60 * 60);

        // incorporates the r equation for distance
        myDistanceTraveled = Math.pow(speedMS, 2) * Math.sin(2 * Math.toRadians(myAngle)) / 9.8;

    }

}
