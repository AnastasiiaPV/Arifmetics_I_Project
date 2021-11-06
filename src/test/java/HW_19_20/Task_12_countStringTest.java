package HW_19_20;

import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class Task_12_countStringTest {
    //    //Написать метод, который принимает на вход строку и производит вычисления в этой строке в порядке математических действий.
    //    //Входные данные:
    //    //"5*3-9/3" ////////2*3/2+7-5
    //    //
    //    //Выходные данные:
    //    //“12" //////3
    @Test
    public void testGetResult() {
        int expectedResult = 12;
        int actualResult = Task_12_countString.getResult("5*3-9/3");
        AssertJUnit.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetResult1() {
        int expectedResult = 5;
        int actualResult = Task_12_countString.getResult("2*3/2+7-5");
        AssertJUnit.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetResult2() {
        int expectedResult = -5;
        int actualResult = Task_12_countString.getResult("2*3/2+7-15");
        AssertJUnit.assertEquals(expectedResult, actualResult);
    }
}
