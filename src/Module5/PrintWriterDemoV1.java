package Module5;

/**
 * The purpose of this program is to demonstrate the PrintWriter 
 * class and its methods for writing to text files.
 *
 * @author Charles Babbage
 * @version 06/05/17
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

class PrintWriterDemoV1
{
    public static void main (String [ ] args) throws IOException
    {
        
       PrintWriter outFile = new PrintWriter(new File("numbers.txt"));

       for (int loop = 1; loop <= 5; loop++)
       {

           double randomNum = Math.random() * 1001 + 0.1;
           outFile.println(randomNum);

       }//end for loop

       outFile.close( );    //close the file when finished
    }//end of main method
}//end of class
