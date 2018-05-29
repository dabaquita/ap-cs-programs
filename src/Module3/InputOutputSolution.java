package Module3;

/**
 * @author Denielle Kirk Abaquita
 * @version 16 August 2017
 *
 * This program is to practice changing String
 * input into a specified String output.
 *
 * Input: 407-555-3326          Output: (407)555-3326
 * Input: 4075553326            Output: 407.555.3326
 * Input: 03/06/2017            Output: 03-06-2017
 * Input Tallahassee, Florida   Output: TAllAhAssee, FloridA
 * Input: Anna Wright           Output: Wright, Anna
 *
 */

public class InputOutputSolution {

    public static void main(String[] args) {

        // String inputs
        String input1 = "407-555-3326";
        String input2 = "4075553326";
        String input3 = "03/06/2017";
        String input4 = "Tallahassee, Florida";
        String input5 = "Anna Wright";

        // Input1 change
        System.out.print("Input: " + input1);

        int indexOfDash = input1.indexOf("-");
        String output1 = "(" + input1.substring(0, indexOfDash) + ")" +
                            input1.substring(indexOfDash + 1);

        System.out.println("    Output: " + output1);


        // Input2 change
        System.out.print("Input: " + input2);


        /** ASK QUESTION ABOUT
            String str = "Plan to sing today.";
            String newStr = str.replace("to", "2");
            System.out.println(str.length());
            System.out.println(newStr.length());
            OUTPUT: 19, 17 */

    } // end of main

} // end of class
