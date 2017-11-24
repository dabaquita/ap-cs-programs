package Module8;

/**
 * @purpose: This class tests the CO2FootprintV2 class.
 *
 * A single instance of CO2FootprintV2 is used to invoke
 * methods that calculate the tons of CO2 and pounds of
 * CO2 based off of gallons of gas.
 *
 * @author Denielle Kirk Abaquita
 * @version 23 November 2017
 */

public class CO2FootprintV2Tester
{
    // Main Method
    public static void main(String[] args)
    {
        // Variable declaration
        double gallonsOfGas = 2410;

        // Object declaration and processing
        CO2FootprintV2 footprint = new CO2FootprintV2(gallonsOfGas);
        footprint.calcTonsCO2();
        footprint.convertTonsToPounds();

        // Output table using print and getter methods
        System.out.println("           CO2 Emissions");
        System.out.println("  Gallons   Pounds      Tons");
        System.out.println("  of Gas   from Gas   from Gas");
        System.out.println("  ****************************");
        System.out.printf("  %6.1f   %8.2f    %6.3f", footprint.getGallons(),
                                                      footprint.getPoundsCO2(),
                                                      footprint.getTonsCO2());

        System.out.println();
    }
}

