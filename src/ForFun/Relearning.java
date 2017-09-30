package ForFun;

/**
 *
 */

import java.util.Scanner;

public class Relearning {

    // Main Function
    public static void main(String[] args) {

        // Variables Declarations and Initializations
        String helloWorld = "Hello World!";
        String hello = helloWorld.substring(0, 5); // 0 = start, 5 = length

        String m = helloWorld.substring(helloWorld.indexOf('W'), helloWorld.length());
        System.out.println(m); // prints substring starting with W

        String str = "I ate chocolate.";
        String newStr = str.replace("ate", "8");
        System.out.println(newStr);

        // String methods
        // String indexes start with "0"
        // String modifiers : \", \n
        System.out.println(helloWorld);
        System.out.println(helloWorld.length());
        System.out.println(helloWorld.charAt(4) + "\n");

        System.out.println(hello);
        System.out.println(hello.indexOf("el"));

        // Variable assignment to a class
        String greeting = hello();
        System.out.println(greeting);

        // Boolean value work
        boolean b = 12 / 5 != 2.0;
        boolean c = 12 / 5.0 == 2.0;
        boolean d = (int)(12.0 / 5.0) == 2.0;
        System.out.println(b + " " + c + " " + " " + d);

        double a = 13;
        double z = 15;

        System.out.println("Weight: " + (int)(10 * a)/ 10.0);
        System.out.println("Height: " + (int)(10 * z)/ 100.0);
        System.out.println("BMR: " + (int)(10 * z)/10.0);

        int upper = 10;
        int lower = 1;

        for (int h = 0; h < 10; h++) {
            int rand = (int)(Math.random() * (upper - lower) ) + lower;
            System.out.println(rand);
        }

        // interesting for loop to show placement of X
        str = "taXeX";
        int n = str.length();
        int k;

        for ( k = 0 ; k < str.length() ; k++ )
        {
            if ( str.substring( k, k + 1 ).equals( "X" ) )
            {
                n--;
            }
        }
        System.out.println("\n" + n);

        // nested loop
        int count = 1;
        for(int outer = 0; outer < 3; outer++)
            for(int inner = 1; inner <= 6; inner+=2)
                count++;
        System.out.println("\n" + count);

        int fundsRemaining = 1500;
        int totalItems1 = 7;

        fundsRemaining %= totalItems1;

        int randomNum = 54;
        char oneCharInPassCode = (char) randomNum;                           // casts randomNum into a char value
        System.out.println(oneCharInPassCode);

        int[] nameArray = new int[10];      // array initialization and loop work
        for (int i = 0; i < 10; i++) {

            nameArray[i] += i;
            System.out.println(nameArray[i]);
        }




    }

    //static means that it isn't depending on the creation of a parent object
    public static String hello() {

        return "hello world";

    }

}
