import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class StringOnlyLettersTest {
    //    //Test Data:
    //    //“QAForEveryone” -> “AoEeyn”
    //    //“JavaLessonsAreFun” -> “aaesnAeu”
    @Test
    public void testOddIndexLetters(){
        String expectedResult = "AoEeyn";
        String actualResult = StringOnlyLetters.getOnlyOddLetters("QAForEveryone");
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testOddIndexLetters1(){
        String expectedResult = "aaesnAeu";
        String actualResult = StringOnlyLetters.getOnlyOddLetters("JavaLessonsAreFun");
        Assert.assertEquals(actualResult,expectedResult);
    }
}
