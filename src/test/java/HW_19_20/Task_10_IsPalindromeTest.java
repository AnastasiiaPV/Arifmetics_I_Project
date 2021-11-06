package HW_19_20;

import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class Task_10_IsPalindromeTest {
    //Write a method that will take a string as an argument. The method will return a palindrome. A palindrome is a word, phrase, number, or sequence of words that reads the same backward as forward.
    //
    ////Такие варианты редко дают на интервью
    //a)
    //method(“А роза упала на лапу Азора”) -> “арозА упал ан алапу азор А”      или  “а розА упала на лапу азорА”
    //
    //
    ////Этот вариант чаще дают на интервью
    //b) Написать метод, который проверяет, является ли слово палиндромом.
    //
    //method(“Madam”) -> true    это палиндром
    //method(12321) -> true
    @Test
    public void testIsPalindrome(){
        boolean expectedResult = true;
        boolean actualResult = Task_10_IsPalindrome.isPalindrome("Madam");
        AssertJUnit.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testIsPalindrome1(){
        boolean expectedResult = true;
        boolean actualResult = Task_10_IsPalindrome.isPalindrome("12321");
        AssertJUnit.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testIsPalindrome2(){
        boolean expectedResult = true;
        boolean actualResult = Task_10_IsPalindrome.isPalindrome("арозА упал ан алапу азор А");
        AssertJUnit.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testIsPalindrome3(){
        boolean expectedResult = false;
        boolean actualResult = Task_10_IsPalindrome.isPalindrome("JAVA");
        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
}
