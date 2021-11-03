package HW_19_20;

import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class Task_1_String_n_timesTest {
    //1.Напишите метод, который выводит строковый параметр  n раз и показывает количество символов в новой строке.
    @Test
    public void testPrintStringNTimes(){
        String expectedResult = "November November November November 36";
        String actualResult = Task_1_String_n_times.printStringNTimes("November",4);

        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
}
