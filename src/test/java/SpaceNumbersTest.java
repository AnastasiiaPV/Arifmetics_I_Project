import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class SpaceNumbersTest {
////
////Test Data:
////“QA For Everyone” -> 2
////“Java lessons  are fun” -> 4
    @Test
    public void testSpaceNumbers(){
        int expectedResult = 2;
        int actualResult = SpaceNumbers.getSpaceNumbers("QA For Everyone");
        AssertJUnit.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testSpaceNumbers1(){
        int expectedResult = 4;
        int actualResult = SpaceNumbers.getSpaceNumbers("Java lessons  are fun");
        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
}
