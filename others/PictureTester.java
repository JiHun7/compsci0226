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
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testkeepOnlyBlue()
  {
    Picture beach1 = new Picture("beach.jpg");
    beach1.explore();
    beach1.keepOnlyBlue();
    beach1.explore();
    }
  
  public static void testKeepOnlyRed()
  {
      Picture beach1 = new Picture("beach.jpg");
    beach1.explore();
    beach1.keepOnlyRed();
    beach1.explore();
    }
  
  public static void testKeepOnlyGreen()
  {
    Picture beach1 = new Picture("beach.jpg");
    beach1.explore();
    beach1.keepOnlyGreen();
    beach1.explore();  
    }
    
  public static void testNegate()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.negate();
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
  
  public static void testGrayscale()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.grayscale();
      beach.explore();
    }
    
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture temple = new Picture("snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture temple = new Picture("seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
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
  
  public static void testFixUnderwater()
  {
      Picture water = new Picture("water.jpg");
      water.explore();
      water.fixUnderwater();
      System.out.println("Fix under water");
      water.explore();
    }
   
  public static void testMirrorVerticalRightToLeft()
  {
      Picture Caterpillar = new Picture("caterpillar.jpg");
      Caterpillar.explore();
      Caterpillar.mirrorVerticalRightToLeft();
      Caterpillar.explore();
    }
  
  public static void testMirrorHorizontal()
  {
      Picture Motorcycle = new Picture("blueMotorcycle.jpg");
      Motorcycle.explore();
      Motorcycle.mirrorHorizontal();
      Motorcycle.explore();
    }
  
  public static void testMirrorHorizontalBotToTop()
  {
      Picture Motorcycle = new Picture("blueMotorcycle.jpg");
      Motorcycle.explore();
      Motorcycle.mirrorHorizontalBotToTop();
      Motorcycle.explore();
    }
    
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testkeepOnlyBlue();
    testKeepOnlyRed();
    testKeepOnlyGreen();
    testNegate();
    testGrayscale();
    testFixUnderwater();
    testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    testMirrorHorizontalBotToTop();
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}