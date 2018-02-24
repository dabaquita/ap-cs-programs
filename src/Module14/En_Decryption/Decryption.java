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
            String character = message.substring(i, i + 1);

            for (int j = 0; j < cipherAlphabet.length; j++)
            {
                if (character.equalsIgnoreCase(cipherAlphabet[j])) {
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
