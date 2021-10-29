import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class DeleteSpace_ToLoverCaseTest {

    //Test Data:
    //“QA For  Everyone ” -> “qaforeveryone”
    //“ Java lessons  are fun” -> “javalessonsarefun”
    @Test
    public void testDeleteSpaceToLowerCase(){
        String expectedResult = "qaforeveryone";
        String actualResult = DeleteSpace_ToLoverCase.deleteSpaceToLoverCase("QA For  Everyone ");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testDeleteSpaceToLowerCase1(){
        String expectedResult = "javalessonsarefun";
        String actualResult = DeleteSpace_ToLoverCase.deleteSpaceToLoverCase(" Java lessons  are fun");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
}
