package Module8;

/**
 * To create a reusable object class.
 *
 * @author Denielle Kirk Abaquita
 * @version 22 November 2017
 */

public class DogV8 {
    private String myName;
    private String myBreed;
    private double myWeight;
    private boolean myCleanliness;

    // Constructors
    public DogV8() {

    }

    public DogV8(String name, String breed) {

        // initialize private variables
        myName = name;
        myBreed = breed;

    }

    public DogV8(String name, String breed, double weightKG, boolean isClean) {

        // initialize all private variables
        myName = name;
        myBreed = breed;
        myWeight = weightKG;
        myCleanliness = isClean;

    }


    // Methods //

    // sets instance variables
    public void setName(String name) {
        myName = name;
    }

    public void setBreed(String breed) {
        myBreed = breed;
    }

    public void setWeight(double weight) {
        myWeight = weight;
    }

    public void setCleanliness(boolean isClean) {
        myCleanliness = isClean;
    }


    // gets instance variables
    public String getName() { return myName; }
    public String getBreed() {
        return myBreed;
    }

    public double getWeight() {
        return myWeight;
    }

    public boolean getCleanliness() {
        return myCleanliness;
    }


    // toString() method to display all instance variables
    public String toString() {
        return myName + " " + myBreed + " " + myWeight + " " + myCleanliness;
    }


    // Decreases the weight and changes cleanliness to false
    public void fetch() {

        myWeight -= 0.01;
        myCleanliness = false;

    }   // end of fetch()

    // Decreases the weight depending on distance of object and changes cleanliness
    public void fetch(int distanceInMeters) {

        myWeight -= (0.01 * distanceInMeters);
        myCleanliness = false;

    }   // end of fetch()

    // Increases weight
    public void eatFood() {

        myWeight += 0.02;       // increments weight by 0.02 KG

    }   // end of eatFood()

    // Changes cleanliness to true
    public void takeBath() {

        myCleanliness = true;

    }   // end of takeBath()


}   // end of class
