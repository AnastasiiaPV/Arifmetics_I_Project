import org.testng.Assert;
import org.testng.annotations.Test;

public class ZeroSumTest {
    ////Test Data:
    ////{35, 23, 12, 89, -23, -48, 100}
    ////Expected result = {23, -23}

    @Test
    public void testZeroSum() {
        int[] expectedResult = new int[]{23, -23};
        int[] actualArray = new int[]{35, 23, 12, 89, -23, -48, 100};
        Assert.assertEquals(ZeroSum.zeroSum(actualArray), expectedResult);
    }
}
