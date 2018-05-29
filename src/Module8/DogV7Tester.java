package Module8;

/**
 * Tests the DogV7 class by instantiating the object
 *
 * @author Denielle Kirk Abaquita
 * @version 16 November 2017
 */

public class DogV7Tester {

    // Main method
    public static void main(String[] args) {

        // Instantiating DogV7 objects
        DogV7 Lunchbox = new DogV7("Yorkie", 5.2, true);
        DogV7 Max = new DogV7("Pug", 4.3, false);
        DogV7 Allie = new DogV7("Husky", 18.4, true);


        // Output BEFORE exercise and eating and bathing
        System.out.printf("%30s", "Dogs: Day One");
        System.out.printf("\n%10s%10s%15s%10s", "Name", "Breed", "Weight(KG)", "Clean");
        System.out.print("\n-----------------------------------------------");

        System.out.printf("\n%10s%10s%15.2f%10s", "Lunchbox",
                            Lunchbox.getBreed(), Lunchbox.getWeight(), Lunchbox.getCleanliness());
        System.out.printf("\n%10s%10s%15.2f%10s", "Max",
                Max.getBreed(), Max.getWeight(), Max.getCleanliness());
        System.out.printf("\n%10s%10s%15.2f%10s\n", "Allie",
                Allie.getBreed(), Allie.getWeight(), Allie.getCleanliness());


        // Playing with Lunchbox (fetching, eating, bathing)
        for (int i = 0; i < 3; i++) {

            Lunchbox.fetch(2);      // ran a distance of 2 meters per fetch

        }

        Lunchbox.eatFood();         // ate food after playing
        Lunchbox.takeBath();        // took a bath after playing


        // Playing with Max (fetching, eating, bathing)
        for (int i = 0; i < 5; i++) {

            Max.eatFood();          // ate food... a lot of food

        }

        Max.fetch();                // played fetch once, but didn't bathe


        // Playing with Allie (fetching, eating, bathing)
        for (int i = 0; i < 4; i++) {

            Allie.eatFood();
            Allie.fetch(2);
            Allie.eatFood();
            Allie.eatFood();
            Allie.eatFood();

        }

        Allie.takeBath();           // Allie bathed
        Allie.fetch();              // But Allie played fetch one more time


        // Output AFTER exercise and eating and bathing
        System.out.printf("\n%30s", "Dogs: Day Two");
        System.out.printf("\n%10s%10s%15s%10s", "Name", "Breed", "Weight(KG)", "Clean");
        System.out.print("\n-----------------------------------------------");

        System.out.printf("\n%10s%10s%15.2f%10s", "Lunchbox",
                Lunchbox.getBreed(), Lunchbox.getWeight(), Lunchbox.getCleanliness());
        System.out.printf("\n%10s%10s%15.2f%10s", "Max",
                Max.getBreed(), Max.getWeight(), Max.getCleanliness());
        System.out.printf("\n%10s%10s%15.2f%10s", "Allie",
                Allie.getBreed(), Allie.getWeight(), Allie.getCleanliness());

    }

}
