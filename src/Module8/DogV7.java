package Module8;

/**
 * To create a reusable object class.
 *
 * @author Denielle Kirk Abaquita
 * @version 15 November 2017
 */

public class DogV7 {
    private String myBreed;
    private double myWeight;
    private boolean myCleanliness;

    // Constructors
    public DogV7() {

    }

    public DogV7(String breed, double weightKG, boolean isClean) {

        // initialize all pritave variables
        myBreed = breed;
        myWeight = weightKG;
        myCleanliness = isClean;

    }


    // Methods //

    // gets instance variables
    public String getBreed() {
        return myBreed;
    }

    public double getWeight() {
        return myWeight;
    }

    public boolean getCleanliness() {
        return myCleanliness;
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
