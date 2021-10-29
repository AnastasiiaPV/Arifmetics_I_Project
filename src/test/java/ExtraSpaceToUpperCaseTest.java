import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class ExtraSpaceToUpperCaseTest {

    //Test Data:
    //“QA For  Everyone ” -> “QA FOR EVERYONE”
    //“ Java lessons  are fun” -> “JAVA LESSONS ARE FUN”

    @Test
    public void deleteExtraSpaceToUpperCase(){
        String expectedResult = "QA FOR EVERYONE";
        String actualResult = ExtraSpaceToUpperCase.deleteExtraSpaceToUpperCase1("QA For  Everyone ");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void deleteExtraSpaceToUpperCase1(){
        String expectedResult = "JAVA LESSONS ARE FUN";
        String actualResult = ExtraSpaceToUpperCase.deleteExtraSpaceToUpperCase(" Java lessons  are fun");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
}
