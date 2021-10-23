import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TwoArraysTest {
    //Test Data:
    //{1, 2, 3, 4, 5}
    //{1, 2, 3, 4, 5}
    //Expected result: true
    //
    //{1, 2, 3, 4, 6}
    //{1, 2, 3, 4, 5}
    //Expected result: false
    @Test
    public void testTrueFalse() {
        boolean actualResult = TwoArrays.isFirstSameAsSecond(new int[]{1, 2, 3, 4, 5},new int[]{1, 2, 3, 4, 5});

        Assert.assertTrue(actualResult);
    }

    @Test
    public void testTrueFalse1() {
        boolean actualResult = TwoArrays.isFirstSameAsSecond(new int[]{1, 2, 3, 4, 5},new int[]{1, 2, 3, 4, 6});

        Assert.assertFalse(actualResult);
    }

}
