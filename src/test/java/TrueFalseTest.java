import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TrueFalseTest {

    //Test Data:
    //Input = {4, 6, 3, 7, 1, 2}
    //Expected Result = true
    //
    //Input = {12, 48, 15, 125}
    //Expected Result = false
    @Test
    public void testTrueFalse() {
        boolean actualResult = TrueFalse.array(new int[]{4, 6, 3, 7, 1, 2});

        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void testTrueFalse1() {
        boolean actualResult = TrueFalse.array(new int[]{12, 48, 15, 125});

        Assert.assertEquals(false, actualResult);
    }

}
