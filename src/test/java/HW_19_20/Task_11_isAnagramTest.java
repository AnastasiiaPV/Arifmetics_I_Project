package HW_19_20;

import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class Task_11_isAnagramTest {
    //Write a method, which checks if two given strings are Anagram of each other.
    // Two String is said to be an anagram of each other, if they contain exactly the same characters but in a different order.
    //
    //Пример:
    //method("O, Draconian devil!", "!Leonardo Da Vinci,")  -> true
    //method("Oh, lame saint!", "The Mona Lisa,!") -> true
    @Test
    public void testIsAnagram(){
        boolean expectedResult = true;
        boolean actualResult = Task_11_IsAnagram.isAnagram("O, Draconian devil!","!Leonardo Da Vinci,");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testIsAnagram1(){
        boolean expectedResult = true;
        boolean actualResult = Task_11_IsAnagram.isAnagram("Oh, lame saint!","The Mona Lisa,!");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testIsAnagram3(){
        boolean expectedResult = false;
        boolean actualResult = Task_11_IsAnagram.isAnagram("Santa is here!","Here is he!");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
}
