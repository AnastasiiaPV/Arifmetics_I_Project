import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Arrays;

public class AscendingSequenceTest {
    //    //Test Data:
    //    //a =  10
    //    //b =  25
    //    //n =  5
    //    //Expected result = {10, 15, 20, 25}
    @Test
    public void testAscendingSequence1(){
        int[] sequence = AscendingSequence.testAscendingSequence(10,25,5);
        System.out.println(Arrays.toString(sequence));

        Assert.assertEquals(new int[]{10, 15, 20, 25},sequence);
        Assert.assertTrue(Arrays.equals(new int[]{10, 15, 20, 25},sequence));
    }
    //    //a =  10
    //    //b =  -25
    //    //n =  -5
    //    //Expected result = {-1}
    @Test
    public void testAscendingSequence2(){
        int[] sequence = AscendingSequence.testAscendingSequence(10,-25,-5);
        System.out.println(Arrays.toString(sequence));

        Assert.assertTrue(Arrays.equals(new int[]{-1},sequence));
    }
    //    //
    //    //a =  10
    //    //b =  10
    //    //n =  2
    //    //Expected result = {-1}
    @Test
    public void testAscendingSequence3(){
        int[] sequence = AscendingSequence.testAscendingSequence(10,10,2);
        System.out.println(Arrays.toString(sequence));

        Assert.assertTrue(Arrays.equals(new int[]{-1},sequence));
        }
    }
