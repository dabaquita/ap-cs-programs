package Module8;

/**
 * Tests the DogV8 class by instantiating the object
 *
 * @author Denielle Kirk Abaquita
 * @version 22 November 2017
 */

public class DogV8Tester {

    // Main method
    public static void main(String[] args) {

        // Instantiating DogV8 objects
        DogV8[] kennel =
                {
                        new DogV8("Kenny", "Beagle"),
                        new DogV8("Sally", "Beagle"),
                        new DogV8("Kevin", "Beagle"),
                        new DogV8("Dan", "Beagle"),
                        new DogV8("Bear", "Beagle")
                };

        // More variables
        int randomNum;
        double max = Double.MIN_VALUE,
                min = Double.MAX_VALUE,
                sum = 0,
                average;


        // Processing
        for (int i = 0; i < kennel.length; i++) {               // randomly operates over each DogV8 object

            kennel[i].setWeight((int) (Math.random() * (13 - 8)) + 8);  // sets weight to 8 - 12 kg randomly

            randomNum = (int) (Math.random() * 2);              // creates 0 or 1 randomly
            if (randomNum == 0) {
                kennel[i].setCleanliness(true);   // sets cleanliness if randomNum is 0
            } else {
                kennel[i].setCleanliness(false);  // sets cleanliness if randomNum is 1
            }

            randomNum = (int) (Math.random() * 6);              // generates 0 - 5 to create for loop limit
            for (int j = 0; j < randomNum; j++) {

                kennel[i].fetch(randomNum);       // fetches the distance of randomNum
                kennel[i].eatFood();

                if (randomNum == 1 || randomNum == 5) {         // takes bath if randomNum is equal to 1 or 5
                    kennel[i].takeBath();
                }
            }   // end of for loop

        }   // end of for loop


        // Output
        System.out.printf("\n%30s", "Beagle Kennel");
        System.out.printf("\n%10s%10s%15s%10s", "Name", "Breed", "Weight(KG)", "Clean");
        System.out.print("\n-----------------------------------------------");

        for (DogV8 dog: kennel) {       // prints each dog and tests for weight max and min

            System.out.printf("\n%10s%10s%15.2f%10s", dog.getName(), dog.getBreed(),
                                dog.getWeight(), dog.getCleanliness());

            if (dog.getWeight() > max) {
                max = dog.getWeight();
            } else if (dog.getWeight() < min) {
                min = dog.getWeight();
            }
            sum += dog.getWeight();     // adds each weight to a sum

        }   // end of for each loop

        average = sum / kennel.length;  // calculates the average of the weights

        System.out.print("\n-----------------------------------------------");
        System.out.printf("\nMinimum: %10.2f\nMaximum: %10.2f\nAverage: %10.2f",
                            min, max, average);         // prints the min, max, and average at end

    }

}
