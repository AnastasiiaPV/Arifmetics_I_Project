import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class Change0toOTest {
    //    //Test Data:
    //    //“QAF0rEvery0ne” -> “QAForEveryone” ”
    //    //“Java less0ns are fun” -> “Java lessons are fun”
    @Test
    public void testReplaced0ToO(){
        String expectedResult = "QAForEveryone";
        String actualResult = Change0toO.getZeroToO("QAF0rEvery0ne");
        Assert.assertEquals(actualResult,expectedResult);
    }
}
