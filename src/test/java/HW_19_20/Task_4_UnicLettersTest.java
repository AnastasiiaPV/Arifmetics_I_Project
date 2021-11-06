package HW_19_20;

import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class Task_4_UnicLettersTest {
    //Написать метод, который принимает на вход строку букв,  и  возвращает строку, в которой только уникальные буквы
//
//    Пример:
//    method(“abcaczdbdakcazdbaz”)
//    Вернуть
//“abczdk"
    @Test
    public void testUnicLetters(){
        String expectedResult = "whatonderfuly";
        String actualResult = Task_4_UnicLetters.getUnicLetters("What a wonderful day");

        AssertJUnit.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testUnicLetters1(){
        String expectedResult = "abczdk";
        String actualResult = Task_4_UnicLetters.getUnicLetters("abcaczdbdakcazdbaz");

        AssertJUnit.assertEquals(expectedResult, actualResult);
    }
}
