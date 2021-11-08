package HW_19_20;

import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class Task_8_NonRepeatingLengthTest {

    @Test
    public void testFindSubstringLength(){
        int expectedResult = 3;
        int actualResult = Task_8_NonRepeatingLength.findSubstringLength("aabcb");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testFindSubstringLength1(){
        int expectedResult = 1;
        int actualResult = Task_8_NonRepeatingLength.findSubstringLength("aaaaa");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testFindSubstringLength2(){
        int expectedResult = 0;
        int actualResult = Task_8_NonRepeatingLength.findSubstringLength("");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testFindSubstringLength3(){
        int expectedResult = 2;
        int actualResult = Task_8_NonRepeatingLength.findSubstringLength("aAaaa");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
}
