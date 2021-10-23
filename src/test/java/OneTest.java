import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class OneTest {
    //Test Data:
//Input = {1, 1, 1, 0, 0, 0, 1, 1}
//Expected Result = {1, 1, 1}
//
//	Input = {1, 0, 1, 1, 0, 1}
//Expected Result = {1, 1}
    @Test
    public void testOne() {
        int[] expectedResult = One.zeroOne(new int[]{1, 1, 1});
        int[] actualResult = One.zeroOne(new int[]{1, 1, 1, 0, 0, 0, 1, 1});

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOne1() {
        int[] expectedResult = One.zeroOne(new int[]{1, 1});
        int[] actualResult = One.zeroOne(new int[]{1, 0, 1, 1, 0, 1});

        Assert.assertEquals(expectedResult, actualResult);
    }
}
