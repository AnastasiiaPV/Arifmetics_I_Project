import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class VowelLettersTest {
    //    //(гласные буквы - “a”, “e”, “i”, “o”, “u”)
    //    //
    //    //
    //    //Test Data:
    //    //“QA For Everyone” -> 6
    //    //“Java lessons are fun” -> 7

    @Test
    public void testVowelLetters3(){
        int expectedResult = 7;
        int actualResult = VowelLetters.getNumbersOfVowel1("Java lessons are fun");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testVowelLetters2(){
        int expectedResult = 7;
        int actualResult = VowelLetters.getNumbersOfVowel("Java lessons are fun");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testVowelLetters(){
        int expectedResult = 6;
        int actualResult = VowelLetters.getNumbersOfVowel1("QA For  Everyone");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testVowelLetters1(){
        int expectedResult = 6;
        int actualResult = VowelLetters.getNumbersOfVowel("QA For  Everyone");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
}
