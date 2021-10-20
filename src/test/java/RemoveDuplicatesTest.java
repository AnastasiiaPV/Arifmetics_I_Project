import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class RemoveDuplicatesTest {
    //    //Test Data
    //    //{3, 4, 2, 6, 4, 3, 3, 3, 2, 2} -> {3, 4, 2, 6}
    //    //{0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0} -> {0, 1, 2, 3, 4, 5}
    @Test
    public void testRemoveDuplicates (){
        int[] actualArray=  new int[]{3, 4, 2, 6, 4, 3, 3, 3, 2, 2};
        int[] expectedResult =  new int[]{3, 4, 2, 6};

        Assert.assertEquals(RemoveDuplicates.array(actualArray),expectedResult);
    }

    @Test
    public void testRemoveDuplicates2 (){
        int[] actualArray =  new int[]{0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0} ;
        int[] expectedResult =  new int[]{0, 1, 2, 3, 4, 5};

        Assert.assertEquals(RemoveDuplicates.array(actualArray),expectedResult);
    }

}
