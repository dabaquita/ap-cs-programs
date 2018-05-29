package Module5;

/**
 *
 */

import java.util.Scanner;
public class LotteryV2
{
    public static void main(String[] args)
    {
        //declare and initialized variables and objects
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        int lotNumLength = 3;              //number of digits per lottery number
        String lotteryNum = "";
        String userPick = "";


        //Generate a 3-digit "lottery" number composed of random numbers.
        //Simulate a lottery by drawing one number at a time and
        //concatenating it to the string.
        for(int n = 1; n <= lotNumLength; n++)
        {
            int digit = (int) (Math.random() * 10); //generate a random integer from 0 to 9 (inclusive)
            lotteryNum += digit;                     //concatenate the random digit to the lottery String
            System.out.println(lotteryNum);       //debug statement; use while testing program
        }

        //Input: Ask user to guess 3 digit number
        System.out.println("Enter your " + lotNumLength + " digit lottery number: ");
        userPick = in.next();

        //Output: Error if user guess did not contain the right number of digits. Otherwise
        // report matches for front pair, back pair, or all digits.
        if(userPick.length() != lotNumLength)
        {
            System.out.println("Sorry, your pick did not contain the right number of digits.");
        }
        else
        {
            //Create Strings with front and back pair digits for easy comparison
            String lotteryFrontPair = lotteryNum.substring(0, 2);
            String lotteryBackPair = lotteryNum.substring(1, 3);
            String userFrontPair = userPick.substring(0, 2);
            String userBackPair = userPick.substring(1, 3);

            //Compare the user's guess to the lottery number and report results
            if( userBackPair.compareTo(lotteryBackPair) == 0 )
            {
                System.out.println("\tWinner: " + lotteryNum + "\n\tCongratulations, the back pair matched!");
            }
            else if( userFrontPair.compareTo(lotteryFrontPair) == 0 )
            {
                System.out.println("\tWinner: " + lotteryNum + "\n\tCongratulations, the front pair matched!");
            }
            else if( userPick.equals(lotteryNum) )
            {
                System.out.println("\tWinner: " + lotteryNum + "\n\tCongratulations, both pairs matched!");
            }
            else
            {
                System.out.println("\tWinner: " + lotteryNum + "\n\tSorry, no digits match. \n\tThe odds were not in your favor.");
            }
        }
    } //end main
}//end class Lottery