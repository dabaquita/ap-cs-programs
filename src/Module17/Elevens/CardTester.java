package Module17.Elevens;

/**
 * This is a class that tests the Card class.
 *
 *  < Your Name >
 *  < Today's Date >
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);
      Card queenDiamonds = new Card("ace", "diamonds", 11);
      Card kingClubs = new Card("king", "clubs", 12);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      System.out.println("**** Tests Card 1: queen of diamonds ****");
      System.out.println("  rank: " + queenDiamonds.rank());
      System.out.println("  suit: " + queenDiamonds.suit());
      System.out.println("  pointValue: " + queenDiamonds.pointValue());
      System.out.println("  toString: " + queenDiamonds.toString());
      System.out.println();

      // Test card 3
      System.out.println("**** Tests Card 1: king of clubs ****");
      System.out.println("  rank: " + kingClubs.rank());
      System.out.println("  suit: " + kingClubs.suit());
      System.out.println("  pointValue: " + kingClubs.pointValue());
      System.out.println("  toString: " + kingClubs.toString());
      System.out.println();

      // Test matches() method
      System.out.println("**** matches Test ****");
      System.out.println("  matching: true");
      System.out.println("  not matching: false");
      System.out.println("**********************");
      System.out.println("Ace of Hearts and Queen of Diamonds: " + aceHearts.matches(queenDiamonds));
      System.out.println("Queen of Diamonds and King of Clubs: " + queenDiamonds.matches(kingClubs));

   }
}
