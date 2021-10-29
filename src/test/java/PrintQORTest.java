import org.testng.Assert;
import org.testng.annotations.Test;

public class PrintQORTest {
    //    //Test Data
    //    //“QAForEveryone”
    //    //“Java lessons are fun”

    @Test
    public void testPrintQOR(){
        String expectedResult = "qorro";
        String actualResult = PrintQOR.str("QAForEveryone");

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testPrintQOR1(){
        String expectedResult = "or";
        String actualResult = PrintQOR.str("Java lessons are fun");

        Assert.assertEquals(actualResult,expectedResult);
    }
}
