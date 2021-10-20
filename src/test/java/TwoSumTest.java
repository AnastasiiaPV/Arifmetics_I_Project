import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoSumTest {
    //    //Test Data:
    //    //Input = {68, 5, 2, 100, 9, 12, 8}
    //    //targetNumber = 10
    //    //Expected Result =  {2, 6}
    //    //
    //    //Input = {1, 20, 40, 60, -40, -20, -1}
    //    //targetNumber = -19
    //    //Expected Result =  {0, 5}
    //    //
    //    //Input = {8, 5, 2, 0, 9, 12, 8}
    //    //targetNumber = 12
    //    //Expected Result =  {3, 5}
    @Test
    public void testTwoSum(){
        int[] expectedResult = new int[]{2,6};
        int[] actualResult = new int[]{68, 5, 2, 100, 9, 12, 8};
        Assert.assertEquals(TwoSum.arrayIndex(actualResult,10),expectedResult);
    }

    @Test
    public void testTwoSum1(){
        int[] expectedResult = new int[]{0, 5};
        int[] actualResult = new int[]{1, 20, 40, 60, -40, -20, -1};
        Assert.assertEquals(TwoSum.arrayIndex(actualResult,-19),expectedResult);
    }

    @Test
    public void testTwoSum2(){
        int[] expectedResult = new int[]{3, 5};
        int[] actualResult = new int[]{8, 5, 2, 0, 9, 12, 8};
        Assert.assertEquals(TwoSum.arrayIndex(actualResult,12),expectedResult);
    }
}
