package HW_19_20;

import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class Task_2_FirstThree_LastThreeTest {
    //2.Напишите метод, который принимает строковый параметр и возвращает слово, которое состоит из последних
    // трех и первых трех букв слова-параметра, если длина строки больше 5. Иначе метод возвращает слово,
    // состоящее из средней/средних буквы/букв слова-параметра, повторенных столько раз, какова длина строки.
    //
    //Пример:
    //method(“QAForEveryone”) -> “oneQAF”
    //method(“Java”) -> “avavavav”
    //method(“A”) -> “A”

    @Test
    public void testFirstAndLastLetters(){
        String expectedResult = "oneQAF";
        String actualResult = Task_2_FirstThree_LastThree.getFirstThreeLastThreeLetters("QAForEveryone");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testFirstAndLastLetters1(){
        String expectedResult = "avavavav";
        String actualResult = Task_2_FirstThree_LastThree.getFirstThreeLastThreeLetters("Java");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testFirstAndLastLetters2(){
        String expectedResult = "A";
        String actualResult = Task_2_FirstThree_LastThree.getFirstThreeLastThreeLetters("A");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testFirstAndLastLetters3(){
        String expectedResult = "a";
        String actualResult = Task_2_FirstThree_LastThree.getFirstThreeLastThreeLetters("MaP");

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
}
