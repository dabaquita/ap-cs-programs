package Module14.En_Decryption;

/**
 * Tests both the Encryption.java and
 * Description.java files.
 *
 * @author Denielle Kirk Abaquita
 * @version 13 February 2018
 */

import java.util.Scanner;

import static Module14.En_Decryption.Decryption.*;
import static Module14.En_Decryption.Encryption.*;

public class CaesarTester {

    private static int value = 0;
    private static Scanner input = new Scanner(System.in);

    public static void promptMenu()
    {
        String response = "";
        boolean isResponseCorrect = false;

        // Gets a response to encrypt or decrypt a message / checks for if response is correct
        while (!isResponseCorrect)
        {
            System.out.print("\nWould you like to Encrypt or Decrypt? (E/D): ");
            response = input.next();

            if (response.equalsIgnoreCase("E") || response.equalsIgnoreCase("D")) {
                isResponseCorrect = true;
            }
        }

        // calls for methods according to input
        if (response.equalsIgnoreCase("E")) {
            encrypt();
        } else if (response.equalsIgnoreCase("D")) {
            decrypt();
        }

    }

    /**
     * Prompts user for a message to encrypt and calls for encryption
     */
    public static void encrypt()
    {
        Encryption encrypt = new Encryption(value);
        boolean quit = false;

        displayAlphabet();                      // displays the alphabets
        displayCipherAlphabet();

        System.out.println();

        // continually prompts for message until user decides to quit
        while ( !quit )
        {
            System.out.print("Please enter a message to be encrypted (\"Q\" to quit): ");
            String messageToEncrypt = input.next();
            messageToEncrypt += input.nextLine();

            // displays the encrypted message if the user decides not to quit
            if (messageToEncrypt.equalsIgnoreCase("Q")) {
                quit = true;
                System.out.print("\nThanks for using Caesar Tester!");
            } else {
                System.out.print("Encrypted Message: " + encryptMessage(messageToEncrypt));
                System.out.println("\n\nEnter another!");
            }
        }
    }

    /**
     * Prompts user for a message to decrypt and calls for decryption
     */
    public static void decrypt()
    {
        Decryption decrypt = new Decryption(value);
        boolean quit = false;

        displayAlphabet();                      // displays the alphabets
        displayCipherAlphabet();

        System.out.println();

        // continually prompts for message until user decides to quit
        while ( !quit )
        {
            System.out.println("Please enter a message to be decrypted (\"Q\" to quit): ");
            String messageToDecrypt = input.next();
            messageToDecrypt += input.nextLine();

            // displays the decrypted message if the user decides not to quit
            if (messageToDecrypt.equalsIgnoreCase("Q")) {
                quit = true;
                System.out.println("Thanks for using Caesar Tester!");
            } else {
                System.out.println("Decrypted Message: " + decryptMessage(messageToDecrypt));
                System.out.println("\n\nEnter another!");
            }
        }
    }

    // Main Method
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean isInputRight = false;

        // Prompt user for a shift key value
        System.out.println("\n--------------------------------------------");
        System.out.printf("%35s", "Welcome to Caesar Tester!\n");
        System.out.println("--------------------------------------------\n");

        // Calls for encryption or decryption and checks for correct shift key value
        while (!isInputRight)
        {
            System.out.print("Please enter a shift key value from 0 - 25 (inclusive): ");
            value = in.nextInt();

            if (value <= 25 && value >= 0) {
                isInputRight = true;

                promptMenu();               // call for promptMenu()
            }
        }
    }

}   // end of class
