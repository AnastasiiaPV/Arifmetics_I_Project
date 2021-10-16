import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Arrays;

public class EvenIndexTest {
    //    //Test Data:
    //    //Input = {-45, 590, 234, 985, 12, 68}
    //    //Expected Result =  {590, 985, 68}
    @Test
    public void testEvenIndex() {
        int[] evenIndex = EvenIndex.getEvenIndexes(new int[]{-45, 590, 234, 985, 12, 68});
        System.out.println(Arrays.toString(evenIndex));

        Assert.assertTrue(Arrays.equals(new int[]{590, 985, 68},evenIndex));
    }
}
