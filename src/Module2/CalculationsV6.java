package Module2;

/**
 * Denielle Kirk Abaquita
 * 9 August 2017
 *
 * This uses both int and double variables to perform
 * arithmetic operations within print() and println()
 * statements with the consistent usage of
 * concatenations to provide readable output.
 *
 */

public class CalculationsV6 {

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
        double dNum3 = 10.0;
        double dNum4 = 4.21;
        double dNum5 = 5.6;

        // Addition
        System.out.println("Addition");
        System.out.println( iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println( dNum1 + " + " + dNum2 + " + " + dNum3 + " = " + (dNum1 + dNum2 + dNum3));
        System.out.println();

        // Subtraction
        System.out.println("Subtraction");
        System.out.println( iNum3 + " - " + iNum2 + " - " + iNum1 + " = " + (iNum3 - iNum2 - iNum1));
        System.out.println( dNum2 + " - " + dNum3 + " = " + (dNum2 - dNum3));
        System.out.println();

        // Multiplication
        System.out.println("Multiplication");
        System.out.println( iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum2));
        System.out.println( dNum2 + " * " + dNum3 + " * " + dNum3 + " = " + (dNum2 * dNum3 * dNum3));
        System.out.println();

        // Division
        System.out.println("Division");
        System.out.println( iNum2 + " / " + iNum1 + " = " + (iNum2 / iNum1));
        System.out.println( dNum1 + " / " + dNum3 + " = " + (dNum1 / dNum3));
        System.out.println();

        // Modulus operator
        System.out.println("Modulus");
        System.out.println( iNum3 + " % " + iNum2 + " = " + (iNum3 % iNum2));
        System.out.println( dNum3 + " % " + dNum2 + " = " + (dNum3 % dNum2));
        System.out.println();

        // 2.03 Additional int Equations
        System.out.println("Additional int Equations");
        System.out.println(iNum4 + " + " + iNum5 + " - " + iNum1 + " = " + (iNum4 + iNum5 - iNum1));
        System.out.println(iNum1 + " / " + iNum4 + " * " + iNum2 + " = " + (iNum1 / iNum4 * iNum2));
        System.out.println(iNum3 + " % " + iNum2 + " + " + iNum5 + " = " + (iNum3 % iNum2 + iNum5));
        System.out.println();

        //2.04 Additional double Equations
        System.out.println("Additional double Equations");
        System.out.println(dNum5 + " * " + dNum3 + " - " + dNum1 + " = " + (dNum5 * dNum3 - dNum1));
        System.out.println(dNum2 + " / " + dNum4 + " + " + dNum3 + " = " + (dNum2 / dNum4 + dNum3));
        System.out.println(dNum1 + " % " + dNum2 + " * " + dNum4 + " = " + (dNum1 % dNum2 * dNum4));
        System.out.println();

    } // end of main method
} // end of class

