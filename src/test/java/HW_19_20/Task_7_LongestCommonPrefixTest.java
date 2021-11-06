package HW_19_20;

import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class Task_7_LongestCommonPrefixTest {
    //Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".
    //Example 1:
    //Input: String[] strs = {"flower","flow","flight"}
    //Output: "fl"
    //Example 2:
    //Input: String[] strs = {"dog","racecar","car"}
    //Output: ""
    //Explanation: There is no common prefix among the input strings.
    @Test
    public void testIsCommonPrefix(){
        String expectedResult = "fl";
        String actualResult = Task_7_LongestCommonPrefix.getLongestPrefix("flower","flow","flight");
        AssertJUnit.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testIsCommonPrefix1(){
        String expectedResult = "";
        String actualResult = Task_7_LongestCommonPrefix.getLongestPrefix("dog","racecar","car");
        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
}
