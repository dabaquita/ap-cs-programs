package Module13;

/**
 * Tests the Terrain.java class along with
 * subsequent subclasses.
 *
 * @author Denielle Kirk Abaquita
 * @version 29 January 2018
 */

public class GameTerrainTester {

    // Main Method
    public static void main(String[] args) {

        // Variable declarations and initializations
        Terrain terrain = new Terrain(400, 500);
        Forest forest = new Forest(200, 300, 23);
        Mountain mountain = new Mountain(560, 730, 7);
        WinterMountain winterMountain = new WinterMountain(630, 440, 4, 12.4);
        Plain plains = new Plain(540, 470, 56);
        GrassyPlain grassPlains = new GrassyPlain(370, 460, 43, "green");

        // Output
        System.out.println("\n" + terrain.getTerrainSize() +
                            "\n\n" + forest.getAttributes() +
                            "\n\n" + mountain.getAttributes() +
                            "\n\n" + winterMountain.getInfo() +
                            "\n\n" + plains.getAttributes() +
                            "\n\n" + grassPlains.getInfo());


    }


}
