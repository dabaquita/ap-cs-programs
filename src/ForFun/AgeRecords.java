

public class AgeRecords
{
    private int[][] individualAges;
    private String[][] ageCategory;

    // constructors not shown

    // postcondition: returns −1.0 if category does not appear in ageCategory
    // otherwise, returns the average of all individualAges with corresponding
    // ageCategory values that are equal to the parameter category.
    public double categoryAverage(String category)
    {

        double sum = 0;
        int numberOfAges = 0;

        for (int i = 0; i < ageCategory.length; i++)
        {

            for (int j = 0; j < ageCategory[i].length; j++)
            {

                if (category.equalsIgnoreCase(ageCategory[i][j]));
                {
                    sum += individualAges[i][j];
                    numberOfAges++;
                }

            }

        }

        if (sum == 0) {
            return -1.0;
        }

        return sum / numberOfAges;


    }

    // other methods not shown

}
