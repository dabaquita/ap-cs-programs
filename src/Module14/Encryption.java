package Module14;

/**
 * Encodes a message using a Caesar Shift method.
 *
 * @author Denielle Kirk Abaquita
 * @version 13 February 2018
 */

public class Encryption {

    // Private variables
    static int keyValue;
    static final String[] ALPHABET = {"A", "B", "C", "D", "E",
                                                "F", "G", "H", "H", "J",
                                                "K", "L", "M", "N", "O",
                                                "P", "Q", "R", "S", "T",
                                                "U", "V", "W", "X", "Y",
                                                "Z"};
    static String[] cipherAlphabet = new String[26];


    // Constructors
    public Encryption() {

    }

    /**
     * Constructor with parameter for the value
     * @param val - the shift key value
     */
    public Encryption(int val)
    {
        keyValue = val;                         // initialize variable
        generateCipher();                       // generates a cipher alphabet upon
                                                // creating the instance
    }


    // Methods
    /**
     * Generates the cipher alphabet based on the shift key value and
     * the original alphabet order.
     */
    public static void generateCipher()
    {
        // for loop to initialize cipherAlphabet using keyValue
        for (int i = 0; i < ALPHABET.length; i++)
        {
            if ( (keyValue + i) < 26 && (keyValue + i) >= 0 )
            {
                cipherAlphabet[i] = ALPHABET[i + keyValue];
            } else if ( (i + keyValue) >= 26 )
            {
                cipherAlphabet[i] = ALPHABET[ (i + keyValue) - 26];
            }
        }   // end of for loop
    }   // end of method

    public static void displayAlphabet()
    {
        System.out.println("\nOriginal Alphabet: " +
                            "\n-----------------------");

        for (int i = 0; i < ALPHABET.length; i++)
        {
            System.out.print(ALPHABET[i] + " ");

            if (i % 5 == 0) {
                System.out.println();               // generates a new line after every 5th item
            }
        }
    }

    /**
     * Displays a table of the cipher alphabet
     */
    public static void displayCipherAlphabet()
    {
        System.out.println("\nCipher Alphabet: " +
                            "\n-----------------------");

        for (int i = 0; i < cipherAlphabet.length; i++)
        {
            System.out.print(cipherAlphabet[i] + " ");

            if (i % 5 == 0) {
                System.out.println();               // generates a new line after every 5th item
            }
        }
    }

    /**
     * Converts the given string into a transformed string from cipher alphabet
     * @param message - string that is to be encrypted
     * @return encryptedMessage - newly transformed string
     */
    public static String encryptMessage(String message)
    {
        String encryptedMessage = "";

        for (int i = 0; i < message.length(); i++)
        {
            int index = -1;
            String character = message.substring(i, i + 1);                   // assigns the current letter to a variable

            for (int j = 0; j < ALPHABET.length; j++)               // gets the index of the letter
            {
                if ( character.equalsIgnoreCase(ALPHABET[j]) ) {
                    index = j;
                }
            }

            if (index == -1) {
                encryptedMessage += character;                         // checks for punctuation
            } else {
                encryptedMessage += cipherAlphabet[index];          // adds the letter equivalent to cipher to message
            }
        }

        return encryptedMessage;
    }

}
