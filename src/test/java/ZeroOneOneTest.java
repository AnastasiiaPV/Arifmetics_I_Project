import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class ZeroOneOneTest {
    //    //Test Data:
    //    //89, 89
    //    //Expected result: 0
    //    //-89, 89
    //    //Expected result: -1
    //    //89, -89
    //    //Expected result: 1
    @Test
    public void testZero(){
        int comparator = ZeroOneOne.getZeroOneOne(89,89);
        System.out.println("0");
        AssertJUnit.assertEquals(0,comparator);
    }

    @Test
    public void testOne(){
        int comparator = ZeroOneOne.getZeroOneOne(89,-89);
        System.out.println("1");
        AssertJUnit.assertEquals(1,comparator);
    }

    @Test
    public void testMinesOne(){
        int comparator = ZeroOneOne.getZeroOneOne(-89,89);
        System.out.println("-1");
        AssertJUnit.assertEquals(-1,comparator);
    }

}
