package HW_17_18_Test;

import HW_17_18.Task_3_Change0toO;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class Task_3_Change0toOTest {
    //    //Test Data:
    //    //“QAF0rEvery0ne” -> “QAForEveryone” ”
    //    //“Java less0ns are fun” -> “Java lessons are fun”
    @Test
    public void testReplaced0ToO(){
        String expectedResult = "QAForEveryone";
        String actualResult = Task_3_Change0toO.getZeroToO("QAF0rEvery0ne");
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testReplaced0ToO1(){
        String expectedResult = "QAForEveryone";
        String actualResult = Task_3_Change0toO.getZeroToO("QAF0rEvery0ne");
        Assert.assertEquals(actualResult,expectedResult);
    }
}
