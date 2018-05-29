package Module2;

/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given
 * the current exchange rate.
 *
 * @author Denielle Kirk Abaquita
 * @version 11 August 2017
 *
 */

public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars

        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 19.57852;     // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico
        //remaining variables below here

        double yenSpent = 201456.2;             // Japanese Yen spent
        double yenExchangeRate = 0.00967;       // 1 US dollar = 0.00967 Yen
        double dollarsSpentInJapan = 0.0;       // US dollars spent in Japan
        double dollarsAfterJapan = 0.0;         // US dollars remaining after Japan

        double eurosSpent = 987.43;             // Euros spent
        double euroExchangeRate = 1.2406;       // 1 US dollar = 1.2406 euros
        double dollarsSpentInGreece = 0.0;      // US dollars spent in Greece
        double dollarsAfterGreece = 0.0;        // US dollars remaining after Greece


        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();


        // Conversion
        // code goes below here
        System.out.println("Starting US Dollars: " + startingUsDollars);
        System.out.println();

        // Mexico spent and leftover dollars
        System.out.println("Mexico");
        System.out.println("   Pesos Spent:                             " + pesosSpent);

        dollarsSpentInMexico = pesosSpent / pesoExchangeRate;           // From pesos to dollars
        System.out.println("   US Dollar Equivalent:                    " + dollarsSpentInMexico);

        dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;  // Calculates dollars remaining
        System.out.println("   US Dollars Remaining:                    " + dollarsAfterMexico);
        System.out.println();

        // Japan spent and leftover dollars
        System.out.println("Japan");
        System.out.println("   Yen Spent:                               " + yenSpent);

        dollarsSpentInJapan = yenSpent / yenExchangeRate;               // From yen to dollars
        System.out.println("   US Dollar Equivalent:                    " + dollarsSpentInJapan);

        dollarsAfterJapan = dollarsAfterMexico - dollarsSpentInJapan;   // Calculates dollars remaining
        System.out.println("   US Dollars Remaining:                    " + dollarsAfterJapan);
        System.out.println();

        // Greece spent and leftover dollars
        System.out.println("Greece");
        System.out.println("   Euros Spent:                             " + eurosSpent);

        dollarsSpentInGreece = eurosSpent / euroExchangeRate;           // From euros to dollars
        System.out.println("   US Dollar Equivalent:                    " + dollarsSpentInGreece);

        dollarsAfterGreece = dollarsAfterJapan - dollarsSpentInGreece;  // Calculates dollars remaining
        System.out.println("   US Dollars Remaining:                    " + dollarsAfterGreece);
        System.out.println();


        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;  					                   //cost per item of first souvenir
        int budget1 = 100;   					                   //budget for first item
        int totalItems1 = budget1 / costItem1; 		               //how many items can be purchased
        int fundsRemaining1 = budget1 % costItem1;                 //how much of the budget is left

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99;  					                //cost per item of second souvenir
        int budget2 = 500;   						                //budget for second item
        int totalItems2 = (int)(budget2 / costItem2); 	            //how many items can be purchased
        double fundsRemaining2 = budget2 % costItem2;  	            //how much of the budget is left

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method

} // end of class

