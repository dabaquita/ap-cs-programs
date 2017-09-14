package Module2;

/**
 *  Denielle Kirk Abaquita
 *  8 August 2017
 *
 *  This program uses integer variables in correspondance with
 *  strings and concatenations to deliver readable arithmetic
 *  output, which includes values used and value(s) calculated.
 *
 */

public class CalculationsV4 {

    public static void main(String[] args) {

        // Variables
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;
        int iNum4 = 5;
        int iNum5 = 7;

        // Addition
        System.out.println("Addition");
        System.out.println( iNum1 + " + " + iNum2 + " = " + (25 + 9));
        System.out.println( "43.21 + 3.14 + 10.0" + (43.21 + 3.14 + 10.0));
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
