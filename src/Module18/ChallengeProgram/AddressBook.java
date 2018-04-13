package Module18.ChallengeProgram;

import java.util.ArrayList;

/**
 * A tester class for the Contact.java
 * program.
 *
 * @author Denielle Kirk Abaquita
 * @version 10 April 2018
 */

public class AddressBook {

    /** MAIN METHOD */
    public static void main(String[] args)
    {
        int test;
        Contact[] addressBook =
                {
                        new Contact("Hailey Ray", "friend", "May 24", "hray@yahoo.com", "226-879-2113"),
                        new Contact("Wyatt Smith", "best friend", "Nov 17", "wsmith@aol.com", "643-857-6473"),
                        new Contact("Meg Scott", "sister", "Dec 12", "mlear@gmail.com", "763-453-7580"),
                        new Contact("Cheyenne Scott", "mom", "May 15", "sscott@gmail.com", "763-453-7580"),
                        new Contact("Bob Scott", "brother", "May 2", "bscott@gmail.com", "727-345-7654"),
                        new Contact("Greg Scott", "dad", "Nov 7", "gscott@gmail.com", "727-334-4843"),
                        new Contact("Mary Gonzalez", "friend", "Feb 23", "mgonzalez@yahoo.com", "283-723-8337"),
                        new Contact("Dylan Scott", "brother", "Oct 23", "dscott@gmail.com", "341-342-3434"),
                        new Contact("Anne Covey", "friend", "Aug 3", "acovey@gmail.com", "283-423-5406"),
                        new Contact("Michael Yo", "friend", "Jan 28", "myo@yahoo.com", "532-647-1103")
                };

        printTable(addressBook);

        // Name search
        System.out.println("\n\nSearching for Bob Scott: ");
        mergeSort(addressBook, 0, addressBook.length - 1, 1);
        //printTable(addressBook);        // debug statement to check if list is sorted

        test = binSearchName(addressBook, "Bob Scott");
        if (test != -1)
            System.out.println("Found: " + addressBook[test]);
        else
            System.out.println("Not Found.");

        System.out.println("\n\nSearching for Denielle Abaquita: ");
        test = binSearchName(addressBook, "Denielle Abaquita");
        if (test != -1)
            System.out.println("Found: " + addressBook[test]);
        else
            System.out.println("Not Found.");

        // Relationship search
        System.out.println("\n\nSearching for brother(s): ");
        mergeSort(addressBook, 0, addressBook.length - 1, 2);
        //printTable(addressBook);        // debug statement to check if list is sorted

        binSearchRelation(addressBook, "brother");


        // Search for birthdays
        System.out.print("\n\nSearching for contact(s) whose birthday(s) are(is) in May: ");
        seqSearchMonth(addressBook, "May");

        System.out.print("\n\nSearching for contact(s) whose birthday(s) are(is) in June: ");
        seqSearchMonth(addressBook, "Jun");

        // Search for phone number
        System.out.print("\n\nSearching for 763-453-7580: ");
        seqSearchNumber(addressBook, "763-453-7580");

        System.out.print("\n\nSearching for 273-484-4521: ");
        seqSearchNumber(addressBook, "273-484-4521");

        // Search for email addresss
        System.out.print("\n\nSearching for myo@yahoo.com: ");
        seqSearchEmail(addressBook, "myo@yahoo.com");

        System.out.print("\n\nSearching for dhello@gmail.com: ");
        seqSearchEmail(addressBook, "dhello@gmail.com");
    }

    /**
     * Prints out a table of contacts
     * @param toPrint array of contact objects
     */
    public static void printTable(Contact[] toPrint)
    {
        System.out.printf("%-15s %-15s %-10s %-23s %s", "Name", "Relationship", "Birthday", "Email", "Number");
        System.out.println("\n------------------------------------------------------------------------------------");

        for (Contact person: toPrint)
        {
            System.out.println(person);
        }
    }

    /**
     * Merge sorts an array of contacts
     * @param source - unsorted array of contact objects
     * @param left - first index
     * @param right - ending index
     * @param type - 1: name, 2: relationship
     */
    public static void mergeSort(Contact[] source, int left, int right, int type)
    {
        if (left >= right)
            return;

        int mid = (left + right) / 2;               // calculates the middle index

        mergeSort(source, left, mid, type);
        mergeSort(source, mid + 1, right, type);

        if (type == 1)          // merge sorts by name
        {
            mergeByName(source, left, mid, right);
        }
        else if (type == 2)     // merge sorts by relationship
        {
            mergeByRelation(source, left, mid, right);
        }
    }

    /**
     * Merges halves an array by name
     * @param source - unsorted
     * @param leftStart - starting index
     * @param mid - middle index
     * @param rightEnd - last index
     */
    public static void mergeByName(Contact[] source, int leftStart, int mid, int rightEnd)
    {
        Contact[] temp = new Contact[rightEnd - leftStart + 1];

        int left = leftStart,               // starting index of left half
                right = mid + 1,            // starting index of right half
                index = 0;                  // index of the temp array

        while (left <= mid || right <= rightEnd)        // while value(s) are in bound
        {
            if (left > mid)                 // if left is finished being sorted
            {
                temp[index] = source[ right ];
                right++;
            }
            else if (right > rightEnd)      // if right is finished being sorted
            {
                temp[index] = source[ left ];
                left++;
            }
            else if (source[left].getName().compareTo(source[right].getName()) < 0)
            {   // if left's name is less than right's name
                temp[index] = source[left];
                left++;
            }
            else        // if right's name is less than left's name
            {
                temp[index] = source[right];
                right++;
            }
            index++;
        }

        // Place sorted values back into original array
        for (int i = leftStart; i <= rightEnd; i++)
        {
            source[ i ] = temp[ i - leftStart ];
        }
    }

