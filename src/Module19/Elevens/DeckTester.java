package Module19.Elevens;


/**
 * This is a class that tests the Deck class.
 *
 *  < Your Name >
 *  < Today's Date >
 */

public class DeckTester
{
   /**
    * The main method in this class checks the Deck operations for consistency.
    * @param args is not usemyDeck.
    */
   public static void main(String[] args)
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      /* Uncomment blocks of code to test the Deck class */

      String[] myRanks = {"queen", "ace", "king", "two", "three", "jack", "nine", "eight", "jack", "two"};
      String[] mySuits = {"heart", "heart", "clubs", "spade", "diamonds", "diamonds", "clubs", "club", "spade", "spade"};
      int[] myPointValues = {12, 1, 13, 2, 3, 11, 9, 8, 11, 2};
      Deck myDeck = new Deck(myRanks, mySuits, myPointValues);

      System.out.println("**** Original Deck Methods ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After 1 Card Dealt ****");
      System.out.println("  toString:\n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal Remaining Cards ****");
      for (int i = myDeck.size() - 1; i >= 0; i--)
      {
         System.out.println("  deal: " + myDeck.deal());
      }
      System.out.println(" deal: " + myDeck.deal());

      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After All Cards Dealt ****");
      System.out.println("  toString:\n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: "  + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card From Empty Deck ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();


      /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

      System.out.println("\n**** 52 Card Deck shuffle Tests ****");
      String[] ranks52 = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king",
              "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king",
              "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king",
              "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king",};
      String[] suits52 = {"spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades",
              "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts",
              "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs",
              "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds"};
      int[] pointValues52 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
              1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
              1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
              1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

      Deck fullDeck = new Deck(ranks52, suits52, pointValues52);

      System.out.println("\n  The Starting Deck ");
      System.out.println("\n  toString: \n" + fullDeck.toString());

      System.out.println("  The Deck After Dealing a Card" );
      System.out.println("  deal: " + fullDeck.deal());

      System.out.println("\n  Shuffling the Deck ");
      fullDeck.shuffle();
      System.out.println("\n  toString: \n" + fullDeck.toString());

   }
}
