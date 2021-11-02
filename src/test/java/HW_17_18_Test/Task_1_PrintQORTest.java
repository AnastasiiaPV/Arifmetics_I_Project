package HW_17_18_Test;

import HW_17_18.Task_1_PrintQOR;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task_1_PrintQORTest {
    //    //Test Data
    //    //“QAForEveryone”
    //    //“Java lessons are fun”

    @Test
    public void testPrintQOR(){
        String expectedResult = "qorro";
        String actualResult = Task_1_PrintQOR.str("QAForEveryone");

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testPrintQOR1(){
        String expectedResult = "or";
        String actualResult = Task_1_PrintQOR.str("Java lessons are fun");

        Assert.assertEquals(actualResult,expectedResult);
    }
}
