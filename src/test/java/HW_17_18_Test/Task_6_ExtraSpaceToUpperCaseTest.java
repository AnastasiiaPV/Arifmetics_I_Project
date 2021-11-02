package HW_17_18_Test;

import HW_17_18.Task_6_ExtraSpaceToUpperCase;
import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class Task_6_ExtraSpaceToUpperCaseTest {

    //Test Data:
    //“QA For  Everyone ” -> “QA FOR EVERYONE”
    //“ Java lessons  are fun” -> “JAVA LESSONS ARE FUN”

    @Test
    public void deleteExtraSpaceToUpperCase(){
        String expectedResult = "QA FOR EVERYONE";
        String actualResult = Task_6_ExtraSpaceToUpperCase.deleteExtraSpaceToUpperCase1("QA For  Everyone ");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void deleteExtraSpaceToUpperCase1(){
        String expectedResult = "JAVA LESSONS ARE FUN";
        String actualResult = Task_6_ExtraSpaceToUpperCase.deleteExtraSpaceToUpperCase(" Java lessons  are fun");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
}
