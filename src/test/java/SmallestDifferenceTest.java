import org.testng.Assert;
import org.testng.annotations.Test;

public class SmallestDifferenceTest {


    @Test
    public void testSmallestDigit(){
        int[] expectedResult = new int[]{9, 8};
        int[] actualResult = SmallestDifference.smallestDifference(new int[]{8, 5, 2, 0, 9, 12, 8});

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSmallestDigit1(){
        int[] expectedResult = new int[]{-55, -54};
        int[] actualResult = SmallestDifference.smallestDifference(new int[]{8, -55, 2, -54, -12});

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSmallestDigit2(){
        int[] expectedResult = new int[]{8,9};
        int[] actualResult = SmallestDifference.smallestDifference(new int[]{8, 5, 2, 8, 9, 12, 0});

        Assert.assertEquals(actualResult,expectedResult);
    }

//    //
//    //Test Data:
//    //Input = {8, 5, 2, 0, 9, 12, 8}
////  //Expected Result =  {9, 8}
//    //
//    //Input = {8, -55, 2, -54, -12}
//    //Expected Result =  {-55, -54}
}
