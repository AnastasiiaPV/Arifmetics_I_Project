package HW_19_20;

import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class Task_3_MinMaxLengthTest {
    //Напишите метод, который в строке находит слова минимальной и максимальной длины,
    // и количество слов одинаковой длины (максимально одинаковой).
    //
    //“What a wonderful day!” -> [“a”, “wonderful”, “0”]
    //“I love to learn Java mava!” -> [“I”, “learn”, “3”]
    @Test
    public void testMinMaxCountLetters(){
        String[] expectedResult = new String[]{"a", "wonderful", "0"};
        String[] actualResult = Task_3_MinMaxLength.getMinMaxLetter("What a wonderful day!");

        AssertJUnit.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testMinMaxCountLetters1(){
        String[] expectedResult = new String[]{"I", "learn", "2"};
        String[] actualResult = Task_3_MinMaxLength.getMinMaxLetter("I love to learn Java!");

        AssertJUnit.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testMinMaxCountLetters2(){
        String[] expectedResult = new String[]{"I", "learn", "3"};
        String[] actualResult = Task_3_MinMaxLength.getMinMaxLetter("I love to to learn Java mava!");

        AssertJUnit.assertArrayEquals(expectedResult, actualResult);
    }
}
