import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Arrays;

public class MaxMInAverageTest {
    //    //
    //    //Test Data:
    //    //{1, 2, 3, 4, 5} -> {5, 1, 3}
    //    //{-3, 0, 155, -39, 1003} -> {1003, -39, 223}
    @Test
    public void testMaxMinAverage(){
        int[] array  = MaxMinAverage.getMaxMinAverage(new int[]{2,4});
        System.out.println(Arrays.toString(array));

        Assert.assertTrue(Arrays.equals(new int[]{4,2,3},array));
    }

    @Test
    public void testMaxMinAverage2(){
        int[] array  = MaxMinAverage.getMaxMinAverage(new int[]{-3, 0, 155, -39, 1003});
        System.out.println(Arrays.toString(array));

        Assert.assertTrue(Arrays.equals(new int[]{1003, -39, 223},array));
    }
}
