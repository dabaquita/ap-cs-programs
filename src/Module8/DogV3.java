package Module8;

/**
 * To define an implementation class for a dog.
 *
 * @author Denielle Kirk Abaquita
 * @version 6 November 2017
 */

public class DogV3 {

    // Default constructor
    public DogV3() {

    }


    // Methods
    public static boolean isDogBarking(boolean catPurr) {

        boolean dogIsBarking;

        if (catPurr) {                              // if a cat purrs, the dog barks
            return dogIsBarking = true;
        } else {
            return dogIsBarking = false;
        }

    }   // end of isDogBarking()

    public static boolean isDogFetching(boolean ballThrown) {

        boolean dogIsFetching;

        if (ballThrown) {                           // if a ball is thrown, the dog fetches
            return dogIsFetching = true;
        } else {
            return dogIsFetching = false;
        }

    }   // end of isDogFetching()


    // Main Method
    public static void main(String[] args) {

        // Variables
        boolean catPurr = true;                     // simulates if cat purrs to trigger bark
        boolean throwBall = true;                   // simulates ball thrown to trigger fetch
        DogV3 kevinTheDog = new DogV3();            // Kevin the Virtual Dog!
        String response = null;

        // Processing
        boolean isDogBarking = kevinTheDog.isDogBarking(catPurr);
        boolean isDogFetchingBall = kevinTheDog.isDogFetching(throwBall);

        // Output Processing
        System.out.printf("%30s", "Kevin the Dog");

        if (isDogBarking && isDogFetchingBall) {

            response = "Barking & Fetching";        // Kevin's response to a cat purr and thrown ball

        }

        System.out.println("\n--------------------------------------------------");
        System.out.printf("%15s%15s%15s", "Cat Purred?", "Ball Thrown?", "Response");
        System.out.println("\n--------------------------------------------------");
        System.out.printf("%12s%13s%25s", catPurr, throwBall, response);

    }

}
