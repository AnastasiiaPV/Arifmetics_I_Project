import org.testng.Assert;
import org.testng.annotations.Test;

public class SortedArrayTest {
    //Test Data:
    //{12, 2, 3, 4, 5} -> {2, 3, 4, 5, 12}
    //{-3, 0, 155, -39, 1003} -> {-39, -3, 0, 155, 1003}
    @Test
    public void testSortedArray(){
        int[] expectedResult = new int[]{2, 3, 4, 5, 12};
        int[] actualResult = SortedArray.getSortedArray(new int[]{12, 2, 3, 4, 5});

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSortedArray2(){
        int[] expectedResult = new int[]{-39, -3, 0, 155, 1003};
        int[] actualResult = SortedArray.getSortedArray(new int[]{-3, 0, 155, -39, 1003});

        Assert.assertEquals(actualResult,expectedResult);
    }
}
