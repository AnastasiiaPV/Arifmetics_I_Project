import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

import java.util.Arrays;
import java.util.List;

public class DigitsToListTest {

    //Test Data:
    //“QA 4 Every1” -> [4, 1]
    //“45 тысяч 378” -> [4, 5, 3, 7, 8]
    @Test
    public void testDigitsToList(){
        List<Integer> expectedResult = Arrays.asList(4,1);
        List<Integer> actualResult = DigitsToList.getNumbers("QA 4 Every1");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testDigitsToList1(){
        List<Integer> expectedResult = Arrays.asList(4, 5, 3, 7, 8);
        List<Integer> actualResult = DigitsToList.getNumbers("45 тысяч 378");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
}
