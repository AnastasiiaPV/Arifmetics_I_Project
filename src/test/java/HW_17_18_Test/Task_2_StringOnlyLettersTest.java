package HW_17_18_Test;

import HW_17_18.Task_2_StringOnlyLetters;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class Task_2_StringOnlyLettersTest {
    //    //Test Data:
    //    //“QAForEveryone” -> “AoEeyn”
    //    //“JavaLessonsAreFun” -> “aaesnAeu”
    @Test
    public void testOddIndexLetters(){
        String expectedResult = "AoEeyn";
        String actualResult = Task_2_StringOnlyLetters.getOnlyOddLetters("QAForEveryone");
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testOddIndexLetters1(){
        String expectedResult = "aaesnAeu";
        String actualResult = Task_2_StringOnlyLetters.getOnlyOddLetters("JavaLessonsAreFun");
        Assert.assertEquals(actualResult,expectedResult);
    }
}
