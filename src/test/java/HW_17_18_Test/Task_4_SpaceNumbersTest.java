package HW_17_18_Test;

import HW_17_18.Task_4_SpaceNumbers;
import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class Task_4_SpaceNumbersTest {
////
////Test Data:
////“QA For Everyone” -> 2
////“Java lessons  are fun” -> 4
    @Test
    public void testSpaceNumbers(){
        int expectedResult = 2;
        int actualResult = Task_4_SpaceNumbers.getSpaceNumbers("QA For Everyone");
        AssertJUnit.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testSpaceNumbers1(){
        int expectedResult = 4;
        int actualResult = Task_4_SpaceNumbers.getSpaceNumbers("Java lessons  are fun");
        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
}
