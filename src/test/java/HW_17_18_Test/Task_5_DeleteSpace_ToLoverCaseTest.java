package HW_17_18_Test;

import HW_17_18.Task_5_DeleteSpace_ToLoverCase;
import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class Task_5_DeleteSpace_ToLoverCaseTest {

    //Test Data:
    //“QA For  Everyone ” -> “qaforeveryone”
    //“ Java lessons  are fun” -> “javalessonsarefun”
    @Test
    public void testDeleteSpaceToLowerCase(){
        String expectedResult = "qaforeveryone";
        String actualResult = Task_5_DeleteSpace_ToLoverCase.deleteSpaceToLoverCase1("QA For  Everyone ");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testDeleteSpaceToLowerCase1(){
        String expectedResult = "javalessonsarefun";
        String actualResult = Task_5_DeleteSpace_ToLoverCase.deleteSpaceToLoverCase(" Java lessons  are fun");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testDeleteSpaceToLowerCase2(){
        String expectedResult = "javalessonsarefun";
        String actualResult = Task_5_DeleteSpace_ToLoverCase.deleteSpaceToLoverCase(" Java lessons  are fun");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
}
