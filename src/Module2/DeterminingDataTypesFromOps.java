package Module2;

/**
 * Denielle Kirk Abaquita
 * 11 August 2017
 *
 * These are notes for determination of data
 * types after code execution.
 *
 */

public class DeterminingDataTypesFromOps {

    public static void main(String[] args) {

        // What is the value of z: pay attention to
        // original variable data type assignments
        double x = 2.5;
        double y = (2 * x);
        double z;

        z = (int)(x + (2 * y));
        System.out.println(z); // Data type should be double


        // What is the value of z: pay attention to ERRORS
        /** int x = 2.5;  // This is not valid
         *  int y = (2 * x);
         *  int z = y / 2;
         */




    }
}
