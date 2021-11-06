package HW_19_20;

import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class Task_6_PosibilityOfNewStringTest {
    //Даны две строки. Определите, можно ли из некоторых символов первой строки составить вторую строку.
    //
    //      Пример:
    //method( “QAForEveryone”, “Verona”) -> true
    //method( “QAForEveryone”, “frog”) -> false
    @Test
    public void testIsNewString(){
        boolean expectedResult = true;
        boolean actualResult = Task_6_PosibilityOfNewString.isNewString("QAForEveryone","Verona");
        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testIsNewString1(){
        boolean expectedResult = false;
        boolean actualResult = Task_6_PosibilityOfNewString.isNewString("QAForEveryone","frog");
        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
}

