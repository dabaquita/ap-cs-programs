package Module16.pixLab.classes;/*
 * Purpose:
 * 
 * < your name >
 * < today's date >
*/

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue - Activity 5 */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  /** Method to test keepOnlyBlue - Activity 5 */
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }

  /** Method to test negate - Activity 5 */
  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }

  /** Method to test grayscale - Activity 5 */
  public static void testGrayscale()
  {
    Picture beach = new Picture("/Users/DK/Desktop/AP CS/AP CS/src/Module15/pixLab/images/beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  /** Method to test mirrorVerticalRightToLeft - Activity 6 */
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }

  /** Method to test mirrorHorizontal - Activity 6 */
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }

  /** Method to test mirrorHorizontal - Activity 6 */
  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  /** Method to test mirrorArms */
  public static void testMirrorArms()
  {
    Picture arms = new Picture("snowman.jpg");
    arms.explore();
    arms.mirrorArms();
    arms.explore();
  }

  /** Method to test mirrorGull */
  public static void testMirrorGull()
  {
    Picture arms = new Picture("seagull.jpg");
    arms.explore();
    arms.mirrorGull();
    arms.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  /** Method to test copy for Activity 8 */
  public static void testCopy()
  {
    Picture koala = new Picture("koala.jpg");
    koala.explore();
    koala.copy(koala, 100, 100, 300, 300, 200, 200);
    koala.explore();
  }

  /** Method to test myCollage for Activity 8 */
  public static void testMyCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.myCollage();
  }

  /** Method to test edgeDetection2 for Activity 9 */
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("/Users/DK/Desktop/AP CS/AP CS/src/Module16/pixLab/images/swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test and 
    // comment out the ones you don't want to run
    
    // Activity 5
    // testZeroBlue();
    // testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    // testNegate();
    // testGrayscale();
    
    // Activity 5 Challenge - optional
    //testFixUnderwater();
    
    // Activity 6
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    
    // Activity 6 Challenge - optional
    //testMirrorDiagonal();
    
    // Activity 7
    //testMirrorTemple();
    //testMirrorArms();
    // testMirrorGull();

    
    // Activity 8
    //testCollage();
    // testCopy();
    // testMyCollage();
    
    // Activity 9
    //testEdgeDetection();
    testEdgeDetection2();
    
    // Extra methods
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}












