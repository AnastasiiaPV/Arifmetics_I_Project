package HW_19_20;

import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class Task_5_UniqueSymbolsTest {
    //Написать метод, который проверяет строку на уникальность символов в ней.
        //pppp125++kkdleEo-=@125
        @Test
        public void testUniqueSymbol(){
            String expectedResult = "p125+kdleEo-=@";
            String actualResult = Task_5_UniqueSymbols.getUniqueSymbols("pppp125++kkdleEo-=@125");

            AssertJUnit.assertEquals(expectedResult, actualResult);
        }

        @Test
        public void testUniqueSymbol1(){
            String expectedResult = "ab/czdk+";
            String actualResult = Task_5_UniqueSymbols.getUniqueSymbols("ab/caczdbdakcazdbaz+");

            AssertJUnit.assertEquals(expectedResult, actualResult);
        }
    }