    /**
     * Merge halves by relationship
     * @param source - unsorted
     * @param leftStart - starting index
     * @param mid - middle index
     * @param rightEnd - ending index
     */
    private static void mergeByRelation(Contact[] source, int leftStart, int mid, int rightEnd)
    {
        Contact[] temp = new Contact[rightEnd - leftStart + 1];

        int left = leftStart,
                right = mid + 1,
                index = 0;

        while (left <= mid || right <= rightEnd)
        {
            if (left > mid)
            {
                temp[index] = source[right];
                right++;
            }
            else if (right > rightEnd)
            {
                temp[index] = source[left];
                left++;
            }
            else if (source[left].getRelation().compareTo(source[right].getRelation()) < 0)
            {
                temp[index] = source[left];
                left++;
            }
            else
            {
                temp[index] = source[right];
                right++;
            }
            index++;
        }

        for (int i = leftStart; i <= rightEnd; i++)
        {
            source[i] = temp[ i - leftStart ];
        }
    }

    /**
     * Binary searches for a name within a contact array
     * @param source - contact array
     * @param toFind - name to find
     */
    public static int binSearchName(Contact[] source, String toFind)
    {
        int high = source.length,
                low = -1,
                probe;

        while( high - low > 1 )
        {
            probe = (high + low) / 2;
            if ( source[probe].getName().compareTo(toFind) > 0 )
                high = probe;
            else
                low = probe;
        }

        if ( low >= 0 && source[low].getName().equals(toFind) )
            return low;
        else
            return -1;
    }

    public static void binSearchRelation(Contact[] source, String toFind)
    {
        int high = source.length,
                low = -1,
                probe;

        while ( high - low > 1 )
        {
            probe = (high + low) / 2;

            if ( source[probe].getRelation().compareTo(toFind) > 0 )
                high = probe;
            else
            {
                low = probe;
                if (source[probe].getRelation().equals(toFind))
                    break;
            }
        }

        if ( low >= 0 && source[low].getRelation().equals(toFind) )
            linearPrintRel(source, low, toFind);
        else
            System.out.println("NOT found: " + toFind);
    }

    /**
     * Prints all elements before and after the found element that match
     * the search criteria for location
     * @param source - list of contact objects
     * @param low - index of match
     * @param toFind - relation to be found
     */
    public static void linearPrintRel(Contact[] source, int low, String toFind)
    {
        int i, start = low, end = low;

        // Find starting point of matches
        i = low - 1;
        while ( i >= 0 && source[i].getRelation().equals(toFind) )
        {
            start = i;
            i--;
        }

        // Find ending point of matches
        while ( i < source.length && source[i].getRelation().equals(toFind) )
        {
            end = i;
            i++;
        }

        // Print out matches
        for (i = start; i <= end; i++)
        {
            System.out.println(source[i]);
        }
    }

    /**
     * Sequentially searches for contacts with birthdays in a specific month
     * @param source - array of contacts
     * @param toFind - month
     */
    public static void seqSearchMonth(Contact[] source, String toFind)
    {
        ArrayList<Contact> foundList = new ArrayList<>();       // list to prepare all matches

        for (int i = 0; i < source.length; i++)                 // searches through entire array for matches
        {
            String month = source[i].getBirthday().substring(0, 3);

            if ( month.equals(toFind) )
            {
                foundList.add(source[i]);
            }
        }

        if (foundList.size() != 0)                              // if list has items, print out elements
        {
            System.out.println("\nBirthdays Found: ");
            for (Contact contact: foundList)
                System.out.println(contact);
        }
        else
        {
            System.out.println("\nNone Found.");
        }
    }

    /**
     * Sequentially searches for contacts with a given number
     * @param source - array of contacts
     * @param toFind - number to find
     */
    public static void seqSearchNumber(Contact[] source, String toFind)
    {
        ArrayList<Contact> foundList = new ArrayList<>();       // list for all matches

        for (int i = 0; i < source.length; i++)
        {
            if (source[i].getPhoneNumber().equals(toFind))
                foundList.add(source[i]);
        }

        if (foundList.size() != 0)
        {
            System.out.println("\nNumbers Found: ");
            for (Contact contact: foundList)
                System.out.println(contact);
        }
        else
        {
            System.out.println("\nNone found.");
        }
    }

    /**
     * Sequentially searches for contacts with the given email
     * @param source - array of contacts
     * @param toFind - email to find
     */
    public static void seqSearchEmail(Contact[] source, String toFind)
    {
        ArrayList<Contact> foundList = new ArrayList<>();       // list for all matches

        for (int i = 0; i < source.length; i++)
        {
            if (source[i].getEmail().equals(toFind))
                foundList.add(source[i]);
        }

        if (foundList.size() != 0)
        {
            System.out.println("\nEmails Found: ");
            for (Contact contact: foundList)
                System.out.println(contact);
        }
        else
        {
            System.out.println("\nNone found.");
        }
    }
}
