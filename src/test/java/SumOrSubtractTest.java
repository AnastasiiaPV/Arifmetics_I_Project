import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class SumOrSubtractTest {
    //    //Test Data:
    //    //n = 222;
    //    //Expected result = 24 753
    //    //n = -10;
    //    //Expected result = 56;
    @Test
    public void testSumOrSubtract(){
        int expectedResult = SumOrSubtract.getSumOrSubtract(222);
        System.out.println(expectedResult);

        Assert.assertEquals(expectedResult,24753);
    }

    @Test
    public void testSumOrSubtract1(){
        int expectedResult = SumOrSubtract.getSumOrSubtract(-10);
        System.out.println(expectedResult);

        Assert.assertEquals(expectedResult,56);
    }
}
