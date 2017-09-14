package Module3;

/**
 * @author Denielle Kirk Abaquita
 * @version 18 August 2017
 *
 * The purpose of this program is to create an
 * e-receipt output after taking in multiple user
 * inputs of data.
 *
 */

/**
 * Planning / Pseudocode
 *
 * import Scanner class
 *
 * ------- Main Method -------
 *
 * -> Variables:
 *  Scanner input
 *
 *  String firstName
 *  String lastName
 *  String dateToday (mm/dd/yyyy)
 *  String nameOfItem
 *  String numOfItems
 *  String priceOfItem
 *  String debitCardNum (#####-###-####)
 *  String pinNum (####)
 *
 *  int numOfItemsInt
 *  double priceOfItemDouble
 *  double total
 *  String orderNum
 *  String initialPlusLastName
 *
 *
 * -> Prompt and store user input
 *  Assign firstName and lastName
 *      with next() and nextLine()
 *  Assign today's date to dateToday
 *  Assign nameOfItem
 *  Assign numOfItems
 *      parse into int
 *  Assign priceOfItem
 *      parse into double
 *  Assign debitCardNum
 *  Assign pinNum
 *
 *
 *  -> Processing Input
 *
 *      Reassign today's date to one that replaces "/" with "-"
 *      Assign orderNum to a string concatenation with substring(1,3) of
 *          lastName and substring(6,9) of debitCardNum
 *
 *      Assign initialPlusLastName to a string concatenation with
 *          substring(0,1) of first name, ".", and lastName
 *      Concatenate blocked out numbers with substring(10) of debitCardNum
 *      Assign total to the product of numOfItemsInt and priceOfItemDouble
 *
 *
 * -> Output Formatting
 * Start border
 *
 *      Print e-Receipt title
 *
 *      Print dateToday
 *      Print orderNum
 *
 *      Print initialPlusLastName
 *      Print debitCardNum
 *      Print nameOfItem
 *      Print numOfItems
 *      Print priceOfItem
 *
 *      Print total
 *      Print a thank you message
 *
 * End border
 *
 */

import java.util.Scanner;

public class BuyVideoGame {

    public static void main(String[] args) {

        // Variables
        int numOfItemsInt;
        double priceOfItemDouble;
        double total;
        String orderNum;
        String initialPlusLastName;


        // Scanner object and user input processing
        Scanner in = new Scanner(System.in);

        System.out.print("Good evening.\nPlease enter your first and last name: ");
        String firstName = in.next();                           // First name variable assignment
        String lastName = in.nextLine();                        // Last name variable assignment

        System.out.print("Enter today's date (mm/dd/yyyy): ");
        String dateToday = in.next();                           // Today's date variable assignment

        System.out.print("What game are you looking to buy? ");
        String nameOfItem = in.next();                          // Title of game
        nameOfItem += in.nextLine();                            // Concatenates the rest of title

        System.out.print("How many of " + nameOfItem + "? ");
        String numOfItems = in.next();                          // How many purchases
        numOfItemsInt = Integer.parseInt(numOfItems);           // Parsing String number into int number

        System.out.print("What is the selling price? $");
        String priceOfItem = in.next();                         // How much is it
        priceOfItemDouble = Double.parseDouble(priceOfItem);    // Parsing String number into double number

        System.out.print("Enter your debit card number (#####-###-####): ");
        String debitCardNum = in.next();                        // Assigning the debit card number input

        System.out.print("Enter your PIN (#####): ");
        String pinNum = in.next();


        // Processing Input
        dateToday = dateToday.replace("/", "-");                                // Replaces "/" with "-" in the string
        orderNum = lastName.substring(0, lastName.length() / 2) + debitCardNum.substring(6, 9);     // creates an order num with substrings from input

        initialPlusLastName = firstName.substring(0, 1) + ".   " + lastName;  // Assigned first inital plus last name to variable
        debitCardNum = "#####-###-" + debitCardNum.substring(10);               // Blurs out first two groups of numbers in debitCardNum
        total = numOfItemsInt * priceOfItemDouble;


        // Processing Output
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=" +
                            "\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("Your e-Receipt\n");

        System.out.println(dateToday);
        System.out.println("Order number: " + orderNum + "\n");

        System.out.println(initialPlusLastName);
        System.out.println("Account: " + debitCardNum);
        System.out.println("Game: " + nameOfItem);
        System.out.println("Number purchased: " + numOfItems);
        System.out.println("Price of each: " + priceOfItem + "\n");

        System.out.println("$" + Double.toString(total) + " will be debited to your account.\n");
        System.out.println("Thank you and enjoy the games!");

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=" +
                "\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    } // end of main

} // end of class
