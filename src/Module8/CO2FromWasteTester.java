package Module8;

/**
 * Test class for CO2FromWaste class, which implements an
 * ArrayList of CO2FromWaste objects and uses its properties.
 *
 * @author Denielle Kirk Abaquita
 * @version 27 November 2017
 */

import java.util.*;

public class CO2FromWasteTester {

    // main method
    public static void main(String[] args) {

        // Initialize array of objects
        ArrayList<CO2FromWaste> households = new ArrayList<>();
        households.add(new CO2FromWaste(4, true, true, true, true));
        households.add(new CO2FromWaste(10, false, true, true, false));
        households.add(new CO2FromWaste(3, true, false, true, false));
        households.add(new CO2FromWaste(1, true, true, true, true));
        households.add(new CO2FromWaste(8, false, true, true, true));
        households.add(new CO2FromWaste(7, false, false, false, false));

        // Processing (invoking mutator methods)
        for (CO2FromWaste data: households) {
            data.calcTotalEmission();       // calculates the object's emission
            data.calcReduction();           // calculates object's reduction
            data.calcNetEmission();         // calculates net emission
        }

        // Creating a table
        System.out.println("|       |        |                                         |             Pounds of CO2             |");
        System.out.println("|       |        |       Household Waste Recycled          |   Total    |             |     Net    |");
        System.out.println("| Index | People |  Paper   |  Plastic |  Glass  |  Cans   |  Emission  |  Reduction  |  Emission  |");
        System.out.print("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");

        // Looping to output data for each data in households array
        for (int i = 0; i < households.size(); i++) {

            CO2FromWaste data = households.get(i);                                            // assign object in array to a variable
            System.out.printf("\n|%7d|%8d|%10s|%10s|%9s|%9s|%12.2f|%13.2f|%12.2f|",           // print each piece of data on one line
                                i, data.getNumPeople(), data.getPaper(), data.getPlastic(), data.getGlass(),
                                data.getCans(), data.getTotalEmission(), data.getReduction(), data.getNetEmission());

        }

    }   // end of main

}   // end of class
