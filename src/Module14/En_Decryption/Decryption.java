package Module14.En_Decryption;

/**
 * Decrypts the a message that was
 * encoded in Caesar Shift.
 *
 * @author Denielle Kirk Abaquita
 * @version 13 February 2018
 */

public class Decryption extends Encryption {

    // Constructors
    Decryption() {

    }

    /**
     * Constructor with shift key value parameter
     * @param value - shift key value for decryption
     */
    Decryption(int value)
    {
        super(value);                       // initializes the Encryption parent class
        generateCipher();                   // generates cipher
    }

    /**
     * Generates a cipher based on the given key value
     */
    public static void generateCipher()
    {
        // for loop to initialize cipherAlphabet using keyValue
        for (int i = 0; i < ALPHABET.length; i++)
        {
            if ( (i - keyValue) < 26 && (i - keyValue) >= 0)
            {
                cipherAlphabet[i] = ALPHABET[i - keyValue];
            } else if ( (i + keyValue) >= 26)
            {
                cipherAlphabet[i] = ALPHABET[ (i - keyValue) - 26];
            }
        }   // end of for loop
    }

    /**
     * Class method to decrypt a given message
     * @param message - the message to be decrypted
     * @return decrypted message
     */
    public static String decryptMessage(String message)
    {
        String decryptedMessage = "";

        for (int i = 0; i < message.length(); i++) {

            int index = -1;
            String character = message.substring(i, i + 1).toUpperCase();

            for (int j = 0; j < cipherAlphabet.length; j++)
            {
                if (character.equals(cipherAlphabet[i])) {
                    index = j;
                }
            }

            if (index == -1) {
                decryptedMessage += character;
            } else {
                decryptedMessage += ALPHABET[index];
            }
        }

        return decryptedMessage;
    }

}
