package HW_19_20;

import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class Task_9_ReverseStrTest {
    //Write a method that will take one string as an argument and will return the reverse version of this string.
    @Test
    public void testReverse(){
        String expectedResult = "raC";
        String actualResult = Task_9_ReverseStr.getReverseStr("Car");
        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testReverse1(){
        String expectedResult = "r";
        String actualResult = Task_9_ReverseStr.getReverseStr("r");
        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testReverse3(){
        String expectedResult = "rewolF";
        String actualResult = Task_9_ReverseStr.getReverseStr("Flower");
        AssertJUnit.assertEquals(expectedResult,actualResult);
    }

}
