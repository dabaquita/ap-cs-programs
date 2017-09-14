package Module3;

/**
 *  @author Denielle Kirk Abaquita
 *  @version 15 August 2017
 *
 *  This class creates a face drawing using
 *  string objects with escape sequences
 *  and print() statements.
 *
 */

public class ArtWork {

    public static void main(String[] args) {

        // String objects of drawing
        String row01 = "| - - - - - - - - - - - - - - - - - - - - - -|\n";
        String row02 = "|                                            |\n";
        String row03 = "|                                            |\n";
        String row04 = "|          \"\"\"          \"\"\"                  |\n";
        String row05 = "|          \" \"          \" \"                  |\n";
        String row06 = "|          \"\"\"          \"\"\"                  |\n";
        String row07 = "|                                            |\n";
        String row08 = "|                 \"\"                         |\n";
        String row09 = "|                                            |\n";
        String row10 = "|          \"            \"                    |\n";
        String row11 = "|            \"\"\"\"\"\"\"\"\"\"                      |\n";
        String row12 = "|                                            |\n";
        String row13 = "| - - - - - - - - - - - - - - - - - - - - - -|";

        String mySignature = "\n\nDenielle Kirk Abaquita\n"; // my name

        // Print statements
        System.out.print(row01 + row02 + row03 + row04 + row05 + row06);
        System.out.print(row07 + row08 + row09 + row10 + row11 + row12);
        System.out.print(row13 + mySignature);

    } // end of main

} // end of class
