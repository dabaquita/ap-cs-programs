package Module5;

/**
 * This program generates random passwords,
 * letting the user select character set
 * and the length.
 *
 * @author Denielle Kirk Abaquita
 * @version 23 September 2017
 *
 */


import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class SecretPasscodes {

    public static void main(String[] args) throws IOException {

        // Object and Variable Declarations and Initializations
        Scanner input = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter(new File("passwords.txt"));
        File fileName = new File("passwords.txt");
        Scanner inFile = new Scanner(fileName);

        String userInput;
        int userSelection = 0;
        int passwordLength = 0;

        int randomNum;
        char oneCharInPassCode;

        boolean continuePrompt = true;

        int numOfCodes = 0;


        // Display Menu
        System.out.println("                Password Generator Menu\n" +
                           "******************************************************\n" +
                           "*   [1] Lowercase Letters                            *\n" +
                           "*   [2] Numbers and Lowercase Letters                *\n" +
                           "*   [3] Numbers and Uppercase Letters                *\n" +
                           "*   [4] Lowercase and Uppercase Letters              *\n" +
                           "*   [5] Quit                                         *\n" +
                           "******************************************************");

        // Processing body
        while (continuePrompt) {        // iterates while continuePrompt is true
            boolean properInput = false;
            boolean properPassword = false;

            // input handling
            while (!properInput) {      // loops while properInput is false to repeat prompt

                System.out.print("\nEnter Selection (1-5): ");
                userInput = input.next();                               // obtain user input
                userSelection = Integer.parseInt(userInput);            // obtain integer value from input to type of password

                if ( !(userSelection > 0 && userSelection < 6) ) {      // tests for if selection is in range

                    System.out.println("\nInvalid option. Please try again.");

                } else {

                    properInput = true;                                 // stops loop if userInput matches properPassword

                }

            } // end of properInput while loop

            if (userSelection != 5) {
                // input handling
                while (!properPassword) {   // loops while properPassword is false to repeat prompt

                    System.out.print("\nPassword Length (6 or more): ");
                    userInput = input.next();                               // obtain user input
                    passwordLength = Integer.parseInt(userInput);           // obtain integer value from input to password's length

                    if (!(passwordLength >= 6)) {                        // tests for if passwordLength is in range

                        System.out.println("\nPassword length too short. Please try again.");

                    } else {

                        properPassword = true;                                 // stops loop if userInput matches properPassword

                    }

                } // end of properPassword while loop

            }

            // password generating
            if (userSelection == 1) {               // [1] Lowercase Letters

                for (int i = passwordLength; i > 0; i--) {                     // loops according to passwordLength
                    
                    randomNum = (int) (Math.random() * (123 - 97)) + 97;            // generates num within [97, 122]
                    oneCharInPassCode = (char) randomNum;                           // casts randomNum into a char value
                    outFile.print(oneCharInPassCode);                               // adds char on line
                
                } // end of for loop

                outFile.println();                                                  // new line

            } else if (userSelection == 2) {        // [2] Numbers and Lowercase Letters

                for (int i = passwordLength; i > 0; i--) {                     // loops according to passwordLength
                    randomNum = (int) (Math.random() * 2);                          // generates 1 or 2 randomly

                    if (randomNum == 0) {                                           // if 0, new randomNum is within [48, 57]

                        randomNum = (int) (Math.random() * (58 - 48)) + 48;

                    } else {                                                        // if 1, new randomNum is within [97, 122]

                        randomNum = (int) (Math.random() * (123 - 97)) + 97;

                    }

                    oneCharInPassCode = (char) randomNum;                           // casts randomNum into a char value
                    outFile.print(oneCharInPassCode);                               // adds char on line

                } // end of for loop

                outFile.println();                                                  // new line

            } else if (userSelection == 3) {        // [3] Numbers and Uppercase Letters

                for (int i = passwordLength; i > 0; i--) {                     // loops according to passwordLength
                    randomNum = (int) (Math.random() * 2);                          // generates 1 or 2 randomly

                    if (randomNum == 0) {                                           // if 0, new randomNum is within [48, 57]

                        randomNum = (int) (Math.random() * (58 - 48)) + 48;

                    } else {                                                        // if 1, new randomNum is within [65, 90]

                        randomNum = (int) (Math.random() * (91 - 65)) + 65;

                    }

                    oneCharInPassCode = (char) randomNum;                           // casts randomNum into a char value
                    outFile.print(oneCharInPassCode);                               // adds char on line

                } // end of for loop

                outFile.println();                                     // new line

            } else if (userSelection == 4) {        // [4] Lowercase and Uppercase Letters

                for (int i = passwordLength; i > 0; i--) {                     // loops according to passwordLength
                    randomNum = (int) (Math.random() * 2);                          // generates 1 or 2 randomly

                    if (randomNum == 0) {                                           // if 0, new randomNum is within [97, 122]

                        randomNum = (int) (Math.random() * (123 - 97)) + 97;

                    } else {                                                        // if 1, new randomNum is within [65, 90]

                        randomNum = (int) (Math.random() * (91 - 65)) + 65;

                    }

                    oneCharInPassCode = (char) randomNum;                           // casts randomNum into a char value
                    outFile.print(oneCharInPassCode);                               // adds char on line

                } // end of for loop

                outFile.println();                                                  // new line

            } else if (userSelection == 5) {        // [5] Quit

                continuePrompt = false;                                             // terminates the loop
                System.out.println("\nThank you for using the Pass Code Generator.\n");

            }


        } // end of continuePrompt while loop

        outFile.close();

        // Final Output
        System.out.println("Here are your randomly generated codes:");

        while (inFile.hasNextLine()) {

            System.out.println(++numOfCodes + "     " + inFile.nextLine());

        }

        inFile.close();

    } // end of main

} // end of class
