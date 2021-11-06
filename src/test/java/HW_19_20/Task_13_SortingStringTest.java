package HW_19_20;

import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class Task_13_SortingStringTest {
    // //Строка состоит из слов, разделенных пробелами. Переставьте слова a) по убыванию их длин
    //    //b) Отсортировать по алфавиту.
    //    public static void main(String[] args) {
    //        sortDescending("Yellowstone is an American drama television series created by Taylor Sheridan and John Linson");
    //        sortAlphabet("Yellowstone is an American drama television series created by Taylor Sheridan and John Linson");
    @Test
    public void testSortDescending(){
        String expectedResult = "Yellowstone television Sheridan American created Linson Taylor series drama John and by an is";
        String actualResult = Task_13_SortingString
                .sortDescending("Yellowstone is an American drama television series created by Taylor Sheridan and John Linson");
        AssertJUnit.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testSortAlphabet(){
        String expectedResult = "American an and by created drama is John Linson series Sheridan Taylor television Yellowstone";
        String actualResult = Task_13_SortingString
                .sortAlphabet("Yellowstone television Sheridan American created Linson Taylor series drama John and by an is");
        AssertJUnit.assertEquals(expectedResult,actualResult);
    }
}
