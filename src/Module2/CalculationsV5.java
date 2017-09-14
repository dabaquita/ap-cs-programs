package Module2;

/**
 *
 */

public class CalculationsV5 {

    public static void main(String[] args) {

        // Int Variables
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;
        int iNum4 = 5;
        int iNum5 = 7;

        // Double Variables
        double dNum1 = 43.21;
        double dNum2 = 3.14;

        // Addition
        System.out.println("Addition");
        System.out.println( iNum1 + " + " + iNum2 + " = " + (25 + 9));
        System.out.println( dNum1 + " + " + dNum2 + " + " + 10.0 + " = " + (43.21 + 3.14 + 10.0));
        System.out.println();

        // Subtraction
        System.out.println("Subtraction");
        System.out.println( iNum3 + " - " + iNum2 + " - " + iNum1 + " = " + (11 - 9 - 25));
        System.out.println( "3.14 - 10.0 = " + (3.14 - 10.0));
        System.out.println();

        // Multiplication
        System.out.println("Multiplication");
        System.out.println( iNum1 + " * " + iNum2 + " = " + (25 * 9));
        System.out.println( "3.14 * 10.0 * 10.0 = " + (3.14 * 10.0 * 10.0));
        System.out.println();

        // Division
        System.out.println("Division");
        System.out.println( iNum2 + " / " + iNum1 + " = " + (9 / 25));
        System.out.println( "43.21 / 10.0 = " + (43.21 / 10.0) );
        System.out.println();

        // Modulus operator
        System.out.println("Modulus");
        System.out.println( iNum3 + " % " + iNum2 + " = " + (11 % 9));
        System.out.println( "10.0 % 3.14 = " + (10.0 % 3.14));
        System.out.println();

        // 2.03 Additional int Equations
        System.out.println(iNum4 + " + " + iNum5 + " - " + iNum1 + " = " + (5 + 7 - 25));
        System.out.println(iNum1 + " / " + iNum4 + " * " + iNum2 + " = " + (25 / 5 * 9));
        System.out.println(iNum3 + " % " + iNum2 + " + " + iNum5 + " = " + (11 % 9 + 7));

        //2.04 Additional double Equations


    } // end of main method
} // end of class

